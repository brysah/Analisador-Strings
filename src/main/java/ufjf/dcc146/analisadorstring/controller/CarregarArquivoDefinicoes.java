/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc146.analisadorstring.controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ufjf.dcc146.analisadorstring.model.Arquivo;
import ufjf.dcc146.analisadorstring.model.Tags;

/**
 *
 * @author brysa
 */
public class CarregarArquivoDefinicoes {
    public void escreverTagsSaida(List <String[]> listaTagsInvalidas) throws IOException
    {
        Tags aux = new Tags();
        String nomeArquivo = "../output/tagsValidas_Invalidas.txt";
        File arquivoSaida = new File(nomeArquivo);
        FileWriter escritor = new FileWriter(arquivoSaida);
        
        arquivoSaida.createNewFile();
        
        escritor.write(" --------- Tags Invalidas --------- ");
        escritor.write("\n");
       
         for(String[] i : listaTagsInvalidas)
        {
            
               escritor.write("\t" + i[0] + ": " + i[1]);   
               escritor.write("\n");
        }
        escritor.write("\n");
        escritor.write(" --------- Tags Validas --------- ");
        escritor.write("\n");
         for(Tags i : aux.getListaDefinicoesTags())
        {
            
               escritor.write("\t" + i.getNome() + ":" + i.getExpressao());     
               escritor.write("\n");
        }
         
        escritor.close();
    }
    
    public CarregarArquivoDefinicoes(String nomeArquivo) throws Exception
    {
            Arquivo arquivo        = new Arquivo(nomeArquivo); 
            File    arquivoEntrada = new File(nomeArquivo); 
            Scanner leitor         = new Scanner(arquivoEntrada);
            List <String[]> listaTagsInvalidas  = new ArrayList<>(); 
            Tags aux = new Tags();
            while(leitor.hasNextLine())
            {
                String     linha = leitor.nextLine();
                FormatoTag ft    = new FormatoTag(linha);
                ft.ehValido();                
                String [] dados = linha.split(":");           
                if(!aux.pertenceLista(dados[0]))
                {
                    
                    Tags t = new Tags(dados[0],dados[1]);
                    
                }else
                {
                    listaTagsInvalidas.add(dados);
                }
                
                
            }  
            escreverTagsSaida(listaTagsInvalidas);       
        
    }

    
}
