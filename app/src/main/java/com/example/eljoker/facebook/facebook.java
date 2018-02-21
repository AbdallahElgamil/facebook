package com.example.eljoker.facebook;

/**
 * Created by el joker on 21/02/2018.
 */

public class facebook {
    private int profileImage;
    private String user_name;
    private String post_content;
    private int postImage;

    public facebook(int profileImage, String user_name, String post_content, int postImage) {
        this.user_name = user_name;
        this.profileImage = profileImage;
        this.post_content = post_content;
        this.postImage = postImage;

    }

    public facebook(int profileImage, String user_name, String post_content) {
        this.user_name = user_name;
        this.profileImage = profileImage;
        this.post_content = post_content;


    }

    public int getProfileImage() {
        return profileImage;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPost_content() {

        return post_content;
    }

    public int getPostImage() {
        return postImage;
    }

}
