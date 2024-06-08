package com.example.jetpackcomposecatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.jetpackcomposecatalog.ui.components.MyTopBarWithDrawable
import com.example.jetpackcomposecatalog.ui.theme.JetpackComposeCatalogTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
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
                    MyTopBarWithDrawable()
                    //ScaffoldExample()
                    //SuperHeroStickyView()
                    //SuperHeroWithSpecialControlView()
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
                    /*var show by remember {
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
                    }*/
                }
            }
        }
    }
}