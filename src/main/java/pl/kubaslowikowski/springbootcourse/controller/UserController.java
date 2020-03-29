package pl.kubaslowikowski.springbootcourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kubaslowikowski.springbootcourse.exception.WrongIdException;
import pl.kubaslowikowski.springbootcourse.model.UserDTO;
import pl.kubaslowikowski.springbootcourse.persistence.model.User;
import pl.kubaslowikowski.springbootcourse.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public ResponseEntity<UserDTO> registry(@RequestBody UserDTO userDTO) {
        if(idExist(userDTO))
            throw new WrongIdException("Tworzony użytkownik nie powinien posiadać ID!");
        return new ResponseEntity<>(userService.createUser(userDTO), HttpStatus.CREATED);
    }

    //w pozostalych metodach nie musze dodawac @ResponseStatus, poniewaz jezeli wszystko sie wykona, to domyslnie wroci status "OK"
    @RequestMapping(value = "/edit", method = RequestMethod.PUT) //TODO
    public UserDTO edit(@RequestBody UserDTO userDTO) {
        if(!idExist(userDTO))
            throw new WrongIdException("Edytowany użytkownik musi posiadać ID!");
        userService.editUser(userDTO);
        return userDTO;
    }

//    @RequestMapping(value = "/confirm/{id}", method = RequestMethod.PUT)
//    public UserDTO confirm(@PathVariable(value = "id") Long id) {
//        return new UserDTO();
//    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT) //TODO
    public ResponseEntity<UserDTO> add(@RequestBody UserDTO userDTO) {
        if(!idExist(userDTO))
            throw new WrongIdException("Tworzony użytkownik powinien posiadać ID!");
        return new ResponseEntity<>(userService.createUser(userDTO), HttpStatus.OK);
    }

    private boolean idExist(UserDTO userDTO) {
        return userDTO.getId() != null;
    }
}