package edu.uc.willi6jd.mycaloriecounter.DTO


class Food(
    val Name: String,
    val Calories: Int,
    val Fat: Int,
    val Protein: Int
){
    override fun toString(): String {
        return "Category [Name: ${this.Name}, Calories: ${this.Calories}, Fat: ${this.Fat}, Protein: ${this.Protein}]"    }
}