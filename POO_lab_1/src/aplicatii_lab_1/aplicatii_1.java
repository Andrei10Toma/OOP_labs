package aplicatii_lab_1;

public class aplicatii_1 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();

        int[][] a = new int [n][n];
        int[][] b = new int [n][n];

        //citire prima matrice
        System.out.println("a = ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }

        //citire a doua matrice
        System.out.println("b = ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = s.nextInt();
            }
        }

        //matriceca suma
        int[][] suma = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        //afisarea matricea suma
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
