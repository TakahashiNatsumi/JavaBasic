package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] cars = new Car[3];

		Car car1 = new Car();
		car1.color = "緑";
		car1.gasoline = 25;
		cars[0] = car1;

		Car car2 = new Car();
		car2.color = "青";
		car2.gasoline = 30;
		cars[1] = car2;

		Car car3 = new Car();
		car3.color = "赤";
		car3.gasoline = 10;
		cars[2] = car3;



		for (Car car : cars) {

			int restDistance = 100;
			int count = 0;

			while(true) {		//car1

				int result = car.run();

				if(result == -1) {
					System.out.println(car.color + "台目は目的地に到達できませんでした");
					break;

				}

				restDistance -= result;
				count++;

				if (restDistance <= 0) {

					System.out.println(car.color + "は目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです。");
					break;
				}


			}

		}
	}
}
