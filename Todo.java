import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {
        String[] tasks = new String[100];
        boolean[] done = new boolean[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("1:追加  2:一覧  3:完了  4:削除  0:終了");
            System.out.print("番号を入力 > ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 0) {
                System.out.println("終了します");
                break;
            } else if (menu == 1) {
                count = add(tasks, done, count, sc);
            } else if (menu == 2) {
                list(tasks, done, count);
            } else if (menu == 3) {
                complete(done, count, sc);
            } else if (menu == 4) {
                count = delete(tasks, done, count, sc);
            } else {
                System.out.println("0〜4 で入力してください");
            }
        }
    }
}
