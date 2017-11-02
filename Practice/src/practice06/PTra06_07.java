package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */


		for(int i = -1; i < 5; i++) {

			for(int j = 0; j < i+1; j++) {

				System.out.print("⬛︎︎︎");
			}

			for(int x = 5; x > i+1; x--) {

				System.out.print("⬜︎");
			}

				System.out.println("");
		}

		for(int i = -1; i < 3; i++) {

			for(int j = 4; j > i+1; j--) {

				System.out.print("⬛︎︎︎");
			}

			for(int x = 0; x <= i + 1; x++) {

				System.out.print("⬜︎");
			}

				System.out.println("");
		}


	}
}
