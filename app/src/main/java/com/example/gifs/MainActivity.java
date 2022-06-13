package com.example.gifs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pl.droidsonroids.gif.GifImageButton;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GifImageButton gifs=findViewById(R.id.gif);
        gifs.setImageResource(R.drawable.salmahayek);
}
}