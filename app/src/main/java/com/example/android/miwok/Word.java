package com.example.android.miwok;

/**
 * Created by user on 06/06/2018.
 */

public class Word {

    //Default translation for the word
    private String mDefaultTranslation ;

    //Miwok translation for the word
    private String mMiwokTranslation ;

    //Variable that will contain the image resource ID
    private int mImageResourcID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1 ;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /**
     * The first constructor
     * Create a new Word opject
     * @param defaultTranslation
     * @param miwokTranslation
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation,String miwokTranslation , int audioResourceId){
        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a second constructor to modify three inputs including the image view
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceID
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceID ,int audioResourceId ){
        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
        mImageResourcID = imageResourceID ;
        mAudioResourceId = audioResourceId;
    }

    /**
     * get the default translation for the word
     * @return
     */
    public String getDefaultTranslation (){
        return mDefaultTranslation ;
    }

    /**
     * get the miwok translation for the word
     * @return
     */
    public String getMiwokTranslation (){
        return mMiwokTranslation ;
    }

    /**
     * to get the image resource ID
     * @return
     */
    public int getImageResourceID(){
        return mImageResourcID ;
    }

    /**
     * Check if there is a valid image or not
     * true = has image
     * false = has no image
     * @return
     */
    public boolean hasImage (){
        return mImageResourcID != NO_IMAGE_PROVIDED ;
    }

    /**
     +     * Return the audio resource ID of the word.
     +     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
