package edu.uc.willi6jd.mycaloriecounter.DAO

import com.fasterxml.jackson.module.kotlin.KotlinModule
import edu.uc.willi6jd.mycaloriecounter.DTO.foodModel.Food
import java.io.File
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

/**
 * This will read data from the storage file and write data to it. will deliver the data to the service
 */
interface FileDAO {

    /**
     * Changed from previous make but still unsure if this is the path to use for this type of process, The idea is to take in the filename which will be view and use that to pull the
     * JSON file, the example uses hardcoded fileName but eventually will build pathBuilder = view + ".JSON".
     *
     * 
     */
//    fun getJsonDataFromAsset(view : String):ArrayList<Food> {
//        val mapper = jacksonObjectMapper().registerModule(KotlinModule())
//        val jsonString: String = File("./src/main/resources/Food.json").readText(Charsets.UTF_8)
//        val jsonTextList:ArrayList<Food> = mapper.readValue<ArrayList<Food>>(jsonString)
//        return jsonTextList
//    }
}