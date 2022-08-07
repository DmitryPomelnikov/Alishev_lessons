package lesson3;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][] matrice = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < matrice.length; i++) {
            for (int q = 0; q < matrice[i].length; q++) {
                System.out.print(matrice[i][q] + " ");
            }
            System.out.println();
        }
    }
}
