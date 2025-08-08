package org.example.project.tabBar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.painterResource

@Composable
fun TabBar(
    items: List<TabBarItem>,
    selectedTab: TabBarItem,
    onTabSelected: (TabBarItem) -> Unit
) {
    NavigationBar(
        windowInsets = NavigationBarDefaults.windowInsets
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedTab == item,
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = ""
                    )
                },
                label = { Text(text = item.text) },
                onClick = {
                    val selectedItem = TabBarItem.fromIndex(index = index)
                    onTabSelected(selectedItem)
                }
            )
        }
    }
}