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
    onItemSelected: (TabBarItem) -> Unit
) {
    NavigationBar(
        windowInsets = NavigationBarDefaults.windowInsets
    ) {
        items.map { item ->
            NavigationBarItem(
                selected = selectedTab == item,
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = "Today Forecast Tab"
                    )
                },
                label = { Text(text = item.text) },
                onClick = {  }
            )
        }
    }
}