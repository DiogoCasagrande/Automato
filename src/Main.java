/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

/**
 *
 * @author Home
 */
public class Automato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /**
         * Aqui será feita a chamada dos métodos das classes Expression e
         * Atribution de acordo com aa necessidades do programa vai ser
         * necessário validar antes se a String é uma atribuição de um valor a
         * uma variável ou se é uma expressão antes da chamada dos métodos
         */

        String nome = "arq.txt";
        Hashtable<String, Integer> identificadores = new Hashtable<String, Integer>();
        
        try {
            FileReader arquivo = new FileReader(nome);

            BufferedReader leitura = new BufferedReader(arquivo);

            String linha = leitura.readLine();
            
            String identificador ="";
            
            while (linha != null) {
                System.out.println(linha + "\n");
                
                for(int i = 0; i < linha.length() ;i++){
                    
                    linha.charAt(i);
                    char valor = linha.charAt(i);
                    System.out.println(valor);
                    if(i==0){
                        if(
                            valor == 'a' || valor == 'b' || valor == 'c' ||
                            valor == 'd' || valor == 'e' || valor == 'f' ||
                            valor == 'g' || valor == 'h' || valor == 'i' || 
                            valor == 'j' || valor == 'k' || valor == 'l' || 
                            valor == 'm' || valor == 'n' || valor == 'o' ||
                            valor == 'p' || valor == 'q' || valor == 'r' || 
                            valor == 's' || valor == 't' || valor == 'u' || 
                            valor == 'v' || valor == 'x' || valor == 'w' || 
                            valor == 'y' || valor == 'z' 
                            ){
                            identificador += valor;
                        }else{
                            System.out.println("String invalida");
                            break;
                        }
                    }else if(
                        valor == 'a' || valor == 'b' || valor == 'c' ||
                        valor == 'd' || valor == 'e' || valor == 'f' ||
                        valor == 'g' || valor == 'h' || valor == 'i' || 
                        valor == 'j' || valor == 'k' || valor == 'l' || 
                        valor == 'm' || valor == 'n' || valor == 'o' ||
                        valor == 'p' || valor == 'q' || valor == 'r' || 
                        valor == 's' || valor == 't' || valor == 'u' || 
                        valor == 'v' || valor == 'x' || valor == 'w' || 
                        valor == 'y' || valor == 'z' ||
                        valor == 'A' || valor == 'B' || valor == 'C' ||
                        valor == 'D' || valor == 'E' || valor == 'F' ||
                        valor == 'G' || valor == 'H' || valor == 'I' || 
                        valor == 'J' || valor == 'K' || valor == 'L' || 
                        valor == 'M' || valor == 'N' || valor == 'O' ||
                        valor == 'P' || valor == 'Q' || valor == 'R' || 
                        valor == 'S' || valor == 'T' || valor == 'U' || 
                        valor == 'V' || valor == 'X' || valor == 'W' || 
                        valor == 'Y' || valor == 'Z' ||
                        valor == '1' || valor == '2' || valor == '3' ||
                        valor == '4' || valor == '5' || valor == '6' ||
                        valor == '7' || valor == '8' || valor == '9' || 
                        valor == '0' 
                        ){
                        identificador += valor;
                    }else if(valor == ' '){
                        System.out.println("espaçoooooooooo");
                    }
                    
                }
                System.out.println(identificador);
                identificador = "";
                linha = leitura.readLine();
            }

            arquivo.close();

        } catch (IOException e) {
            System.err.println("Erro na leitura do arquivo");

        }
    }
}
