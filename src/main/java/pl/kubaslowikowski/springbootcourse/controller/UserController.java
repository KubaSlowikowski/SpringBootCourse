package pl.kubaslowikowski.springbootcourse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.kubaslowikowski.springbootcourse.model.UserDTO;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public UserDTO registry(@RequestBody UserDTO userDTO) {
        return userDTO;
    }

    //w pozostalych metodach nie musze dodawac @ResponseStatus, poniewaz jezeli wszystko sie wykona, to domyslnie wroci status "OK"
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public UserDTO edit(@RequestBody UserDTO userDTO) {
        return userDTO;
    }

    @RequestMapping(value = "/confirm/{id}", method = RequestMethod.PUT)
    public UserDTO confirm(@PathVariable(value = "id") Long id) {
        return new UserDTO();
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public UserDTO add(@RequestBody UserDTO userDTO) {
        return userDTO;
    }
}