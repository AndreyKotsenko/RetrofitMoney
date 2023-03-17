package com.akotsenko.retrofitmoney.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akotsenko.retrofitmoney.data.repository.Repository
import com.akotsenko.retrofitmoney.model.beznal.NonCash
import com.akotsenko.retrofitmoney.model.nal.Cash
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {


    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<NonCash>> = MutableLiveData()

    fun getNonCashMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getNonCash()
        }
    }
}