package app.nikhil.javainteroptest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import app.nikhil.kotlinlib.KotlinPrinter;

public class JavaActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

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
