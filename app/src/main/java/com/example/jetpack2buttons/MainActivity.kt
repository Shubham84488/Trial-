package com.example.jetpack2buttons

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.EaseOutCirc
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack2buttons.ui.theme.Jetpack2ButtonsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack2ButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InputMes();
                    Text(text = "HI")
                    Text(text = "HI")
                    Text(text = "HI")
                    //column();
                    //row();
                    //box();
                    //mix();
                }
            }
        }
    }
}

@Composable
fun InputMes() {
    val state = remember {
        mutableStateOf("")
    }
    TextField(
        value = state.value ,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter Message")}
    )
}

@Composable
fun column(){
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "A", fontSize = 20.sp)
        Text(text = "B", fontSize = 20.sp)
    }
}

@Composable
fun row(){
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "A", fontSize = 20.sp)
        Text(text = "B", fontSize = 20.sp)
    }
}

@Composable
fun box(){
    Box (contentAlignment = Alignment.Center){
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "1st")
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "2nd")
    }
}

@Composable
fun mix(){
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "job",
            modifier = Modifier.size(40.dp,40.dp)
        )

        Column{
            Text(text = "Name : Shubham Pandey" , fontWeight = FontWeight.Bold)
            Text(text = "Job : Android Developer" , fontWeight = FontWeight.Thin)
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun GreetingPreview() {

//    Button(onClick = {  },
//        shape = RectangleShape,
//        colors = ButtonDefaults.buttonColors(
//            contentColor = Color.Cyan
//        ),
//        modifier = Modifier.size(20.dp,20.dp),
//        border = BorderStroke(5.dp, Color.Black)
//    ) {
//        Text(text = "Submit", fontSize = 12.sp)
//    }
    InputMes()

}