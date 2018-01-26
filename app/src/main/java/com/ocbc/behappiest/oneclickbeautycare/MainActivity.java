package com.ocbc.behappiest.oneclickbeautycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.gms.ads.MobileAds;
import org.w3c.dom.Text;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView beautycare;
    private TextView beautytips;
    private TextView hair;
    private TextView makeup;
    private TextView nails;
    private TextView skincare;
    private TextView tips;
    private TextView faq;
    private TextView aboutus;
    private final int REQUEST_CODE = 2;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //Ads ID
        MobileAds.initialize(this, "ca-app-pub-3619509610342029~7357622212");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        beautycare = (TextView) findViewById(R.id.hbeautycareID);
        beautytips = (TextView) findViewById(R.id.hbeautytipsID);
        hair = (TextView) findViewById(R.id.hhairID);
        makeup = (TextView) findViewById(R.id.hmakeupID);
        nails = (TextView) findViewById(R.id.hnailID);
        skincare = (TextView) findViewById(R.id.hskincareID);
        tips = (TextView) findViewById(R.id.htipsID);
        faq = (TextView) findViewById(R.id.hfaqID);
        aboutus = (TextView) findViewById(R.id.haboutusID);


        beautycare.setOnClickListener(this);
        beautytips.setOnClickListener(this);
        hair.setOnClickListener(this);
        makeup.setOnClickListener(this);
        nails.setOnClickListener(this);
        skincare.setOnClickListener(this);
        tips.setOnClickListener(this);
        faq.setOnClickListener(this);
        aboutus.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.hbeautycareID:
                Intent beautycareintent = new Intent(MainActivity.this, listtopics.class);
                beautycareintent.putExtra("title", "BeautyCare");
                startActivity(beautycareintent);
                break;

            case R.id.hbeautytipsID:
                Intent beautytipsintent = new Intent(MainActivity.this, listtopics.class);
                beautytipsintent.putExtra("title", "BeautyTips");
                startActivity(beautytipsintent);
                break;

            case R.id.hhairID:
                Intent hairintent = new Intent(MainActivity.this, listtopics.class);
                hairintent.putExtra("title", "Hair");
                startActivity(hairintent);
                break;

            case R.id.hmakeupID:
                Intent makeupintent = new Intent(MainActivity.this, listtopics.class);
                makeupintent.putExtra("title", "MakeUp");
                startActivity(makeupintent);
                break;

            case R.id.hnailID:
                Intent nailintent = new Intent(MainActivity.this, listtopics.class);
                nailintent.putExtra("title", "Nails");
                startActivity(nailintent);
                break;

            case R.id.hskincareID:
                Intent skincareintent = new Intent(MainActivity.this, listtopics.class);
                skincareintent.putExtra("title", "Skincare");
                startActivity(skincareintent);
                break;

            case R.id.htipsID:
                Intent tipsintent = new Intent(MainActivity.this, listtopics.class);
                tipsintent.putExtra("title", "Tips");
                startActivity(tipsintent);
                break;

            case R.id.hfaqID:
                Intent faqintent = new Intent(MainActivity.this, listtopics.class);
                faqintent.putExtra("title", "Faq");
                startActivity(faqintent);
                break;

            case R.id.haboutusID:
                Intent aboutusintent = new Intent(MainActivity.this, listtopics.class);
                aboutusintent.putExtra("title", "Aboutus");
                startActivity(aboutusintent);
                break;
        }
    }
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == REQUEST_CODE) {
        if (resultCode == RESULT_OK) {
            String result = data.getStringExtra("returnData");

        }
    }


}

}
