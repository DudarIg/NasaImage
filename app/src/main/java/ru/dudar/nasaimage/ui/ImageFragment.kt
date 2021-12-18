package ru.dudar.nasaimage.ui

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.content.res.AppCompatResources.getColorStateList
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import coil.api.load
import ru.dudar.nasaimage.R
import ru.dudar.nasaimage.databinding.ImageFragmentBinding

class ImageFragment : Fragment(R.layout.image_fragment) {

    private var _binding: ImageFragmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<ImageViewModel>()

    companion object {
        fun newInstance() = ImageFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = ImageFragmentBinding.bind(view)

        binding.yestoday2Chip.setOnClickListener {
            viewModel.image2.observe(this, Observer {
                binding.nasaIV.load(it.url)
                binding.tvText.text = it.title
            })
        }

        binding.yestodayChip.setOnClickListener {
            viewModel.image1.observe(this, Observer {
                binding.nasaIV.load(it.url)
                binding.tvText.text= it.title
            })
        }

        binding.todayChip.setOnClickListener {
            viewModel.imageVM.observe(this, Observer {
                binding.nasaIV.load(it.url)
                binding.tvText.text= it.title
            })
        }

     // binding.dateTv.text = data(1)

    }


    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}