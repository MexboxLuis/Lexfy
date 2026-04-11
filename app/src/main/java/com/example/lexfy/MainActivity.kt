package com.example.lexfy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.lexfy.navigation.YOLONavigation
import com.example.lexfy.ui.theme.YOLOAppTheme
import com.example.lexfy.utils.AuthManager
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class MainActivity : ComponentActivity() {

    private lateinit var cameraExecutor: ExecutorService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        enableEdgeToEdge()

        val authManager = AuthManager(FirebaseAuth.getInstance())
        cameraExecutor = Executors.newSingleThreadExecutor()

        setContent {
            YOLOAppTheme {
                MyApp(authManager)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        cameraExecutor.shutdown()
    }
}



@Composable
fun MyApp(authManager: AuthManager){
    val navController = rememberNavController()

    YOLONavigation(navController, authManager)

}


