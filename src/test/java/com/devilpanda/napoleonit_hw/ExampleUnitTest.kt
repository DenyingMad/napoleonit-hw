package com.devilpanda.napoleonit_hw

import org.junit.Test

import org.junit.Assert.*


class ExampleUnitTest {

    val user1 = UserData("Danny", 19, "gmail")
    val user2 = UserData("Peter", 20, "gmail")
    val user3 = UserData("Vanya", 13, "gmail")
    val user4 = UserData("Volodya", 77, "gmail")

    val users = listOf(user1, user2, user3, user4);

    @Test
    fun start() {
        print(users.sortUsers())
    }

    // Сортировка пользователей по возрасту
    private fun List<UserData>.sortUsers(): List<UserData> {
        return this.sortedBy { it.age }
    }
}