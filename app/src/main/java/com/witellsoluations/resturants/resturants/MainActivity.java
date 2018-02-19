package com.witellsoluations.resturants.resturants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.witellsoluations.resturants.resturants.chef.Chef;
import com.witellsoluations.resturants.resturants.user.User;

public class MainActivity extends AppCompatActivity {
    Button btn_sigin_in;
    Button btn_user;
    EditText et_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        btn_sigin_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                siginIn(username);
            }
        });

        btn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userIntent = new Intent(getApplicationContext(), User.class);
                startActivity(userIntent);
            }
        });
    }

    void  initUI() {

        btn_sigin_in = findViewById(R.id.btn_sigin_in);
        btn_user = findViewById(R.id.btn_user);
        et_username = findViewById(R.id.et_username);
    }

    void siginIn(String username) {

        if (username.equals("waiter")) {
            Intent userIntent = new Intent(this, User.class);
            startActivity(userIntent);
        } else if (username.equals("chasier")) {
            Intent userIntent = new Intent(this, User.class);
            startActivity(userIntent);
        } else if (username.equals("chef")) {
            Intent userIntent = new Intent(this, Chef.class);
            startActivity(userIntent);
        }
    }
}
