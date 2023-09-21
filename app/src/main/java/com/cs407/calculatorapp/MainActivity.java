package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void add(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        try{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            dispOutput(n1 + n2);
        }
        catch(NumberFormatException nfe) {
            Toast.makeText(MainActivity.this, "Invalid entry (enter integers only)"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void subtract(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        try{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            dispOutput(n1 - n2);
        }
        catch(NumberFormatException nfe) {
            Toast.makeText(MainActivity.this, "Invalid entry (enter integers only)"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void multiply(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        try{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            dispOutput(n1 * n2);
        }
        catch(NumberFormatException nfe) {
            Toast.makeText(MainActivity.this, "Invalid entry (enter integers only)"
                    ,Toast.LENGTH_LONG).show();
        }
    }

    public void divide(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        try{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            if(n2==0) throw new Exception();
            dispOutput(n1 / n2);
        }
        catch(NumberFormatException nfe) {
            Toast.makeText(MainActivity.this, "Invalid entry (enter integers only)"
                    ,Toast.LENGTH_LONG).show();
        }
        catch(Exception e){
            Toast.makeText(MainActivity.this, "Cannot divide by 0",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void dispOutput(int n){
        Intent intent = new Intent(this, DisplayOutput.class);
        intent.putExtra("message", n+"");
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}