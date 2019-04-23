package com.example.nuevacard;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleyS {

    private static VolleyS volleyS = null;
    private RequestQueue requestQueue;

    public VolleyS(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }
    public static VolleyS getVolleyS(Context context) {
        if(volleyS == null)
        {
            volleyS = new VolleyS(context);
        }

        return volleyS;
    }
    public RequestQueue getRequestQueue() {
        return requestQueue;
    }


}
