package com.example.william.catalogodevinos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.william.catalogodevinos.R.id.parent;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lvVinhos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvVinhos = (ListView) findViewById(R.id.lvVinhos);
        lvVinhos.setOnItemClickListener(this);



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2/vino/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VinhoService service = retrofit.create(VinhoService.class);

        Call<List<Vinho>> vinhos = service.getVinhos();

        vinhos.enqueue(new Callback<List<Vinho>>() {

            @Override
            public void onResponse(Call<List<Vinho>> call,
                                   Response<List<Vinho>> response) {
                if (response.isSuccessful()) {

                    List<Vinho> lista = response.body();

                    VinhosAdapter adapter = new VinhosAdapter(
                            getApplicationContext(), lista, "http://10.0.2.2/vino/fotos/");

                    lvVinhos.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<Vinho>> call, Throwable t) {

            }
        });






    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Vinho vinho = (Vinho) adapterView.getItemAtPosition(i);

        Intent it = new Intent(this, DetalhesActivity.class);
        it.putExtra("id", vinho.getId());
        it.putExtra("nome", vinho.getNome());
        it.putExtra("tipo", vinho.getTipo());
        it.putExtra("origem", vinho.getOrigem());

    }
}
