package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegDAO {
	private Connection con;
	
	public RegDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "douzone";
		String password = "oracle";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void regStage(RegDTO reg) {
		PreparedStatement ps = null;
		String sql = "INSERT INTO membership VALUES (?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, reg.getId());
			ps.setString(2, reg.getPw());
			ps.setString(3, reg.getUser_name());
			ps.setString(4, reg.getBirth());
			ps.setString(5, reg.getEmail());
			ps.setString(6, reg.getPhone_num());
			ps.setString(7, reg.getGender());
			ps.setString(8, reg.getLogin_check());
			ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void idOverlapStage(RegDTO idoverlap) {
//		PreparedStatement ps = null;
//		String sql = "SELECT * FROM membership WHERE id=?";
//		ResultSet rs = null;
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setString(1, idoverlap);
//			rs = ps.executeQuery();
//			if (rs.next()) {
//				idoverlap = rs.getString("id");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
