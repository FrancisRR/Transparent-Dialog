package com.example.transparentdialo.java;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.transparentdialo.R;

public class SecondClass extends AppCompatActivity {

    private String TAG = SecondClass.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> {
            DialogTransparent transparent = new DialogTransparent();
            transparent.show(getSupportFragmentManager(), TAG);
        });
    }
}
