package com.generation.blogpessoal.security;

import java.util.Collection;
import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blogpessoal.model.Usuario;

public class UserDatailsImpl implements UserDetails {
	
	//informações que iremos usar para o login
	
	private static final long serialVersionUID = 1L;
	//atributo static apenas dessa classe. identificador de versão da classe
	
	private String userName; //email
	private String password;
	private List<GrantedAuthority> authorities; // esta classe consegue passar os níveis de acesso de um usuário
	
	public UserDatailsImpl (Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
		}
	
	public UserDatailsImpl() {
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
