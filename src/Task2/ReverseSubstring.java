package Task2;

public class ReverseSubstring {
    public static void main(String[] args) {

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int from = -1, to = 6;

        System.out.print(array);
        showSubstring(array, from, to);
        showReversedSubstring(array, from, to);
        System.out.print("\"");
    }

    private static void showSubstring(char[] array, int from, int to) {

        if(from < 0 || from > to || to >= array.length) {

            System.out.println();
            System.err.println("Error: Outside the array!\n" +
                    "Array boundaries: (0, " + (array.length - 1) + ")");
            System.exit(-1);
        }

        System.out.print(" - substring \"");
        for(int i = from; i <= to; i++) {
            System.out.print(array[i]);
        }
    }

    private static void showReversedSubstring(char[] array,
                                      int from, int to) {
        if(from < 0 || from > to || to >= array.length) {

            System.out.println();
            System.err.println("Error: Outside the array!\n" +
                    "Array boundaries: (0, " + (array.length - 1) + ")");
            System.exit(-1);
        }

        System.out.print("\" was reversed to \"");
        for(int i = to; i >= from; i--) {
            System.out.print(array[i]);
        }
    }
}
