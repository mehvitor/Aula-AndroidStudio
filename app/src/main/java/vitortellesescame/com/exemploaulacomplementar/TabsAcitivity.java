package vitortellesescame.com.exemploaulacomplementar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import vitortellesescame.com.exemploaulacomplementar.ui.main.SectionsPagerAdapter;
import vitortellesescame.com.exemploaulacomplementar.databinding.ActivityTabsAcitivityBinding;

public class TabsAcitivity extends AppCompatActivity {

    private ActivityTabsAcitivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTabsAcitivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://googlemaps.com"));
                    startActivity(mapIntent);
                    }
                });
            }
    }