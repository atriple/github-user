package xyz.atriple.dicoding.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_user.*
import xyz.atriple.dicoding.githubuser.model.User

class DetailUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val userData = intent.getParcelableExtra<User>("USER_DATA")

        tv_profile_name.text = userData.name
        tv_profile_username.text = userData.username
        tv_profile_company.text = userData.company
        tv_profile_location.text = userData.location
        tv_profile_repository_value.text = userData.repository
        tv_profile_follower_value.text = userData.follower
        tv_profile_following_value.text = userData.following
        img_profile_avatar.setImageResource(userData.avatar)
    }
}