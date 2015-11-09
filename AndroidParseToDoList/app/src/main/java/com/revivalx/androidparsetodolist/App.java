package com.revivalx.androidparsetodolist;

import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "9g42fq6i93wZbyYqtCaowcQ2zvyZjXvN3KuJ8Sat", "eYMNFng0nsYmaKL4O7kfGE2rfGxuNF27Om8fMMAd"); // Your Application ID and Client Key are defined elsewhere
    }
}
