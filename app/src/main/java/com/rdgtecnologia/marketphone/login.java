package com.rdgtecnologia.marketphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private Button btnLogin, btnCadastro;
    private EditText edtMail,edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin=findViewById(R.id.btnLogin);
        btnCadastro=findViewById(R.id.btnCadastro);
    }

    public void entrar (View view){
        setContentView(R.layout.activity_main); // Vai para tela principal
        }
    public void cadastro (View view){
        setContentView(R.layout.activity_cadastro); // Vai para o cadastro
    }
}