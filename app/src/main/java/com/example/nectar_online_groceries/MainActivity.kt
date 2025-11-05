package com.example.nectar_online_groceries

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nectar_online_groceries.ui.theme.NectarOnlineGroceriesTheme
import com.example.nectar_online_groceries.viewmodel.UserViewModel
import com.example.nectar_online_groceries.views.HomeScreen
import com.example.nectar_online_groceries.views.SignInScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val userViewModel: UserViewModel = viewModel()

            NectarOnlineGroceriesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(navController = navController, startDestination = "signIn") {
                        composable("signIn") {
                            SignInScreen(
                                viewModel = userViewModel,
                                onEnterClick = { user ->
                                    Log.i("MainActivity", "User signed in: $user")
                                    navController.navigate("homeScreen") {
                                        popUpTo("signIn") { inclusive = true }
                                    }
                                },
                                onForgotClick = {
                                    userViewModel.setErrorMessage("Link funcionando e redirecionamento feito!")
                                },
                                onRegisterClick = {
                                    userViewModel.setErrorMessage("Link funcionando e redirecionamento feito!")
                                }
                            )
                        }
                        composable("homeScreen") {
                            HomeScreen()
                        }
                    }
                }
            }
        }
    }
}