/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class SopaLetras {

    //Atributo encapsulado
    private char[][] matrizSopa;

    //Insertamos constructor
    public SopaLetras(int filas, int columnas) {
        this.matrizSopa = new char[filas][columnas];
        Random r = new Random();
        //Bucle para ir rellenando cada posición de la A-Z de forma aleatoria
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int letraAleatoria = r.nextInt(65, 91);
                this.matrizSopa[i][j] = (char) letraAleatoria;
            }
        }
    }

    //Insertamos los getter y los setter
    public char[][] getMatrizSopa() {
        return matrizSopa;
    }

    public void setMatrizSopa(char[][] matrizSopa) {
        this.matrizSopa = matrizSopa;
    }

    //Insertamos toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SopaLetras{");
        sb.append("matrizSopa=").append(matrizSopa);
        sb.append('}');
        return sb.toString();
    }

    //Insertamos equal y hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Arrays.deepHashCode(this.matrizSopa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SopaLetras other = (SopaLetras) obj;
        return Arrays.deepEquals(this.matrizSopa, other.matrizSopa);
    }

    //Mostrar matriz
    public void mostrarMatriz() {
        for (int i = 0; i < this.matrizSopa.length; i++) {
            for (int j = 0; j < this.matrizSopa[i].length; j++) {
                System.out.print(this.matrizSopa[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Método que recibe una coordenada de la matriz y un String con la palabra
    // y pone la palbra horizontalmente en la matriz a partir de la coordenada 
    //indicada
    public void colocarPalabraHorizontal(
            int filaCoordenada, int columnaCoordenada, String palabra) {
        
        //Convertir a char el string que le ha pasado el usuario
        char[] palabraChar = new char[palabra.length()];
        //Bucle para ir recorriendo y rellenando sin que se salga
        for (int i = (filaCoordenada - 1); i <= (filaCoordenada + 1); i++) {
            if (!(i < 0 || i >= matrizSopa.length)) {
                for (int j = (columnaCoordenada - 1); j <= (columnaCoordenada + 1); j++) {
                    if (!(j < 0 || j >= matrizSopa[i].length)) {
                        if (palabra.length() <= columnaCoordenada){
                            
                        }
                    }
                }
            }
        }
    }
}
