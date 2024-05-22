package com.example.jetpackcomposecatalog

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetpackcomposecatalog.ui.components.MyAlertDialog
import com.example.jetpackcomposecatalog.ui.theme.JetpackComposeCatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeCatalogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /*val myOptions = getOptions(titles = listOf("Heri", "Ejemplo", "Otra opcion"))
                    var selected by remember {
                        mutableStateOf("Opción 1")
                    }*/

                    /*Column {
                        //var myText by remember { mutableStateOf("Hola Heri") }
                        //MyTextField(myText) { myText = it }
                        /*MyTriStatusCheckBox()
                        myOptions.forEach {
                            MyCheckBoxWithTextCompleted(checkInfo = it)
                        }*/
                        //MyRadioButton()
                        /*MyRadioButtonList(selected) {
                            selected = it
                        }*/
                        //BasicSlider()
                    }*/
                    // Dialogs
                    var show by remember {
                        mutableStateOf(false)
                    }
                    Box (
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(onClick = {show = true}) {
                            Text(text = "Mostrar dialogo")
                        }
                        MyAlertDialog(
                            show = show,
                            onDismiss = { show = false },
                            onConfirm = { Log.d("DIALOG", "Hello onConfirm") }
                        )
                    }
                }
            }
        }
    }
}