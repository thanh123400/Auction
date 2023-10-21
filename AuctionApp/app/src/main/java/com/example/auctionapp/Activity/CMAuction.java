package com.example.auctionapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.auctionapp.R;
import com.example.auctionapp.databinding.ActivityCmauctionBinding;

public class CMAuction extends AppCompatActivity {
    ActivityCmauctionBinding activityCmauctionBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityCmauctionBinding = DataBindingUtil.setContentView(this, R.layout.activity_cmauction);
        setContentView(activityCmauctionBinding.getRoot());
        getSupportActionBar().setTitle(R.string.coming_header);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
    }
}