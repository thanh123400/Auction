package com.example.auctionapp.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.auctionapp.Adapter.homeAdapter;
import com.example.auctionapp.ItemEffect.TransparentItemDecoration;
import com.example.auctionapp.R;
import com.example.auctionapp.databinding.ActivityHomePageBinding;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    private ActivityHomePageBinding activityHomePageBinding;

    homeAdapter homeAdapter;
    ArrayList<String> arrayList = new ArrayList<>();
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHomePageBinding = DataBindingUtil.setContentView(this, R.layout.activity_home_page);
        setContentView(activityHomePageBinding.getRoot());
        setSupportActionBar(activityHomePageBinding.toolbar);
        getSupportActionBar().setTitle(R.string.home_header);
        activityHomePageBinding.navView.bringToFront();
        activityHomePageBinding.navView.setItemIconTintList(null);

        ActionBarDrawerToggle toggle = new
                ActionBarDrawerToggle(this, activityHomePageBinding.drawerLayout
                , activityHomePageBinding.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        activityHomePageBinding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        activityHomePageBinding.navView.setNavigationItemSelectedListener(this::onNavigationItemSelected);
        activityHomePageBinding.navView.setCheckedItem(R.id.nav_home);
        addTest();
        setItem();

    }

    private void setItem() {
        homeAdapter = new homeAdapter(arrayList);

        activityHomePageBinding.rvHome.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        activityHomePageBinding.rvHome.setAdapter(homeAdapter);
        TransparentItemDecoration itemDecoration = new TransparentItemDecoration();

// Áp dụng itemDecoration chỉ cho item đầu tiên
        activityHomePageBinding.rvHome.addItemDecoration(itemDecoration);
        activityHomePageBinding.rvHome.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                sum += dy;
                if (sum < 0) sum = 0;
                if (sum < 20) {
                    activityHomePageBinding.cardView.setVisibility(View.VISIBLE);
                    activityHomePageBinding.cardView2.setVisibility(View.GONE);
                } else if (sum > 20) {
                    activityHomePageBinding.cardView.setVisibility(View.GONE);
                    activityHomePageBinding.cardView2.setVisibility(View.VISIBLE);
                    LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                    int firstVisibleItemPosition = layoutManager.findFirstCompletelyVisibleItemPosition();
                    if (recyclerView.getChildAt(1).getTop() > activityHomePageBinding.cardView2.getBottom() + 100
                            && firstVisibleItemPosition == 1 && dy > 0
                    ) {
                        recyclerView.smoothScrollBy(0, 50);
                    }
                    Log.d("HH", "hihi: " + recyclerView.getChildAt(1).getTop() + " " + sum);
                }
            }
        });
    }

    private void addTest() {
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");
        arrayList.add("111");
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");
        arrayList.add("111");
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if (menuItem.getItemId() == R.id.nav_home) {
        } else if (menuItem.getItemId() == R.id.s2) {
            Toast.makeText(this, "h", Toast.LENGTH_SHORT).show();
        } else if (menuItem.getItemId() == R.id.s3) {
            Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        }

        activityHomePageBinding.drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}