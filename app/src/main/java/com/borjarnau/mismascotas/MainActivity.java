package com.borjarnau.mismascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

    }




    public void inicializarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }






    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perro2, "Dady", 3));
        mascotas.add(new Mascota(R.drawable.perro3, "Dudú", 10));
        mascotas.add(new Mascota(R.drawable.perro4, "Caly", 6));
        mascotas.add(new Mascota(R.drawable.perro5, "Carola", 2));
        mascotas.add(new Mascota(R.drawable.perro6, "Mulero", 14));
        mascotas.add(new Mascota(R.drawable.perro7, "Truncate", 22));
        mascotas.add(new Mascota(R.drawable.perro8, "Nino", 4));


    }


    public void irAFavoritos(View v){

        Intent intent = new Intent(this, Favoritas_Activity.class);
        startActivity(intent);

    }

}
