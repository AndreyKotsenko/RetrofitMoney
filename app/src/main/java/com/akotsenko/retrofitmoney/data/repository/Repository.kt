package com.akotsenko.retrofitmoney.data.repository

import com.akotsenko.retrofitmoney.data.api.RetrofitInstance
import com.akotsenko.retrofitmoney.model.beznal.NonCash
import com.akotsenko.retrofitmoney.model.beznal.NonCashItem
import com.akotsenko.retrofitmoney.model.nal.Cash
import com.akotsenko.retrofitmoney.model.nal.CashItem
import retrofit2.Response

class Repository {

    suspend fun getCash(): Response<Cash> {
        return RetrofitInstance.api.getCashMoneys()
    }

    suspend fun getNonCash(): Response<NonCash> {
        return RetrofitInstance.api.getNonCashMoneys()
    }
}