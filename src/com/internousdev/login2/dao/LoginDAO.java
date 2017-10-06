/**
 *
 */
package com.internousdev.login2.dao;

/**
 * @author internousdev
 *
 */
public class LoginDAO {
	public LoginDTO select(String name,String password){
		DBConecctor db =new DBConenctor();
		Conection con =db.getConection();
		LoginDTO dto = new LoginDTO();

		String sql = "select * form user wher user_name =? and password=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString (1,name);
			ps.setString

		}
	}
}
