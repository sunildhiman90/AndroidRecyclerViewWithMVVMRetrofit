package com.codingambitions.androidrecyclerviewexamplekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codingambitions.androidrecyclerviewexamplekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var usersViewModel: UsersViewModel

    private val usersRecyclerAdapter by lazy {
        UsersRecyclerAdapter()
    }

    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usersViewModel = ViewModelProvider(this).get(UsersViewModel::class.java)
        linearLayoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        binding.usersRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            adapter = usersRecyclerAdapter
        }

        usersViewModel.getUsers()

        usersViewModel.users.observe(this, Observer {
            usersRecyclerAdapter.submitList(it)
        })


    }
}