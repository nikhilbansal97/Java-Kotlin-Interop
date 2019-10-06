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

    // Get the name of printer

    // Print a sample file

    // Get the configuration of Printer

    // Establish a connection to a WIFI
  }
}
