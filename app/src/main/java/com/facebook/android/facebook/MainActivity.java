package com.facebook.android.facebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.facebook.android.facebook.R.string.pwd;

public class MainActivity extends AppCompatActivity {

    Button loginbtn;
    EditText etun,etpwd;
    String uname = "praful", pwd= "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etun = (EditText)findViewById(R.id.username);
        etpwd = (EditText)findViewById(R.id.password);
        loginbtn = (Button)findViewById(R.id.login_btn);

        View.OnClickListener z1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = etun.getText().toString();
                String s2 = etpwd.getText().toString();
                if (s1.equals(uname) && s2.equals(pwd)){

                    Toast.makeText(MainActivity.this, R.string.success, Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(i1);
                }
                else
                    Toast.makeText(MainActivity.this, R.string.failed , Toast.LENGTH_SHORT).show();
            }
        };
            loginbtn.setOnClickListener(z1);
    }
}

