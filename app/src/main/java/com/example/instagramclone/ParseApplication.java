package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cmV81zfK7X1QJ2tQLdwhCCEq4dP4hgSLXnSkmiZ6")
                .clientKey("ZOE3jjqBudUOZ0YRUw3Y6JaZ3jOk4kNU5ZnM0jYL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
