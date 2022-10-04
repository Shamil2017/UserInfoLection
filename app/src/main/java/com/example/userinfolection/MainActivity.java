package com.example.userinfolection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText etName, etYear;
    Button btnGoMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etYear = findViewById(R.id.etYear);
        btnGoMsg = findViewById(R.id.btnGoMsg);

    }

    public void goDoIt(View view) {
        String stName = etName.getText().toString();
        String stYear = etYear.getText().toString();
        if (stName.equals("")) return;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myYear = Integer.parseInt(stYear);
        if (myYear>year) return;
        int myAge = year - myYear +1;
        Toast.makeText(this, stName + " ваш возраст: "+ myAge + " лет", Toast.LENGTH_LONG).show();
    }
}