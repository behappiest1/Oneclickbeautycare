package com.ocbc.behappiest.oneclickbeautycare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.ocbc.behappiest.oneclickbeautycare.MainActivity;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

/**
 * Created by behappiest on 14-Jan-18.
 */

public class listtopics extends AppCompatActivity {
    private RecyclerView recylerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listitems;
    private Bundle extras;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topics_list);

        extras = getIntent().getExtras();

        if (extras != null) {
            String title = extras.getString("title");
            setUp(title);
        }

    }

    public void setUp(String title) {
        recylerView = (RecyclerView) findViewById(R.id.recyclerViewId);
        recylerView.setHasFixedSize(true);
        recylerView.setLayoutManager(new LinearLayoutManager(listtopics.this));

        listitems = new ArrayList<>();

       switch (title){
            case "BeautyCare":
                listitems.add(new ListItem("Habits That Cause Wrinkles and Finelines"));
                listitems.add(new ListItem("Home Remedies For Overnight Eyebrow Growth"));
                listitems.add(new ListItem("How To Get Rid Of Dead Skin Cells"));
                listitems.add(new ListItem("Herbs for Healthy Hair and Glowing Skin"));
                listitems.add(new ListItem("Natural Anti-tanning Face Pack"));
                listitems.add(new ListItem("Scrub To Tighten Skin Pores"));
                listitems.add(new ListItem("Natural Bleach To Lighten Your Skin Tone"));
                listitems.add(new ListItem("Natural Glossy Lips"));
                listitems.add(new ListItem("Scrub for Acne Treatment"));
                break;

            case "BeautyTips":
                listitems.add(new ListItem("Amazing Beauty Tips with Vaseline"));
                listitems.add(new ListItem("Beauty Benefits Of Rose Essential Oil"));
                listitems.add(new ListItem("How To Enhance Your Beauty Naturally"));
                break;

            case "Hair":
                listitems.add(new ListItem("Best Ingredients for Hair Care"));
                listitems.add(new ListItem("Want Healthy and Thicker Hair"));
                break;

            case "MakeUp":
                listitems.add(new ListItem("Makeup Tips To Get Dewy Skin"));
                break;

            case "Nails":
                listitems.add(new ListItem("DIY How To Improve Weak Nails"));
                break;

            case "Skincare":
                listitems.add(new ListItem("How To Remove Nasty Boils Naturally"));
                break;

            case "Tips":
                listitems.add(new ListItem("Habits That Cause Wrinkles and Finelines"));
                break;

            case "Faq":
                listitems.add(new ListItem("How To Exfoliate Your Skin"));
                break;

            case "Aboutus":
                listitems.add(new ListItem("About Us"));
                listitems.add(new ListItem("Contact Us"));
                break;

        }
        adapter = new MyAdapter(this, listitems);
        recylerView.setAdapter(adapter);
    }
}