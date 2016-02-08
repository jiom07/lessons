package ru.alex.db;

import java.sql.Statement;
import java.util.HashSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSQL {
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet resSet = null;

	public void conn() {
		try {
			Class.forName("org.postgresql.Driver");
			// con =
			// DriverManager.getConnection("jdbc:postgresql://localhost/test","postgres",
			// "graverok");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/test", "postgres", "graverok");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createDB() {
		try {
			if (stmt == null) {
				stmt = con.createStatement();
			}
			stmt.execute("CREATE SEQUENCE users_sec");
			stmt.execute("CREATE TABLE IF NOT EXISTS users (id integer NOT NULL DEFAULT nextval('users_sec'), "
					+ "name VARCHAR(25), sname VARCHAR(25), dep_id INTEGER);");
			stmt.execute("CREATE TABLE IF NOT EXISTS deps(id INTEGER, name VARCHAR(25))");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertData() {
		try {

			if (stmt == null) {
				stmt = con.createStatement();
			}

			
			  stmt.execute("INSERT INTO deps(id,name )VALUES(1,'HR')");
			  stmt.execute("INSERT INTO deps(id,name )VALUES(2,'IT')");
			  stmt.execute("INSERT INTO deps(id,name )VALUES(3,'SEO')");
			  
			  stmt.execute( "INSERT INTO users (name, sname, dep_id) VALUES ('al', 'good',1 )"  ); 
			  stmt.execute(  "INSERT INTO users (name, sname, dep_id) VALUES ('wel', 'good',1 )"
			  ); stmt.execute("INSERT INTO users (name, sname, dep_id) VALUES ('not', 'good',2 )"
			  ); stmt.execute("INSERT INTO users (name, sname, dep_id) VALUES ('so', 'goodus',3 )"
			  );
			  
			 /* PreparedStatement pstmt = con
					.prepareStatement("INSERT INTO users (name, sname, dep_id) VALUES (?, ?, 1 )");
			for (int i = 0; i < 100000; i++) {
				pstmt.setString(1, "Ivan" + i);
				pstmt.setString(2, "Ivanov" + i);
				pstmt.addBatch();
			}
			con.setAutoCommit(false);
			pstmt.executeBatch();
			con.setAutoCommit(true);
			pstmt.close();*/
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteData() {
		try {
			if (stmt == null) {
				stmt = con.createStatement();
			}


			stmt.execute("DROP TABLE IF  EXISTS users ");
			stmt.execute("DROP TABLE IF  EXISTS deps");
			stmt.execute("DROP SEQUENCE IF  EXISTS users_sec");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readData(){
		try {
			stmt = con.createStatement();
			resSet = stmt.executeQuery("SELECT u.name , u.sname , d.name  FROM users u INNER JOIN deps d ON  u.dep_id = d.id ORDER BY u.name;");
			HashSet<String> names = new HashSet<String>();
			while (resSet.next()) {
				
	            String name= resSet.getString(1);
	            
				String sname = resSet.getString(2);
				names.add(sname);
				String dname = resSet.getString(3);
				System.out.println("name = " + name + "; sname = " + sname + "; dname = " + dname);
			}
			for (String nm: names){
				System.out.println(nm);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}
	public void closeDB() {
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
