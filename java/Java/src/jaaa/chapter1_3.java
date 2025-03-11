package jaaa;
import java.util.Scanner;

public class chapter1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("생일을 입력하세요: ");
        int birth = scanner.nextInt();
        
        int year = birth / 10000;
        int month = (birth % 10000) / 100;
        int day = birth % 100;
        
        System.out.println(year+"년 "+month+"월 "+day+"일");

        scanner.close();
    }
}