package samples;
import java.util.Scanner;
/**
 * スッキリわかる　Java入門：第4章、第5章
 * 
 * @author haruna
 *
 */
public class Sample03{
	public static void main(String[] args) {
		//練習４－１回答：
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
		//練習４－２回答：
		int[] moneyList = {121902,8302,55100};
		for(int i = 0;i < moneyList.length;i++) {
			System.out.println(moneyList[i]);
		}
		for(int value : moneyList) {
			System.out.println(value);
		}
		
		//練習４ー３回答：
		//NullPointerException と　ArrayIndexOutOfBoundsException
		
		//練習４ー４回答：
		int[] numbers = new int[] {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int input = new Scanner(System.in).nextInt();
		for(int number : numbers) {
			if(number == input) {
				System.out.println("アタリ！");
			}
		}
		//練習５－１回答：
		introduceOneself();
		
		//練習５－２回答：
		email("報告","haruna_02@xxx.com","hello!");
		
		//練習５－３回答：
		email("haruna_02@xxx.com","hello!");
		
		//練習５－４回答：
		System.out.println(calcTriangleArea(10, 5));
		System.out.println(calcCircleArea(5));
	}
	//練習５－１回答：
	public static void introduceOneself() {
		String name = "田中";
		int age = 18;
		double height = 179.5;
		char animal = '羊';
		System.out.println("初めて、" + name + "です。" + age + 
				"です。今の身長は" + height + "です。私は" + animal + "年生まれです。");
	}
	
	//練習５－２回答：
	public static void email(String title,String address,String text) {
		System.out.println( address + "に、以下のメールを送信しました");
		System.out.println( "件名:" + title );
		System.out.println( "本文: " + text );
	}
	
	//練習５－３回答：
	public static void email(String address,String text) {
		System.out.println( address + "に、以下のメールを送信しました\n件名:無題\n本文: " + text);
	}
	
	//練習５－４回答：
	public static double calcTriangleArea(double bottom,double height) {
		return (bottom * height)/2;
	}
	public static double calcCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
}