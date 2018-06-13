package theme_2_2.lab_2_2_1;

class Matrix {

    static int[][] add(int[][] a, int[][] b) {
        int c[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        return c;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int c[][] = new int[a.length][a[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}
