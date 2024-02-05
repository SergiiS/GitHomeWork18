public class TrainingCombatMatrix {
    public static void main(String[] args) {
        int[][] matrix = createTrainingCombatMatrix(8, 8);

        for(int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static int[][] createTrainingCombatMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (i % 2 == 0) ? j + 1 : cols - j;
            }
        }
        return matrix;
    }
}
