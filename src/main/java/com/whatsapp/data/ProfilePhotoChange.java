package com.whatsapp.data;

import java.io.Serializable;

public class ProfilePhotoChange implements Serializable {
    public static final long serialVersionUID = -1;
    public byte[] newPhoto;
    public int newPhotoId;
    public byte[] oldPhoto;
}
