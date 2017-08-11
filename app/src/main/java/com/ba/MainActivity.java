package com.ba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.ba.Adapter.CategoryAdapter;
import com.ba.Model.Category;
import com.ba.Utility.BaseActivity;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {


    private RecyclerView recyclerID;
    private ArrayList<Category> mCategories;
    CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
        initData();
        initClickListner();
    }



    @Override
    public void initComponent() {

        recyclerID = (RecyclerView) findViewById(R.id.recyclerID);
        recyclerID.setLayoutManager(getLayoutManager(2,1));
    }

    @Override
    public void initData() {

        categoryAdapter = new CategoryAdapter(mContext,mCategories);
        recyclerID.setAdapter(categoryAdapter);
    }

    @Override
    public void initClickListner() {

    }


}
