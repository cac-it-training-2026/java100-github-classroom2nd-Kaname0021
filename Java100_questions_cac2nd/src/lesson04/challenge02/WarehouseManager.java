package lesson04.challenge02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		System.out.println("Z先輩：");
		System.out.println("それではこれより新人研修の第2回目を始めます。\n");
		System.out.println("Yさん：");
		System.out.println("はい、よろしくお願いします。\n");

		System.out.println("Z先輩：");
		System.out.println("今回の研修では、配列の要素を予め決めておくことはせず、");
		System.out.println("お客様のご要望にお答えする形にします。\n");

		System.out.println("Yさん：");
		System.out.println("はい,わかりました。\n");

		System.out.println("Z先輩：");
		System.out.println("あ、お客様がご来店だ!\n");

		System.out.println("Z先輩：");
		System.out.println("いらっしゃいませ、ご要望をどうぞ。\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("データ型を選んでください（1...文字、2...文字列、3...数値）＞");

		String dataTypestr = reader.readLine();
		int dataType = Integer.parseInt(dataTypestr);

		System.out.print("\n要素数を選んでください（1...1個、2...2個、3...3個）＞");

		String dataNumstr = reader.readLine();
		int dataNum = Integer.parseInt(dataNumstr);

		boolean errFlag = false;

		//ここに入力値の範囲チェック処理を記述する。
		if ((dataType < 1 || dataType > 3) || (dataNum < 1 || dataNum > 3)) {
			errFlag = true;
		}

		if (!errFlag) {
			System.out.println("\nZ先輩：");
			System.out.println("中に入れる値はおまかせという事でよろしいですね。");
			System.out.println("ご注文を承りました。\n");

			System.out.println("Z先輩：");
			System.out.println("Yさん、作成をお願いしてもいいかな？\n");

			System.out.println("Yさん：");
			System.out.println("はい、作成させていただきます。\n");

			char[] charArray = null;
			String[] strArray = null;
			int[] intArray = null;

			//ここに入力値による分岐および配列要素数の確定、
			//値の代入処理を記述する。
			if (dataType == 1) {
				if (dataNum == 1) {
					charArray = new char[1];
					charArray[0] = 'a';
				} else if (dataNum == 2) {
					charArray = new char[2];
					charArray[0] = 'a';
					charArray[1] = 'b';
				} else {
					charArray = new char[3];
					charArray[0] = 'a';
					charArray[1] = 'b';
					charArray[2] = 'c';
				}
			} else if (dataType == 2) {
				if (dataNum == 1) {
					strArray = new String[1];
					strArray[0] = "abc";
				} else if (dataNum == 2) {
					strArray = new String[2];
					strArray[0] = "abc";
					strArray[1] = "def";
				} else {
					strArray = new String[3];
					strArray[0] = "abc";
					strArray[1] = "def";
					strArray[2] = "ghi";
				}
			} else {
				if (dataNum == 1) {
					intArray = new int[1];
					intArray[0] = 1;
				} else if (dataNum == 2) {
					intArray = new int[2];
					intArray[0] = 1;
					intArray[1] = 2;
				} else {
					intArray = new int[3];
					intArray[0] = 1;
					intArray[1] = 2;
					intArray[2] = 3;
				}
			}

			System.out.println("Yさん：");
			System.out.println("...出来ました。\n");

			System.out.println("Z先輩：");
			System.out.println("試しに最後の値を見せてください。\n");

			System.out.println("Yさん：");

			//ここに入力値による分岐および配列要素の表示処理を記述する。
			if (dataType == 1) {
				System.out.print(charArray[charArray.length - 1]);
			} else if (dataType == 2) {
				System.out.print(strArray[strArray.length - 1]);
			} else {
				System.out.print(intArray[intArray.length - 1]);
			}

			System.out.println("です。\n");

			System.out.println("Z先輩：");
			System.out.println("はい、ありがとう。ちゃんと出来てますね。\n");
		} else {
			System.out.println("\nZ先輩：");
			System.out.println("そのような選択肢はありません。");
		}
	}
}
