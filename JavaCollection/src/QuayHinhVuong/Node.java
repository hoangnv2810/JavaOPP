package QuayHinhVuong;

public class Node {
    private int[][] matrix;
    private int level;

    public Node(int[][] matrix, int level) {
        this.matrix = matrix;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Node turnLeft() {
        int tmp[][]  = new int[2][3];
        tmp[0][0] = matrix[1][0];
        tmp[1][0] = matrix[1][1];
        tmp[1][1] = matrix[0][1];
        tmp[0][1] = matrix[0][0];
        tmp[0][2] = matrix[0][2];
        tmp[1][2] = matrix[1][2];
        return new Node(tmp, level);
    }

    public Node turnRight(){
        int tmp[][] = new int[2][3];
        tmp[0][1] = matrix[1][1];
        tmp[1][1] = matrix[1][2];
        tmp[1][2] = matrix[0][2];
        tmp[0][2] = matrix[0][1];
        tmp[0][0] = matrix[0][0];
        tmp[1][0] = matrix[1][0];
        return new Node(tmp, level);
    }

    @Override
    public boolean equals(Object o) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] != ((Node) o).matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
