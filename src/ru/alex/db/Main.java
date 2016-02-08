package ru.alex.db;

public class Main {

	public static void main(String[] args) {
		PSQL db = new PSQL();
		System.out.println("Start");
		long start = System.currentTimeMillis();
		db.conn();
				
		long connTime = System.currentTimeMillis();
		System.out.println("Conn tine = " + (connTime-start));
		db.deleteData();
		long delTime =System.currentTimeMillis();
		System.out.println("del time = " + (delTime - connTime));
		db.createDB();
		long createTime =System.currentTimeMillis();
		System.out.println("create time = " + (createTime-delTime ));
		db.insertData();
		long insertTime= System.currentTimeMillis();
		System.out.println("insert time = " + (insertTime-createTime ));
		db.readData();
		long readTime = System.currentTimeMillis();
		System.out.println("read time = " + (readTime-insertTime ));
		db.closeDB();
		
		long endTime= System.currentTimeMillis();
		System.out.println("total time :"+ (endTime-start));
		
	}

}
