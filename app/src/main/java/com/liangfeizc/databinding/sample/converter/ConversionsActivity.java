package com.liangfeizc.databinding.sample.converter;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.os.Bundle;
import android.view.View;

import com.liangfeizc.databinding.R;
import com.liangfeizc.databinding.databinding.ActivityConversionsBinding;
import com.liangfeizc.databinding.sample.BaseActivity;
import com.liangfeizc.databinding.utils.ScreenUtils;

public class ConversionsActivity extends BaseActivity {

    private ObservableBoolean mIsError = new ObservableBoolean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityConversionsBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_conversions);

        mIsError.set(true);

        binding.setIsError(mIsError);
        binding.setHeight(ScreenUtils.dp2px(this, 200));

    }

    public void toggleIsError(View view) {
        mIsError.set(!mIsError.get());
    }

//    @BindingConversion
//    public static ColorDrawable convertColorToDrawable(int color) {
//        return new ColorDrawable(color);
//    }

    /** !!! Binding conversion should be forbidden, otherwise it will conflict with
     *  {@code android:visiblity} attribute.
     */
    /*
    @BindingConversion
    public static int convertColorToString(int color) {
        switch (color) {
            case Color.RED:
                return R.string.red;
            case Color.WHITE:
                return R.string.white;
        }
        return R.string.app_name;
    }*/
}
