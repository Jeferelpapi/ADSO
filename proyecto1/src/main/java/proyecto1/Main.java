package proyecto1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        int suma = 0;

        for (int i = 1; i <= num; i++) {
            suma += 1;
            System.out.print(suma + " ");
        }
        System.out.println();

        int[] array = {27, 78, 5, 36, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        List<String> frutas = List.of("Pera", "Mango", "Manzanas", "Fresas");
        for (String i : frutas) {
            System.out.print(i + " ");
        }
    }
}
