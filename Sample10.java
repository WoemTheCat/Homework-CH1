import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample10 {
    public static void main(String[] args) {
        System.out.println("請輸入一個整數");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String str1;
        try {
            str1 = br1.readLine();
        } catch (IOException e) {
            throw new RuntimeException("There is something wrong with the input.");
        }

        int num = Integer.parseInt(str1);

        System.out.println("您輸入的數字是:" + num);

        System.out.println("請輸入字串");

        String str2;
        try {
            str2 = br1.readLine();
        } catch (IOException e) {
            throw new RuntimeException("There is something wrong with the input.");
        }
        System.out.println("剛剛輸入的字串是:" + str2);
    }
}