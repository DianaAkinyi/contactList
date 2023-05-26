package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactlist.databinding.ActivityMainBinding
import com.example.contactlist.databinding.ContactNameListBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }

    fun displayTweets() {
        val contact1 = ContactData("Diana Akinyi","0724329898","dianaakinyi@gmail.com")
        val contact2 = ContactData("Kelly Klein","0723435463","kellyklein@gmail.com")
        val contact3=ContactData("Winnie Esther","09734321585","winnieesther@gmail.com")
        val contact4=ContactData("Rukia Ilham","07685534383","rukiailham@gmail.com")
        val contact5=ContactData("Viola Stephanie","07453624265","viola@gmail.com")
        val contactList = listOf(contact1, contact2,contact3,contact4,contact5)
        val contAdapter = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contAdapter
    }
}