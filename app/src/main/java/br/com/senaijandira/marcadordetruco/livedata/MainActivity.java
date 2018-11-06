package br.com.senaijandira.marcadordetruco.livedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import br.com.senaijandira.marcadordetruco.R;

public class MainActivity extends AppCompatActivity {

    TextView txtPontuacao;

    //Variavel do tipo LiveData que pode sofrer alteraçôes
    MutableLiveData<Integer> pontuacao = new MutableLiveData<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPontuacao = findViewById(R.id.txtPontuacao);

        pontuacao.setValue(0);

        pontuacao.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer valor) {
                txtPontuacao.setText(valor.toString());
            }
        });

    }

    public void adicionar1(View view) {
        pontuacao.setValue(pontuacao.getValue() + 1);
    }

    public void adicionar3(View view) {
        pontuacao.setValue(pontuacao.getValue() + 3);
    }

    public void adicionar6(View view) {
        pontuacao.setValue(pontuacao.getValue() + 6);
    }

    public void adicionar9(View view) {
        pontuacao.setValue(pontuacao.getValue() + 9);
    }

    public void adicionar12(View view) {
        pontuacao.setValue(pontuacao.getValue() + 12);
    }
}
