
package com.cyiboy.dispatch.Welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cyiboy.dispatch.Auth.Login;
import com.cyiboy.dispatch.Auth.Signup;
import com.cyiboy.dispatch.R;

import mehdi.sakout.fancybuttons.FancyButton;


public class WelcomeActivity extends AppCompatActivity {

    FancyButton btnSignup, btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnLogin = findViewById(R.id.btnlogin);
        btnSignup = findViewById(R.id.btnsignup);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               startActivity(new Intent(WelcomeActivity.this, Login.class));

            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(WelcomeActivity.this, Signup.class));

            }
        });
    }
}
