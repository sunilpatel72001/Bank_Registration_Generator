package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentityGenerator;

public class BankAccountGenerator extends IdentityGenerator {

	
	@Override
	public Serializable generate(SessionImplementor s, Object obj) {
		String name = "BANK";
	try{		
//		create sequence bank
//		  2  start with 1234
//		  3  increment by 1
//		  4  nocycle
//		  5  nocache;
		
		// get next seq value
		// append to Bankstring 
		// send to table..
		
		Connection con = s.connection();
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery("select bank.nextval from dual");	
		if(rs.next()){
			name = name+rs.getInt(1);
			
		}
		
		
	}catch(Exception e){}
	return name;
  }
	
}
