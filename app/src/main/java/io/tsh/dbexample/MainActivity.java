package io.tsh.dbexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.tsh.dbexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);

        ButterKnife.bind(this);

        user = new User("Jon Snow", 20);
        binding.setUser(user);
    }

    @OnClick(R.id.changeMe)
    public void onChangeMeClick(View v) {
        user.setName("Arya Stark");
        user.setAge(11);
    }

}
