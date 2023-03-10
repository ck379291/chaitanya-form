package com.example.chaitanyaform

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuBuilder
import com.example.chaitanyaform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener,RadioGroup.OnCheckedChangeListener,
CompoundButton.OnCheckedChangeListener{
    private lateinit var binding: ActivityMainBinding
    val list: ArrayList<String> = ArrayList()
    var gender:String?=null
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_main,menu)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonFirst.setOnClickListener(this)
        binding.radiogroup.setOnCheckedChangeListener(this)
        binding.cricket.setOnCheckedChangeListener(this)
        binding.programming.setOnCheckedChangeListener(this)
        binding.music.setOnCheckedChangeListener(this)
        binding.nobel.setOnCheckedChangeListener(this)

    }
    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button_first ->{
                if (binding.firstnmae.text!!.isEmpty() && binding.lastname.text!!.isEmpty() && binding.mobilenumber.editableText!!.isEmpty()
                    && binding.alternativemobilenumber.editableText!!.isEmpty()  && binding.email.text.isEmpty() ){
                    binding.firstnmae.requestFocus()
                    Toast.makeText(this,"fill all the information", Toast.LENGTH_SHORT).show()

                }
                else if (binding.firstnmae.text.isEmpty()){
                    binding.firstnmae.requestFocus()
                    Toast.makeText(this,"Your first name is missing",Toast.LENGTH_SHORT).show()
                }
                else if (binding.lastname.text.isEmpty()){
                    binding.lastname.requestFocus()
                    Toast.makeText(this,"Your last name is missing",Toast.LENGTH_SHORT).show()
                }
                else if (binding.mobilenumber.editableText.isEmpty()){
                    binding.mobilenumber.requestFocus()
                    Toast.makeText(this,"Your mobile name is missing",Toast.LENGTH_SHORT).show()
                }
                else if (binding.alternativemobilenumber.editableText.isEmpty()){
                    binding.alternativemobilenumber.requestFocus()
                    Toast.makeText(this,"Your Alternative mobile name  is missing",Toast.LENGTH_SHORT).show()
                }
                else if (binding.email.text.isEmpty()){
                    binding.email.requestFocus()
                    Toast.makeText(this,"Your email Address is missing",Toast.LENGTH_SHORT).show()
                }
                else if (binding.firstnmae.text!!.isNotEmpty() && binding.lastname.text!!.isNotEmpty() &&binding.mobilenumber.editableText.isNotEmpty() && binding.alternativemobilenumber.editableText.isNotEmpty() && binding.email.text!!.isNotEmpty() ){
                    val intent=Intent(this,useroutput::class.java)
                    val ufirstname=binding.firstnmae.editableText.toString()
                    val ulastname=binding.lastname.editableText.toString()
                    val umobileNumber=binding.mobilenumber.editableText.toString()
                    val ualternativenumber=binding.alternativemobilenumber.editableText.toString()
                    val uemailaddress=binding.email.editableText.toString()
                    val lst=list.toString().replace("["," ").replace("]"," ")
                    intent.putExtra("firstname",ufirstname)
                    intent.putExtra("lastname",ulastname)
                    intent.putExtra("mobile number",umobileNumber )
                    intent.putExtra("alternative",ualternativenumber)
                    intent.putExtra("email",uemailaddress)
                    intent.putExtra("gender",gender)
                    intent.putExtra("hobbies",lst)
                    startActivity(intent)
                }
            }

        }
    }



    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when(group?.checkedRadioButtonId){
            R.id.male ->{
                val Radiomale=findViewById<RadioButton>(checkedId)
                gender=Radiomale.text.toString()
            }
            R.id.female ->{
                val Radiofemale=findViewById<RadioButton>(checkedId)
                gender=Radiofemale.text.toString()
            }
            R.id.transgender ->{
                val Radiotrans=findViewById<RadioButton>(checkedId)
                gender=Radiotrans.text.toString()
            }
        }

    }

    override fun onCheckedChanged(buttonView: CompoundButton?,isChecked: Boolean) {
        when(buttonView?.id){
            R.id.cricket -> {
                if (binding.cricket.isChecked){
                    list.add(binding.cricket.text.toString())
                }
                else{
                    list.remove(binding.cricket.text.toString())
                }
            }
            R.id.programming ->{
                if (binding.programming.isChecked){
                    list.add(binding.programming.text.toString())
                }
                else{
                    list.remove(binding.programming.text.toString())
                }
            }
            R.id.music ->{
                if (binding.music.isChecked){
                    list.add(binding.music.text.toString())
                }
                else{
                    list.remove(binding.music.text.toString())
                }
            }
            R.id.nobel->{
                if (binding.nobel.isChecked){
                    list.add(binding.nobel.text.toString())
                }
                else{
                    list.remove(binding.nobel.text.toString())
                }
            }
        }
        }

    }




