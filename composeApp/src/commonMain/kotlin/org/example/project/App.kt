package org.example.project

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import org.example.project.networking.makeHttpClient
import org.example.project.tabBar.TabBar
import org.example.project.tabBar.TabBarItem
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val tabBarItems = listOf(TabBarItem.TODAY, TabBarItem.TEN_DAYS)
    var selectedTabBarItem by remember { mutableStateOf(tabBarItems.first()) }

    Scaffold(
        bottomBar = {
            TabBar(
                items = tabBarItems,
                selectedTab = selectedTabBarItem,
                onTabSelected = { selectedItem ->
                    selectedTabBarItem = selectedItem
                }
            )
        },
        content = {
            selectedTabBarItem.makeScreen(httpClient = makeHttpClient())
        }
    )
}