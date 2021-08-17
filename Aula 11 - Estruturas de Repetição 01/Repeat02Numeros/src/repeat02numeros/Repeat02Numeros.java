/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeat02numeros;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Repeat02Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner (System.in);
        int n, s = 0;
        String resp;
        do{
            System.out.print("Digite um número:");
            n = t.nextInt();
            s+=n;
            System.out.print("Deseja somar mais um número? [S/N]");
            resp = t.next();
        }while((resp.equals("S"))|| resp.equals("s"));
        System.out.println("A soma dos valores é "+ s);
    }
    
}
