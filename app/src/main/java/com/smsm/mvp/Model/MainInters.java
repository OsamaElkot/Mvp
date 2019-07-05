package com.smsm.mvp.Model;

public class MainInters {
    public interface IView{
        void SeText(String text);
    }
    public interface IPresenter{
        void SetTextView();
    }
    public interface IModel{
        String getdata();

    }
}
