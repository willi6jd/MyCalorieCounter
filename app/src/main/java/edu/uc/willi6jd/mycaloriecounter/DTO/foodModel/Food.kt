package edu.uc.willi6jd.mycaloriecounter.DTO.foodModel


data class Food(
    var Name: String = "",
    var Calories: Int = 0,
    var Fat: Int = 0,
    var Protein: Int = 0
){
    override fun toString(): String {
        return "$Name $Calories $Fat $Protein"
    }
}