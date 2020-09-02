package xyz.atriple.dicoding.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import xyz.atriple.dicoding.githubuser.adapter.UserAdapter
import xyz.atriple.dicoding.githubuser.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var users: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        users = createUserList()

        //rv_github_user.adapter =
    }

    fun createUserList(): ArrayList<User>{
        //TODO: This can be optimized (probably?)
        val users : ArrayList<User> = ArrayList<User>()
        val usernames = resources.getStringArray(R.array.username)
        val names = resources.getStringArray(R.array.name)
        val locations = resources.getStringArray(R.array.location)
        val repositories = resources.getStringArray(R.array.repository)
        val companies = resources.getStringArray(R.array.company)
        val followers = resources.getStringArray(R.array.followers)
        val following = resources.getStringArray(R.array.following)
        val avatars = resources.getStringArray(R.array.avatar)

        for((index, _) in usernames.withIndex()){
            users.add(
                User(
                    usernames[index],
                    names[index],
                    locations[index],
                    repositories[index],
                    companies[index],
                    followers[index],
                    following[index],
                    resources.getIdentifier(avatars[index], null, packageName)
                ))
        }

        return users
    }
}