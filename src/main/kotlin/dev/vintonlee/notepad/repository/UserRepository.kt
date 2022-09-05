package dev.vintonlee.notepad.repository

import dev.vintonlee.notepad.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int?>