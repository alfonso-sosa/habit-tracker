package org.coati.habit_tracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HabitTrackerApplication

fun main(args: Array<String>) {
	runApplication<HabitTrackerApplication>(*args)
}
