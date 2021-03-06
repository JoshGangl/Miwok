package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getmDefaultTranslation());

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getmMiwokTranslation());

        return listItemView;
    }

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }
}
