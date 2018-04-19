package edu.washington.uwn73d8g.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val TAG = "MyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var p1: TextView = findViewById(R.id.textView1)
        var p1minus: Button = findViewById(R.id.button1)
        var p1plus: Button = findViewById(R.id.button2)
        var p1p5: Button = findViewById(R.id.button3)
        var p1m5: Button = findViewById(R.id.button4)

        p1minus.setOnClickListener {
            var life1: Int = p1.text.toString().toInt() - 1
            if (life1 <= 0) {
                p1.text = "Player 1 LOSES!"
            } else {
                p1.text = life1.toString()
            }
        }

        p1plus.setOnClickListener {
            var life1: Int = p1.text.toString().toInt() + 1
            if (life1 <= 0) {
                p1.text = "Player 1 LOSES!"
            } else {
                p1.text = life1.toString()
            }
        }

        p1p5.setOnClickListener {
            var life1: Int = p1.text.toString().toInt() + 5
            if (life1 <= 0) {
                p1.text = "Player 1 LOSES!"
            } else {
                p1.text = life1.toString()
            }
        }

        p1m5.setOnClickListener {
            var life1: Int = p1.text.toString().toInt() - 5
            if (life1 <= 0) {
                p1.text = "Player 1 LOSES!"
            } else {
                p1.text = life1.toString()
            }
        }

        var p2: TextView = findViewById(R.id.textView2)
        var p2minus: Button = findViewById(R.id.button5)
        var p2plus: Button = findViewById(R.id.button6)
        var p2p5: Button = findViewById(R.id.button7)
        var p2m5: Button = findViewById(R.id.button8)

        p2minus.setOnClickListener {
            var life1: Int = p2.text.toString().toInt() - 1
            if (life1 <= 0) {
                p2.text = "Player 2 LOSES!"
            } else {
                p2.text = life1.toString()
            }
        }

        p2plus.setOnClickListener {
            var life1: Int = p2.text.toString().toInt() + 1
            if (life1 <= 0) {
                p2.text = "Player 2 LOSES!"
            } else {
                p2.text = life1.toString()
            }
        }

        p2p5.setOnClickListener {
            var life1: Int = p2.text.toString().toInt() + 5
            if (life1 <= 0) {
                p2.text = "Player 2 LOSES!"
            } else {
                p2.text = life1.toString()
            }
        }

        p2m5.setOnClickListener {
            var life1: Int = p2.text.toString().toInt() - 5
            if (life1 <= 0) {
                p2.text = "Player 2 LOSES!"
            } else {
                p2.text = life1.toString()
            }
        }

        var p3: TextView = findViewById(R.id.textView3)
        var p3minus: Button = findViewById(R.id.button9)
        var p3plus: Button = findViewById(R.id.button10)
        var p3p5: Button = findViewById(R.id.button11)
        var p3m5: Button = findViewById(R.id.button12)

        p3minus.setOnClickListener {
            var life1: Int = p3.text.toString().toInt() - 1
            if (life1 <= 0) {
                p3.text = "Player 3 LOSES!"
            } else {
                p3.text = life1.toString()
            }
        }

        p3plus.setOnClickListener {
            var life1: Int = p3.text.toString().toInt() + 1
            if (life1 <= 0) {
                p3.text = "Player 3 LOSES!"
            } else {
                p3.text = life1.toString()
            }
        }

        p3p5.setOnClickListener {
            var life1: Int = p3.text.toString().toInt() + 5
            if (life1 <= 0) {
                p3.text = "Player 3 LOSES!"
            } else {
                p3.text = life1.toString()
            }
        }

        p3m5.setOnClickListener {
            var life1: Int = p3.text.toString().toInt() - 5
            if (life1 <= 0) {
                p3.text = "Player 3 LOSES!"
            } else {
                p3.text = life1.toString()
            }
        }

        var p4: TextView = findViewById(R.id.textView4)
        var p4minus: Button = findViewById(R.id.button13)
        var p4plus: Button = findViewById(R.id.button14)
        var p4p5: Button = findViewById(R.id.button15)
        var p4m5: Button = findViewById(R.id.button16)

        p4minus.setOnClickListener {
            var life1: Int = p4.text.toString().toInt() - 1
            if (life1 <= 0) {
                p4.text = "Player 4 LOSES!"
            } else {
                p4.text = life1.toString()
            }
        }

        p4plus.setOnClickListener {
            var life1: Int = p4.text.toString().toInt() + 1
            if (life1 <= 0) {
                p4.text = "Player 4 LOSES!"
            } else {
                p4.text = life1.toString()
            }
        }

        p4p5.setOnClickListener {
            var life1: Int = p4.text.toString().toInt() + 5
            if (life1 <= 0) {
                p4.text = "Player 4 LOSES!"
            } else {
                p4.text = life1.toString()
            }
        }

        p4m5.setOnClickListener {
            var life1: Int = p4.text.toString().toInt() - 5
            if (life1 <= 0) {
                p4.text = "Player 4 LOSES!"
            } else {
                p4.text = life1.toString()
            }
        }

    }



}
