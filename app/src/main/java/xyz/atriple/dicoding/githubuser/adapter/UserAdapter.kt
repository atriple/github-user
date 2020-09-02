package xyz.atriple.dicoding.githubuser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import xyz.atriple.dicoding.githubuser.model.User
import kotlinx.android.synthetic.main.item_user.view.*
import xyz.atriple.dicoding.githubuser.R

class UserAdapter(private val mUser: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    lateinit var onItemClickCallback: (User) -> Unit

    class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val userView = inflater.inflate(R.layout.item_user, parent, false)

        return ViewHolder(userView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user: User = mUser[position]

        Glide.with(holder.itemView.context).load(user.avatar).apply(RequestOptions())
            .override(60, 60).into(holder.itemView.img_item_user)

        holder.itemView.tv_item_name.text = user.name
        holder.itemView.tv_item_username.text = user.username
        holder.itemView.tv_item_location.text = user.location
        holder.itemView.setOnClickListener{ onItemClickCallback(user) }
    }

    override fun getItemCount(): Int {
        return mUser.size
    }


}