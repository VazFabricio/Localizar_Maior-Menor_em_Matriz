import java.util.Random;

public class Main {
    private static int [][] maiorEMenor (int [][] array) {
        int [][] maiorEmenor = new int[2][3];
        int maior = array[0][0];
        int menor = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>maior){
                    maior = array[i][j];
                    maiorEmenor[0][0] = maior;
                    maiorEmenor[0][1] = i;
                    maiorEmenor[0][2] = j;
                } else if (array[i][j] < menor) {
                    menor = array[i][j];
                    maiorEmenor[1][0] = menor;
                    maiorEmenor[1][1] = i;
                    maiorEmenor[1][2] = j;
                }
            }
        }
        return maiorEmenor;
    }
    private static void exibreArray (int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static void exibeMaiorMenorPosicao (int [][] array){
        int i = 0;
        int j = 0;
            System.out.println("O maior elemento e o: " + array[i][j]);
            System.out.println("A posicao do maior elemento: " +"["+ array[i][j+1] + "] ["+ array[i][j+2]+"]");
            System.out.println("O menor elemento e o: " + array[i+1][j]);
            System.out.println("A posicao do menor elemento: " + "["+ array[i+1][j+1]+ "] ["+ array[i][j+2]+"]");

    }
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int [][] numeros = new int[6][3];
        for (int i = 0; i< numeros.length; i++){
            for (int j = 0; j<numeros[i].length; j++){
                numeros[i][j] = aleatorio.nextInt(0, 10);
            }
        }
        System.out.println("---Matriz---");
        exibreArray(numeros);
        System.out.println("__________");
        exibeMaiorMenorPosicao(maiorEMenor(numeros));


    }
}