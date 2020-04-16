package edu.uc.willi6jd.mycaloriecounter.ui.main.foodView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.FirebaseFirestore
import edu.uc.willi6jd.mycaloriecounter.DTO.foodModel.Food
import edu.uc.willi6jd.mycaloriecounter.R


/**
 * This will control the view when they get to the food page
 */
class FoodActivity : AppCompatActivity() {

    var firestore :FirebaseFirestore
    private var _food: MutableLiveData<ArrayList<Food>> = MutableLiveData<ArrayList<Food>>()

    init {
        foodListener()
        firestore = FirebaseFirestore.getInstance()

    }

    private fun foodListener() {
        firestore.collection("food").addSnapshotListener {
            snapshot, e ->

            if(e != null){
                Log.d("food" ,"listen failed")
                return@addSnapshotListener
            }
            if(snapshot != null) {
                val allFood = ArrayList<Food>()
               val documents =  snapshot.documents
                documents.forEach {
                   val food = it.toObject(Food::class.java)
                    if(food != null) {
                        allFood.add(food!!)
                    }
                }
                _food.value = allFood
            }
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        /*This will display food items from firebase in the food activity*/
        /* context for some reason is not being recognized */

        // food.observe(this, Observer {
        //    it ->
          //  spnFood.adapter =
            //    ArrayAdapter(context!!, R.layout.support_simple_spinner_dropdown_item, food)
        //})

        val addButton = findViewById<Button>(R.id.addFoodBtn)
        addButton.setOnClickListener {
            val addIntent = Intent(this, AddFoodActivity:: class.java )
            startActivity(addIntent)
        }

    }

    internal var food: MutableLiveData<ArrayList<Food>>
        get() {return _food}
        set(value) {_food = value}



}


