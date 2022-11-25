import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserVal {
	
	public boolean validate(User user) throws ClassNotFoundException{
		boolean status = false;
		DBConnection db = new DBConnection();
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = db.getConnectionToDatabase();
		
		try {
			PreparedStatement state = conn.prepareStatement("select * from users where username=?,password=?");
			state.setString(1, user.getUsername());
			state.setString(2, user.getPassword());
            System . out . println(state);
            ResultSet rs = state.executeQuery();
            status = rs . next();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}

