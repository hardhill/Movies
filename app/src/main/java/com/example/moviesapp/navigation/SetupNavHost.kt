package com.example.moviesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.moviesapp.screens.MainScreen
import com.example.moviesapp.screens.SplashScreen
import com.example.moviesapp.util.Constants
import com.example.moviesapp.util.Constants.Screens.DETAILS_SCREEN
import com.example.moviesapp.util.Constants.Screens.MAIN_SCREEN
import com.example.moviesapp.util.Constants.Screens.SPLASH_SCREEN

sealed class Screens(val route:String){
    object Splash:Screens(route = SPLASH_SCREEN)
    object Main:Screens(route = MAIN_SCREEN)
    object Details:Screens(route= DETAILS_SCREEN)
}


@Composable
fun SetupNavHost(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screens.Splash.route ){
        composable(route = Screens.Splash.route){
            SplashScreen(navController)
        }
        composable(route = Screens.Main.route){
            MainScreen()
        }
        composable(route = Screens.Details.route){

        }
    }
}