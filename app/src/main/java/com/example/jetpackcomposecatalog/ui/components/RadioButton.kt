package com.example.jetpackcomposecatalog.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecatalog.ui.theme.JetpackComposeCatalogTheme

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun RadioButtonsPreview() {
    JetpackComposeCatalogTheme {
        var selected by remember { mutableStateOf("Opción 1") }
        Column {
            MyRadioButtonList(name = selected) {
                selected = it
                
            }

            MyRadioButton()
        }
    }
}

@Composable
fun MyRadioButtonList(name: String, onItemSelected: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            RadioButton(
                selected = name == "Opción 1",
                onClick = {
                    onItemSelected("Opción 1")
                }
            )
            Text(text = "Opción 1")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            RadioButton(
                selected = name == "Opción 2",
                onClick = {
                    onItemSelected("Opción 2")
                }
            )
            Text(text = "Opción 2")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            RadioButton(
                selected = name == "Opción 3",
                onClick = {
                    onItemSelected("Opción 3")
                }
            )
            Text(text = "Opción 3")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            RadioButton(
                selected = name == "Opción 4",
                onClick = {
                    onItemSelected("Opción 4")
                }
            )
            Text(text = "Opción 4")
        }
    }
}

@Composable
fun MyRadioButton() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        RadioButton(
            selected = false,
            onClick = { },
            colors = RadioButtonDefaults
                .colors(
                    disabledSelectedColor = Color.Green,
                    disabledUnselectedColor = Color.Red,
                    selectedColor = Color.Blue,
                    unselectedColor = Color.Cyan
                )
        )
        Text(text = "Radio 1")
    }
}