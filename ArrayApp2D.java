import java.util.Random;
import java.util.Scanner;

public class ArrayApp2D {
    public static void print_array2D(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print_array2D(double [][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void assign_array2D (int[][] array2D) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("Dizinin "+ (i+1) +". satırının "+ (j+1) +". elemanı : ");
                array2D[i][j] = input.nextInt();
            }
        }
    }
    public static void assign_array2D (double [][] array2D) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("Dizinin "+ (i+1) +". satırının "+ (j+1) +". elemanı : ");
                array2D[i][j] = input.nextDouble();
            }
        }
    }
    public static void assign_array2D() {
        System.out.println("Dizinin satır sayısını giriniz.");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        System.out.println("Dizinin sütun sayısını giriniz.");
        int column = input.nextInt();
        int[][] array2D = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Dizinin "+ (i+1) +". satırının "+ (j+1) +". elemanı : ");
                array2D[i][j] = input.nextInt();
            }
        }
    }
    public static int[][] random_assign_array2D() {
        System.out.println("Dizinin satır sayısını giriniz.");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        System.out.println("Dizinin sütun sayısını giriniz.");
        int column = input.nextInt();
        int[][] array2D = new int[row][column];
        Random rand = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array2D[i][j] = rand.nextInt(100);
            }
        }
        return array2D;
    }
    public static void random_assign_array2D(double[][]array2D) {
        Random rand = new Random();
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = rand.nextInt(100);
            }
        }
        for(int i = 0;i<array2D.length;i++) {
            for(int j = 0;j<array2D[i].length;j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void random_assign_array2D(int[][]array2D) {
        Random rand = new Random();
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0;i<array2D.length;i++) {
            for(int j = 0;j<array2D[i].length;j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] max_row_array2D(int[][] array2D) {
        int []maxnum = new int[array2D.length];
        for (int i = 0; i < array2D.length; i++) {
            int max = array2D[i][0];
            for (int j = 1; j < array2D[i].length; j++) {
                if(array2D[i][j] > max) {
                    max = array2D[i][j];
                }
            }
            maxnum[i] = max;
        }
        return maxnum;
    }
    public static double[] max_row_array2D(double[][]array2D){
        double []maxnum = new double[array2D.length];
        for (int i = 0;i < array2D.length; i++){
            double max = array2D[i][0];
            for (int j = 1; j < array2D[i].length; j++) {
                if(array2D[i][j] > max) {
                    max = array2D[i][j];
                }
            }
            maxnum[i] = max;
        }
        return maxnum;
    }
    public static int[] min_row_array2D(int[][] array2D) {
        int []minnum = new int[array2D.length];
        for (int i = 0; i < array2D.length; i++) {
            int min = array2D[i][0];
            for (int j = 1; j < array2D[i].length; j++) {
                if(array2D[i][j] < min) {
                    min = array2D[i][j];
                }
            }
            minnum[i] = min;
        }
        return minnum;
    }
    public static double[] min_row_array2D(double[][]array2D){
        double []minnum = new double[array2D.length];
        for (int i = 0;i < array2D.length; i++){
            double min = array2D[i][0];
            for (int j = 1; j < array2D[i].length; j++) {
                if(array2D[i][j] < min) {
                    min = array2D[i][j];
                }
            }
            minnum[i] = min;
        }
        return minnum;
    }
    public static int[] max_col_array2D(int[][] array2D) {
        int []maxnum = new int[array2D.length];
        int max = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if(array2D[j][i] > max) {
                    max = array2D[j][i];
                }
            }
            maxnum[i] = max;
            max = array2D[i][0];
        }
        return maxnum;
    }
    public static double[] max_col_array2D(double [][] array2D){
        double []maxnum =new double[array2D.length];
        double max = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if(array2D[j][i] > max) {
                    max = array2D[j][i];
                }
            }
            maxnum[i] = max;
            max = array2D[i][0];
        }
        return maxnum;
    }
    public static int [] min_col_array2D(int[][] array2D) {
        int []minnum = new int[array2D.length];
        int min = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[j][i] < min) {
                    min = array2D[j][i];
                }
            }
            minnum[i] = min;
            min = array2D[i][0];
        }
        return minnum;
    }
    public static double [] min_col_array2D(double[][] array2D){
        double []minnum = new double[array2D.length];
        double min = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[j][i] < min) {
                    min = array2D[j][i];
                }
            }
            minnum[i] = min;
            min = array2D[i][0];
        }
        return minnum;
    }
    public static double[] mean_row_array2D(int[][] array2D) {
        double []meannum = new double[array2D.length];
        double mean=0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                mean += array2D[i][j];
            }
            mean /= array2D[i].length;
            meannum[i]=mean;
        }
        return meannum;
    }
    public static double[] mean_row_array2D(double [][] array2D) {
        double[] meannum = new double[array2D.length];
        double mean = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                mean += array2D[i][j];
            }
            mean /= array2D[i].length;
            meannum[i] = mean;
        }
        return meannum;
    }
    public static double[] mean_col_array2D(int[][] array2D) {
        double meannum[] = new double[array2D.length];
        double mean = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                mean += array2D[j][i];
            }
            mean /= array2D.length;
            meannum[i] = mean;
            mean=0;
        }
        return meannum;
    }
    public static double[] mean_col_array2D(double[][] array2D) {
        double meannum[] = new double[array2D.length];
        double mean = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                mean += array2D[j][i];
            }
            mean /= array2D.length;
            meannum[i] = mean;
            mean=0;
        }
        return meannum;
    }
}
