package com.fullsail.librarydemo.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends Activity {

    @InjectView(R.id.hellobutton) Button hello;

    @OnClick(R.id.hellobutton) void sayHello() {
        Toast.makeText(this, "Hello, views!", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick(R.id.hellobutton) boolean sayGetOffMe() {
        Toast.makeText(this, "Let go of me!", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

}
