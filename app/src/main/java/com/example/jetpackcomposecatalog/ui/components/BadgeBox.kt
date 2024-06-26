package com.example.jetpackcomposecatalog.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalog.ui.theme.JetpackComposeCatalogTheme

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun BadgeBoxPreview() {
    JetpackComposeCatalogTheme {
        MyBadgeBox()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBadgeBox() {
    BadgedBox(
        modifier = Modifier
            .padding(16.dp),
        badge = {
            Badge(
                content = {
                    Text(text = "100")
                },
                containerColor = Color.Blue,
                contentColor = Color.Green
            )
        }
    ) {
        Icon(imageVector = Icons.Default.Star, contentDescription = "Star")
    }
}