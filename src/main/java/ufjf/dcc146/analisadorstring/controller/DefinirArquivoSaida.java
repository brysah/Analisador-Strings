/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc146.analisadorstring.controller;
import java.io.File;
import ufjf.dcc146.analisadorstring.model.Arquivo;

/**
 *
 * @author brysa
 */
public class DefinirArquivoSaida {
    public DefinirArquivoSaida(String nomeArquivo) throws Exception{
        File arquivoSaida = new File("../output/" + nomeArquivo);
        arquivoSaida.createNewFile();
        Arquivo aux = new Arquivo();
        aux.setArquivoSaida(nomeArquivo);
    }
}
