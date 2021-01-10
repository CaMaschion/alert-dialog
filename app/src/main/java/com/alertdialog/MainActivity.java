package com.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){

        //instaciar alertdialog
        AlertDialog.Builder dialog = new AlertDialog.Builder( this );

        //configurar titulo e mensagem
        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem da dialog");

        //configurar cancelamento
        dialog.setCancelable(false);

        //configurar icone
        dialog.setIcon( android.R.drawable.ic_btn_speak_now);

        //configurar acoes para sim e nao
        dialog.setPositiveButton("Sim", (dialog1, which) -> {
            Toast.makeText(
                    getApplicationContext(),
                    "Executar ação ao clicar no botão Sim",
                    Toast.LENGTH_SHORT
            ).show();
        });

        dialog.setNegativeButton("Não", (dialog12, which) -> {
            Toast.makeText(
                    getApplicationContext(),
                    "Executar ação ao clicar no botão não",
                    Toast.LENGTH_SHORT
            ).show();
        });

        //criar e exibir alertdialog

        dialog.create();
        dialog.show();

    }
}