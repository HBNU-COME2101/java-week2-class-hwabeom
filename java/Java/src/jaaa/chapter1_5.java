package jaaa;
import java.util.Scanner;

public class chapter1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하시오: ");
        int age = scanner.nextInt();
        
        if (age<=0) { //나이가 0이나 음수일 경우
        	System.out.println("나이는 양수로만 입력하세요.");
        	System.exit(1);
        }
        
        int red=age/10;
        int blue=(age%10)/5;
        int yellow=age%5;
        
        String result="";
        
        //특정 초의 개수가 0개일 경우 그 초의 문자열은 출력되지 않도록

        if (red > 0) result += "빨간 초 " + red + "개, ";
        if (blue > 0) result += "파란 초 " + blue + "개, ";
        if (yellow > 0) result += "노란 초 " + yellow + "개, ";
        
        result=result.substring(0,result.length()-2); //쉼표 및 공백 제거
        
        System.out.println(result+". 총 "+(red+blue+yellow)+"개가 필요합니다.");

        scanner.close();
    }
}