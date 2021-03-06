package com.northdoo.futian_ducha;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.TabAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/8/23.
 */

public class JointlyActivity extends BaseActivity
{
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.title)
    TextView title;

    private int positions = 0;
    private List<String> mPageTitleList = new ArrayList<>();
    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<Integer> mBadgeCountList = new ArrayList<>();
    private TabAdapter mAdapter;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_tab);
    }

    @Override
    protected void initData()
    {
        title.setText("协办件");
        mPageTitleList.add("任务协办");
        mPageTitleList.add("本人协办");
        mBadgeCountList.add(0);
        mBadgeCountList.add(0);
        //第一个参数为公文状态，第三个是公文类型collect
        mFragmentList.add(new TaskOperationFragment().newInstance(0));
        mFragmentList.add(new OneselfFragment().newInstance(4));
        mAdapter = new TabAdapter(this, getSupportFragmentManager(),
                mFragmentList, mPageTitleList, mBadgeCountList);
        viewPager.setAdapter(mAdapter);
        tabLayout.setupWithViewPager(viewPager);
        //设置fragment缓存数为2，不设置默认为1滑到第三个后再回到第一个fragment会从新加载
        viewPager.setOffscreenPageLimit(1);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                positions = position;
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {

            }
        });
    }

    /**
     * 设置Tablayout上的标题的角标
     */
    private void setUpTabBadge()
    {
        for (int i = 0; i < mFragmentList.size(); i++)
        {
            TabLayout.Tab tab = tabLayout.getTabAt(i);

            // 更新Badge前,先remove原来的customView,否则Badge无法更新
            View customView = tab.getCustomView();
            if (customView != null)
            {
                ViewParent parent = customView.getParent();
                if (parent != null)
                {
                    ((ViewGroup) parent).removeView(customView);
                }
            }
            // 更新CustomView
            tab.setCustomView(mAdapter.getTabItemView(i));
        }
        // 需加上以下代码,不然会出现更新Tab角标后,选中的Tab字体颜色不是选中状态的颜色
        tabLayout.getTabAt(tabLayout.getSelectedTabPosition()).getCustomView().setSelected(true);
    }


    @OnClick({R.id.left_img, R.id.search})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.search:
                Intent intent = new Intent(this, SearchActivity.class);
                intent.putExtra("type", positions == 0 ? 7 : 8);
                startActivity(intent);
                break;
        }
    }
}
