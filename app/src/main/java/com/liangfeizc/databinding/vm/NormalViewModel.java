package com.liangfeizc.databinding.vm;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.liangfeizc.databinding.utils.Randoms;

/**
 * the ViewModel for layout of "activity_normal.xml", this layout is a "View"
 */
public class NormalViewModel {
    private Context context;

    private NormalNameCardViewModel card;
    private NormalAvatarViewModel avatar;

    private View.OnClickListener btnClickListener;

    public NormalViewModel(Context context) {
        this.context = context;
        avatar = new NormalAvatarViewModel(context);
        card = new NormalNameCardViewModel(context);
        init();
    }

    private void init() {
        this.btnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NormalViewModel.this.context, "who will come?", Toast.LENGTH_SHORT).show();
                card.setValues(Randoms.nextFirstName(), Randoms.nextLastName(), Randoms.nextAge());
                avatar.setImageUrl(Randoms.nextImgUrl());
            }
        };
    }

    public View.OnClickListener getBtnClickListener() {
        return btnClickListener;
    }

    public NormalNameCardViewModel getCard() {
        return card;
    }

    public NormalAvatarViewModel getAvatar() {
        return avatar;
    }

}
