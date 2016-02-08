import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileLesson {
	public static void main(String args[]){
		//testString test= new testString();
		//test.testStr(10000000);
		File file= new File("E:\\java_web_templates\\first.vm");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr) ;
			int ch=br.read();
			StringBuilder res = new StringBuilder();
			while(ch!=-1){
				char c = (char)ch;
				if(c=='<')
					c = '[';
				if(c=='>')
					c=']';
					
				res.append(c);
				ch=br.read();
			}
			System.out.println(res);
			
			FileWriter fw=new FileWriter(file,false);
			//BufferedWriter bw= new BufferedWriter(fw);
			fw.write(res.toString());
			fw.flush();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
