package com.example.smpnegeri13kotategal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Buku7Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku7);
    }
    public void mtk7(View view) {
        goToUrl("https://drive.google.com/file/d/17i5FpSXODOm_j3SBltygrub5mRmlCLS1/view?usp=drivesdk");
    }

    public void bind(View view) {
        goToUrl("https://drive.google.com/file/d/17i5FpSXODOm_j3SBltygrub5mRmlCLS1/view?usp=drivesdk");
    }

    public void ipa(View view) {
        goToUrl("https://drive.google.com/file/d/17i5FpSXODOm_j3SBltygrub5mRmlCLS1/view?usp=drivesdk");
    }
    private void goToUrl (String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }
}
