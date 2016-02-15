import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		label:while(true){
			File file;
			try{
				
				System.out.println("ファイルに入力する場合は0を、ファイルを読み込む場合は1を入力してください");
				String i = br.readLine();
				int j = Integer.parseInt(i);
				String x = null;
				
				
				switch (j) {
				case 0:
					
					System.out.println("ファイルを作成するフォルダ名を指定してください。");
					x = br.readLine();
					
					file = new File(x);
					if(file.exists()){
						
						x = x + "\\";
						
						System.out.println("ファイル名を指定してください。");
						String y = br.readLine();
						
						y = x.concat(y);
						
						file = new File(y);
					if(file.exists()){
						
						while(true){
							System.out.println("ファイルが存在します。上書きしますか。(YESかNOで入力してください)");
							String conte = br.readLine();
							if(conte.equalsIgnoreCase("YES")){
								
								FileOutputStream fos = new FileOutputStream(file,true);
								OutputStreamWriter osw = new OutputStreamWriter(fos);
								PrintWriter pw = new PrintWriter(osw);
								
								System.out.println("ファイルに入力する文字を入力してください。");
								String b = br.readLine();
								pw.println(b);
								
								pw.close();
								
								System.out.println("ファイルに書き込みました。");
								break;
							}else if(conte.equalsIgnoreCase("NO")){
								
								FileOutputStream fos = new FileOutputStream(file,false);
								OutputStreamWriter osw = new OutputStreamWriter(fos);
								PrintWriter pw = new PrintWriter(osw);
								
								System.out.println("ファイルに入力する文字を入力してください。");
								String b = br.readLine();
								pw.println(b);
								
								pw.close();
								
								System.out.println("ファイルに書き込みました。");
								break;
							}
							
						}
					
					}else{
						int point = y.lastIndexOf(".");
					    if (point != -1) {
					        y = y.substring(0,point);
					    } 
						y = y.concat(".txt");
						file = new File(y);
						FileOutputStream fos = new FileOutputStream(file);
						OutputStreamWriter osw = new OutputStreamWriter(fos);
						PrintWriter pw = new PrintWriter(osw);
						System.out.println("ファイルに入力する文字を入力してください。");
						String b = br.readLine();
						pw.println(b);
						
						pw.close();
						System.out.println("ファイルに書き込みました。");
					}
					}else{
						System.out.println("フォルダが存在しません");
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
					
				case 1:
					System.out.println("読み込むファイルのフォルダ名とファイル名を入力してください。");
					x = br.readLine();
					
					file = new File(x);
					if(file.exists()){
						FileReader filer = new FileReader(file);
						BufferedReader br1 = new BufferedReader(filer);
						String str;
						while((str = br1.readLine()) != null){
							System.out.println(str);
						}
						br1.close();
						
					}else{
						System.out.println("ファイルが存在しません。");
						
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
					
					while(true){
						System.out.println("プログラムを終了しますか。(YESかNOで入力してください)");
						String conte = br.readLine();
						if(conte.equalsIgnoreCase("YES")){
							break label;
						}else if(conte.equalsIgnoreCase("NO")){
							continue label;
						}
						
					}
					
				default:
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
			}catch(Exception e){
				e.printStackTrace();
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
		}
	


