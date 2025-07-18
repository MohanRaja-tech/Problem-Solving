import java.util.*;

public class Main {

    
    public static void reverse(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

  
    public static void encode(char[] arr, int k) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '-') {
                arr[i] = (char) ((int) arr[i] + k + count);
                count++;
            }
        }
        reverse(arr);
    }

   
    public static void decode(char[] arr, int k) {
        reverse(arr);

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '-') {
                arr[i] = (char) ((int) arr[i] - k - count);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        String original = "I love to code java";
        int k = 2;

      
        StringBuilder sb = new StringBuilder();
        for (char ch : original.toCharArray()) {
            if (ch == ' ') {
                sb.append('-');
            } else {
                sb.append(ch);
            }
        }

        char[] arr = sb.toString().toCharArray();

      
        encode(arr, k);
        System.out.println("Encoded: " + new String(arr));
        decode(arr, k);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '-') {
                arr[i] = ' ';
            }
        }

       
        System.out.println("Decoded: " + new String(arr));
    }
}
