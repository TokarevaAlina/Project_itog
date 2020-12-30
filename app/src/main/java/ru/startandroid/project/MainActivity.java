package ru.startandroid.project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        mImageUrls.add("https://funcats.by/uploads/2011/06/tigr_01.jpg");
        mNames.add("Тигр");

        mImageUrls.add("https://avatars.mds.yandex.net/get-pdb/776003/759c417c-81ec-4d06-95e8-ac3448196159/s1200");
        mNames.add("Рысь");

        mImageUrls.add("https://avatars.mds.yandex.net/get-pdb/405705/3ceb6917-a525-4176-8c37-89db502aff54/s1200?webp=false");
        mNames.add("Пума");

        mImageUrls.add("https://a.d-cd.net/799370es-1920.jpg");
        mNames.add("Лев");

        mImageUrls.add("https://vitalyatattoo.ru/wp-content/uploads/s-golubymi-glazami-pantera_17.jpg");
        mNames.add("Пантера");

        mImageUrls.add("https://prohvost.club/wp-content/uploads/2018/03/kot-gotovitsya-k-atake-600x338.jpg");
        mNames.add("Кошка");

        mImageUrls.add("https://i0.wp.com/set-travel.com/images/europe/1/505/%D0%A1%D1%82%D0%B5%D0%BF%D0%BD%D0%B0%D1%8F_%D1%80%D1%8B%D1%81%D1%8C__%D0%9A%D0%B0%D1%80%D0%B0%D0%BA%D0%B0%D0%BB_5.jpg");
        mNames.add("Каракал");

        mImageUrls.add("https://i1.wp.com/what-this.ru/assets/images/nature/animals/rychashhij-gepard.jpg");
        mNames.add("Гепард");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}