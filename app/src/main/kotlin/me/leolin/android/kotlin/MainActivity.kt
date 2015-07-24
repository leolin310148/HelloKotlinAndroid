package me.leolin.android.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(10)
            textView("Hello Kotlin with Anko") {
                onClick {
                    toast(this.getText())
                    this.setText(this.getText().toString() + "!")
                }
            }
        }

    }

}