package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User[] users = new User[3];

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		Scanner scanner = new java.util.Scanner(System.in);


		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start

		int count = 0;

		for(int i = 0; i < users.length; i++) {

			count++;
			users[i] = new User();

			System.out.println(count + "人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line = scanner.next();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String[] array = line. split(",",4);

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			int userIdnum = Integer.parseInt(array[0]);
			users[i].userId = userIdnum;
			users[i].userNm = array[1];
			users[i].mail = array[2];
			users[i].passward = array[3];




		}//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

		for(int y = 0; y < users.length; y++) {

			System.out.println(users[y].userId);
			System.out.println(users[y].userNm);
			System.out.println(users[y].mail );
			System.out.println(users[y].passward);

		}

	}
}
