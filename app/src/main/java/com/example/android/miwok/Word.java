package com.example.android.miwok;

/**
 * Created by Arijit on 12-12-2017.
 */

public class Word {

    private String mOdiaTranslation;
    private String  mDefaultTranslation ;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId ;

    private static final int NO_IMAGE_PROVIDED = -1;

    //Takes in the default translation, the odia translation, and the audio resource id for phrases

    public Word(String defaultTranslation, String odiaTranslation, int audioResourceId) {
              mDefaultTranslation = defaultTranslation;
                mOdiaTranslation = odiaTranslation;
                mAudioResourceId = audioResourceId;
            }
    //Takes in the default translation, the odia translation,image id, and the audio resource id for all activities
     public Word(String defaultTranslation, String odiaTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation  = defaultTranslation;
        mOdiaTranslation = odiaTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
     }

    public String getOdiaTranslation(){
        return mOdiaTranslation;
    }

    public String getEnglishTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId(){return mImageResourceId;}

    public boolean hasImage(){
        if(mImageResourceId==NO_IMAGE_PROVIDED)
            return false;

        else
            return true;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }




}
