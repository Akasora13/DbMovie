package id.farrel.dbmovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import id.farrel.dbmovie.ui.home.HomeActivity
import com.github.ybq.android.spinkit.sprite.Sprite
import android.view.View
import android.widget.ProgressBar
import com.github.ybq.android.spinkit.style.CubeGrid


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<View>(R.id.progressBar) as ProgressBar
        val cubeGrid: Sprite = CubeGrid()
        progressBar.indeterminateDrawable = cubeGrid

        

        Handler(mainLooper).postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, 1500L)
    }
}