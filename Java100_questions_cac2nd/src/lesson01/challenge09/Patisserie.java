/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citron = 30;
		int choco = 30;
		int pis = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + choco + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pis + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで)\n");
		System.out.print("シトロン    >");
		String citronBuystr = br.readLine();
		double citronBuy = Double.parseDouble(citronBuystr);

		System.out.print("ショコラ    >");
		String chocoBuystr = br.readLine();
		double chocoBuy = Double.parseDouble(chocoBuystr);

		System.out.print("ピスターシュ    >");
		String pisBuystr = br.readLine();
		double pisBuy = Double.parseDouble(pisBuystr);

		System.out.println("シトロン" + citronBuy + "個");
		System.out.println("ショコラ" + chocoBuy + "個");
		System.out.println("ピスターシュ" + pisBuy + "個");

		double sum1 = citronBuy + chocoBuy + pisBuy;
		int sum2 = (int) (250 * citronBuy + 280 * chocoBuy + 320 * pisBuy);

		System.out.println("\n合計個数" + sum1 + "個");
		System.out.println("合計金額" + sum2 + "円");
		System.out.println("をお買い上げですね。\n承りました。");

		citron = (int) (citron - citronBuy);
		choco = (int) (choco - chocoBuy);
		pis = (int) (pis - pisBuy);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトラン   \\250 ・・・残り" + citron + "個");
		System.out.println("ショコラ   \\280 ・・・残り" + choco + "個");
		System.out.println("ピスターシュ   \\320 ・・・残り" + pis + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上の合計   \\" + sum2);

		double citronper = ((250 * citronBuy) / sum2) * 100;
		double chocoper = ((280 * chocoBuy) / sum2) * 100;
		double pisper = ((320 * pisBuy) / sum2) * 100;

		System.out.println("\n内訳");
		System.out.println("シトロン       \\" + (int) (250 * citronBuy) + "・・・" + (int) citronper + "%");
		System.out.println("ショコラ       \\" + (int) (280 * chocoBuy) + "・・・" + (int) chocoper + "%");
		System.out.println("ピスターシュ   \\" + (int) (320 * pisBuy) + "・・・" + (int) pisper + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味   ・・・" + (int) citronper + "%");
		System.out.println("ショコラの味   ・・・" + (int) chocoper + "%");
		System.out.println("ピスターシュの味   ・・・" + (int) pisper + "%");

		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\" + ((sum2 / (int) sum1) / 10) * 10 + "です。");

	}

}
