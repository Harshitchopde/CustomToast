package com.example.simpletoast;

import android.content.Context;
import android.widget.Toast;

public
class CustomToast {
    public static void cmtoast(Context context,String msg){
        Toast.makeText(context, ""+msg, Toast.LENGTH_SHORT)

                .show();
    }
}
