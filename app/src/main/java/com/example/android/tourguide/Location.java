package com.example.android.tourguide;

public class Location {
    private int Lname;
    private int Ldescription;
    private int Lstreet;
    private int imgid;

    public Location(int lname, int ldescription, int lstreet, int imagee) {
        Lname = lname;
        Ldescription = ldescription;
        Lstreet = lstreet;
        imgid = imagee;
    }

    public int getLname() {
        return Lname;
    }

    public int getLdescription() {
        return Ldescription;
    }

    public int getLstreet() {
        return Lstreet;
    }

    public int getImgid() {
        return imgid;
    }
}
