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
public class Arquivo {
    private static String arquivoEntrada;
    private static String arquivoSaida;
    public Arquivo() {
        
    }
    
    public Arquivo(String nomeArquivoEntrada) {
        this.arquivoEntrada = nomeArquivoEntrada;
        this.arquivoSaida   = "terminal";
    }

    public static String getArquivoEntrada() {
        return arquivoEntrada;
    }

    public static String getArquivoSaida() {
        return arquivoSaida;
    }

   
    public void setArquivoEntrada(String arquivoEntrada) {
        this.arquivoEntrada = arquivoEntrada;
    }
     public void setArquivoSaida(String arquivoSaida) {
        this.arquivoSaida = arquivoSaida;
    }
    
}
