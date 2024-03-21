package com.ganeshi.practiceprojectset.AndroidPermission
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.ganeshi.practiceprojectset.databinding.ActivityAndroidPermissionBinding
class AndroidPermissionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAndroidPermissionBinding
    private val PERMISSION_REQ_CODE = 100
    val PERMISSION_RECORD_AUDIO = android.Manifest.permission.RECORD_AUDIO


    private val PERMISSION_REQ_CODE1 = 101
    val PERMISSION_CAMERA = android.Manifest.permission.CAMERA

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAndroidPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickPermission.setOnClickListener {
        requestRunTimePermission()

        }
    }
        private fun requestRunTimePermission(){
            if ( ActivityCompat.checkSelfPermission(this , PERMISSION_CAMERA ) == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this , "Permission Granted" , Toast.LENGTH_SHORT).show()
            }else if (ActivityCompat.shouldShowRequestPermissionRationale(this , PERMISSION_CAMERA)){
                val alertDialogBuilder = AlertDialog.Builder(this)
                alertDialogBuilder.setMessage("this is required Camera permission for particular feature to work at expected")
                    .setTitle("Permission Required")
                    .setCancelable(false)
                    .setNegativeButton("No"){ dialog:DialogInterface , i:Int ->
                        dialog.dismiss()
                    }
                    .setPositiveButton("Yes"){ dialog:DialogInterface , i:Int ->
                        ActivityCompat.requestPermissions(this , arrayOf(PERMISSION_CAMERA) , PERMISSION_REQ_CODE1)
                        dialog.dismiss()
                    }
                alertDialogBuilder.show()
            }
            else{
                ActivityCompat.requestPermissions(this , arrayOf(PERMISSION_CAMERA) , PERMISSION_REQ_CODE1)
            }
        }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)


        if (requestCode == PERMISSION_REQ_CODE1){
           if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
               Toast.makeText(this , "Permission Granted. use can use API...." , Toast.LENGTH_SHORT).show()
           }
            else if (ActivityCompat.shouldShowRequestPermissionRationale(this , PERMISSION_CAMERA)){
               val alertDialogBuilder = AlertDialog.Builder(this)
                    alertDialogBuilder.setMessage( "This feature is unavailable because this feature require permission that you have denied ." +
                            "Please allow Camera  permission from setting to proceed further")
                        .setTitle("Permission Required")
                        .setCancelable(false)
                        .setNegativeButton("Cancel" ){ dialogInterface:DialogInterface, _:Int ->
                            dialogInterface.dismiss()
                        }
                        .setPositiveButton("Setting"){ dialogInterface:DialogInterface, _:Int ->
                                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                            val uri  = Uri.fromParts("package" , packageName , null)
                            intent.setData(uri)
                            startActivity(intent)
                            dialogInterface.dismiss()

                        }
                    alertDialogBuilder.show()

                }
                else{
                    requestRunTimePermission()
                }
           }
        }
    }



//        private fun requestRunTimePermission() {
//            if (ActivityCompat.checkSelfPermission(
//                    this,
//                    PERMISSION_RECORD_AUDIO
//                ) == PackageManager.PERMISSION_GRANTED
//            ) {
//                Toast.makeText(
//                    this,
//                    "Permission Granted . You can use API which require the permission",
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else if (ActivityCompat.shouldShowRequestPermissionRationale(
//                    this,
//                    PERMISSION_RECORD_AUDIO
//                )
//            ) {
//                val alertDialogBuilder = AlertDialog.Builder(this)
//                alertDialogBuilder.setMessage("This is required RECORD_AUDIO permission for particular feature to work at expected")
//                alertDialogBuilder.setTitle("Permission Required")
//                alertDialogBuilder.setCancelable(false)
//                alertDialogBuilder.setPositiveButton("Allow") { dialogInterface: DialogInterface, i: Int ->
//                    ActivityCompat.requestPermissions(
//                        this,
//                        arrayOf(PERMISSION_RECORD_AUDIO), PERMISSION_REQ_CODE
//                    )
//                    dialogInterface.dismiss()
//                }
//                alertDialogBuilder.setNegativeButton("Deny") { dialogInterface: DialogInterface, i: Int ->
//                    dialogInterface.dismiss()
//                }
//                alertDialogBuilder.show()
//
//
//            } else {
//                ActivityCompat.requestPermissions(
//                    this,
//                    arrayOf(PERMISSION_RECORD_AUDIO), PERMISSION_REQ_CODE
//                )
//            }
//        }
//        override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//            super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//
//            if (requestCode == PERMISSION_REQ_CODE){
//                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
//                    Toast.makeText(this , "Permission Granted. you can use the API which require the permission" , Toast.LENGTH_SHORT).show()
//                }
//                else if (ActivityCompat.shouldShowRequestPermissionRationale(this , PERMISSION_RECORD_AUDIO)){
//                    val alertDialogBuilder = AlertDialog.Builder(this)
//                    alertDialogBuilder.setMessage( "This feature is unavailable because this feature require permission that you have denied ." +
//                            "Please allow microphone (Record Audio) permission from setting to proceed further")
//                        .setTitle("Permission Required")
//                        .setCancelable(false)
//                        .setNegativeButton("Cancel" ){ dialogInterface:DialogInterface , i:Int ->
//                            dialogInterface.dismiss()
//                        }
//                        .setPositiveButton("Setting"){ dialogInterface:DialogInterface , i:Int ->
//                                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
//                            val uri  = Uri.fromParts("package" , packageName , null)
//                            intent.setData(uri)
//                            startActivity(intent)
//                            dialogInterface.dismiss()
//
//                        }
//                    alertDialogBuilder.show()
//
//                }
//                else{
//                    requestRunTimePermission()
//                }
//            }
//        }
//
//    }




