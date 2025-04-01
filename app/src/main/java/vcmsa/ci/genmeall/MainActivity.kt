package vcmsa.ci.genmeall

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var input : EditText? = null
    private var answ : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.input)
        answ = findViewById(R.id.answ)

        val btnGen = findViewById<Button>(R.id.Pickbtn)
        val btnExit = findViewById<Button>(R.id.Exitbtn)
        val btnClear = findViewById<Button>(R.id.Clearbtn)

        btnGen.setOnClickListener(){
            MealGeneration()
        }

        btnExit.setOnClickListener(){
            finishAffinity()
        }

        btnClear.setOnClickListener(){
            input?.text?. clear()
            answ?.text =""
        }
    }

    private fun isNotEmpty() : Boolean {
        var b = true
        if (input?.text.toString().trim().isEmpty()){
            input?.error = "Input time!"
            b = false
        }
        return b

    }


    private fun MealGeneration() {


        if (isNotEmpty()){

            when(input?.text.toString().trim().toInt()) {

                in 600..1100 -> answ?.text ="Greek yogurt\n Oatmeal"
                in 600..1100 -> answ?.text ="eggs \n berries \n coffee"
                in 1200..1500 ->answ?.text ="instant noodle soup"
                in 1200..1500 ->answ?.text ="fully loaded veggie sandwiches"
                in 1501..2200 ->answ?.text ="baked feta chickpeas"
                in 1501..2200 ->answ?.text ="monster meatballs"

            }

        }


    }


}