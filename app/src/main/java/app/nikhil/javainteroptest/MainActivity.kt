package app.nikhil.javainteroptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nikhil.javalib.JavaPrinter
import app.nikhil.kotlinlib.KotlinPrinter

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Create an instance of Java Printer
    val javaPrinter = JavaPrinter()

    // Access the name of the printer
    javaPrinter.name

    // Save the return value of a void function
    val result: Unit = javaPrinter.printFile(null)

    // Call a function with Kotlin Keyword
    javaPrinter.`is`()

    // Check for nullable parameter and return type
    val isConnSuccess = javaPrinter.isConnectionEstablished("GDG DevFest 2019")
  }
}
