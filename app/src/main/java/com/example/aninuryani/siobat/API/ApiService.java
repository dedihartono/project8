package com.example.aninuryani.siobat.API;

import com.example.aninuryani.siobat.Model.ModelData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * Created by aninuryani on 11/11/17.
 */

public interface ApiService {

    @GET("obat")
    Call<List<ModelData>> getDataObat();
}
