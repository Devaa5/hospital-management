package com.mirna.hospitalmanagementapi.domain.dtos.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

/**
* Data transfer object used to store the user information requested to perform the login
* @author Mirna Gama
* @version 1.0
*/
public record UserLoginDTO(
		@NotBlank(message="login cannot be blank")
		@Column(name="login")
		String login,
		
		@NotBlank(message="password cannot be blank")
		@Column(name="password")
		String password) {
}
