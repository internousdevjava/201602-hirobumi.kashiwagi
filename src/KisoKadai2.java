import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ゲームを開始します。");
		Random rnd = new Random();
		int rand = rnd.nextInt(100) + 1;
		String x;
		int q;
		label : while(true){
			
			try{
				
				while(true){
					
					while(true){
						System.out.println("1から100の数字を入力してください");
						x = br.readLine();
						q = Integer.parseInt(x);
						if(1<=q && q<=100){
							break;
						}else{
							continue;
						}
					}
					
					if(rand == q){
						System.out.println("正解です");
						break;
					}else if(rand < q){
						System.out.println("入力された数字のほうが大きいです");
					}else{
						System.out.println("入力された数字のほうが小さいです");
					}
					
				}
				while(true){
					System.out.println("プログラムを終了しますか。(YESかNOで入力してください)");
					String conte = br.readLine();
					if(conte.equalsIgnoreCase("YES")){
						break label;
					}else if(conte.equalsIgnoreCase("NO")){
						rand = rnd.nextInt(100) + 1;
						continue label;
					}
					
				}
			}catch(Exception e){
				System.out.println("入力エラーです。");
				System.out.println("使用できるのは0から2147483647までの整数です");
				while(true){
					System.out.println("ゲームを終了しますか。(YESかNOで入力してください)");
					String conte = br.readLine();
					if(conte.equalsIgnoreCase("YES")){
						break label;
					}else if(conte.equalsIgnoreCase("NO")){
						continue label;
					}
					e.printStackTrace();
				}
			}
		}
	}

}
