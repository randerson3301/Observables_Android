package br.com.senaijandira.marcadordetruco.viewmodel;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import br.com.senaijandira.marcadordetruco.R;

public class MainActivity extends AppCompatActivity {

    TextView txtPontuacao;

    //variavel do viewModel
    PontuacaoViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instancia do viewModel
        viewModel = ViewModelProviders.of(this).get(PontuacaoViewModel.class);

        txtPontuacao = findViewById(R.id.txtPontuacao);

        if(viewModel.pontuacao.getValue() == null)
            viewModel.pontuacao.setValue(0);

        viewModel.pontuacao.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer valor) {
                txtPontuacao.setText(valor.toString());
            }
        });
    }

    public void adicionar1(View view) {
        viewModel.pontuacao.setValue(viewModel.pontuacao.getValue() + 1);
    }

    public void adicionar3(View view) {
        viewModel.pontuacao.setValue(viewModel.pontuacao.getValue() + 3);
    }

    public void adicionar6(View view) {
        viewModel.pontuacao.setValue(viewModel.pontuacao.getValue() + 6);
    }

    public void adicionar9(View view) {
        viewModel.pontuacao.setValue(viewModel.pontuacao.getValue() + 9);
    }

    public void adicionar12(View view) {
        viewModel.pontuacao.setValue(viewModel.pontuacao.getValue() + 12);
    }
}
