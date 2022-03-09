/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author thomas
 */
import java.util.Scanner;
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, r;
        
        System.out.println("Digite o nível lógico da porta P: ");
        p=input.nextInt();
        
        System.out.println("Digite o nível lógico da porta R: ");
        r=input.nextInt();
        
        if(p==0){
            System.out.println("Sua bolinha caiu na saída C");
        }else if(p==1 && r==0){
            System.out.println("Sua bolinha caiu na saída B");
        }else if(p==1 && r==1){
            System.out.println("Sua bolinha caiu na saída A");
        }
        
        // TODO code application logic here
    }
    
}
