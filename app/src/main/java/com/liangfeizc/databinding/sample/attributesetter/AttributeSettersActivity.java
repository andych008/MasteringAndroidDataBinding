package com.liangfeizc.databinding.sample.attributesetter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.liangfeizc.databinding.R;
import com.liangfeizc.databinding.databinding.ActivityAttributeSettersBinding;
import com.liangfeizc.databinding.sample.BaseActivity;
import com.liangfeizc.databinding.utils.Randoms;

public class AttributeSettersActivity extends BaseActivity {
    private ActivityAttributeSettersBinding mBinding;

    public View.OnClickListener avatarClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(AttributeSettersActivity.this, "Come on", Toast.LENGTH_SHORT).show();
            mBinding.setImageUrl(Randoms.nextImgUrl());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_attribute_setters);
        mBinding.setActivity(this);
        mBinding.setImageUrl(Randoms.nextImgUrl());
    }

}

