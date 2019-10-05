package app.nikhil.javainteroptest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import app.nikhil.kotlinlib.KotlinPrinter;

@RunWith(JUnit4.class)
public class JavaTest {

  @Test
  public void testKotlinFromJava() {

    // Create an instance of KotlinPrinter
    KotlinPrinter kotlinPrinter = new KotlinPrinter();

    // Get the name of printer
    String printerName = kotlinPrinter.name;

    // Print a sample file
    kotlinPrinter.printFile("");

    // Get the configuration of Printer
    KotlinPrinter.getConfiguration();

    // Establish a connection to a WIFI
    kotlinPrinter.establishConnectionToWifi(null);
  }
}
