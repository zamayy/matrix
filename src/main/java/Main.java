public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        Matrix matrix2 = new Matrix(3,3);
        Matrix matrix3 = new Matrix(3,3);
        Matrix matrix4 = new Matrix(3,3);
        Matrix matrix5 = new Matrix(3,3);
        matrix1.output();
        System.out.println();
        matrix2.output();
        System.out.println();
        matrix3 = matrix1.mplus(matrix2);
        matrix3.output();
        System.out.println();
        matrix4 = matrix1.umnoznachislo(2);
        matrix4.output();
        System.out.println();
        matrix5 = matrix1.umnozmatrix(matrix2);
        matrix5.output();
        
    }
}
