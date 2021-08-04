package com.mtsteta.android.pirozhkovteta

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PreviewMovie(
    val title: String,
    val description: String,
    val rateScore: Int,
    val ageRestriction: String,
    val imageUrl: String,
    val actorOne: String,
    val actorTwo: String,
    val actorThree: String,
    val actorOneName: String,
    val actorTwoName: String,
    val actorThreeName: String,
    val genre: String



) : Parcelable

