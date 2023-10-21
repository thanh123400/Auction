package com.example.auctionapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.auctionapp.R;
import com.example.auctionapp.databinding.ActivityNotificationAuctionBinding;

public class NotificationAuction extends AppCompatActivity {
    ActivityNotificationAuctionBinding activityNotificationAuctionBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityNotificationAuctionBinding = DataBindingUtil.setContentView(this, R.layout.activity_notification_auction);
        setContentView(activityNotificationAuctionBinding.getRoot());
        getSupportActionBar().setTitle(R.string.notification_header);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
    }
}