package edu.uc.willi6jd.mycaloriecounter.DTO.recipeModel
import edu.uc.willi6jd.mycaloriecounter.DTO.foodModel.Food


class Recipe(
    val Name: String,
    val Ingredients: ArrayList<Food> = arrayListOf<Food>(),
    val Calories: Int,
    val Fat: Int,
    val Protein: Int
){
    override fun toString(): String {
        return "Category [Name: ${this.Name}, Calories: ${this.Calories}, Fat: ${this.Fat}, Protein: ${this.Protein}]"    }
}