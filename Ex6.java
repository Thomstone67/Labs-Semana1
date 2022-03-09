/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author thomas
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hip, l1, l2;
        
        for(hip=1;hip<500;hip++){
            for(l1=1;l1<500;l1++){
                for(l2=1;l2<500;l2++){
                    int pit = l1*l1 + l2*l2;
                    int hipsqr = hip*hip;
                    if(pit == hipsqr){
                        System.out.printf("São triângulos retângulos, os valores de %d, %d, %d (hipotenusa, lado 1, lado 2)\n", hip, l1, l2);
                    }else if(pit > hipsqr){
                        break;
                    }
                }
            }
        }
        // TODO code application logic here
    }
    
}
