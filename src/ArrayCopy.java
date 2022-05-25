import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayCopy {

        static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws IOException {


            int numbers[] = new int [20];
            for (int i = 0; i < 20; i++){
                System.out.println("Input " + i + " element");
                numbers[i] = Integer.parseInt(READER.readLine());
            }
            System.out.println("Array before copying: " + Arrays.toString(numbers));
            
            int[] array1 = new int[10];
            int[] array2 = new int[10];

            array1 = copyTheFirsTen(numbers);
            System.out.println("New Array with the first 10 elements: " + Arrays.toString(array1));

            array2 = copyTheSecondTen(numbers);
            System.out.println("New Array with the second 10 elements: " + Arrays.toString(array2));
        }

        private static int[] copyTheFirsTen(int[] numbers) {
            int[] temp = new int[10];
            System.arraycopy(numbers, 0, temp, 0, 10);
            return temp;
        }

        private static int[] copyTheSecondTen(int[] numbers) {
            int[] temp = new int [10];
            System.arraycopy(numbers, 10, temp, 0, 10);
            return temp;
        }

    }
