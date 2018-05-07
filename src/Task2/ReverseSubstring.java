package Task2;

public class ReverseSubstring {
    public static void main(String[] args) {

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int from = 2, to = 4;

        System.out.print(array);
        System.out.print(" - substring \"");
        showSubstring(array, from, to);
        System.out.print("\" was reversed to \"");
        showReversedSubstring(array, from, to);
        System.out.print("\"");
    }

    static void showSubstring(char[] array, int from, int to) {

        if(from < 0 || from > to || to >= array.length) {
            throw new IndexOutOfBoundsException();
        }

        for(int i = from; i <= to; i++) {
            System.out.print(array[i]);
        }
    }

    static void showReversedSubstring(char[] array,
                                      int from, int to) {
        if(from < 0 || from > to || to >= array.length) {
            throw new IndexOutOfBoundsException();
        }

        for(int i = to; i >= from; i--) {
            System.out.print(array[i]);
        }
    }
}
