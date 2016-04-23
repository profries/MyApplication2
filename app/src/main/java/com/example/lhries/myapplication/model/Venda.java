package com.example.lhries.myapplication.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lhries on 23/04/2016.
 */
public class Venda {
    private List<Produto> listaProdutos;
    private double frete;

    public Venda(){
        listaProdutos = new ArrayList<>();
        frete = 0;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double _frete){
        if(_frete < 0) throw new IllegalArgumentException("Valor deve ser maior que 0");
        this.frete = _frete;
    }

    public void addProduto(Produto p){
        listaProdutos.add(p);
    }

    public int getQuantidade(){
        return listaProdutos.size();
    }

    public double getTotal(){
        double total = 0;
        for(Produto p: listaProdutos)
            total += p.getPreco();
        total+= frete;
        return(total);
    }
}
