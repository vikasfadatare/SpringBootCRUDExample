package com.agrorakshak.crudservice.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {
	@Id
	//@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "user_id")
	private String userid;
	
	@Column(name = "first_name", nullable = true)
	private String firstname;
	
	@Column(name = "last_name", nullable = true)
	private String lastname;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "phone", nullable = true)
	private String phone;
	
	@Column(name = "registration_date", nullable = true)
	private Date registrationdate;
	
	@Column(name = "updated_date", nullable = true)
	private Date updateddate;
	
	@Column(name = "is_active", nullable = true)
	private Boolean isactive;
	
	@Column(name = "role", nullable = true)
	private String role;
	
	@Column(name = "lastlogin_date", nullable = true)
	private Date lastlogindate;
}
