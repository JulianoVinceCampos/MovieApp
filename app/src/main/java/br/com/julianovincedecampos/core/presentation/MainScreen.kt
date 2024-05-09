package br.com.julianovincedecampos.core.presentation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import br.com.julianovincedecampos.core.presentation.navigation.BottomNavigationBar
import br.com.julianovincedecampos.core.presentation.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController){

    Scaffold (
        bottomBar = {
            BottomNavigationBar(navController = navController)
        },
        content = {
            NavigationGraph(navHostController = navController)
        }
    )

}