import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/employees_database";
		int rowsAffected;
		try {
			// Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "root", "a1234567");
			
			// create a statement object to send to the database
			
			Statement statement = conn.createStatement();
			
			// Execute the statement object
			
			//rowsAffected = statement.executeUpdate("delete from employees_tbl");
			rowsAffected = statement.executeUpdate("update employees_tbl set salary = 5500 where id=600;");
			/*
			rowsAffected = statement.executeUpdate("insert into employees_tbl(id, name, dept, salary)"
							 		                   + "value(900,'Robert','Sales',4000);");
			
			statement.executeUpdate("insert into employees_tbl(id, name, dept, salary)"
			 		                   + "value(800,'Juliet','Sales',5500);");
			
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
			*/
	     	// Process the result
			System.out.println("Executed a update statement - Rows Affected: " + rowsAffected);
		//	System.out.println("Executed a delete statement - Rows Affected: " + rowsAffected);
			
	//		System.out.println("Executed an Insert statement - Rows Affected: " + rowsAffected);
	 /*   	System.out.println("Executed an Insert statement");
			
			int salaryTotal = 0;
			while(resultSet.next()) {
				salaryTotal = salaryTotal + Integer.parseInt(resultSet.getString("salary"));
				salaryTotal = salaryTotal + resultSet.getInt("salary");
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getString("dept"));
				System.out.println(resultSet.getString("salary"));
			}
			System.out.println(salaryTotal);*/
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		//	System.out.println("Error while Insertion");
		//	System.out.println("Error while deleting");
			System.out.println("Error while updating");
		}

	}

}