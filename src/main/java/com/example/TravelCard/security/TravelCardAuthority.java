package com.example.TravelCard.security;

import org.springframework.security.core.GrantedAuthority;

public class TravelCardAuthority implements GrantedAuthority{

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 1663354245518969929L;
	private String role;
	
	public TravelCardAuthority(String role){
		this.role = role;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return role;
	}

}
