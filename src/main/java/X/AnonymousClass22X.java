package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.22X  reason: invalid class name */
public class AnonymousClass22X extends AbstractC29021Ws {
    @Override // X.AbstractC29021Ws
    public void A01(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            bundle.putString("app_badge_packageName", "com.whatsapp");
            try {
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            } catch (Exception e) {
                Log.e("cannot update badge", e);
            }
        }
    }
}
