package com.avantsystems.problems.others;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@ToString
public class Person {


    @Getter @Setter String firstName;
    @Getter @Setter String lastName;
    @Getter @Setter int age;
    @Getter @Setter Date dateOfBirth;
    @Getter @Setter int countryId;




}
