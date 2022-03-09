/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author thomas
 */
import java.util.Scanner;
public class Ex4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float salario=0, n_salario=0, g_reajuste=0, pporc=0, porc=0;
        
        System.out.println("Digite seu salário para o reajuste (usar ',' como separador decimal): ");
        salario = input.nextFloat();
        
        if(salario>=0.00 && salario<=400.00){
            porc=15;
            pporc = porc/100;
            n_salario = salario*(pporc+1);
            g_reajuste = n_salario-salario;
        }else if(salario>=400.01 && salario<=800.00){
            porc=12;
            n_salario = salario*((porc/100)+1);
            g_reajuste = n_salario-salario;
        }else if(salario>=800.01 && salario<=1200.00){
            porc=10;            
            pporc = porc/100;
            n_salario = salario*(pporc+1);
            g_reajuste = n_salario-salario;
        }else if(salario>=1200.01 && salario<=2000.00){
            porc=7;
            pporc = porc/100;
            n_salario = salario*(pporc+1);
            g_reajuste = n_salario-salario;
        }else if(salario>=2000.00){
            porc=4;
            pporc = porc/100;
            n_salario = salario*(pporc+1);
            g_reajuste = n_salario-salario;
        }
        int p = Math.round(porc);
        float n = Math.round(n_salario);
        float g = Math.round(g_reajuste);
        System.out.println("Novo Salário: "+n);
        System.out.println("Reajuste Ganho: "+g);
        System.out.printf("Em percentual: "+p);
        System.out.println(" %");
    }
    
}
