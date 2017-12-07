/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		ArrayList<Player> array = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){

			while(scanner.hasNext()) {
				Player player = new Player();

				String line = scanner.nextLine();
				String[] lineArray = line.split(",",4);

				player.setCountry(lineArray[0]);
				player.setName(lineArray[1]);
				player.setPosition(lineArray[2]);
				player.setTeam(lineArray[3]);

				array.add(player);

			}

		}catch(IOException e){

			System.out.println("例外発生");

		}


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

			for (int i = array.size()-1; i >= 0; i--) {
				Player playerlist = new Player();
				playerlist = array.get(i);
				String teamName = playerlist.getTeam();

				if(teamName.equals("レアル・マドリード")) {

					array.remove(i);

				}else if(teamName.equals("バルセロナ")) {

					array.remove(i);

				}


			}


		// ★ 削除後のArrayListの中身を全件出力してください

			for(Player i: array) {

				System.out.println(i.toString());

			}

	}
}
