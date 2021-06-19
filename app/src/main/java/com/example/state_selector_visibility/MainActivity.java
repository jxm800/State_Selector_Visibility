package com.example.state_selector_visibility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button disableButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disableButton = findViewById(R.id.button2);
    }

    public void enableFunction(View view) {
        disableButton.setEnabled(true);
    }

    public void disableFunction(View view) {
        disableButton.setEnabled(false);
    }

    public void toNext(View view) {
        Intent mainViewIntent = new Intent(this, SecondActivity.class);
        startActivity(mainViewIntent);
    }
}
