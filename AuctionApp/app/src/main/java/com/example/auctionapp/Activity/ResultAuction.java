package com.example.auctionapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.auctionapp.R;
import com.example.auctionapp.databinding.ActivityResultAuctionBinding;

public class ResultAuction extends AppCompatActivity {
    ActivityResultAuctionBinding activityResultAuctionBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityResultAuctionBinding = DataBindingUtil.setContentView(this, R.layout.activity_result_auction);
        setContentView(activityResultAuctionBinding.getRoot());
        getSupportActionBar().setTitle(R.string.result_header);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
    }
}