package com.example.adtest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.anythink.core.api.ATSDK;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ???SDK??????????
        ATSDK.init(this, 
            "cf522f76c132b78d7c9a124e953fa04d",  // App Key
            "9e9eb925ff853a089381fe8df9e74b197b76b910" // Publisher Key
        );
        
        // ??Debug??
        ATSDK.setNetworkLogDebug(true);
        ATSDK.setSDKDebugKey("1f2b0db6ac21bb6f508dd954165f125c65084f40");
    }
}
