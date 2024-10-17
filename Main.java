//public class Main {
//    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int n = matrix.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//public class Main {
//    public int[][] transpose(int[][] A){
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int rows = A.length;
//        int cols = A[0].length;
//
//        int[][] new_matrix = new int[cols][rows];
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<cols; j++){
//                new_matrix[j][i] = A[j][i];
//            }
//        }
//        return new_matrix;
//    }
//}
///*
//
//example:
//[
//    [1, 2, 3];
//    [4, 5, 6];
//    [7, 8, 9]
//]
//
//[
//    [1, 4, 7];
//    [2, 5, 8];
//    [3, 6, 9]
//]
// */
public class Main {

    public static int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] new_matrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                new_matrix[j][i] = A[i][j];
            }
        }

        return new_matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = transpose(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
