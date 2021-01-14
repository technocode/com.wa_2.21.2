package com.whatsapp;

import android.location.Location;
import java.io.Serializable;

public class PlaceInfo implements Serializable {
    public static final long serialVersionUID = 1;
    public transient Location A00;
    public transient Object A01;
    public String address;
    public double dist;
    public String icon;
    public double lat;
    public double lon;
    public String name;
    public String phone;
    public String placeId;
    public String rating;
    public int source;
    public String url;
    public String vicinity;
}
