public class MainApp {
    public static void main(String[] args) {
        double a[][] = new double [3][3];
        double b[][] = new double[3][3];
        ArrayApp2D.random_assign_array2D(a);
        System.out.println();
        ArrayApp2D.random_assign_array2D(b);
        double c[][] = MatrixApp.matrixmultiply(a,b);
        System.out.println();
        ArrayApp2D.print_array2D(c);
    }
}
