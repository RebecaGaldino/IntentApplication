package com.example.rebecagaldino.intentapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rebecagaldino.intentapplication.R;

public class PrimeiraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
        Log.i("OnCreate","Está no onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("OnResume","Está no onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("OnDestroy","Está no onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("OnPause","Está no onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("OnStop","Está no onStop");
    }

    /**Exibição - mensagem digitada com o Toast
     */
    public void exibeMensagem(View view){
        EditText mensagem = (EditText) findViewById(R.id.mensagem);
        Log.i("Mensagem", mensagem.getText().toString());
        Toast.makeText(this, "Mensagem: " + mensagem.getText(), Toast.LENGTH_LONG).show();
    }

    /**
     * Direcionamento para a segunda tela, e envio de um pacote bundle com a mensagem
     */
    public void segundaTela(View view){
        EditText mensagem = (EditText) findViewById(R.id.mensagem);

        Intent intent = new Intent(this, SegundaActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("mensagem", mensagem.getText().toString());
        intent.putExtras(bundle);

        startActivity(intent);
    }
}