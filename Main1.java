import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] array = toArray(matrix);

        for (int i = 0; i < array.length; i += 3) {
            System.out.println("Row: " + array[i] + ", Col: " + array[i + 1] + ", Value: " + array[i + 2]);
        }
    }

    public static int[] toArray(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    list.add(i);
                    list.add(j);
                    list.add(matrix[i][j]);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
