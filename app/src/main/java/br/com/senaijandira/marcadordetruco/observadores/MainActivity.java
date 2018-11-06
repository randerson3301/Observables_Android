package br.com.senaijandira.marcadordetruco.observadores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import br.com.senaijandira.marcadordetruco.R;

public class MainActivity extends AppCompatActivity {

    TextView txtPontuacao;

    Observavel pontuacao = new Observavel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //iniciando com 0
        pontuacao.setValor(0);

        txtPontuacao = findViewById(R.id.txtPontuacao);

        //definir o observe
        pontuacao.observar(new Observador() {
            @Override
            public void notificar(Integer valor) {

                //updade UI
                txtPontuacao.setText(valor.toString());
            }
        });
    }

    public void adicionarUm(View v){
        //update pontuacao
        pontuacao.setValor(pontuacao.getValor() + 1);
    }

    public void adicionar3(View view) {
        //update pontuacao
        pontuacao.setValor(pontuacao.getValor() + 3);
    }

    public void adicionar6(View view) {
        //update pontuacao
        pontuacao.setValor(pontuacao.getValor() + 6);
    }

    public void adicionar9(View view) {
        //update pontuacao
        pontuacao.setValor(pontuacao.getValor() + 9);
    }

    public void adicionar12(View view) {
        //update pontuacao
        pontuacao.setValor(pontuacao.getValor() + 12);
    }
}
