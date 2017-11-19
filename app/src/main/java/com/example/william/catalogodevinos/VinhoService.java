package com.example.william.catalogodevinos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by william on 18/11/2017.
 */

public interface VinhoService {

    @GET("lista_vinhos.php")
    Call<List<Vinho>> getVinhos();
}
