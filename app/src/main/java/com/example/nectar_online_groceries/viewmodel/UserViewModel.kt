package  com.example.nectar_online_groceries.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nectar_online_groceries.data.User

class UserViewModel : ViewModel() {
    private val _username = MutableLiveData("")
    val username: LiveData<String> = _username

    private val _password = MutableLiveData("")
    val password: LiveData<String> = _password

    private val _errorMessage = MutableLiveData("")
    val errorMessage: LiveData<String> = _errorMessage

    fun onUsernameChange(newValue: String) {
        _username.value = newValue
    }

    fun onPasswordChange(newValue: String) {
        _password.value = newValue
    }

    fun validateLogin(onSuccess: (User) -> Unit) {
        val user = _username.value ?: ""
        val pass = _password.value ?: ""

        if (username.value.isBlank() || password.value.isBlank()) {
            _errorMessage.value = "Preencha todos os campos"
        } else {
            _errorMessage.value = ""
            onSuccess(User(user, pass))
        }
    }

    fun setErrorMessage(message: String) {
        _errorMessage.value = message
    }
}