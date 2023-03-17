package com.akotsenko.retrofitmoney.data.api

import com.akotsenko.retrofitmoney.model.beznal.NonCash
import com.akotsenko.retrofitmoney.model.beznal.NonCashItem
import com.akotsenko.retrofitmoney.model.nal.Cash
import com.akotsenko.retrofitmoney.model.nal.CashItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCashMoneys(): Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getNonCashMoneys(): Response<NonCash>
}