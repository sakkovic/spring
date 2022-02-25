package com.example.demotestangular.payload.response;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class JwtResponse {
    private final  String token;
    private final  String id;
    private final  String email;
    private final  String username;
    private final  String phone;
    private final  String firstName;
    private final  String lastname;
    private final  String password;

}
