package com.codingambitions.androidrecyclerviewexamplekotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UsersViewModel: ViewModel() {

    private var _users = MutableLiveData<List<UserX>>()
    val users: LiveData<List<UserX>> = _users

    val usersRepository by lazy {
        UsersRepository()
    }

    fun getUsers(){
        viewModelScope.launch { 
            var response = usersRepository.getUsers()
            _users.postValue(response)
        }
        /*var list = mutableListOf<UserX>()
        list.add(
            User(
                "Sunil",
                1,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "John",
                2,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "Phillip",
                3,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "Anil",
                4,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "Ramesh",
                5,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "Shruti",
                6,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "Amanda",
                7,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "Nima",
                8,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "AShruti",
                9,
                R.drawable.profile
            )
        )
        list.add(
            User(
                "Aman",
                10,
                R.drawable.profile
            )
        )*/
        //_users.value = list
    }
}