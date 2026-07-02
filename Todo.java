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

  // 追加：入力を配列に入れて、新しい件数を返す
  static int add(String[] tasks, boolean[] done, int count, Scanner sc) {
    System.out.print("やること > ");
    String t = sc.nextLine();
    tasks[count] = t; // ヒント：入力した t を入れる
    done[count] = false; // ヒント：追加した直後は未完了
    count++;
    System.out.println("追加しました");
    return count; // ヒント：新しい count を返す
  }

  // 一覧：完了[x]／未完了[ ] を表示する
  static void list(String[] tasks, boolean[] done, int count) {
    if (count == 0) {
      System.out.println("タスクはありません");
    } else {
      for (int i = 0; i < count; i++) {
        System.out.println((i + 1) + ": [" + (done[i] ? "x" : " ") + "] " + tasks[i]);
      }
    }
  }

  // 完了：n 番目を完了にする
  static void complete(boolean[] done, int count, Scanner sc) {
    System.out.print("完了する番号 > ");
    int n = sc.nextInt();
    sc.nextLine();
    if (n >= 1 && n <= count) {
      done[n - 1] = true; // ヒント：done の n-1 番目を完了にする
      System.out.println("完了にしました");
    } else {
     System.out.println("その番号はありません");
    }
  }

  // 削除：n 番目を消して、新しい件数を返す
  static int delete(String[] tasks, boolean[] done, int count, Scanner sc) {
    System.out.print("削除する番号 > ");
    int n = sc.nextInt();
    sc.nextLine();
    if (n >= 1 && n <= count) {
      for (int i = n - 1; i < count - 1; i++) { // ヒント：詰める範囲
      tasks[i] = tasks[i + 1]; // ヒント：1 つ後ろを前へ
      done[i] = done[i + 1];
    }
    count--;
    System.out.println("削除しました");
    } else {
      System.out.println("その番号はありません");
    }
    return count; // ヒント：新しい count を返す
  }
}
