package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;

public class PreverificationHelper {
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
