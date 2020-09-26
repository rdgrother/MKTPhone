package com.rdgtecnologia.marketphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText edtTitulo;
    private RadioButton rbNovo, rbusado;
    private EditText edtDescri, edtValor;
    private CheckBox ckFone, ckCarregador, ckBateria, ckPelicula, ckCabos, ckCapa;
    private Button btnImg, btnSalvarAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTitulo = findViewById(R.id.edtTitulo);
        rbNovo = findViewById(R.id.rbNovo);
        rbusado = findViewById(R.id.rbUsado);
        edtDescri = findViewById(R.id.edtDescri);
        edtValor = findViewById(R.id.edtValor);
        ckFone = findViewById(R.id.ckFone);
        ckCarregador = findViewById(R.id.ckCarregador);
        ckBateria = findViewById(R.id.ckBateria);
        ckPelicula = findViewById(R.id.ckPelicula);
        ckCabos = findViewById(R.id.ckCabos);
        ckCapa = findViewById(R.id.ckCapa);
        btnImg = findViewById(R.id.btnImg);
        btnSalvarAn = findViewById(R.id.btnSalvarAn);
    }

    public void carregarImagens(View view) // Botão carregar imagens
    {    }

    public void salvarAnuncio(View view) // Botão Salvar anuncios
    {    }
}