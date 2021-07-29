package com.mtsteta.android.pirozhkovteta

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.loadImage(imageUrl: String) {
    Glide
        .with(this.context)
        .load(imageUrl)
        .thumbnail( 0.1f )
        .into(this)
}