package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.1BJ  reason: invalid class name */
public final class AnonymousClass1BJ {
    public static Parcelable A00(Bundle bundle, String str) {
        bundle.setClassLoader(AnonymousClass1BJ.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(AnonymousClass1BJ.class.getClassLoader());
        return bundle2.getParcelable(str);
    }

    public static void A01(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable A00 = A00(bundle, "MapOptions");
            if (A00 != null) {
                A02(bundle2, "MapOptions", A00);
            }
            Parcelable A002 = A00(bundle, "StreetViewPanoramaOptions");
            if (A002 != null) {
                A02(bundle2, "StreetViewPanoramaOptions", A002);
            }
            Parcelable A003 = A00(bundle, "camera");
            if (A003 != null) {
                A02(bundle2, "camera", A003);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void A02(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(AnonymousClass1BJ.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(AnonymousClass1BJ.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
