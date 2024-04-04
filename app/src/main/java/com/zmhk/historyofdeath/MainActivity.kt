package com.zmhk.historyofdeath

import android.icu.util.TimeZone
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.inputAge)
        resultTextView = findViewById(R.id.resultTextView)

        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()
            if (age != null && age in 20..100) {
                val searchAge = when (age) {
                    21 -> "Sophie Magdalena Scholl (German, 1921 - 1943) " + "A philosophy student who with her brother and other allies spread the word against the Nazi movement in the 1900s. She was beheaded by the German government for treason."
                    29 -> "Rani Lakshmi Bai. (Indian, 1828 - 1858) " + " Queen of Jhansi and resistance leader/fighter against the colonizing british party. She died being wounded in battle while getting her son(who was tied to her back) to safety."
                    44 -> "Albert Severin Roche aka 'The First Soldier of France' (French, 1895 - 1939) " + " A respected figure and one of the most essential reasons for france surviving WW1, being responsible for defending a trench from the enemy's advance by himself and capturing over 1180 prisoners. He was killed after the war by getting hit by a car on his way to work."
                    55 -> "Ṣalāḥ ad-Dīn Yūsuf ibn Ayyūb aka 'Saladin' (Kurdish,1138 - 1193) " + " The united Arab leader who successfully conquered the Holy City of Jerusalem and brought and end to the slaughtering of muslum civilians during the crusades while also gaining the respect of his enemies for his boundless honour, generosity and courage. He died after contracting a fever."
                    60 -> "Theodore Roosevelt (American,1858 - 1919) " + " The 26th U.S. President, in his term he prioritized conservation and established national parks, forest and monuments to preserve the U.S.'s natural resources. He died of a coronary embolism in his sleep."
                    63 -> "Catherine the Great (German-Russian) " + " The 8th Tsar of Russia, a noble girl of German heritage who by her determined mind and a few chance encounters brought Russia into it's Golden Age. She died of a stroke."
                    82 -> "Ghulam Mohammad Baksh Butt aka  'The Great Gama' (Indian, 1878 - 1960) " + " The Undefeated palvani wrestling champion. His record was 5000 victories, 3 ties an 0 loses. His precise daily work out regime was the inspiration for the late great Bruce Lee. He was an Islamic humanitarian responsible for protecting Hindus of his colony during the 1947 riots with his bare hands as well as escorted them to the boarder and bore all expenses to allow them safe travel. He passed away in retirement after a long battle with illness."
                    83 -> "Sir Adrian Carton de Wiart aka 'The Unkillable Solider' (Belgin/irish, 1808 - 1963) " + " A British soldier who fought in the Boar Wars, WW1 and WW2. He was repeatedly severally injured so much that he was famously known as 'the man who would not die'. He ended up passing away in his sleep after falling down a flight of stairs."
                    86 -> "Nikola Tesla (American, 1856 - 1943) " + " A man who changed the world by pioneering the generation, transmission and use of alternating current electricity, effectively powering a wide arrange of homes and buildings. He died of a coronary thrombosis"
                    96 -> "Simo Häyhä aka 'White Death' (Finnish, 1905 - 2002) " + " A Finnish hunter turned sniper in the Winter War between Finland and Soviet Russia. He successful rung up over 505 confirmed kills from mostly solo missions. He died peacefully of old age in a nursing home."
                    else -> null

                }
                val message = if (searchAge != null ) "$age is the dying age of $searchAge"
                else "Invalid input, please enter an age between the range 20 - 100."
                Log.e("MainActivity", "Invalid input recorded.")
                resultTextView.text = message.toString()
                if (age == 21)
                    Log.d("MainActivity","Sophie Magdalena Scholl was Accessed")
                if (age == 29)
                    Log.d("MainActivity","Rani Lakshmi Bai was Accessed")
                if (age == 44)
                    Log.d("MainActivity","Albert Severin Roche was Accessed")
                if (age == 55)
                    Log.d("MainActivity","Ṣalāḥ ad-Dīn Yūsuf ibn Ayyūb was Accessed")
                if (age == 60)
                    Log.d("MainActivity","Theodore Roosevelt was Accessed")
                if (age == 63)
                    Log.d("MainActivity","Catherine the Great was Accessed")
                if (age == 82)
                    Log.d("MainActivity","Ghulam Mohammad Baksh Butt was Accessed")
                if (age == 83)
                    Log.d("MainActivity","Sir Adrian Carton de Wiart was Accessed")
                if (age == 86)
                    Log.d("MainActivity","Nikola Tesla was Accessed")
                if (age == 96)
                    Log.d("MainActivity","Simo Häyhä was Accessed")
            } else {

                resultTextView.text = "Invalid, Please Enter Your Age."
                Log.e("MainActivity","Invalid input recorded.")
            }

        }
        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }

    }
}