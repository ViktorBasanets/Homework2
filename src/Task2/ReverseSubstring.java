package Task2;

public class ReverseSubstring {
    public static void main(String[] args) {

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int from = 2, to = 4;
        System.out.println(array);

        reverse(array, from, to);
        System.out.println(array);
    }

    private static void reverse(char[] array, int from, int to) {

        if(from < 0 || from > to || to >= array.length) {
            System.err.println("\nError: Outside the array!\n" +
                    "Array boundaries: (0, " + (array.length - 1) + ")");
            return;
        }

        for(int i = from, j = to; i < j; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
