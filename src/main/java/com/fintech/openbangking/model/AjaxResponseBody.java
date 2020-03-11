package com.fintech.openbangking.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AjaxResponseBody {
	

	String msg;
	
	List<User> result;


}
