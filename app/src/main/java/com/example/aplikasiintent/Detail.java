package com.example.aplikasiintent;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;


public class Detail implements Parcelable {

    private String Name;
    private String Price;

    private String Type;
    private String Cc;
    private String Gambar;

    protected Detail(Parcel in) {
        Name = in.readString();
        Price = in.readString();
        Type = in.readString();
        Cc = in.readString();
        Gambar = in.readString();
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public Detail() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getCc() {
        return Cc;
    }

    public void setCc(String cc) {
        Cc = cc;
    }

    public String getGambar() {
        return Gambar;
    }

    public void setGambar(String gambar) {
        Gambar = gambar;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Price);
        dest.writeString(Type);
        dest.writeString(Cc);
        dest.writeString(Gambar);
    }
}
