/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author thomas
 */
import java.util.Scanner;
public class Ex1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n_lados=0;  
        System.out.println("Digite o número de lados:");
        n_lados = input.nextInt();
        
        if(n_lados<=1){
            System.out.printf("Entrada Inválida");
            n_lados =1;
        }else if(n_lados>=20){
            System.out.printf("Entrada Inválida");
            n_lados=20;
        }
        
        int linha = 1, coluna;
        while(linha<=n_lados){
            coluna=1;
            while(coluna<=n_lados){
                if(linha==1){
                    System.out.printf("*");
                }else if(linha == n_lados){
                    System.out.print("*");
                }
                else if(coluna == 1){
                    System.out.print("*");
                }
                else if(coluna == n_lados){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                coluna ++;
            }
            linha ++;
            System.out.println();
        }

        // TODO code application logic here
    }
    
}
