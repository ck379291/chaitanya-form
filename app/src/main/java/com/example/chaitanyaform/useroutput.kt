package com.example.chaitanyaform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.chaitanyaform.databinding.ActivityMainBinding
import com.example.chaitanyaform.databinding.ActivityUseroutputBinding

class useroutput : AppCompatActivity() {
    private lateinit var binding: ActivityUseroutputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityUseroutputBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val ufirstname=intent.getStringExtra("firstname")
        val ulastname=intent.getStringExtra("lastname")
        var umobileNumber=intent.getStringExtra("phone-number")
        val  ualternativenumber=intent.getStringExtra("Alternative mobile number")
        val uemailaddress=intent.getStringExtra("email")
        val gender=intent.getStringExtra("gender")
        val hobbies=intent.getStringExtra("hobbies")
        binding.userOutput.text="Name : $ufirstname $ulastname \n Mobile Number: $umobileNumber\n Alternative number :$ualternativenumber\n Email $uemailaddress \n Hobbies $hobbies \n Gender $gender"


    }
}