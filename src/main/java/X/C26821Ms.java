package X;

import android.os.Build;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Ms  reason: invalid class name and case insensitive filesystem */
public class C26821Ms {
    public static final int[] A02 = (Build.VERSION.SDK_INT >= 29 ? new int[]{R.string.settings_theme_follow_system, R.string.settings_theme_light, R.string.settings_theme_dark} : new int[]{R.string.settings_theme_light, R.string.settings_theme_dark});
    public final AnonymousClass00D A00;
    public final AnonymousClass01X A01;

    public C26821Ms(AnonymousClass01X r1, AnonymousClass00D r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final int A00() {
        int A07 = this.A00.A07();
        if (Build.VERSION.SDK_INT < 29) {
            return A07 != 2 ? 0 : 1;
        }
        if (A07 != 1) {
            return A07 == 2 ? 2 : 0;
        }
        return 1;
    }
}
