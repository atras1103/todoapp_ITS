import java.util.Scanner;
public class Todo {
  public static void main(String[] args) {
    String[] tasks = new String[100]; // タスク（最大100件）
    int count = 0;                    // 件数
    Scanner sc = new Scanner(System.in);
    while (true) {
      // メニューを表示して番号を読む
      int choice = sc.nextInt();
      if (choice == 0) { break; }
      else if (choice == 1) { /* 追加：第9回 */ }
      else if (choice == 2) { /* 一覧：第9回 */ }
      // 3:完了 / 4:削除 は第10回
    }
  }
}