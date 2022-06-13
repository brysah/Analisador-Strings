/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc146.analisadorstring.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brysa
 */
public class Tags {
    private String nome;
    private String expressao;
    private static List <Tags> listaDefinicoesTags = new ArrayList<>(); 

    public Tags(String nome, String expressao) {
        this.nome = nome;
        this.expressao = expressao;
        this.listaDefinicoesTags.add(this);
    }
     public Tags() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public List<Tags> getListaDefinicoesTags() {
        return listaDefinicoesTags;
    }

    public void setListaDefinicoesTags(List<Tags> listaDefinicoesTags) {
        this.listaDefinicoesTags = listaDefinicoesTags;
    }
    public void limparLista()
    {
        this.listaDefinicoesTags.clear();
    }

    public boolean pertenceLista(String tag) {
        for(Tags i : listaDefinicoesTags)
        {
            if(i.getNome().equals(tag)){
                return true;
                //throw new RuntimeException(tag + " A tag deve ser unica");
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "" + nome + ": " + expressao;
    }


    

}
