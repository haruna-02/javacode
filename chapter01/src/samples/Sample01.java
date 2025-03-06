package samples;
import java.util.Random;
import java.util.Scanner;
/**
 * スッキリわかる　Java入門：第1章、第2章
 *
 * @author haruna
 * 
 *
 */
public class Sample01{
	public static void main (String[] args) {
		//練習１ー１回答：
		/**
		 * ア：コンパイラ　
		 * イ：インタプリタ
		 * ウ：ソースコード　
		 * エ：バイトコード　
		 * オ：JVM
		 * 
		 */
		//練習１－２回答：
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println("縦幅３横幅５の長方形の面積は、" + c);
		//練習１－３回答：
		boolean p1 = true;
		char p2 = '駆';
//		float p3 = 3.14f;
		double p3 = 3.14;
		long p4 = 31415926853979L;
		String p5 = "ミナトの攻撃！敵に１５ポイントのダメージを与えた。　";
		
		//練習２－１回答：
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		System.out.println(ans);
		
		//練習２－２回答：
		//②　④　⑤　⑦
		
		//練習２－３回答：
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new Random().nextInt(3);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("１:大吉２:中吉３:吉４:凶");
	}
}