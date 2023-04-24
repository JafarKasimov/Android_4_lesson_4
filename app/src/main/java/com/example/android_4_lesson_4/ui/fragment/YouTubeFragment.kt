package com.example.android_4_lesson_4.ui.fragment


import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android4lesson1.R
import com.example.android4lesson1.databinding.FragmentYouTubeBinding
import com.example.android_4_lesson_4.base.BaseFragment
import com.example.android_4_lesson_4.ui.adapter.YouTubeAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class YouTubeFragment :
    BaseFragment<FragmentYouTubeBinding, YouTubeViewModel>(R.layout.fragment_you_tube) {

    override val binding by viewBinding(FragmentYouTubeBinding::bind)
    override val viewModel: YouTubeViewModel by viewModels()
    private val adapter = YouTubeAdapter()
    private val youTubeAdapter = YouTubeAdapter()

    override fun initialize() {
        binding.youtubeEpisodeRecycler.adapter = youTubeAdapter
        binding.youtubeEpisodeRecycler.adapter = adapter
    }

    override fun setupSubscribes() {
        viewModel.fetchYouTube().observe(viewLifecycleOwner) {
            lifecycleScope.launch {
                adapter.submitData(it)
            }
        }

        viewModel.fetchYouTube().observe(viewLifecycleOwner) {
            lifecycleScope.launch {
                youTubeAdapter.submitData(it)
            }
        }
    }
}