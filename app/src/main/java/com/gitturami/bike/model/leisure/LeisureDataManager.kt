package com.gitturami.bike.model.leisure

import android.content.Context
import com.gitturami.bike.model.DataManager
import com.gitturami.bike.model.leisure.pojo.LeisureResponse

class LeisureDataManager(context: Context): DataManager(context) {
    private var api: LeisureApi = retrofitConfig.getRetrofit().create(LeisureApi::class.java)

    fun getAllLeisure(): LeisureResponse = api.getAllLeisure()

    fun getAllPark(): LeisureResponse = api.getAllPark()

    fun getAllCultures(): LeisureResponse = api.getAllCultures()

    fun getAllFestivals(): LeisureResponse = api.getAllFestivals()

    fun getAllLeports(): LeisureResponse = api.getAllLeports()

    fun getAllCourses(): LeisureResponse = api.getAllCourses()

    fun getAllHotels(): LeisureResponse = api.getAllHotels()

    fun getAllShopping(): LeisureResponse = api.getAllShopping()

    fun getAllFoods(): LeisureResponse = api.getAllFoods()
}