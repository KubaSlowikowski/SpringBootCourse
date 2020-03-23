package pl.kubaslowikowski.springbootcourse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public User registry(@RequestBody User user) {
        return user;
    }

    //w pozostalych metodach nie musze dodawac @ResponseStatus, poniewaz jezeli wszystko sie wykona, to domyslnie wroci status "OK"
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public User edit(@RequestBody User user) {
        return user;
    }

    @RequestMapping(value = "/confirm/{id}", method = RequestMethod.PUT)
    public User confirm(@PathVariable(value = "id") Long id) {
        return new User();
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public User add(@RequestBody User user) {
        return user;
    }
}