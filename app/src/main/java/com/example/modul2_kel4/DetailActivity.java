package com.example.modul2_kel4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.modul2_kel4.R;


public class DetailActivity  extends AppCompatActivity {

    private ImageView tvAvatar;
    private TextView tvEmail;
    private TextView tvID;
    private TextView tvFirstName;
    private TextView tvLastName;

    private Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvAvatar = findViewById(R.id.tv_avatar);
        tvEmail = findViewById(R.id.tv_email);
        tvID = findViewById(R.id.tv_id);
        tvFirstName = findViewById(R.id.tv_first_name);
        tvLastName = findViewById(R.id.tv_last_name);
        btnAbout = findViewById(R.id.buttonAboutAction);


        if (getIntent().hasExtra("avatar")) {

            String avatar = getIntent().getStringExtra("avatar");
            String email = getIntent().getStringExtra("email");
            String id = getIntent().getStringExtra("id");
            String firstName = getIntent().getStringExtra("firstName");
            String lastName = getIntent().getStringExtra("lastName");

            Glide.with(DetailActivity.this).load(avatar).into(tvAvatar);
            tvEmail.setText(email);
            tvID.setText(id);
            tvFirstName.setText(firstName);
            tvLastName.setText(lastName);


        }

        btnAbout.setOnClickListener(V->{
            Intent reg = new Intent(this, AboutActivity.class);
            startActivity(reg);
            finish();
        });
    }

}
