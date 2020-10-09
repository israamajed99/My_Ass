package edu.comp438.my_first_ass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import edu.comp438.my_first_ass.model.Factory;
import edu.comp438.my_first_ass.model.InterFaceMovies;
import edu.comp438.my_first_ass.model.Movies;
import edu.comp438.my_first_ass.model.MoviesDa;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner, spinner2;
    private Button button,button2;
    private EditText edt,edtYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        button = (Button) findViewById(R.id.button);
        edt = findViewById(R.id.edt);
        addToSpinner();

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        button2 = (Button) findViewById(R.id.button2);
        edtYear = findViewById(R.id.edtYear);
        addToSpinner2();
    }
    private void addToSpinner2() {

        Factory factor = new Factory();
        InterFaceMovies o = factor.getModel();
        int [] year =o.getyear();


    }

    private void addToSpinner() {

        Factory factor = new Factory();
        InterFaceMovies o = factor.getModel();
        String [] genre =o.getgenre();
        ArrayAdapter<String> Adapter=new ArrayAdapter<>(this
                ,android.R.layout.simple_spinner_item,genre);
        spinner.setAdapter(Adapter);

    }

    public void getSelectedUser(View view) {

        Factory factory = new Factory();
        InterFaceMovies obj = factory.getModel();

        String items = "";
        items = spinner.getSelectedItem().toString();
        List<Movies> movies = obj.getMov(items);
        String str = "";
        for (Movies m : movies)
            str += m.getTitle() + "  " + m.getYear() + "\n";

        edt.setText(str);
//        Toast.makeText(this , str , Toast.LENGTH_LONG).show();

    }

    public void getSelectedYear(View view) {
        Factory factory = new Factory();
        InterFaceMovies obj = factory.getModel();

        String items = "";
        items = spinner2.getSelectedItem().toString();
        List<Movies> movies = obj.getMov(items);
        String str = "";
        for (Movies m : movies)
            str += m.getTitle() + "  " + m.getTitle() + "\n";

        edtYear.setText(str);
    }
}
