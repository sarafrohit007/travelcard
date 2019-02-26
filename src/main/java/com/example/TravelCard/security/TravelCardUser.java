package com.example.TravelCard.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.TravelCard.entity.User;



public class TravelCardUser implements UserDetails, CredentialsContainer{
	

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -256994696821975757L;

	private List<GrantedAuthority>        authorities               = new ArrayList<GrantedAuthority>();
	
	private boolean                       useOTPAsPassword;
	
	private User						  user;

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stubx
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eraseCredentials() {
		// TODO Auto-generated method stub
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
