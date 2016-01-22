package com.liangfeizc.databinding.vm;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

import com.liangfeizc.databinding.BR;
import com.liangfeizc.databinding.utils.Randoms;

/**
 * the ViewModel for layout of "activity_normal.xml", this layout is a "View"
 */
public class NormalAvatarViewModel extends BaseObservable {
    private Context context;

    private String imageUrl;
    private View.OnClickListener avatarClickListener;


    public NormalAvatarViewModel(Context context) {
        this.context = context;
        init();
    }

    private void init() {
        this.avatarClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NormalAvatarViewModel.this.context, "Come on on", Toast.LENGTH_SHORT).show();
                setImageUrl(Randoms.nextImgUrl());
            }
        };
    }

    public View.OnClickListener getAvatarClickListener() {
        return avatarClickListener;
    }

    @Bindable
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        notifyPropertyChanged(BR.imageUrl);
    }
}
