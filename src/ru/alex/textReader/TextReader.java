package ru.alex.textReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextReader {
	public ArrayList<String> cssToArrayList(String filename) {
		File file = new File(filename);
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader bw = new BufferedReader(new FileReader(file));

			String line;
			while ((line = bw.readLine()) != null) {
				lines.add(line);
			}
			return lines;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;

	}

	public ArrayList<CssStyle> parse(ArrayList<String> stringlist) {
		ArrayList<CssStyle> list = new ArrayList<CssStyle>();
		Pattern p=Pattern.compile("/\\s/");
		Matcher m=p.matcher("  border-bottom: solid 2px #000000;");
		
		//
		String strTest = " solid 2px #000000";
		
		char[] ch = " solid 2px #000000".toCharArray();
		boolean isWord = false;
		String strProp=new String();
		List<String> listStr = new ArrayList<String>();
		for(int i = 0; i <= ch.length - 1 ; i++){
			if (ch[i] == ' ' || i == ch.length - 1){
				if(isWord){
					if(i == ch.length - 1){
						strProp+= ch[i];
					}
					listStr.add(strProp);
					strProp = "";
					isWord = false;
				}
			}else{
				if(!isWord){
					isWord = true;
				}
				strProp += ch[i];
			}
		}
		for(String val: listStr){
			System.out.println("val = '"+val+"'");
		}

		
		//
		boolean isWork = false;
		if (!stringlist.isEmpty()) {
			CssStyle a = null;
			HashMap<String, String> properties = new HashMap();
			for (String str : stringlist) {
				int count = str.length();

				if (count > 0) {
					/*
					 * String s = str.substring(count - 1, count); //if
					 * (s.equals("{")) { //System.out.println(str);
					 * 
					 * }
					 */

					/*
					 * char ch = str.charAt(count-1); if(ch=='{'){
					 * System.out.println(str); }
					 */
					/*
					 * if(str.indexOf('{')>0){ System.out.println(str); }
					 */
					/*
					 * if(str.endsWith("{")){ System.out.println(str); }
					 */
					if (str.contains("{")) {
						a = new CssStyle();
						a.setName(str.substring(0, count - 1));
						isWork = true;

					} else if (str.contains("}")) {

						if (isWork && a != null) {
							list.add(a);

							isWork = false;
							a = null;
						}
					} else {
						if (isWork == true && a != null && !str.isEmpty()) {
							int index=str.indexOf(':');
							if(index>0){
								String key = str.substring(0 , index);
								key = key.replaceAll("\\s", "");
								String value=str.substring(index+1 , count-1);
								
								
								System.out.println( "\n"+"key= '"+key+"' Value= '"+value+"'");
							}
						}
					}

				}

			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "C:\\test\\style.css";
		TextReader tr = new TextReader();

		ArrayList<CssStyle> list2 = tr.parse(tr.cssToArrayList(file));
		for (CssStyle style : list2) {
			System.out.println(style.getName());
		}
	}

}
