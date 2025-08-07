package org.example.project.tabBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import weatherapp.composeapp.generated.resources.Res
import weatherapp.composeapp.generated.resources.tab_10days
import weatherapp.composeapp.generated.resources.tab_today

enum class TabBarItem(val index: Int, val text: String, val icon: DrawableResource) {
    TODAY(0, "Today", Res.drawable.tab_today),
    TEN_DAYS(1, "10 days", Res.drawable.tab_10days);

    @Composable
    fun makeScreen() {
        when (this) {
            TODAY -> Box(modifier = Modifier.fillMaxSize().background(Color.Red))
            TEN_DAYS -> Box(modifier = Modifier.fillMaxSize().background(Color.Blue))
        }
    }

    companion object {
        fun fromIndex(index: Int): TabBarItem = entries.first { item ->
            item.index == index
        }
    }
}