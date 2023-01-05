package lesson01_02;

import java.util.Arrays;

public class DecodeTheMessage_2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }

    public static String decodeMessage(String key, String message) {
        //Tạo mảng freq có index bằng giá trị từng phần tử của key
        int[] freq = new int[123];
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i)==' ') {
                continue;
            }
            freq[key.charAt(i)]++;
        }
        System.out.println("Freq = " + Arrays.toString(freq));
        //Tạo mảng alphabet[123], lưu giá trị từ 97 trở đi, mỗi lần gán cho freq = 0. Nếu freq = 0
        //i trỏ vào mảng alphabet, j trỏ vào mảng key
        int[] alphabet = new int[123];
        int i = 97;
        int j = 0;

        while (i < 123 || j > key.length()) {

            if (freq[key.charAt(j)] != 0 && key.charAt(j) != 32) {
                alphabet[i] = key.charAt(j);
                freq[key.charAt(j)] = 0;

                i++;
            }
            j++;
        }

        StringBuilder secret = new StringBuilder();

        //Chạy mảng message --> tại giá trị message bằng giá trị alphabet -> trả về giá trị (char) index
        for (int k = 0; k < message.length(); k++) {
            for (int l = 97; l < alphabet.length; l++) {
                if (message.charAt(k)==alphabet[l])
                {
                    secret.append((char)l);
                    break;
                }
                else if (message.charAt(k)==32) {
                    secret.append((char)32);
                    break;
                }
            }
        }
        return secret.toString();
    }
}
