package McShop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserVal {
	private boolean boo;
	public boolean validate(User user) throws ClassNotFoundException{
		boolean status = false;
		DBConnection db = new DBConnection();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = db.getConnectionToDatabase();
			PreparedStatement state = conn.prepareStatement("select * from login where username=? and password=?");
			state.setString(1, user.getUsername());
			state.setString(2, user.getPassword());
            System . out . println(state);
            ResultSet rs = state.executeQuery();
            status = rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public void check(boolean boo) {
		this.boo=boo;
	}
	
}

