/*
 *
 * IFPE - Federal Institute of Education, Science and Technology of Pernambuco
 * Informatics for the Internet
 * Object Oriented Programming
 * Professor: Allan Lima - allan.lima@igarassu.ifpe.edu.br
 * 
 * Public domain code, feel free to use, modify and redistribute it 
 *
 */

package br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.user;

import br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.Entity;
import br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.exception.InvalidDataException;

/**
 * 
 * Represents an user on the social network 
 * 
 * @author Allan Diego Silva Lima - allan.lima@igarassu.ifpe.edu.br
 *
 */
public class User extends Entity {
	// the name of the user
	private String name;
	
	// the passord of the user
	private String password;
	private String email;
	private String username;

	/**
	 * 
	 * Initializes the classe's parameters with the given parameters 
	 * 
	 * @param id the id the of user
	 * @param name the name of the user
	 * @param password the password of the user
	 */
	public User(long id, String name, String password, String email, String username)throws InvalidDataException {
		super(id);
		this.setName(name);
		this.setPassword(password);
		this.setEmail(email);
		this.setUsername(username);
	}

	/**
	 * 
	 * Returns the name of the user
	 * 
	 * @return the name of the user
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * Sets the name of the user
	 * 
	 * @param name the new name of the user
	 */
	public void setName(String name) throws InvalidDataException {
		if(name==null || name.length()==0){
			throw new InvalidDataException("Nome Inválido");
		}
		this.name = name;
	}

	/**
	 * 
	 * Returns the password of the user
	 * 
	 * @return the password of the user
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * Sets the password of the user
	 * 
	 * @param password the new password of the user
	 */
	public void setPassword(String password) throws InvalidDataException {
		if(password==null || password.length()==0){
			throw new InvalidDataException("Senha Inválida");
		}
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws InvalidDataException {
		if(email==null || email.length()==0){
			throw new InvalidDataException("E-mail Inválido");
		}
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) throws InvalidDataException {
		if(username==null || username.length()==0){
			throw new InvalidDataException("Username Inválido");
		}
		this.username = username;
	}

}
