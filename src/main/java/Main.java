public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.dostat(3,4);
        System.out.println("�������� �������:");
        matrix.sozdanie(matrix.p, matrix.o);
        System.out.println();
        System.out.println("��������� �������:");
        matrix.slozenie(matrix.a, matrix.b);
        System.out.println();
        System.out.println("���������� �� ����� �������:");
        matrix.umnoznachislo(matrix.a, matrix.f);
        System.out.println();
        System.out.println("������������� �������:");
        matrix.umnozmatrix(matrix.a, matrix.b);
    }
}
