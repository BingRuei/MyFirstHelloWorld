package com.app.ray.myfirsthelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Hey!");

        txtHello = (TextView) this.findViewById(R.id.txt_hello_world);
        txtHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHello.setText("Hi, there is Mr. Ray's Box");
            }
        });

    }
}
