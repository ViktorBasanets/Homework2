package Task3;

public class FrequencyOfChar {

    public static void main(String[] args) {

        char[] string = "aaa156aadfsdaeraaaawq".toCharArray();
        char character = 'a';

        System.out.println(frequencyChar(string, character));
    }

    private static int frequencyChar(char[] string, char character) {

        int counter = 0;

        for(int i = 0; i < string.length; i++) {
            if(string[i] == character) {
                counter++;
            }
        }

        return counter;
    }
}
