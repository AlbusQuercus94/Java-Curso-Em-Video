/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepitaaula11;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class ExercicioRepitaAula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int q=0;
        int p=0;
        int i=0;
        int s=0;
        int c=0;        
        float m = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um Número. <br><em>Digite 0 (zero) para finalizar.</em></html>",
                    "Digite um número"));
            q++;
            if(n%2==0){
                p++;
            }else{
                i++;
            }
            s+=n;
            m=s/q;
            if(n>100){
                c++;
            }
            
        }while(n!=0);
        JOptionPane.showMessageDialog(null,"<html>Resultado dos valores digitados <hr>"
                + "Quantidade de números digitados: " + q + ";"
                + "<br>Quantidade de números pares: " + p + ";"
                + "<br>Quantidade de números impares: " + i + ";"
                + "<br>Quantidade de números maiores que 100: " + c + ";"
                + "<br>Média dos números: " + m + ";"
                + "</html>");
    }
    
}
