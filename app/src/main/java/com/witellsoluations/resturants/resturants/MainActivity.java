package com.witellsoluations.resturants.resturants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.witellsoluations.resturants.resturants.user.User;

public class MainActivity extends AppCompatActivity {
    Button btn_sigin_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        btn_sigin_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siginIn();
            }
        });
    }

    void  initUI() {
        btn_sigin_in = findViewById(R.id.btn_sigin_in);
    }

    void siginIn() {

        Intent userIntent = new Intent(this,User.class);
        startActivity(userIntent);
    }
}
