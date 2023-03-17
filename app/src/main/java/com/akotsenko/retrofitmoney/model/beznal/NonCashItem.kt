package com.akotsenko.retrofitmoney.model.beznal

data class NonCashItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)