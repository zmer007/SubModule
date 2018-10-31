package com.zplay.playable.bob.submodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zplay.playable.bob.hellomodel.SayHello;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SayHello.sayHello("bob");
    }
}
