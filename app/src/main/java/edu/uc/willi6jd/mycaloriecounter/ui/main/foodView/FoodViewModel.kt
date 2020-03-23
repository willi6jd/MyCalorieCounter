package edu.uc.willi6jd.mycaloriecounter.ui.main.foodView

import androidx.lifecycle.ViewModel
import edu.uc.willi6jd.mycaloriecounter.DTO.foodModel.Food
import edu.uc.willi6jd.mycaloriecounter.Service.FileService

/**
 * Work in progress, will create the service instance and get the data from file from the DAO
 */
class FoodViewModel : ViewModel() {

    private var foodList = ArrayList<Food>()
    /**
     * This function is what grabs the foodList from the servce/dao boolean is to determine if it was successful or not, async function would work aswell
     */
//     fun getDataFromFile(fileName: String):Boolean{
//        var fileService: FileService = FileService()
//        foodList = fileService.fetchFood(fileName);
//        if(foodList == null){
//            return false;
//        }
//        else{
//            return true;
//        }
//    }

    fun getDataHeldInViewModel():ArrayList<Food>{
        return foodList
    }


}
