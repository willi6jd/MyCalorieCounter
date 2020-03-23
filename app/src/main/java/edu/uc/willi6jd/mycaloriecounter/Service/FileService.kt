package edu.uc.willi6jd.mycaloriecounter.Service

import edu.uc.willi6jd.mycaloriecounter.DAO.FileDAO
import edu.uc.willi6jd.mycaloriecounter.DTO.foodModel.Food

/**
 * The instance of this service will be used to create the DAO and get the data from the file or write to the file.
 *
 * unsure if needing to use mutablelive data since we don't neccesarily need to hold data within viewmodels
 */
class FileService : FileDAO {

//    fun fetchFood(fileName:String): ArrayList<Food> {
//        var food = ArrayList<Food>()
//        food = getJsonDataFromAsset(fileName)
//        return food
//    }

}