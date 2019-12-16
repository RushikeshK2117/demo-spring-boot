package com.rushikeshk.demo.spring.boot.service;

import com.rushikeshk.demo.spring.boot.model.AuthenticationResponse;
import com.rushikeshk.demo.spring.boot.model.LoginUserObject;

public interface LoginService {

	AuthenticationResponse auth(LoginUserObject luo);
}
