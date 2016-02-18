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
		
		String x;
		String y;
		int q;
		int w;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		label: while(true){
			try{
				System.out.println("掛け算表を作ります。");
				System.out.print("0以上の数字を2つ入力してください。(0～9の間で入力してください。)");
				
				System.out.print("横の範囲");
				
				while(true){
					
					x = br.readLine();
					q = Integer.parseInt(x);
					if(1<=q && q<=9){
						break;
					}else{
						System.out.print("0～9の間で入力してください。");
						continue;
					}
				}
				
				System.out.print("縦の範囲(0～9の間で入力してください。)");
				
				while(true){
					
					y = br.readLine();
					w = Integer.parseInt(y);
					if(1<=w && w<=9){
						break;
					}else{
						System.out.print("0～9の間で入力してください。");
						continue;
					}
				}
				
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
				System.out.println("使用できるのは1から9までの整数です");
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
