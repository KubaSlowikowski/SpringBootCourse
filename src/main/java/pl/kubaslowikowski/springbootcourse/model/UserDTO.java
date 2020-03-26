package pl.kubaslowikowski.springbootcourse.model;

import lombok.Data;

@Data
public class UserDTO {  //odpowiada za wyświetlanie JSONa
//w tym przypadku DTO dodajemy, poniewaz transformujemy plik JSON na Java
    // latwo jest wtedy odrozniac
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean author;
    private boolean admin;
}