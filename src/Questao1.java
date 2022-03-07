
//# Questão 01
//
//A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista
// após a ordenação. Dada uma lista de números com um número ímpar de elementos,
// desenvolva um algoritmo que encontre a mediana.


import java.util.ArrayList;
import java.util.List;

public class Questao1 {
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(6);

        // Esse for ordena o array, usei o List achei mais facil
        for(int i = 0; i < arr.size(); i++){
            for( int j = 0; j < arr.size(); j++){
                if (arr.get(j) > arr.get(i)){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }

        // Esse trecho acha a mediana apesar de imprimir mais de 1 resultado
        for(int i = 0; i < arr.size(); i++){
            int esquerda = 0;
            int direita = arr.size() - 1;
            int mediana = (esquerda + direita) / 2;
            System.out.println(arr.get(mediana));
        }
    }
}
