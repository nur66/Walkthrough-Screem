package com.example.walkthroughscreem

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnBoardingAdapter(var list:ArrayList<OnBoardinglemModel>) : RecyclerView.Adapter<OnBoardingAdapter.ViewHolder>() {
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var image = view.findViewById<ImageView>(R.id.img)
        var title = view.findViewById<TextView>(R.id.tv_title)
        var desc = view.findViewById<TextView>(R.id.tv_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}