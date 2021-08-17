/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorfatorial;

/**
 *
 * @author Pedro
 */
public class Fatorial {
    private static int num = 0;
    private static int fat = 1;
    private static String formula = "";
    
    public static void setValor(int n){
        int num = n;
        int f = 1;
        String s ="";
        for(int c = n; c>1; c--){
            f*=c;
            s+= c + " x ";
            
        }
        s+="1 = ";
        fat = f;
        formula = s;
                
    }
    public static int getFatorial(){
        return fat;
    }
    public static String getFormula(){
        return formula;
    }
    
}
