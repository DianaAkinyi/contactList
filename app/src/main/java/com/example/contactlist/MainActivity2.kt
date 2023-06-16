package com.example.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contactlist.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    override fun onResume(){
    super.onResume()
 binding.btnAdd.setOnClickListener {
     var intent=Intent(this,MainActivity::class.java)
     startActivity(intent)
     validation()

 }
}
fun validation(){
    val name=binding.etName.text.toString()
    val email=binding.etEmail.text.toString()
    val phone=binding.etPhone.text.toString()
    var error=false
    if (name.isBlank()){
        binding.tilName.error="Enter name"
        error=true
    }
    if (email.isBlank()){
        binding.tilEmail.error="Enter email"
        error=true
    }
    if (phone.isBlank()){
        binding.tilPhone.error="Enter PhoneNumber"
        error=true
    }
    if (!error){
        Toast.makeText(this,"Successful addition",Toast.LENGTH_SHORT)
            .show()
    }
    }
    }
