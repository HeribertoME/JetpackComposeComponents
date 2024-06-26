package com.example.jetpackcomposecatalog.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
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
fun ButtonsPreview() {
    JetpackComposeCatalogTheme {
        MyButtonExample()
    }
}

@Composable
fun MyButtonExample() {

    var enabled by rememberSaveable { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = {
                //Log.i("LOG", "Esto es un ejemplo")
                enabled = false
            },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = MaterialTheme.colorScheme.surface,
            ),
            border = BorderStroke(3.dp, Color.Green)
        ) {
            Text(text = "Button")
        }

        OutlinedButton(
            onClick = { enabled = false },
            enabled = enabled,
            modifier = Modifier.padding(top = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = MaterialTheme.colorScheme.surface,
                disabledContainerColor = Color.Blue,
                disabledContentColor = Color.Red
            ),
        ) {
            Text(text = "OutlinedButton")
        }

        TextButton(onClick = { }) {
            Text(text = "TextButton")
        }

        CreateSpace()

        FilledTonalButton(onClick = {  }) {
            Text(text = "FilledTonalButton")
        }

        CreateSpace()

        ElevatedButton(onClick = { }) {
            Text(text = "ElevatedButton")
        }

        CreateSpace()

        FloatingActionButton(onClick = { }) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "fav")
        }
        
        CreateSpace()

        FloatingActionButton(onClick = { }) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "fav")
        }

        CreateSpace()

        SmallFloatingActionButton(onClick = { }) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "fav")
        }

        CreateSpace()

        LargeFloatingActionButton(onClick = { }) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "fav")
        }

        CreateSpace()

        ExtendedFloatingActionButton(onClick = { }) {
            Text(text = "ExtendedFloatingActionButton")
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "fav")
        }
    }
}

@Composable
fun CreateSpace() {
    Spacer(modifier = Modifier.height(8.dp))
}