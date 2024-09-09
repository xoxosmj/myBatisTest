package user.main;

import user.service.*;

import java.util.Scanner;

public class UserMain {

    public void menu() {
        Scanner sc = new Scanner(System.in);
        UserService userService = null;

        while (true) {
            System.out.println();
            System.out.println("***************");
            System.out.println("    1.등록");
            System.out.println("    2.출력");
            System.out.println("    3.수정");
            System.out.println("    4.삭제");
            System.out.println("    5.검색");
            System.out.println("    6.종료");
            System.out.println("***************");
            System.out.print("번호 입력 : ");

            // 숫자 입력 예외 처리
            if (!sc.hasNextInt()) {
                System.out.println("올바른 번호를 입력하세요.");
                sc.next(); // 잘못된 입력값 버리기
                continue; // 다음 반복으로
            }

            int num = sc.nextInt();

            if (num == 6) {
                break;
            } else if (num >= 1 && num <= 5) {
                switch (num) {
                    case 1: userService = new UserInsertService(); break;
                    case 2: userService = new UserSelectService(); break;
                    case 3: userService = new UserUpdateService(); break;
                    case 4: userService = new UserDeleteService(); break;
                    case 5: userService = new UserSearchService(); break;
                }
                userService.execute();
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
        sc.close(); // Scanner 사용 후 닫기
    }

    public static void main(String[] args) {
        new UserMain().menu();
        System.out.println("프로그램 종료");
    }
}