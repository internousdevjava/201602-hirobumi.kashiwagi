import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

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
	public static void main(String[] args) throws IOException{
		
		Scanner stdIn = new Scanner(System.in, "UTF-8");

		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		label:while(true){
			File file;
			try{
				System.out.println("ファイルの作成読み込みを行います。");
				System.out.println("ファイルに入力する場合は0を、ファイルを読み込む場合は1を入力してください");
				String i = br.readLine();
				int j = Integer.parseInt(i);
				String x = null;
				
				
				switch (j) {
				case 0:
					System.out.println("ファイルを作成します。");
					System.out.println("ファイルを作成するフォルダ名を指定してください。");
					System.out.println("例:C:\\Users\\Public");
					x = br.readLine();
					
					file = new File(x);
					char c = x.charAt(x.length()-1);
					if(c != '\\'){
						
						x = x + "\\";
					}
					
					System.out.println(x);
					if(file.exists()){
						
						System.out.println("作成したいファイル名をしてください。");
						String y = br.readLine();
						
						y = x.concat(y);
						
						file = new File(y);
					if(file.exists()){
						//拡張子をテキストファイルに変更
						int point = y.lastIndexOf(".");
					    if (point != -1) {
					        y = y.substring(0,point);
					    } 
						y = y.concat(".txt");
						//
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
						//拡張子をテキストファイルに変更
						System.out.println("ファイルが存在しません。新規作成します。");
						int point = y.lastIndexOf(".");
					    if (point != -1) {
					        y = y.substring(0,point);
					    } 
						y = y.concat(".txt");
						//
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
						System.out.println("フォルダが存在しなかったため作成します。");
						
						file = new File(x);
					
						file.mkdir();
						
						c = x.charAt(x.length()-1);
						if(c != '\\'){
							
							x = x + "\\";
						}
						System.out.println("作成したいファイル名を入力してください。");
						String y = br.readLine();
						
						y = x.concat(y);
						
						file = new File(y);
					if(file.exists()){
						//拡張子をテキストファイルに変更
						int point = y.lastIndexOf(".");
					    if (point != -1) {
					        y = y.substring(0,point);
					    } 
						y = y.concat(".txt");
						//
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
						//拡張子をテキストファイルに変更
						System.out.println("ファイルが存在しません。新規作成します。");
						int point = y.lastIndexOf(".");
					    if (point != -1) {
					        y = y.substring(0,point);
					    } 
						y = y.concat(".txt");
						//
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
				case 1:
					System.out.println("読み込むファイルのフォルダ名とファイル名を入力してください。");
					System.out.println("例:C:\\eclipse\\test.txt");
					x = br.readLine();
					
					int point = x.lastIndexOf(".");
				    if (point != -1) {
				        x = x.substring(0,point);
				    } 
					x = x.concat(".txt");
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
			}catch(NumberFormatException e){
				System.out.println("0又は1以外のものが入力されたためエラーが発生しました。");
				while(true){
					
					System.out.println("プログラムを終了しますか。(YESかNOで入力してください)");
					String conte;
					try {
						conte = br.readLine();
						if(conte.equalsIgnoreCase("YES")){
							break label;
						}else if(conte.equalsIgnoreCase("NO")){
							continue label;
						}
					} catch (IOException e1) {
						
					}
					
				}
			}catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("ファイルが見つからないかアクセスできないファイルが指定されました。");
				while(true){
					
					System.out.println("プログラムを終了しますか。(YESかNOで入力してください)");
					String conte;
					try {
						conte = br.readLine();
						if(conte.equalsIgnoreCase("YES")){
							break label;
						}else if(conte.equalsIgnoreCase("NO")){
							continue label;
						}
					}catch(IOException ex){
						
					}
					
				}
			}
		}
			
			}
		}
	


