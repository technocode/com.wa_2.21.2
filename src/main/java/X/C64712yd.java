package X;

import android.os.Build;
import android.os.PowerManager;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.2yd  reason: invalid class name and case insensitive filesystem */
public class C64712yd {
    public float A00 = -1.0f;

    public void A00(Window window) {
        window.clearFlags(128);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = this.A00;
        window.setAttributes(attributes);
    }

    public void A01(AnonymousClass03P r5, Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.A00 = attributes.screenBrightness;
        PowerManager A0C = r5.A0C();
        if (Build.VERSION.SDK_INT >= 21 && A0C != null && !A0C.isPowerSaveMode()) {
            window.addFlags(128);
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
    }
}
