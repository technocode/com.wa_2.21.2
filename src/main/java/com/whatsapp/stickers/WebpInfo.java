package com.whatsapp.stickers;

public class WebpInfo {
    public final int height;
    public final int minFrameDurationMS;
    public final int numFrames;
    public final int totalAnimationDurationMS;
    public final int width;

    public WebpInfo(int i, int i2, int i3, int i4, int i5) {
        this.numFrames = i;
        this.width = i2;
        this.height = i3;
        this.minFrameDurationMS = i4;
        this.totalAnimationDurationMS = i5;
    }
}
