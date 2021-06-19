package com.example.state_selector_visibility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.imageView);
    }

    public void visibleFunction(View view) {
        imageView.setVisibility(View.VISIBLE);
    }

    public void invisibleFunction(View view) {
        imageView.setVisibility(View.INVISIBLE);
    }

    public void goneFunction(View view) {
        imageView.setVisibility(View.GONE);
    }
}
