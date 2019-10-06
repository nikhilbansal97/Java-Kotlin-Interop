package app.nikhil.kotlinlib

/*
* Implementation of Printer in Kotlin
*/
class KotlinPrinter {

  /*
  * Value denoting the name of the printer
  */
  val name: String = "MyPrinter"

  /*
  * Prints the file on the given path.
  * @params:
  * 1. path: String = Path of the file to print. Prints a sample file by default.
  */
  fun printFile(path: String = "samplePath") {
    // Logic to print the file.
  }

  /*
  * Establishes a connection to the name of WIFI specified.
  * @params:
  * 1. wifiName: String = Name of the WIFI to create connection with.
  */
  fun establishConnectionToWifi(wifiName: String) {
    // Logic to establish the connection
    println(wifiName.toShort())
  }

  companion object {
    /*
    * Return the configuration of Printer in String format
    */
    fun getConfiguration(): String = "Sample Configuration"
  }
}