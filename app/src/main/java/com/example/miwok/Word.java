package com.example.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String miwokTranslation, String defaultTranslation)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation ;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

}
