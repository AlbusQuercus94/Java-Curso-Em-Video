/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author Pedro
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    //Método sem retorno de valor
    static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma dos valores é " + s);
    }
    static int somaR (int a, int b ){
        int s = a+ b;
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa e...");
        soma (5,2);
        int sm = somaR(5,2);
        System.out.println("O resultado do retorno é " + sm);
    }
    
}
