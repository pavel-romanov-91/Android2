package com.example.android2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.data.UiToolingDataApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android2.ui.theme.Android2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage("Jetpack Compose Tutorial", shortDescription = "Jetpack Compose is a modern toolkit for building native Android UI. Jetpack Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        longDescription = "In this tutorial, you'll build a simple UI component with declarative functions. You won't be editing any XML layouts or using the Layout Editor. Instead, you will call composable functions to define what elements you want, and the Compose compiler will do the rest.")

                }
            }
        }
    }
}



@OptIn(UiToolingDataApi::class)
@Composable
fun GreetingImage(headerText: String,shortDescription: String, longDescription:String, modifier: Modifier = Modifier) {
    Column {
        val image = painterResource(id = R.drawable.item)
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = headerText,
            fontSize = 25.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = shortDescription,
            fontSize = 15.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = longDescription,
            fontSize = 15.sp,
            modifier = Modifier.padding(16.dp)
        )


    }



}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android2Theme {
        GreetingImage(headerText="Jetpack Compose Tutorial",
            shortDescription = "Jetpack Compose is a modern toolkit for building native Android UI. Jetpack Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            longDescription = "In this tutorial, you'll build a simple UI component with declarative functions. You won't be editing any XML layouts or using the Layout Editor. Instead, you will call composable functions to define what elements you want, and the Compose compiler will do the rest.")
    }
}