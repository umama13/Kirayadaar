package com.example.kirayadaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View tenant=findViewById(R.id.tenant);
        tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTenant();
            }

            private void openTenant() {
                Intent intent=new Intent();
                startActivity(intent);
            }
        });
    }
}
