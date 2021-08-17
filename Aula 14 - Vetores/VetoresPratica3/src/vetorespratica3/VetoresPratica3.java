/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorespratica3;

import java.util.Arrays;

/**
 *
 * @author Pedro
 */
public class VetoresPratica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FOR IT (PARA CADA)
        int n[]= {8,6,700,13,69};
        
        for(int valor:n){//a cada laço, a variável valor recebe o valor de n
            //começando com o n[0] até o último valor. Logo, o laço se repetirá
            //n.length vezes
            System.out.print(valor+" ");
        }
        //Buscando um valor no vetor
        System.out.println("");
        int pos = Arrays.binarySearch(n, 13);
        System.out.println("O número 13 esta na posição " + pos);
        
        Arrays.sort(n);//Classe para ordenar o objeto vetor
        System.out.println("");
        for(int valor:n){//a cada laço, a variável valor recebe o valor de n
            //começando com o n[0] até o último valor. Logo, o laço se repetirá
            //n.length vezes
            System.out.print(valor+" ");
        }
        //Buscando um valor no vetor
        System.out.println("");
        int pos2 = Arrays.binarySearch(n, 13);
        System.out.println("O número 13 esta na posição " + pos2);
        
        //Preencher o vetortodo com o número 7
        Arrays.fill(n,7);
        System.out.println("");
        for(int valor:n){//a cada laço, a variável valor recebe o valor de n
            //começando com o n[0] até o último valor. Logo, o laço se repetirá
            //n.length vezes
            System.out.print(valor+" ");
        }
        
    }
    
}
