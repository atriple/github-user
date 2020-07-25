package xyz.atriple.dicoding.githubuser.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val username: String,
    val name: String,
    val company: String,
    val location: String,
    val repository: String, //could be integer
    val follower: String, //could be integer
    val following: String, //could be integer
    @DrawableRes val avatar: Int
) : Parcelable