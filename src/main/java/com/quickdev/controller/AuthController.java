package com.quickdev.controller;

import com.quickdev.auth.Jwt;
import com.quickdev.model.User;
import com.quickdev.model.request.LoginRequest;
import com.quickdev.model.response.ErrorResponse;
import com.quickdev.model.response.LoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;


    private Jwt jwt;
    public AuthController(AuthenticationManager authenticationManager, Jwt jwt) {
        this.authenticationManager = authenticationManager;
        this.jwt = jwt;

    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody LoginRequest LoginRequest)  {

        try {
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(LoginRequest.getEmail(), LoginRequest.getPassword()));
            String email = authentication.getName();
            User user = new User(email, "123456");
            String token = jwt.createToken(user);
            LoginResponse loginResponse = new LoginResponse(email,token);

            return ResponseEntity.ok(loginResponse);

        }catch (BadCredentialsException e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, "Invalid username or password");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }catch (Exception e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }
}