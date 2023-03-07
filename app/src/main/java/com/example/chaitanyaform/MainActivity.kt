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
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.example.chaitanyaform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener,RadioGroup.OnCheckedChangeListener,
CompoundButton.OnCheckedChangeListener{
    private lateinit var binding: ActivityMainBinding
    val list: ArrayList<String> = ArrayList()
    private val isChecked:Boolean = false
    private var txtGender: String? = null
    private var music :String? =null
    private var Programming :String?=null
    private var cricket :String?=null
    private  var Nobel  :String?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonFirst.setOnClickListener(this)




        }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button_first->{
                if (binding.firstnmae.text.isEmpty() && binding.lastname.text.isEmpty() && binding.mobilenumber.text.isEmpty()
                    && binding.alternativemobilenumber.text.isEmpty() && binding.email.text.isEmpty() ){
                    Toast.makeText(this,"fill all the require feild",Toast.LENGTH_SHORT).show()
                }
                else if (binding.lastname.text.isEmpty()){
                    binding.lastname.requestFocus()
                    Toast.makeText(this,"enter your first name",Toast.LENGTH_SHORT).show()
                }
                else if (binding.mobilenumber.text.isEmpty()){
                    binding.mobilenumber.requestFocus()
                    Toast.makeText(this,"enter your first name",Toast.LENGTH_SHORT).show()
                }
                else if (binding.alternativemobilenumber.text.isEmpty()){
                    binding.alternativemobilenumber.requestFocus()
                    Toast.makeText(this,"enter your first name",Toast.LENGTH_SHORT).show()
                }
                else if (binding.email.text.isEmpty()){
                    binding.email.requestFocus()
                    Toast.makeText(this,"enter your first name",Toast.LENGTH_SHORT).show()
                }
                else{
                    val Firstname=binding.firstnmae.text.toString()
                    val Lastname=binding.lastname.text.toString()
                    val Mobilenumber=binding.mobilenumber.text.toString()
                    val Alternative=binding.alternativemobilenumber.text.toString()
                    val  Email=binding.email.text.toString()
                    binding.output.text=" Your name:$Firstname $Lastname \n Phone N" +
                            "umber:- $Mobilenumber \n Alternative number :$Alternative" +
                            "\n Email :$Email"
                }


            }
        }

    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when(group?.checkedRadioButtonId){
            R.id.male->{
                val rbmale=findViewById<RadioButton>(checkedId)
                txtGender=rbmale.text.toString()
                Toast.makeText(this,"male",Toast.LENGTH_SHORT).show()
                binding.output.text="Gender:$rbmale"
            }
            R.id.female->{
                val rbfemale=findViewById<RadioButton>(checkedId)
                txtGender=rbfemale.text.toString()
                Toast.makeText(this,"male",Toast.LENGTH_SHORT).show()
                binding.output.text="Gender :$rbfemale"
            }
            R.id.transgender->{
                val rbtransg=findViewById<RadioButton>(checkedId)
                txtGender=rbtransg.text.toString()
                Toast.makeText(this,"transgender",Toast.LENGTH_SHORT).show()
                binding.output.text="Gender:$rbtransg"
            }
        }

    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when(buttonView?.id){
            R.id.music->{
                if(binding.music.isChecked){
                    list.add(binding.music.text.toString())
                }
                else{
                    list.remove(binding.music.text.toString())
                }
            }
            R.id.cricket->{
                if (binding.music.isChecked){
                    list.add(binding.cricket.text.toString())
                }
                else{
                    list.remove(binding.cricket.text.toString())
                }
            }
            R.id.programming->{
                if (binding.programming.isChecked){
                    list.add(binding.programming.text.toString())
                }
                else{
                    list.remove(binding.programming.text.toString())
                }
            }
            R.id.nobel->{
                if (binding.nobel.isChecked){
                    list.add(binding.nobel.text.toString())
                }
                else{
                    list.remove(binding.nobel.text.toString()  )
                }
            }
        }
    }


}

