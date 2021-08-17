/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Pedro
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 4;
        float media = (n1+n2)/2;
        System.out.println("A média é igual a "+media);
        
        n1++;
        n2--;
        System.out.println("A média é igual a "+ (n1+n2)/2);
        
        n1+=n2;
        n2*=n1;
        System.out.println(n1);
        System.out.println(n2);
        
        float n3 = 8.55468f;
        double cima = Math.ceil(n3); //arredonda o valor para cima
        double baixo = Math.floor(n3);//arredonda o valor para baixo
        double normal = Math.round(n3);//arredonda aritmeticamente
        
        System.out.println(cima);
        System.out.println(baixo);
        System.out.println(normal);
               
    }
    
}
