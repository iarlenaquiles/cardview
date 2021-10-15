package com.aquiles.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aquiles.cardview.R;
import com.aquiles.cardview.adapter.PostagemAdapter;
import com.aquiles.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<Postagem>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // definir layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        // ddefinir adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens() {
        Postagem postagem = new Postagem("Iarlen Aquiles", "Viagem top", R.drawable.imagem1 );
        this.postagens.add(postagem);

        postagem = new Postagem("Marilene", "Viagem e aproveite muito", R.drawable.imagem2 );
        this.postagens.add(postagem);

        postagem = new Postagem("Erlania", "#Paris", R.drawable.imagem3 );
        this.postagens.add(postagem);

        postagem = new Postagem("Eloah", "que foto top", R.drawable.imagem4 );
        this.postagens.add(postagem);


    }
}