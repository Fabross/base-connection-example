package cl.telematica.basicconnectionexample.connection;

import cl.telematica.basicconnectionexample.models.Libro;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.GET;

public interface GetDataService {

    @GET("/v2/5bfc6aa9310000780039be36")
    Call<List<Libro>> result();
}