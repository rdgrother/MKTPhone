package com.rdgtecnologia.marketphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {
    private EditText edtmail, edtnome, edtfone, edtEnde, edtCep, edtSenha, edtRep;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            edtmail.setText("");
            Toast.makeText(getApplicationContext(), String.format("Preencha o seu E-mail"),Toast.LENGTH_SHORT).show();
            }
        });

    }


}