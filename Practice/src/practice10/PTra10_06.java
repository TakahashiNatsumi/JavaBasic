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

		Car car1 = new Car();

			car1.color = "緑";
			car1.gasoline = 25;

		Car car2 = new Car();

			car2.color = "青";
			car2.gasoline = 30;

		Car car3 = new Car();

			car3.color = "赤";
			car3.gasoline = 15;

		int restDistance = 100;
		int count = 0;

			while(true) {		//car1

				int result = car1.run();

//				System.out.println("count:" + count);
//				System.out.println("result:" + result);

				if(result == -1) {

					break;

				}

				restDistance -= result;
				count++;

				if (restDistance <= 0) {

					System.out.println("car1は目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです。");
					break;
						}


			}

			while(true) {		//car2

				int result = car2.run();

				if(result == -1) {

					break;

				}

				restDistance -= result;
				count++;

				if (restDistance <= 0) {

					System.out.println("car2は目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです。");
					break;
						}


			}

			while(true) {		//car3

				int result = car3.run();

				if(result == -1) {

					break;

				}

				restDistance -= result;
				count++;

				if (restDistance <= 0) {

					System.out.println("car3は目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです。");
					break;
						}


			}

	}
}
