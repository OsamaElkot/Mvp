package com.smsm.mvp.Presenter;

import com.smsm.mvp.Model.MainInters;
import com.smsm.mvp.Model.MainModel;
import com.smsm.mvp.View.MainActivity;

public class MainPresenter implements MainInters.IPresenter {
    MainInters.IView view;
    MainModel model;
    public MainPresenter(MainActivity x){
        view=x;
        model=new MainModel();
    }

    @Override
    public void SetTextView() {
      String data = model.getdata();
        view.SeText(data);
    }
}
