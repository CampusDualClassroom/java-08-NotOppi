package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop(4);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        int num2 = 0;
        while (num2 < num){
            System.out.println(num2 + " < " + num + ". El proximo ciclo valdra: " + (num2+1) );
            num2++;
        }
    }
}