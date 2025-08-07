package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.example.project.tabBar.TabBar
import org.example.project.tabBar.TabBarItem
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val tabBarItems = listOf(TabBarItem.TODAY, TabBarItem.TEN_DAYS)

    Scaffold(
        bottomBar = {
            TabBar(
                items = tabBarItems,
                selectedTab = tabBarItems.first(),
                onItemSelected = { }
            )
        },
        content = {
            Box(modifier = Modifier.background(Color.Red))
        }
    )
}