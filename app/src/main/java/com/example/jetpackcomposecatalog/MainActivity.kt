package com.example.jetpackcomposecatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposecatalog.ui.components.ScreenFive
import com.example.jetpackcomposecatalog.ui.components.ScreenFour
import com.example.jetpackcomposecatalog.ui.components.ScreenOne
import com.example.jetpackcomposecatalog.ui.components.ScreenThree
import com.example.jetpackcomposecatalog.ui.components.ScreenTwo
import com.example.jetpackcomposecatalog.ui.model.Routes
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
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.Screen1.route
                    ) {
                        composable(Routes.Screen1.route) { ScreenOne(navigationController) }
                        composable(Routes.Screen2.route) { ScreenTwo(navigationController) }
                        composable(Routes.Screen3.route) { ScreenThree(navigationController) }

                        // Navigation con un String
                        /*composable(Routes.Screen4.route + "/{name}") { backStackEntry ->
                            val name: String? = backStackEntry.arguments?.getString("name")
                            ScreenFour(navigationController, name.orEmpty())
                        }*/

                        // Navigation con un Int
                        composable(
                            Routes.Screen4.route,
                            arguments = listOf(navArgument("age") { type = NavType.IntType })
                        ) { backStackEntry ->
                            val name: Int? = backStackEntry.arguments?.getInt("age")
                            ScreenFour(navigationController, name ?: 0)
                        }
                        composable(Routes.Screen5.route,
                            arguments = listOf(navArgument("name") { defaultValue = "Pepe" })
                        ) { backStackEntry ->
                            val name: String? = backStackEntry.arguments?.getString("name")
                            ScreenFive(navigationController, name)

                        }
                    }
                }
            }
        }
    }

    /*
                    //MyTopBarWithDrawable()
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
                     */
}