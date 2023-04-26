package com.sohel.linechart

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class MainActivity : AppCompatActivity() {

    private lateinit var lineChart: LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lineChart = findViewById(R.id.lineChart)

        // Create a list of data entries
        val entries = ArrayList<Entry>()
        entries.add(Entry(1f, 5f))
        entries.add(Entry(2f, 6f))
        entries.add(Entry(3f, 8f))
        entries.add(Entry(4f, 6f))
        entries.add(Entry(5f, 5f))
        entries.add(Entry(6f, 6f))
        entries.add(Entry(7f, 6f))

        // Create a LineDataSet with the data entries
        val dataSet = LineDataSet(entries,"sohail")

        // Configure the appearance of the LineDataSet
        dataSet.color = Color.WHITE
        dataSet.setCircleColor(Color.BLACK)
        dataSet.lineWidth = 2f
        dataSet.circleRadius = 5f
        dataSet.setDrawCircleHole(true)


        dataSet.setDrawFilled(true)
        dataSet.fillColor = Color.GREEN

        /*  val fillGradient = LinearGradient(
            0f, 0f, 0f, lineChart.height.toFloat(),
            Color.BLUE, Color.WHITE, Shader.TileMode.MIRROR
        )
        dataSet.setDrawFilled(true)
        dataSet.fillDrawable = fillGradient*/


        // Create a LineData object and add the LineDataSet to it
        val lineData = LineData(dataSet)

        lineChart.animateX(5000)

        // Set the LineData to the LineChart
        lineChart.data = lineData
          lineChart.setDrawGridBackground(true)
      //  dataSet.fillDrawable = ContextCompat.getDrawable(this, R.drawable.gradientpichart)

        lineChart.description.isEnabled = false

       /* lineChart.xAxis.isEnabled = false
        lineChart.axisLeft.isEnabled = false
        lineChart.axisRight.isEnabled = false*/

        // Refresh the chart
        lineChart.invalidate()
        }

}