package ru.alex.state;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateWrapper stw= new StateWrapper();
		String text="<tag1>tag value</tag1>"; 
		char texts[] = text.toCharArray();
		
		
		for (int i =0;i<texts.length;i++){
			if(texts[i]=='<'){
				stw.on();
			}else if(texts[i]=='>'){
				stw.off();
			}else if (texts[i]=='/'){
				stw.def();
			}else{
				stw.text();
			}
			
			
			}

	}

}
