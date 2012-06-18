package com.feth.play.module.pa.providers.oauth2;

import com.feth.play.module.pa.providers.AuthUser;

public abstract class OAuth2AuthUser extends AuthUser {

	private OAuth2AuthInfo info;
	private String id;
	
	public OAuth2AuthUser(final String id, final OAuth2AuthInfo info) {
		this.info = info;
		this.id = id;
	}
	
	public OAuth2AuthInfo getOAuth2AuthInfo() {
		return info;
	}
	
	@Override
	public String getId() {
		return id;
	}
}
