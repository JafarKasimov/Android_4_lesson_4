package com.example.android_4_lesson_4.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.android4lesson1.databinding.ItemYoutubeBinding
import com.example.android_4_lesson_4.extension.setImage
import com.example.android_4_lesson_4.model.YoutubeModel

class YouTubeAdapter() :
    PagingDataAdapter<YoutubeModel, YouTubeAdapter.ViewHolder>(
        YouTubeDiffCallBack
    ) {
    inner class ViewHolder(private val binding: ItemYoutubeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: YoutubeModel?) = with(binding) {
            tvAuthorName.text = item?.snippet?.channelTitle
            ivCover.setImage(item?.snippet?.thumbnails?.maxRes!!.url)
            binding.tvName.text = item.snippet.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YouTubeAdapter.ViewHolder {
        return ViewHolder(
            ItemYoutubeBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: YouTubeAdapter.ViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    object YouTubeDiffCallBack : DiffUtil.ItemCallback<YoutubeModel>() {
        override fun areItemsTheSame(
            oldItem: YoutubeModel,
            newItem: YoutubeModel
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: YoutubeModel,
            newItem: YoutubeModel,
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
