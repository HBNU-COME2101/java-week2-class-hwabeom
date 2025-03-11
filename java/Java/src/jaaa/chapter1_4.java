package jaaa;
import java.util.Scanner;

public class chapter1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("여행지를 입력하세요: ");
        String trip = scanner.nextLine(); //문자열은 String으로...
        System.out.print("인원을 입력하세요: ");
        int peep = scanner.nextInt();
        System.out.print("숙박일을 입력하세요: ");
        int day = scanner.nextInt();
        System.out.print("인당 항공료를 입력하세요: ");
        int airfare = scanner.nextInt();
        System.out.print("한 방의 숙박비를 입력하세요: ");
        int lodging = scanner.nextInt();
        
        int rooms=(peep+1)/2; //방 하나에는 두 명 투숙, 한 명만 투숙하더라도 한 방의 비용을 지불하므로
        int cost=(peep*airfare)+(rooms*lodging*day); //총 가격=인원*항공료+방 수*숙박비*숙박일
        
        System.out.println(peep+"명의 "+trip+" "+day+"박 "+(day+1)+"일 여행에는 방이 "+rooms+"개 필요하며 경비는 "+cost+"원입니다.");

        scanner.close();
    }
}