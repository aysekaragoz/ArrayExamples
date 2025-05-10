import java.util.Random;
import java.util.Scanner;

public class ArrayApp {
    public static void printarray1D(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) +". eleman : " + array[i] + " ");
        }
    }
    public static void printarray1D(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) +". eleman : " + array[i] + " ");
        }
    }
    public static void array1D_assign(int [] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) +". elemanı : ");
            array[i] = input.nextInt();
        }
    }
    public static int[] array1D_assign() {
        System.out.println("Dizi boyutunu giriniz.");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) +". elemanı : ");
            array[i] = input.nextInt();
        }
        return array;
    }
    public static double[] double_array1D_assign() {
        System.out.println("Dizi boyutunu giriniz.");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + ". elemanı : ");
            array[i] = input.nextDouble();
        }
        return array;
    }
    public static void array_random_assign(int [] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(51);
        }
    }
    public static void array_random_assign(double [] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble(51);
        }
    }
    public static int arraymin(int [] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static double arraymin(double [] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int arraymax(int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static double arraymax(double [] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static double arraymean(int [] array) {
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean += array[i];
        }
        mean /= array.length;
        return mean;
    }
    public static double arraymean(double [] array) {
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean += array[i];
        }
        mean /= array.length;
        return mean;
    }
    public static double[] upside_down_array(double[] array) {
        double temp = 0;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
    public static int[] upside_down_array(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
    public static int[] arrayevennum(int [] array) {
        int evennum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evennum++;
            }
        }
        int []even = new int[evennum];
        evennum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even[evennum] = array[i];
                evennum++;
            }
        }
        return even;
    }
    public static int[] arrayoddnum(int [] array){
        int oddnum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddnum++;
            }
        }
        int []odd = new int[oddnum];
        oddnum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd[oddnum] = array[i];
                oddnum++;
            }
        }
        return odd;
    }
}
