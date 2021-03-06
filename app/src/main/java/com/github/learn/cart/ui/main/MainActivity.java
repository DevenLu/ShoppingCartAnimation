package com.github.learn.cart.ui.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.github.learn.cart.R;
import com.github.learn.cart.databinding.ActivityMainBinding;
import com.github.learn.cart.ui.amazon.AddToCartOfAmazonActivity;
import com.github.learn.cart.ui.base.BaseActivity;
import com.github.learn.cart.ui.jd.AddToCartOfJDActivity;
import com.github.learn.cart.ui.simple.AddToCartOfSimpleActivity;
import com.github.learn.cart.ui.taobao.AddToCartOfTaoBaoActivity;

public class MainActivity extends BaseActivity implements MainPresenter {

    @Override
    public void init(Bundle savedInstanceState) {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(this);
    }

    @Override
    protected void initSupportActionBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }
    }


    @Override
    public void onSelectedTaoBao() {
        startActivity(new Intent(MainActivity.this, AddToCartOfTaoBaoActivity.class));
    }

    @Override
    public void onSelectedAmazon() {
        startActivity(new Intent(MainActivity.this, AddToCartOfAmazonActivity.class));
    }

    @Override
    public void onSelectedJD() {
        startActivity(new Intent(MainActivity.this, AddToCartOfJDActivity.class));
    }

    @Override
    public void onSelectedSimple() {
        startActivity(new Intent(MainActivity.this, AddToCartOfSimpleActivity.class));
    }
}
