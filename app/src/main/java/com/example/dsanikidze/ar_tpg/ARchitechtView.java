package com.example.dsanikidze.ar_tpg;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.StartupConfiguration;

/**
 * Created by dsanikidze on 21.01.16.
 */
public class ARchitechtView extends AppCompatActivity {



    public StartupConfiguration getStartupConfiguration() {

        return new StartupConfiguration("wzScgAjnyAVS8yo/oCZ3pmpawwzr6KmhLkwwgGYfPSN9TspIL9TEr88z7MRg1LG8iK+3gPCDZT+nVsv05cq1BLhQg/UIyebcfe08sA0zUfFknsbSIPONZEroNGNT2Z0glb8g3XQxpRiNvjjzwKS4d8egQi8yI0D0V4h2mEogsq5TYWx0ZWRfX1I+rGOPYGnVeSW8EvVf4Z2cRsyK2W9Wu8WAqIOj7m30bXF+4MdF8d92r5ePAzrq1TTqAhH6N9fGjoRX5EG90yf0DKPTg7Bffe5Wvw6d6aQ6bHrBvWuHr2vZIwQuQsrmQV3LUSYVny1lhp9PNhk4pcG45/hJwe7Rsn9OcjoG8xRG7ITXZm4wx67FEoOlOsPLIa2LUNfdzSeU+GLCb0COV9/B8xDG5IXjRu2gAiyBiTfOfb2snEGnbXX7oBJqiSQ6jkzl8ehwuYRZTbquwAXRh05tGOFnLsamwGVjW5DdPjEe6TAYRP4mCiUAviqpVD0brzFkO5ZxMbzdHBxTCB5VL/g2O7fpHx8b7iYeHx6GgRpdhoJnIhF1sYe78hGDDwL3qKx/KpgQ1eSUstmBvDs4KYZZtVqX6XK1oYbNai7lDMknAYUYIhY79iA2uvzfzAZuUOwS9oFiLTuZeCBF9ZR0cyZIN2sQCPUIspqx5i4dF4TAz6Wb2D2QtV4=");
    }


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getStartupConfiguration();
        setContentView(R.layout.activity_main);
    }
}
