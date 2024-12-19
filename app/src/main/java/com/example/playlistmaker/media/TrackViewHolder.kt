package com.example.playlistmaker.media

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.playlistmaker.R

class TrackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val imageView: ImageView
    private val trackNameView: TextView
    private val groupNameAndTimeCodeView: TextView

    init {
        imageView = itemView.findViewById(R.id.image_for_track)
        trackNameView = itemView.findViewById(R.id.track_name)
        groupNameAndTimeCodeView = itemView.findViewById(R.id.group_name)
    }

    fun bind(model: Track) {
        Glide.with(itemView)
            .load(model.artworkUrl100)
            .placeholder(R.drawable.placeholder)
            .centerCrop()
            .transform(RoundedCorners(8))
            .into(imageView)
        trackNameView.setText(model.trackName)
        groupNameAndTimeCodeView.setText("${model.artistName} • ${model.trackTime}")
    }
}