package samples;
import java.util.Random;
import java.util.Scanner;
/**
 * スッキリわかる　Java入門：第3章
 * 
 * @author haruna
 *
 *
 */
public class Sample02{
	public static void main(String[] args) {
		//練習３－１回答：
		/**
		 * ①weight == 60
		 * ②(age1 + age2) * 2 > 60
		 * ③age % 2 == 1
		 * ④name.equals("湊")
		 *  
		 */
		
		//練習３－２回答：
		// c d e 
		
		//練習３－３回答:
		int isHungry = 1;
		String food = "ケーキ";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		
		//練習３－４回答：
		//elseの後ろの波カッコ｛｝をつけてください。
		
		//練習３－５回答：
		System.out.print("[メニュー]1:検索2:登録3:削除4:変更＞");
		int selected = new Scanner(System.in).nextInt();
		switch(selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}
		
		//練習3－6回答：
		System.out.println("【数あてゲーム】");
		int ans = new Random().nextInt(10);
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i < 5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = scan.nextInt();
			if(num == ans) {
				System.out.println("アタリ！");
				break;			
			}else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}