package br.com.senaijandira.marcadordetruco.observadores;

import java.util.ArrayList;
import java.util.List;

public class Observavel {

    //essa classe pode ter varios observadores
    private List<Observador> observadores;

    public void observar(Observador ob){

        if(observadores == null){

            observadores = new ArrayList<>();
        }

        observadores.add(ob);
    }

    private Integer valor;

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;

        //se tem algum observador na lista
        if(observadores != null) {

            //notificar os observadores desta lista
            for (Observador ob : observadores) {
                ob.notificar(valor);
            }
        }
    }
}
