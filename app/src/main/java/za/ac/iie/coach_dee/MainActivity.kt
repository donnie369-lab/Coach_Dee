package za.ac.iie.coach_dee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import za.ac.iie.coach_dee.ui.theme.Coach_DeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Coach_DeeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Coach_DeeTheme {
        Greeting("Android")
    }
}

fun DoingWhatIWantToDo(){
    /*
    In this program it will be demonstrated on how to prompt an individual on entering their
    information. To check if they qualify for pension and if they also are allowed to drive.
     */

    //Prompt the individual to enter their first name.//
    println("Enter your first name")
    val Name_01 = readLine()

    //Prompt the individual to enter their age.//
    println("Enter your age")
    val Age = readLine()?.toIntOrNull() ?:0

    /*
    Make a decision statement to determine whether the individual qualifies for pension and/or is
    allowed to drive
     */

    //Decision statement to see if the individual qualifies for pension.//
    if(Age>=50) {
        println("Yes: You do qualify for pension.")
    }else{
        println("No: You do not qualify for pension.")
    }
   //Statement of decision to check if the individual is allowed to drive or not.//
    if(Age>=19){
        println("Yes: You are allowed to drive.")
    }else{
        println("No: You are not allowed to drive")
    }
}
fun Quetionaires(){
    //Question 1 is here to evaluate the student' on-campus experience.//
    println("Question 1" +
            "Are you happy with the experience at the IIE' Varsity College and what course and the year are you ?")
    val Answer_001 = readln()

    //Question 2 is here to determine whether the student will continue with their here at the IIE' Varsity College.//
    println("Question 2" +
            "Inclusive of your experience here on campus will you be furthering your studies here at the IIE' Varsity College?")
    val Answer_002 = readln()

    //

}
fun main(){
    println(DoingWhatIWantToDo())
}