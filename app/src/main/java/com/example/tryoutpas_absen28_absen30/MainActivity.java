package com.example.tryoutpas_absen28_absen30;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.example.tryoutpas_absen28_absen30.LaligaFragment;
import com.example.tryoutpas_absen28_absen30.PremierleagueFragment;
import com.example.tryoutpas_absen28_absen30.ProfileFragment;


public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.navigasi);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new PremierleagueFragment())
                .commit();


        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            int itemId = item.getItemId();

            if (itemId == R.id.nav_Laliga) {
                fragment = new LaligaFragment();
            } else if (itemId == R.id.nav_Premier) {
                fragment = new PremierleagueFragment();
            } else if (itemId == R.id.nav_Jadwal) {
                fragment = new ProfileFragment();
            }

            if (fragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout, fragment)
                        .commit();
                return true;
            }

            return false;
        });
    }
}
