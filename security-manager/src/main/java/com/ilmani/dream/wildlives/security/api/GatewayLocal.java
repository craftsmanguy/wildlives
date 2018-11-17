package com.ilmani.dream.wildlives.security.api;

import javax.ejb.Local;

import com.ilmani.dream.wildlives.framework.dto.auth.ConnectionFieldsDto;
import com.ilmani.dream.wildlives.framework.exceptions.AuthenticationException;
import com.ilmani.dream.wildlives.framework.exceptions.RestClientException;

@Local
public interface GatewayLocal {

	public String authenticate(ConnectionFieldsDto fields, String profil, String issuer)
			throws AuthenticationException, RestClientException;

	public void checkToken(String token, String profil) throws AuthenticationException;
	
	public void checkRigths(String ressource, String profil) throws AuthenticationException;

}
