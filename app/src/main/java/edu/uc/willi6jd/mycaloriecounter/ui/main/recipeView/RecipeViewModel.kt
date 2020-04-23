package edu.uc.willi6jd.mycaloriecounter.ui.main.recipeView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.lifecycle.ViewModel
import edu.uc.willi6jd.mycaloriecounter.R

/**
 * Work in progress, will create the service instance and get the data from file from the DAO
 */
class RecipeViewModel : ViewModel() {

    /**
     * This is created in order to fill the listview with the recipes. This may change once we integrate file reading and writing.
     */
    class recipeCustomerAdapter(context: Context): BaseAdapter(){
        private val mContext: Context

        //Test values for filling JSON
        private val recipe = arrayListOf<String>("Spaghetti", "Ham Sandhich","Fried Chicken, French Fries, Toast and Sauce")
        private val count = arrayListOf<String>("5", "3", "4","350","999")
        private val description = arrayListOf<String>("Noodles and meatsauce with cheese and garlic bread", "Bread, ham and cheese","Fried Chicken with french fries, buttered toast and sauce")

        init{
            mContext = context
        }
        //Rows in list
        override fun getCount(): Int {
            return recipe.size
        }

        //Select item
        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        //get selected item's id
        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        //Displays each row
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
//            val textView = TextView(mContext)
//            textView.text = "HERE"
//            return textView
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.recipe_row, viewGroup, false)

            val nameTextView = rowMain.findViewById<TextView>(R.id.listRecipeName)
            var currentItem = "Name: " + recipe.get(position)
            nameTextView.text = currentItem

            val calTextView = rowMain.findViewById<TextView>(R.id.listRecipeCount)
            var currentCount = "Count: " + count.get(position)
            calTextView.text = currentCount

            val fatTextView = rowMain.findViewById<TextView>(R.id.listRecipeDescription)
            var currentDescription = "Description: " + description.get(position)
            fatTextView.text = currentDescription


            return rowMain
        }

    }

    object RecipeItem {
        var name = "";
        var count = 0;
        var Description = "";
    }

}
