package edu.temple.activity4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var textSizeSelector: RecyclerView
    lateinit var textSizeDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textSizeSelector = findViewById(R.id.textSizeSelectorRecyclerView)
        textSizeDisplay = findViewById(R.id.textSizeDisplayTextView)
        // Trying to create array of integers that are multiples of 5
        // Verify correctness by examining array values.
        val textSizes = Array(20) { (it + 1) * 5 }
        for (i in 0 < until < textSizes.size)
            Log.d("array value", textSizes[i].toString())
        textSizeSelector.adapter=
    }
}



/* Convert to RecyclerView.Adapter */
class TextSizeAdapter(_textSize) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
    class TextSizeViewHolder (View: View) : RecyclerView.ViewHolder(View){}


}