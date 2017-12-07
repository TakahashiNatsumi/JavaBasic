/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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

				player.setCountry(lineArray[2]);
				player.setName(lineArray[1]);
				player.setPosition(lineArray[0]);
				player.setTeam(lineArray[3]);

				array.add(player);

			}

		}catch(IOException e){

			System.out.println("例外発生");

		}



		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		Collections.shuffle(array);
		int count = 0;

		for(int i = 0; i<array.size(); i++) {

			Player playerlist = new Player();
			playerlist = array.get(i);
			String position = playerlist.getPosition();

			if(position.equals("GK")) {
				if(count  < 1) {
					System.out.println(playerlist);
					count++;
				}

				}
		}

			int count2 = 0;

			for(int i = 0; i<array.size(); i++) {

				Player playerlist = new Player();
				playerlist = array.get(i);
				String position = playerlist.getPosition();

				if(position.equals("DF")) {
					if(count2  < 4) {
						System.out.println(playerlist);
						count2++;
					}

					}
			}


				int count3 = 0;
				for(int i = 0; i<array.size(); i++) {

					Player playerlist = new Player();
					playerlist = array.get(i);
					String position = playerlist.getPosition();

					if(position.equals("MF")) {
						if(count3  < 4) {
							System.out.println(playerlist);
							count3++;
						}

						}
				}

				int count4 = 0;
				for(int i = 0; i<array.size(); i++) {

					Player playerlist = new Player();
					playerlist = array.get(i);
					String position = playerlist.getPosition();

					if(position.equals("FW")) {
						if(count4  < 2) {
							System.out.println(playerlist);
							count4++;
						}

						}
				}






		}
	}

