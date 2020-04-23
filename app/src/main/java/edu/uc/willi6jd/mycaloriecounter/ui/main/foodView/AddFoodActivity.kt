package edu.uc.willi6jd.mycaloriecounter.ui.main.foodView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.firebase.firestore.FirebaseFirestore
import edu.uc.willi6jd.mycaloriecounter.DTO.foodModel.Food
import edu.uc.willi6jd.mycaloriecounter.R
import kotlinx.android.synthetic.main.activity_add_food.*

class AddFoodActivity : AppCompatActivity() {

    lateinit var firestore :FirebaseFirestore


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)

        var addFoodButton = findViewById<Button>(R.id.addBtn)
        addFoodButton.setOnClickListener {
            saveFood()
        }

    }


    private fun saveFood() {

        var food = Food().apply {
            Name = foodNameTxt.text.toString()
            Calories = foodCalTxt.text.toString().toInt()
            Fat = foodFatTxt.text.toString().toInt()
            Protein = foodProteinTxt.text.toString().toInt()

        }

        firestore = FirebaseFirestore.getInstance()

        firestore.collection("food")
            .document()
            .set(food)
            .addOnSuccessListener {
                Log.d("Firebase", "saved")
            }
            .addOnFailureListener {
                Log.d("Firebase", "failed")
            }



    }




}
