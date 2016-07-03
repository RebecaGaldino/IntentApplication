package com.example.rebecagaldino.intentapplication;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    /**Extração da mensagem digitada na primeira tela do bundle, exibindo no TextView
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String dados = extras.getString("mensagem");
            if (dados != null) {
                TextView mensagem = (TextView) findViewById(R.id.mensagemSegTela);
                mensagem.setText(dados);
            }
        }
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
}