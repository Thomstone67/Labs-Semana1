/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author thomas
 */
import java.util.Scanner;
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        n3 = input.nextInt();
        
        System.out.println("Digite o quarto número: ");
        n4 = input.nextInt();
        
        System.out.println("Digite o quinto número: ");
        n5 = input.nextInt();
        
        int count=0;
        while(count!=n1){
            if(n1!=0){
                System.out.printf("*");
                count++;
            }else{
                System.out.println();
            }            
        }
        System.out.println();
        
        count=0;
        while(count!=n2){
            if(n2!=0){
                System.out.printf("*");
                count++;
            }else{
                System.out.println();
            }
        }
        System.out.println();
        
        count=0;
        while(count!=n3){
            if(n3!=0){
                System.out.printf("*");
                count++;
            }else{
                System.out.println();
            }
        }
        System.out.println();
        
        count=0;
        while(count!=n4){
            if(n4!=0){
                System.out.printf("*");
                count++;
            }else{
                System.out.println();
            }
        }
        System.out.println();
        
        count=0;
        while(count!=n5){
            if(n5!=0){
                System.out.printf("*");
                count++;
            }else{
                System.out.println();
            }
        }
        System.out.println();
        // TODO code application logic here
    }
    
}
