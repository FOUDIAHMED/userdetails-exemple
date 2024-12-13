//package com.example.userdetails.security;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import java.util.Collection;
//import java.util.List;
//
//public class CustomUserDetails implements UserDetails {
//    private String username;
//    private String password;
//    private List<GrantedAuthority> authorities;
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//
//}
