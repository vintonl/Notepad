package dev.vintonlee.notepad.controller

import dev.vintonlee.notepad.model.User
import dev.vintonlee.notepad.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/users", produces = ["application/json"])
class UserController(private val userService: UserService) {

    @GetMapping("{id}")
    fun getUser(@PathVariable id: Int): User? {
        return userService.getUser(id)
    }

}