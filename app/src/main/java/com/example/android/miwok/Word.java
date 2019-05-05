package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Get the default translation of the word.
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get the Miwok translation of the word.
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
