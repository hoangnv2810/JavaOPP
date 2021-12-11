package QuayHinhVuong;

public class Matrix {
    private int[][] mx;

    public Matrix(int[] mx) {
        this.mx = new int[2][3];
        int idx = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                this.mx[i][j] = mx[idx++];
            }
        }
    }

    public Matrix(int[][] mx){
        this.mx = mx;
    }

    public int[][] getMx() {
        return mx;
    }

    public Matrix turnLeft() {
        int tmp = mx[0][0];
        mx[0][0] = mx[1][0];
        mx[1][0] = mx[1][1];
        mx[1][1] = mx[0][1];
        mx[0][1] = tmp;
        return new Matrix(mx);
    }

    public void turnRight(){
        int tmp = mx[0][1];
        mx[0][1] = mx[1][1];
        mx[1][1] = mx[1][2];
        mx[1][2] = mx[0][2];
        mx[0][2] = tmp;
    }

    public void printMatrix() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mx[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (mx[i][j] != ((Matrix) o).mx[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
