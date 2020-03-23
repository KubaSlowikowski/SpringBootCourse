package pl.kubaslowikowski.springbootcourse;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor //tworzenie konstruktora ze wszystkimi argumentami przez Lombok
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String stackTrace;
    private String details;
}
