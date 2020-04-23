package edu.uc.willi6jd.mycaloriecounter.ui.main.recipeView

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import edu.uc.willi6jd.mycaloriecounter.R

/**
 * This will control the view when they get to hte recipe page
 */
class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
        val listView = findViewById<ListView>(R.id.recipe_listview)
        listView.adapter =
            RecipeViewModel.recipeCustomerAdapter(
                this
            )
//        val btnCreate = findViewById(R.id.btnCreateRecipeItem) as Button //Create recipe button
//
//        btnCreate.setOnClickListener {
//
//            // Get input fields (by ID) store them to recipe item variables
//            var itemName = findViewById<EditText>(R.id.recipeName); //Name of recipe: input text field
//            var itemCount = findViewById<EditText>(R.id.recipeItemCount); //Number of food items in recipe: integer
//            var itemDescription = findViewById<EditText>(R.id.recipeDescription); //Description of recipe: input text field, string
//
//            // Put recipe item variables into recipeItem Object
//            fun recipeItem(nm: String, cnt: Int, dsc: String) {
//                RecipeItem.name = nm;
//                RecipeItem.count = cnt;
//                RecipeItem.Description = dsc;
//            }
//
//            // Build Recipe Array
//            val recipeItemArray = Array(20) { }
//
//            // Push recipeItem to Recipe Array
//            recipeItemArray.add(recipeItem(nm, cnt, dsc))
//        }
    }
}
