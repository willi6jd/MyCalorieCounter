package edu.uc.willi6jd.mycaloriecounter

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import edu.uc.willi6jd.mycaloriecounter.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val foodButton = findViewById<Button>(R.id.foodButton);
        foodButton.setOnClickListener(){
            val foodIntent = Intent(this, FoodActivity :: class.java )
            startActivity(foodIntent)
        }

        val recipeButton = findViewById<Button>(R.id.recipeButton)
        recipeButton.setOnClickListener(){
            val recipeIntent = Intent(this, RecipeActivity :: class.java )
            startActivity(recipeIntent)
        }
        val dailyButton = findViewById<Button>(R.id.dailyButton)
        dailyButton.setOnClickListener(){
            val goalsIntent = Intent(this, GoalsActivity :: class.java )
            startActivity(goalsIntent)
        }
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        }
    }

