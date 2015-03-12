package com.zanelove.VerticalLinearLayoutDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MyActivity extends Activity {
    private VerticalLinearLayout mVertical_LL;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mVertical_LL = (VerticalLinearLayout) findViewById(R.id.id_main_ly);
        mVertical_LL.setOnPageChangeListener(new VerticalLinearLayout.OnPageChangeListener() {
            @Override
            public void onPageChange(int currentPage) {
                Toast.makeText(MyActivity.this,"第"+currentPage+"页",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
