package com.example.yumanoha.barcodedetect;

import android.content.Intent;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
//import com.google.android.gms.vision.Frame;
//import com.google.android.gms.vision.barcode.Barcode;
//import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.File;
import java.io.FileOutputStream;

import static android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        final TextView txtView = findViewById(R.id.txtContent);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this.getApplicationContext(), ScannerActivity.class), 121);
//                ImageView myImageView = (ImageView) findViewById(R.id.imgview);
//                Bitmap myBitmap = BitmapFactory.decodeResource(
//                        getApplicationContext().getResources(),
//                        R.drawable.sample);
//                myImageView.setImageBitmap(myBitmap);

                // get an image from the camera
//                mCamera.takePicture(null, null, mPicture);
//
//                BarcodeDetector detector =
//                        new BarcodeDetector.Builder(getApplicationContext())
//                                .setBarcodeFormats(Barcode.DATA_MATRIX | Barcode.QR_CODE)
//                                .build();
//                if(!detector.isOperational()){
//                    txtView.setText("Could not set up the detector!");
//                    return;
//                }
//
//                Frame frame = new Frame.Builder().setBitmap(myBitmap).build();
//                SparseArray<Barcode> barcodes = detector.detect(frame);
//
//                Barcode thisCode = barcodes.valueAt(0);
//                TextView txtView = (TextView) findViewById(R.id.txtContent);
//                txtView.setText(thisCode.rawValue);
            }
        });
    }

//    private Camera.PictureCallback mPicture = new Camera.PictureCallback() {
//
//        @Override
//        public void onPictureTaken(byte[] data, Camera camera) {
//
//            File pictureFile = getOutputMediaFile(MEDIA_TYPE_IMAGE);
//            if (pictureFile == null){
//                Log.d(TAG, "Error creating media file, check storage permissions: " +
//                        e.getMessage());
//                return;
//            }
//
//            try {
//                Log.d(TAG, "Error accessing file: " + e.getMessage());
//            }
//        }
//    };
}
