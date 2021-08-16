package com.mtsteta.android.pirozhkovteta

data class RequestState(
    val isProgress: Boolean,
    val error: String? = null,
    val hasData: Boolean = false
)
