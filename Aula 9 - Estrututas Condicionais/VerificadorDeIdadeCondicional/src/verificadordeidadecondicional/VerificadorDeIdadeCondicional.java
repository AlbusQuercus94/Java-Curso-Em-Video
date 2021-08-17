/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadordeidadecondicional;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class VerificadorDeIdadeCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite aqui o ano de nascimento:");
        int nasc = teclado.nextInt();
        int idade = Calendar.getInstance().get(Calendar.YEAR)- nasc;
        System.out.println("Sua idade é "+idade);
        if(idade>=18){
            System.out.println("Você já é maior de idade");
        }else{
            System.out.println("Você ainda é menor de idade");
        }
    }
    
}
