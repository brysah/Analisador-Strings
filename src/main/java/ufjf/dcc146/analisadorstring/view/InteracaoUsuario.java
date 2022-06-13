/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc146.analisadorstring.view;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import ufjf.dcc146.analisadorstring.controller.CarregarArquivoDefinicoes;
import ufjf.dcc146.analisadorstring.controller.DefinirArquivoSaida;
import ufjf.dcc146.analisadorstring.controller.ListarDefinicoes;
import ufjf.dcc146.analisadorstring.controller.Salvar;
import ufjf.dcc146.analisadorstring.model.Arquivo;
import ufjf.dcc146.analisadorstring.model.Tags;

/**
 *
 * @author brysa
 */

public class InteracaoUsuario {
    public static void menu()
    {
        
        System.out.println(" --------- MENU --------- ");
        System.out.println(":d - Realiza a divisão em tags (arquivo) ");
        System.out.println(":c - Carrega arquivo com definições de tags ");
        System.out.println(":o - Define o caminho do arquivo de saída para a divisão em tags ");
        System.out.println(":p - Realiza a divisão em tags (entrada) ");
        System.out.println(":a - Lista as definições formais dos autômatos em memória");
        System.out.println(":l - Lista as definições de tag válidas");
        System.out.println(":q - Sair do programa");
        System.out.println(":s - Salvar as tags");

    }

    public static void main(String[] args) throws Exception {
        Arquivo auxArq = new Arquivo();
        Tags auxTag = new Tags();
        Scanner teclado = new Scanner(System.in);
        int loop = 1;
        String comando;
        menu();
        while (loop != 0) {
            System.out.println("Digite uma opcao: ");
            comando = teclado.nextLine();
            comando = comando.trim();
            String []dados = comando.split(" ");
            
            switch (dados[0]) {
                case ":d":
                    System.out.println("[WARNING] - Comando em construção");
                    break;

                case ":c":
                    try{
                        if(auxArq.getArquivoEntrada() != null)
                        {
                            auxTag.limparLista();
                            CarregarArquivoDefinicoes loadIn = new CarregarArquivoDefinicoes(dados[1]);  
                        }
                        else{
                            CarregarArquivoDefinicoes loadIn = new CarregarArquivoDefinicoes(dados[1]);  
                        }
                        System.out.println("[INFO] - Arquivo carregado com sucesso");
                    }catch(ArrayIndexOutOfBoundsException | FileNotFoundException e ){
                        System.out.println("[ERROR] - " + e.getMessage());
                    }                                      
                    break;

                case ":o":
                    try{
                        DefinirArquivoSaida loadOut = new DefinirArquivoSaida(dados[1]); 
                        System.out.println("[INFO] - Saida definida com sucesso");
                    }catch(RuntimeException | IOException e){
                        System.out.println("[ERROR] - " + e.getMessage());
                    } 
                    break;

                case ":p":
                    System.out.println("[WARNING] - Comando em construção");
                    break;

                case ":a":
                    System.out.println("[WARNING] - Comando em construção");
                    break;

                case ":l":
                    try{
                        ListarDefinicoes ld = new ListarDefinicoes();
                    }catch(IOException e){
                        System.out.println("[ERROR] - " + e.getMessage());
                    }
                    System.out.println("[INFO] - As definicoes de tags foram carregadas");
                    break;

                case ":q":
                    System.out.println("[INFO] - Saindo...");
                    loop = 0;
                    break;

                case ":s":
                    try{
                        Salvar s = new Salvar(dados[1]);
                    }catch(ArrayIndexOutOfBoundsException | IOException e){
                        System.out.println("[ERROR] - " + e.getMessage());
                    }
                    System.out.println("[INFO] - As definicoes de tags foram carregadas");
                    break;

                default:
                    System.out.println("[ERROR] Comando invalido ");

            }

        }
    }

}
