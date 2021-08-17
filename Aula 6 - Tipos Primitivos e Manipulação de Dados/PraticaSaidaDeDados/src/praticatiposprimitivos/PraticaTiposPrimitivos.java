/*
    Este arquivo faz parte da prática da aula 6 do Curso em Video de Java
    A finalidade da prática é testar sobre os tipos primitivos e Manipulação de dados
 */
package praticatiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class PraticaTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        /*
            System.in é a entrada de dados
            .nextLine() é o código para poder ler o que será digitado,
            passar como o objeto teclado, que por fim se torna a variável nome.
            .nextLine() só serve pra string
            .nextFloat() vai ler o que está digitado e verificar se é um float,
            ou seja, um número real.
        */
        char letra = 'P';
        System.out.print("Digite o nome do aluno:"); 
        String nome = teclado.nextLine();
        boolean verdade = true;
        System.out.print("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.println("Sua note é de "+nota);
        System.out.printf("A nota %c de %s é de %.2f? %b \n",letra,nome,nota,verdade);
        System.out.format("A nota %c de %s é de %.2f? %b \n",letra,nome,nota,verdade);
        /*
            format é o mesmo que printf
            %c é para substituir por character
            %s é para substituir por String
            %.2f é para substituir por float e o .2 regra quantas casas decimais
            %b é para substituir por boolean
        */
    }
    
}
