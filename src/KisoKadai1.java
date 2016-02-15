import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		label: while(true){
			try{
				System.out.println("0以上の数字を2つ入力してください。");
				
				String x = br.readLine();
				String y = br.readLine();
				int q = Integer.parseInt(x);
				int w = Integer.parseInt(y);
				
				System.out.println(" ");
				for(int b = 1;b<w+1;b++){
					for(int a = 1;a<q+1;a++){
						int num = a*b;
						if(num>=100){
							System.out.print(" "+num);
						}else if(num>=10){
							System.out.print("  "+num);
						}else{
							System.out.print("   "+ num);
					}
						
					}
					System.out.println();
				}
			}catch(Exception e){
				System.out.println("入力エラーです。");
				System.out.println("使用できるのは0から2147483647までの整数です");
			}
			
			while(true){
				System.out.println("プログラムを終了しますか。(YESかNOで入力してください)");
				String conte = br.readLine();
				if(conte.equalsIgnoreCase("YES")){
					break label;
				}else if(conte.equalsIgnoreCase("NO")){
					continue label;
				}
				
			}
		}
		

	}

}
