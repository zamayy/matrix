public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.dostat(3,4);
        System.out.println("Заданные матрицы:");
        matrix.sozdanie(matrix.p, matrix.o);
        System.out.println();
        System.out.println("Сложанная матрица:");
        matrix.slozenie(matrix.a, matrix.b);
        System.out.println();
        System.out.println("Умноженная на число матрица:");
        matrix.umnoznachislo(matrix.a, matrix.f);
        System.out.println();
        System.out.println("Перемноженные матрицы:");
        matrix.umnozmatrix(matrix.a, matrix.b);
    }
}
