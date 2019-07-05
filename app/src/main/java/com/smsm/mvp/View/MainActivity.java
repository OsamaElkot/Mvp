package com.smsm.mvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.smsm.mvp.Model.MainInters;
import com.smsm.mvp.Presenter.MainPresenter;
import com.smsm.mvp.R;

public class MainActivity extends AppCompatActivity implements MainInters.IView {
   MainPresenter presenter;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter=new MainPresenter(this);
        res=(TextView)findViewById(R.id.textView);
        // hello World back to U
    }

    public void clicksuc(View view) {
        presenter.SetTextView();
    }

    @Override
    public void SeText(String text) {
        res.setText(text);
    }
}
