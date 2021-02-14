package com.jwtest.config.provider;

public interface OAuthUserInfo {
	String getProviderId();
	String getProvider();
	String getEmail();
	String getName();
}
