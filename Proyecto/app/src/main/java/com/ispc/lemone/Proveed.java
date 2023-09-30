package com.ispc.lemone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class Proveed extends AppCompatActivity {

    Button btnModificarA;
    Button btnEliminarA;
    Button btnActivarA;
    Button btnModificarB;
    Button btnEliminarB;
    Button btnActivarB;
    Button btnModificarC;
    Button btnEliminarC;
    Button btnActivarC;
    Button btnModificarD;
    Button btnEliminarD;
    Button btnActivarD;
    Button btnBuscarP;
    FrameLayout btnAtrasP;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proveed);

//primer modulo

        btnModificarA = findViewById(R.id.buttonModificarA);
        btnModificarA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Proveed.this, AddProvider.class);
                startActivity(intent);
            }
        });

        btnEliminarA = findViewById(R.id.buttonEliminarA);
        btnEliminarA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, EliminarUsuario.class);
                startActivity(intent);
            }
        });

        btnActivarA = findViewById(R.id.buttonActivarA);
        btnActivarA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, UserActivarDesactivar.class);
                startActivity(intent);
            }
        });

//        segundo modulo

        btnModificarB = findViewById(R.id.buttonModificarB);
        btnModificarB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Proveed.this, AddProvider.class);
                startActivity(intent);
            }
        });

        btnEliminarB = findViewById(R.id.buttonEliminarB);
        btnEliminarB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, EliminarUsuario.class);
                startActivity(intent);
            }
        });

        btnActivarB = findViewById(R.id.buttonActivarB);
        btnActivarB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, UserActivarDesactivar.class);
                startActivity(intent);
            }
        });

//        tercer modulo

        btnModificarC = findViewById(R.id.buttonModificarC);
        btnModificarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Proveed.this, AddProvider.class);
                startActivity(intent);
            }
        });

        btnEliminarC = findViewById(R.id.buttonEliminarC);
        btnEliminarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, EliminarUsuario.class);
                startActivity(intent);
            }
        });

        btnActivarC = findViewById(R.id.buttonActivarC);
        btnActivarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, UserActivarDesactivar.class);
                startActivity(intent);
            }
        });

//        cuarto modulo
        btnModificarD = findViewById(R.id.buttonModificarD);
        btnModificarD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Proveed.this, AddProvider.class);
                startActivity(intent);
            }
        });

        btnEliminarD = findViewById(R.id.buttonEliminarD);
        btnEliminarD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, EliminarUsuario.class);
                startActivity(intent);
            }
        });

        btnActivarD = findViewById(R.id.buttonActivarD);
        btnActivarD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, UserActivarDesactivar.class);
                startActivity(intent);
            }
        });

//        boton de agregar proveedor

        btnBuscarP = findViewById(R.id.buttonAdd);
        btnBuscarP.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, AddProvider.class);
                startActivity(intent);
            }
        });

//        boton de atras
         btnAtrasP = findViewById(R.id.buttonAdd);
        btnAtrasP.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Proveed.this, MainMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}