package com.example.bonilla_quishpe_miguel_supletorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity_mebq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mebq);
    }

    public void abrirRegistro(View view){
        Intent intent = new Intent(this, RegistroActivity_mebq.class);
        startActivity(intent);
    }
}