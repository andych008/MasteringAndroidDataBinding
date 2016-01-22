package com.liangfeizc.databinding.model;

import android.content.Context;
import android.databinding.BaseObservable;

/**
 * the ViewModel for layout of "activity_normal.xml", this layout is a "View"
 */
public class NormalNameCardViewModel extends BaseObservable {
    private Context context;

//    private View.OnClickListener btnClickListener;
    private String firstName;
    private String lastName;
    private int age;

    public NormalNameCardViewModel(Context context) {
        this.context = context;
        init();
    }

    private void init() {
//        this.btnClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(NormalNameCardViewModel.this.context, "who will come?", Toast.LENGTH_SHORT).show();
//                setValues(Randoms.nextFirstName(), Randoms.nextLastName(), Randoms.nextAge());
//            }
//        };
    }

//    public View.OnClickListener getBtnClickListener() {
//        return btnClickListener;
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setValues(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        notifyChange();
    }

    /**
     * 这个只是为了测试，如果age没有初始化，其值为默认值
     */
    public void setValues(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        notifyChange();
    }
}
