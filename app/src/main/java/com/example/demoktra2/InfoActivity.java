package com.example.demoktra2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.demoktra2.model.People;

public class InfoActivity extends AppCompatActivity {
    private TextView tvName;
    private TextView tvDes;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_info);
        tvName = findViewById(R.id.tvName);
        tvDes = findViewById(R.id.tvDes);
        img= findViewById(R.id.img);
        Intent t = getIntent();
        String name = t.getStringExtra("Tên");
        String des = t.getStringExtra("Mô tả bản thân");
//        String[] sub=t.getStringArrayExtra("subject");
//        tvName.setText(name+","+age);
//        tvName.setText(name);
//        tvDes.setText(Arrays.toString(sub));
        People s = (People) t.getSerializableExtra("Duy");
        img.setImageResource(s.getImg());
        tvDes.setText("Tên: "+s.getName()+"Mô tả bản thân: "+s.getDes());
    }
}