/*
 * PTra13_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Animal;

public class PTra13_01 extends practice13.common.Animal{

	/*
	 * ★ PTra13_01クラスはcommon.Animalクラスを継承してください
	 */

	public static void main(String[] args) {

		// ★ PTra13_01をインスタンス化をしてください
		Animal PTra13_01 = new Animal();

		// ★ PTra13_01の持つsetterを実行してください（引数："人"）
		PTra13_01.setName("人");

		// ★ PTra13_01の持つインスタンスメソッドrunとbreathを実行してしてください

		PTra13_01.run();
		PTra13_01.breath();

	}
}
