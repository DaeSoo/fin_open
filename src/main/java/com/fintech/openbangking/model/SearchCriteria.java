package com.fintech.openbangking.model;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

public class SearchCriteria {


	
		@NotBlank
		@Getter @Setter
		String username;

}
