/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
public class Main {

    public static void main(String[] args) {
        SopaLetras sopa = new SopaLetras(10, 10);

        //Método para colocar la palabra horizontalmente
        sopa.colocarPalabraHorizontal(1, 5, "Hola");
        //Método para colocar la palabra horizontalmente de forma inversa
        sopa.colocarPalabraHorizontalInvertida(2, 8, "Hola");
        //Método para colocar la palabra verticalmente
        sopa.colocarPalabraVertical(3, 5, "Hola");
        //Método para colocar la palabra verticalmente de forma inversa
        sopa.colocarPalabraVerticalInvertida(7, 0, "Hola");

        //Mostramos la sopa
        sopa.mostrarMatriz();
    }
}
