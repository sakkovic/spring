package com.example.demotestangular.payload.request;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class SignupRequest {
    private final  String firstName;
    private final  String lastName;
    private final  String username;
    private final  String email;
    private final  String phone;
    private final  String password;
}
