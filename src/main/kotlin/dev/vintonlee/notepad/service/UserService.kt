package dev.vintonlee.notepad.service

import dev.vintonlee.notepad.model.User
import dev.vintonlee.notepad.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UserService(private val userRepository: UserRepository) {

    fun getUser(id: Int): User? {
        val user = userRepository.findById(id).orElse(null)
        return user ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "Actor Not Found")
    }

}