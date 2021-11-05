import java.util.Scanner;

public class CountOnesinBinary {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();

        }
        int counter = 0;

        for (int i = 0; i <arr.length ;i++){
            if (arr[i] == 1)
                counter++;
        }

        System.out.printf("There are %d ones.", counter);

    }
}
