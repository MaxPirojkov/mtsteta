package com.mtsteta.android.pirozhkovteta

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.Resource
import com.bumptech.glide.request.RequestOptions

fun ImageView.loadImage(imageUrl: String) {
    Glide
        .with(this.context)
        .load(imageUrl)
        .override(710)
        .fitCenter()
        .into(this)
}