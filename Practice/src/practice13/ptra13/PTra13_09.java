/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee[] employee = new Employee[3];
		employee[0] = new Employee();
		employee[1] = new Employee();
		employee[2] = new Employee();

		for(int i = 0; i < 3; i++) {

			employee[i].setUserNm(NAMEDATA[i]);

		}

		for(int i = 0; i < 3; i++) {

			employee[i].setMail(MAILDATA[i]);

		}

		for(int i = 0; i < 3; i++) {

			employee[i].setPassword(PASSDATA[i]);

		}

		for(int x = 0; x<3; x++) {

			String departmentNm = QUATERDATA[0][x];
			employee[x].setDepartmentNm(departmentNm);

		}

		for(int x = 0; x<3; x++) {

			int departmentCnt = Integer.parseInt(QUATERDATA[1][x]);
			employee[x].setDepertmentCnt(departmentCnt);

		}

		for(int i = 0; i<3; i++) {

			System.out.println(employee[i].getUserNm());
			System.out.println(employee[i].getMail());
			System.out.println(employee[i].getPassword());
			System.out.println(employee[i].getDepartmentNm());
			System.out.println(employee[i].getDepertmentCnt());

		}


	}
}
