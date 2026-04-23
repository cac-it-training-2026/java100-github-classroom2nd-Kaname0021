/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		int citronBuy = Integer.parseInt(citronBuystr);

		System.out.print("ショコラ    >");
		String chocoBuystr = br.readLine();
		int chocoBuy = Integer.parseInt(chocoBuystr);

		System.out.print("ピスターシュ    >");
		String pisBuystr = br.readLine();
		int pisBuy = Integer.parseInt(pisBuystr);

		System.out.println("シトロン" + citronBuy + "個");
		System.out.println("ショコラ" + chocoBuy + "個");
		System.out.println("ピスターシュ" + pisBuy + "個");

		int sum1 = citronBuy + chocoBuy + pisBuy;
		int sum2 = 250 * citronBuy + 280 * chocoBuy + 320 * pisBuy;

		System.out.println("\n合計個数" + sum1 + "個");
		System.out.println("合計金額" + sum2 + "円");
		System.out.println("をお買い上げですね。\n承りました。");

		citron = citron - citronBuy;
		choco = choco - chocoBuy;
		pis = pis - pisBuy;

		System.out.println("\n本日のおすすめ商品です。");
		System.out.println("シトラン   \\250 ・・・残り" + citron + "個");
		System.out.println("ショコラ   \\280 ・・・残り" + choco + "個");
		System.out.println("ピスターシュ   \\320 ・・・残り" + pis + "個");
	}

}
