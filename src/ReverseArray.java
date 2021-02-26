import java.util.Arrays;

public class ReverseArray {
    private static void reverse(String[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            String s = array[i];
            array[i] = array[j];
            array[j] = s;
        }
    }

    public static void main(String[] args) {
        String[] strings = {"h", "e", "l", "l", "o", "!"};

        System.out.println("Source array: " + Arrays.toString(strings));
        reverse(strings);
        System.out.println("Reverse array: " + Arrays.toString(strings));
    }
}
