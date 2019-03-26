package com.cuty.picassoprob

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var imageDirection : String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun magicBu(view:View){
        imageDirection="https://i.imgur.com/H981AN7.jpg"
        try{Picasso.with(this)
                .load(imageDirection)
                .into(iVMentalist)}
        catch (ex:Exception){
            Toast.makeText(this,"no hay conexion a internet",Toast.LENGTH_SHORT).show()

        }
    }




}
