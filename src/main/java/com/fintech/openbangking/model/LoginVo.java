package com.fintech.openbangking.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Builder
public class LoginVo {

	private String userid;
	private String password;

	@Builder
	public LoginVo(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}
	

}
