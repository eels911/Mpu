package ru.mpu.mpu.helpers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

fun <T> ViewModel.emit(sharedFlow: MutableSharedFlow<T>, event: T) {
    viewModelScope.launch {
        sharedFlow.emit(event)
    }
}