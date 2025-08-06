package app.random_fox_image.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.random_fox_image.domain.model.Fox
import app.random_fox_image.domain.usecase.GetRandomFoxUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class FoxViewModel @Inject constructor(
    private val getRandomFoxUseCase: GetRandomFoxUseCase
) : ViewModel() {

    var fox by mutableStateOf<Fox?>(null)
        private set

    var isLoading by mutableStateOf(false)
        private set

    var error by mutableStateOf<String?>(null)
        private set

    init {
        loadFox()
    }

    fun loadFox() {
        viewModelScope.launch {
            isLoading = true
            error = null
            try {
                fox = getRandomFoxUseCase()
            } catch (e: Exception) {
                error = e.localizedMessage
            }
            isLoading = false
        }
    }

}