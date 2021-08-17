/*
    Tentando resolver a incompatibilidade de Tipos de Primitivos
 */
package testecompatibilidadetipos;

/**
 *
 * @author Pedro
 */
public class TesteCompatibilidadeTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota = 30;
        /*
        String valor = nota;    Essa linha dá erro porque não se dá para
        converter integer em string, assim como
        String valor = (String) nota;
        String valor = (int) nota;
        Para converter um integer em string é da seguinte forma:       
        */
        String valor = Integer.toString(nota);
        System.out.println(valor);
        /*
        A reciproca é verdadeira, int pra string não pode assim como string para
        int também não pode.
        */
        String value = "30";
        int note = Integer.parseInt(value);//Aqui é String para Integer
        float real = Float.parseFloat(value);//Aqui é String para Float
        System.out.println(note);
        System.out.println(real);
            
    }
    
}
