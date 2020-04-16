package com.example.tourguideapp;

public class Information {
    /** Name */
    private String mName;

    /** Address */
    private String mAddress;

    /** Web page */
    private String mWebPage;

    /** Image resource ID */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Information object that only takes 3 Strings as input
     *
     * @param name
     * @param address
     * @param webPage
     */
    public Information (String name, String address, String webPage) {
        mName = name;
        mAddress = address;
        mWebPage = webPage;
    }

    /**
     * Create a new Information object that takes 3 String and also 1 integer for the image ID
     *
     *  @param name
     *  @param address
     *  @param webPage
     * @param imageResourceId is the drawable resource ID of the image
     *
     */
    public Information (String name, String address, String webPage, int imageResourceId) {
        mName = name;
        mAddress = address;
        mWebPage = webPage;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Information
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the address of the Information
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the web page of the Information
     */
    public String getWebPage() {
        return mWebPage;
    }

    /**
     * Get the Image of the Information
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Information
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}
