package com.liangfeizc.databinding.core;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Andy on 1/21/2016.
 */
public class BindingAdapters {

    @BindingAdapter("bind:layout_height")
    public static void setLayoutHeight(View view, float height) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = (int) height;
        view.setLayoutParams(params);
    }

    @BindingAdapter({"app:imageUrl", "app:error"})
    public static void loadImage(ImageView view, String url, Drawable error) {
        Log.d(App.TAG, "load image");
        Picasso.with(view.getContext()).load(url).error(error).into(view);
    }
}
