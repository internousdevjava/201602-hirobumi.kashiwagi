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
				if(q<0 || 100<q){
					System.out.println("t");
				}
				System.out.print(" ");
				for(int a = 0 ;a< q;a++){
					
					System.out.print(" ");
					System.out.print(a+1);
					
				}
				System.out.println(" ");
				for(int b = 0;b<w;b++){
					System.out.print(b+1);
					System.out.print(" ");
					for(int a = 0;a<q;a++){
						System.out.print((a+1) * (b+1));
						System.out.print(" ");
					}
					System.out.println();
				}
			}catch(Exception e){
				System.out.println("数字以外の文字か大きすぎる又は小さすぎる数字が入力されています。");
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
