package com.excal.myproject.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Transaction(
    var id:String,
    var target_id:Int,
    var target:String,
    var amount:Int,
    var date:String
):Parcelable
