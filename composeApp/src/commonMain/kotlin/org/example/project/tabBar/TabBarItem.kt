package org.example.project.tabBar
import org.jetbrains.compose.resources.DrawableResource
import weatherapp.composeapp.generated.resources.Res
import weatherapp.composeapp.generated.resources.tab_10days
import weatherapp.composeapp.generated.resources.tab_today

enum class TabBarItem(val index: Int, val text: String, val icon: DrawableResource) {
    TODAY(0, "Today", Res.drawable.tab_today),
    TEN_DAYS(1, "10 days", Res.drawable.tab_10days);
}