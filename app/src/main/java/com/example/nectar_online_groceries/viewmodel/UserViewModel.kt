package  com.example.nectar_online_groceries.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.nectar_online_groceries.data.User

class UserViewModel : ViewModel() {
    var username = mutableStateOf("")
    var password = mutableStateOf("")
    var errorMessage = mutableStateOf("")

    fun validateLogin(onSuccess: (User) -> Unit) {
        if (username.value.isBlank() || password.value.isBlank()) {
            errorMessage.value = "Preencha todos os campos"
        } else {
            errorMessage.value = ""
            onSuccess(User(username.value, password.value))
        }
    }
}