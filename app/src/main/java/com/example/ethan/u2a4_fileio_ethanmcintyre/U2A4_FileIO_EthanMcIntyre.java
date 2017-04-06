package com.example.ethan.u2a4_fileio_ethanmcintyre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class U2A4_FileIO_EthanMcIntyre extends AppCompatActivity {

    public U2A4_FileIO_EthanMcIntyre() throws FileNotFoundException {
    }

    public static int avgScore(ArrayList<Integer> l){
        int total = 0;
        for(int i = 0; i <= l.size(); i++){
            total = total + l.get(i);
            if(i == l.size()){
                total = total / l.size();
            }
        }
        return total;
    }

    final File inpFile = new File("movieReviews.txt");



    public static List gatherScores(ArrayList<Integer> l, String s){
        for(int i = 0; i <= l.size(); ){
            try(){

            }
            i++;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u2_a4__file_io__ethan_mc_intyre);
        final ArrayList<String> userWords = new ArrayList<>();

    }
}
