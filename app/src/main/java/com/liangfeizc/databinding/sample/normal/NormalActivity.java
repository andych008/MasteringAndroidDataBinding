package com.liangfeizc.databinding.sample.normal;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.liangfeizc.databinding.R;
import com.liangfeizc.databinding.databinding.ActivityNormalBinding;
import com.liangfeizc.databinding.model.NormalViewModel;
import com.liangfeizc.databinding.sample.BaseActivity;

public class NormalActivity extends BaseActivity {
    private ActivityNormalBinding mBinding;
    private NormalViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_normal);
        mBinding.setModel(model = new NormalViewModel(this));
    }

    /**
     * 暂时把BindingAdapter集中放在一个地方, 因为BindingAdapter会影响全局的binding规则, 不属于任何一个Activity,应该统一管理.
     * @see com.liangfeizc.databinding.core.BindingAdapters
     */
}

