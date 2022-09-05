package dev.vintonlee.notepad

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotepadApplication

fun main(args: Array<String>) {
	runApplication<NotepadApplication>(*args)
}
