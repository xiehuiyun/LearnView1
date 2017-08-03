package cn.jhc.crazyandroiddemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private List<DrawFragment> fragments;
    private String[] title = {"drawColor", "drawCirclr", "drawRect","drawPoint", "drawOval", "drawLine", "drawRoundRect", "drawArc", "drawPath", "柱形图", "饼图"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.vp_view);

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return title[position];
            }
        });

        viewPager.setOffscreenPageLimit(1);

    }

    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(DrawFragment.newInstance(R.layout.draw_color));
        fragments.add(DrawFragment.newInstance(R.layout.draw_circle));
        fragments.add(DrawFragment.newInstance(R.layout.draw_rect));
        fragments.add(DrawFragment.newInstance(R.layout.draw_point));
        fragments.add(DrawFragment.newInstance(R.layout.draw_oval));
        fragments.add(DrawFragment.newInstance(R.layout.draw_line));
        fragments.add(DrawFragment.newInstance(R.layout.draw_round_rect));
        fragments.add(DrawFragment.newInstance(R.layout.draw_arc));
        fragments.add(DrawFragment.newInstance(R.layout.draw_path));
        fragments.add(DrawFragment.newInstance(R.layout.draw_bar_chart));
        fragments.add(DrawFragment.newInstance(R.layout.draw_pie));
    }
}
