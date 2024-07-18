package lab2bimestra3;

public class Lab2Bimestra3 {

    public static void main(String[] args) {
        int matriz[][] = {{5, 7, 9}, {4, 2, 1}, {1, 1, 1}};
        int matriz2[][] = new int[3][3];
        int fila = 2;
        int columna = 2;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz2[fila][columna] = matriz[i][j];
                columna--;
            }
            fila--;
            columna = 2;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz2[i][j] + "|");
            }
            System.out.println("");
        }

    }
}
