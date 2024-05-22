package com.example.jetpackcomposecatalog.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun EditTextPreview() {
    JetpackComposeCatalogTheme {
        Column {
            MyTextFieldOutlined()
            MyTextFieldAdvanced()
            MyTextField("Some text") {}
        }
    }
}

@Composable
fun MyTextFieldOutlined() {
    var myText by remember { mutableStateOf("") }
    OutlinedTextField(
        value = myText,
        onValueChange = { myText = it },
        modifier = Modifier.padding(24.dp),
        label = { Text(text = "Hola") },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Green,
            unfocusedIndicatorColor = Color.Red,
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            focusedLabelColor = Color.Green
        )
    )
}

@Composable
fun MyTextFieldAdvanced() {
    var myText by remember { mutableStateOf("") }

    TextField(
        value = myText,
        onValueChange = {
            myText = if (it.contains("a")) {
                it.replace("a", "")
            } else {
                it
            }
        },
        label = {
            Text(text = "Introduce tu nombre")
        })
}

@Composable
fun MyTextField(name: String, onValueChanged: (String) -> Unit) {
    TextField(
        value = name,
        onValueChange = { onValueChanged(it) }
    )
}