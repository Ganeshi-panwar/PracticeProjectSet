package com.ganeshi.practiceprojectset.BottomSheet

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivityBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class BottomSheetActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBottomSheetBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomSheetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idBtnShowBottomSheet.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(this@BottomSheetActivity)
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog , null)
            val buttonDismiss = view.findViewById<Button>(R.id.idBtnDismiss)
            buttonDismiss.setOnClickListener {
                bottomSheetDialog.dismiss()
            }
            bottomSheetDialog.setCancelable(false)
            bottomSheetDialog.setContentView(view)
            bottomSheetDialog.show()
        }
    }

}