package fr.elosi.android.myviewpageapp.Controllers.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import fr.elosi.android.myviewpageapp.Controllers.Fragments.PageAdapter;
import fr.elosi.android.myviewpageapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.configureViewpager();
    }

    private void configureViewpager(){
        ViewPager pager = findViewById(R.id.activity_main_viewpager);
        pager.setAdapter(new PageAdapter(getSupportFragmentManager(),getResources().getIntArray(R.array.colorPagesViewPager)));
    }
}