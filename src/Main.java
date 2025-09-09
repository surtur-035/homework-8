import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));

        double[] fractionalNum = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(fractionalNum));

        String[] gamesToPlay = {"Hollow Knight: Silksong", "Dark souls 2", "Sekiro: Shadows Die Twice", "Resident Evil Village"};
        System.out.println(Arrays.toString(gamesToPlay));

        System.out.println("Задание 2");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1){
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        for (int i = 0; i < fractionalNum.length; i++) {
            if (i == fractionalNum.length - 1){
                System.out.println(fractionalNum[i]);
                break;
            }
            System.out.print(fractionalNum[i] + ", ");
        }

        for (int i = 0; i < gamesToPlay.length; i++) {
            if (i == gamesToPlay.length - 1){
                System.out.println(gamesToPlay[i]);
                break;
            }
            System.out.print(gamesToPlay[i] + ", ");
        }

        System.out.println("Задание 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == numbers.length - 3){
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        for (int i = fractionalNum.length - 1; i >= 0; i--) {
            if (i == fractionalNum.length - 3){
                System.out.println(fractionalNum[i]);
                break;
            }
            System.out.print(fractionalNum[i] + ", ");
        }

        for (int i = gamesToPlay.length - 1; i >= 0; i--) {
            if (i == gamesToPlay.length - 4){
                System.out.println(gamesToPlay[i]);
                break;
            }
            System.out.print(gamesToPlay[i] + ", ");
        }

        System.out.println("Задание 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 !=0){
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.print(Arrays.toString(numbers));

    }
}
