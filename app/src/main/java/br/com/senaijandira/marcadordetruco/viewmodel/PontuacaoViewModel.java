package br.com.senaijandira.marcadordetruco.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class PontuacaoViewModel extends ViewModel {

    //Variavel do tipo LiveData que pode sofrer alteraçôes
    MutableLiveData<Integer> pontuacao = new MutableLiveData<>();
}
