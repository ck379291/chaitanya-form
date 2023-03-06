package com.example.chaitanyaform

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import com.example.chaitanyaform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val Firstname:EditText=findViewById(R.id.firstnmae)
        val Lastname:EditText=findViewById(R.id.lastname)
        val Mobilenumber:EditText=findViewById(R.id.mobilenumber)
        val Alternative:EditText=findViewById(R.id.alternativemobilenumber)
        val Email:EditText=findViewById(R.id.email)
        val btn:Button=findViewById(R.id.submitbtn)
        btn.setOnClickListener {
            Firstname.text.toString()
            Lastname.text.toString()
            Mobilenumber.text.toString()
            Alternative.text.toString()
            Email.text.toString()
            Firstname.setText("fgjjfv:$Firstname")
//            Firstname.setText("first name: $Firstname")
//            Lastname.setText("last name:$Lastname")
//            Mobilenumber.setText("mobile number:$Mobilenumber")
//            Alternative.setText("alternative mobile number:$Alternative ")
//            Email.setText("email:$Email")
        }


    }
}