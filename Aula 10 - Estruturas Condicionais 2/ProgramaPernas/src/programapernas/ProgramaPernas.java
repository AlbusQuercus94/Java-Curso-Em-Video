/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Digite aqui quantas pernas o animal tem:");
        int pernas = t.nextInt();
        String tipo = "";
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Artrópode";
                break;
            case 8:
                tipo = "Artrópode";
                break;
            default:
                tipo = "E.T";
                break;
                
        }
        System.out.println(tipo);
    }
    
}
