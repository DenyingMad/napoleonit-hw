package com.devilpanda.napoleonit_hw.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilpanda.napoleonit_hw.R
import com.devilpanda.napoleonit_hw.model.Recipe
import kotlinx.android.synthetic.main.activity_recipe_details.*

class RecipeDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_details)

        val recipe = intent.extras?.getSerializable("recipe") as Recipe
        recipeName.text = recipe.name
        recipeDescription.text = recipe.description

        addToFavourites.setOnClickListener {
            intent.putExtra("favourite", recipe.name)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}