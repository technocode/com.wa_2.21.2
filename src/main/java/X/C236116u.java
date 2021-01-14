package X;

import android.content.Intent;

/* renamed from: X.16u  reason: invalid class name and case insensitive filesystem */
public class C236116u extends Exception {
    public final Intent mIntent;

    public C236116u(Intent intent) {
        super("Google Play Services not available");
        this.mIntent = intent;
    }
}
