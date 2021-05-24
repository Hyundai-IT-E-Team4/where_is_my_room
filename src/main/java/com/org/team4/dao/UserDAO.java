package com.org.team4.dao;

import com.org.team4.dto.LoginDTO;
import com.org.team4.dto.UserDTO;

public interface UserDAO {
	
	UserDTO getUser(LoginDTO loginDTO) throws Exception;

}
