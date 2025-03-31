package vcmsa.ci.herasmealplan

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnOption = findViewById<Button>(R.id.btnOption)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val edtTime = findViewById<TextView>(R.id.edtTime)
        val txtResults: TextView = findViewById<TextView>(R.id.txtResults)

            btnOption.setOnClickListener {
                val Time = edtTime.text.toString()

                val option: String
                if (Time == "morning") {
                    option = "Breakfast: Bacon, Eggs, Sausage, Weetbix, French Toast."
                } else if (Time == "mid-morning"){
                    option = "Snack: Energy bar, Crisps, Bananas."
                } else if (Time == "afternoon"){
                    option = "Lunch: 2 Kotas, Ramen, Hake."
                } else if (Time == "mid-afternoon"){
                    option = "Quick bite: Slap chips, Sushi, Popcorn."
                } else if (Time == "Dinner"){
                    option = "Main course: Lasagna, Mac & Cheese, Bunny Chow."
                } else if (Time == "After dinner snack"){
                    option = "Chocolate pudding, Caramel Sundae, Milk Tart."
                } else {
                    option = "Please enter a proper time of day."
                }

                txtResults.text = option

                btnClear.setOnClickListener {
                   val options = edtTime.text.toString()
                    txtResults.text = "Meal option will appear here."
                    return@setOnClickListener
                }










        }
















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}