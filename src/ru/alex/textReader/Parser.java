package ru.alex.textReader;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parser {
	private ArrayList<char[]> separators;
	private List<char[]> objects;
	private List<String> results;
	public void parse(){
		char[] list = " solid 2px #000000".toCharArray();
		objects = Arrays.asList(list);
		Separator sep1= new Separator();
		sep1.SetSeparator(' ');
		separators.add(sep1);
		Separator sep2= new Separator();
		sep2.SetSeparator('{');
		separators.add(sep2);
		Separator sep3=new Separator();
		sep3.SetSeparator('}');
		separators.add(sep3);

		boolean isWork = false;
		String tempString = new String();
		for(int i = 0; i <= objects.size() - 1 ; i++){
			if (objects.get(i)[0] == ' ' || i == objects.size() - 1){
				if(isWork){
					if(i == objects.size() - 1){
						tempString+= objects.get(i)[0];
					}
					results.add(tempString);
					tempString = "";
					isWork = false;
				}
			}else{
				if(!isWork){
					isWork = true;
				}
				tempString += objects.get(i)[0];
			}
		}
		
	}

	public void addSeparator(char symbol){
		char[] tmp = new char[1];
		tmp[0] = symbol;
		separators.add(tmp);
		
	}
	public ArrayList<char[]> getSeparators(){
		return this.separators;
	}

}
