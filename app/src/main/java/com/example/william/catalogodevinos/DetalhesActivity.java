package com.example.william.catalogodevinos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    private ImageView imgVinho;
    private TextView txtNome;
    private TextView txtTipo;
    private TextView txtOrigem;
    private TextView txtVinicula;
    private TextView ano;
    private int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);


        imgVinho = (ImageView)findViewById(R.id.imgVinho);
        txtNome = (TextView)findViewById(R.id.txtNome);
        txtTipo = (TextView)findViewById(R.id.txtTipo);
        txtOrigem = (TextView)findViewById(R.id.txtOrigem);
        txtVinicula = (TextView)findViewById(R.id.txtVinicula);

    }
}
