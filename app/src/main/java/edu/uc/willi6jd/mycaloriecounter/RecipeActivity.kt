package edu.uc.willi6jd.mycaloriecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * This will control the view when they get to hte recipe page
 */
class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
    }
}
