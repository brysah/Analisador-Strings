/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc146.analisadorstring.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import ufjf.dcc146.analisadorstring.model.Tags;

/**
 *
 * @author brysa
 */
public class Salvar {
    public Salvar(String nomeArquivo) throws IOException
    {
        Tags aux = new Tags();
        File arquivoSaida = new File("../output/"+nomeArquivo);
        FileWriter escritor = new FileWriter(arquivoSaida);
        arquivoSaida.createNewFile();
        escritor.write(" ------ Tags ------ \n");
        for(Tags i : aux.getListaDefinicoesTags())
        {
            escritor.write("\t" + i.getNome() + ": "+ i.getExpressao()+ "\n");
        }
        escritor.close();
    }
}
