package edu.uc.willi6jd.mycaloriecounter.ui.main

import android.app.PendingIntent.getActivity
import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.uc.willi6jd.mycaloriecounter.DTO.Food
import edu.uc.willi6jd.mycaloriecounter.FoodActivity
import edu.uc.willi6jd.mycaloriecounter.Service.FileService

/**
 * Work in progress, will create the service instance and get the data from file from the DAO
 */
class MainViewModel : ViewModel() {
    //private var foodList: ArrayList<Food> = Array
    private var fileService: FileService = FileService()

//    val food: MutableLiveData<List<Food>> by lazy {
//        MutableLiveData<List<Food>>().also {
//            fetchFood()
//        }
//    }

    //fills the food list
//    fun fetchFood() {
//
//       foodList = fileService.fetchFood(context)
//    }
}
