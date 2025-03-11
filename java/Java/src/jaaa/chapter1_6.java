package jaaa;
import java.util.Scanner;

public class chapter1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(x1, y1), (x2, y2)의 좌표 입력: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // 좌표 정렬 (왼쪽 아래: min, 오른쪽 위: max)

        int x_min = Math.min(x1, x2);
        int y_min = Math.min(y1, y2);
        int x_max = Math.max(x1, x2);
        int y_max = Math.max(y1, y2);

        
        if (x_min >= 10 && y_min >= 10 && x_max <= 200 && y_max <= 300) {
            System.out.printf("(%d,%d), (%d,%d) 사각형은 (10,10), (200,300) 사각형에 포함된다.", x1, y1, x2, y2);
        }
        
        else {
            System.out.printf("(%d,%d), (%d,%d) 사각형은 (10,10), (200,300) 사각형에 포함되지 않는다.", x1, y1, x2, y2);
        }

        scanner.close();
    }
}

/*package jaaa;

// 정렬 없이 if문 사용, 비효율적

import java.util.Scanner;

public class chapter1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(x1, y1), (x2, y2)의 좌표 입력: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        if (x1>=10 && x2<=200 && y1>=10 && y2<=300) {
        	System.out.printf("(%d,%d),(%d,%d) 사각형은 (10,10) (200,300) 사각형에 포함된다.",x1,y1,x2,y2);
        	}
        else if (x2>=10 && x1<=200 && y2>=10 && y1<=300) {
        	System.out.printf("(%d,%d),(%d,%d) 사각형은 (10,10) (200,300) 사각형에 포함된다.",x1,y1,x2,y2);
        	}
        	
        	//그리고 또 다른 경우들 . . .
        	
        else {
        	System.out.printf("(%d,%d),(%d,%d) 사각형은 (10,10) (200,300) 사각형에 포함되지 않는다.",x1,y1,x2,y2);
        	}

        scanner.close();
    }
} */