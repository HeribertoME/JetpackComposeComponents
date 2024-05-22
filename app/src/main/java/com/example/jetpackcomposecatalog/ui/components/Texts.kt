package com.example.jetpackcomposecatalog.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecatalog.ui.theme.JetpackComposeCatalogTheme

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun TextsPreview() {
    JetpackComposeCatalogTheme {
        Column {
            MyText()
        }
    }
}

@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Texto normal")
        Text(text = "Texto con color", color = Color.Blue)
        Text(text = "Texto con formato negritas", fontWeight = FontWeight.ExtraBold)
        Text(text = "Texto con formato ligero", fontWeight = FontWeight.Light)
        Text(text = "Texto con formato cursiva", fontFamily = FontFamily.Cursive)
        Text(
            text = "Texto con decoracion tachado",
            textDecoration = TextDecoration.LineThrough
        )
        Text(
            text = "Texto con decoracion linea baja",
            textDecoration = TextDecoration.Underline
        )
        Text(
            text = "Texto con decoracion combinada (linea baja y tachado)",
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.Underline,
                    TextDecoration.LineThrough
                )
            )
        )
        Text(text = "Texto con fuente 30 sp", fontSize = 30.sp)

    }
}