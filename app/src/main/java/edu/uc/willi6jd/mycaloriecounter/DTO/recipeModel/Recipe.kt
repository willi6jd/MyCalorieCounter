package edu.uc.willi6jd.mycaloriecounter.DTO.recipeModel
import edu.uc.willi6jd.mycaloriecounter.DTO.foodModel.Food


class Recipe(
    val Name: String,
    val Count: Int,
    val Description: String
){
    override fun toString(): String {
        return "Category [Name: ${this.Name}, Count: ${this.Count}, Description: ${this.Description}]"    }
}