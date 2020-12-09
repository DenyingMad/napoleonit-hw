package com.devilpanda.napoleonit_hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.devilpanda.napoleonit_hw.model.Recipe
import com.devilpanda.napoleonit_hw.ui.RecipeDetails
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = "Pizza Chicken BBQ"
        val desc = "Delicious Pizza Chicken BBQ Recipe, quik and easy!"
        val recipe = Recipe(name, desc, false)

        pizzaRecipe.setOnClickListener {
            val intent = Intent(this, RecipeDetails::class.java);
            intent.putExtra("recipe", recipe)
            startActivityForResult(intent, 1);
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data == null) return;
        favouriteRecipe.text = data.getStringExtra("favourite")
    }
}