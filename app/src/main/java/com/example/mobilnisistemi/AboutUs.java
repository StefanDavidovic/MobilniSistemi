package com.example.mobilnisistemi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

//    public void ClickMenu(View view){
//        HomeActivity.openDrawer(drawerLayout);
//    }
//
//    public void ClickLogo(View view){
//        HomeActivity.closeDrawer(drawerLayout);
//    }
//
//    public void ClickHome(View view){
//        HomeActivity.redirectActivity(this, HomeActivity.class);
//    }
//
//    public void ClickAboutUs(View view){
//        recreate();
//    }
//
//    public void ClickLogout(View view){
//        HomeActivity.logout(this);
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        HomeActivity.closeDrawer(drawerLayout);
//    }
}