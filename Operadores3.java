//Operadores 3
public class Operadores3 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;//boolean: ele que irá dizer se é falso ou verdadeiro
        System.out.println("numero 1 é igual a numero 2 ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero 1 é diferente do numero 2 ? " + simNao);

        if(numero1 > numero2)
                System.out.println("Numero 1 maior que numero 2");
        
        if(numero1 < numero2)
                System.out.println("Numero 1 menor que numero 2");   

        
    }
}
