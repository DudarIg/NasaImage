package ru.dudar.nasaimage.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.dudar.nasaimage.data.NasaApiImpl
import ru.dudar.nasaimage.data.NasaImage

class ImageViewModel: ViewModel() {
    val imageVM: LiveData<NasaImage>
    init {
        imageVM = NasaApiImpl().nasaImage()
    }
}