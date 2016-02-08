import java.util.Random;

public class testString {

	public void testStr(int size){
		//final int size = 100;
		Random rnd = new Random();
		System.out.println("Test started");
		Long ts = System.currentTimeMillis();
		for(int i=0;i<size;i++){
			StringBuilder strTest = new StringBuilder();
			for(int j=0;j<65;j++){
				strTest.append(rnd.nextInt(10));
			}
		}
		
		Long te = System.currentTimeMillis();
		System.out.println("Time work StringBuilder ="+(te-ts));
	     ts = System.currentTimeMillis();
	     
	     for(int i=0;i<100;i++){
				String strTest = "";
				for(int j=0;j<65;j++){
					strTest+=rnd.nextInt(10);
				}
				//System.out.println(strTest);
				}
			
		
		 te = System.currentTimeMillis();
		 
		 System.out.println("Time work String= "+(te - ts));
	}
}
