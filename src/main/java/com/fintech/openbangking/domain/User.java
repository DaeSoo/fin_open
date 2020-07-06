package com.fintech.openbangking.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class User {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idx;
	
	@Column
	public String name;
	
	@Column
	public String password;
	
	@Column
	public String email;
	
	@Column
	public LocalDateTime createdDate;
	
	@Column
	public LocalDateTime updatedDate;
}
