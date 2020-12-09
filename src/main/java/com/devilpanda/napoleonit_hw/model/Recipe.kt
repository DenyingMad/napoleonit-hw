package com.devilpanda.napoleonit_hw.model

import java.io.Serializable

data class Recipe(
        val name: String,
        val description: String,
        var isFavourite: Boolean
) : Serializable