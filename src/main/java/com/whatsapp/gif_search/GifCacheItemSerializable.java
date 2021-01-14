package com.whatsapp.gif_search;

import java.io.Serializable;

public class GifCacheItemSerializable implements Serializable {
    public static final long serialVersionUID = -1755176625502120361L;
    public transient byte[] A00;
    public String filePath;
    public String url;

    public GifCacheItemSerializable(String str, byte[] bArr, String str2) {
        this.A00 = bArr;
        this.filePath = str;
        this.url = str2;
    }
}
