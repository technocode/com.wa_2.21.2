package X;

import android.content.SharedPreferences;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: X.0Cd  reason: invalid class name and case insensitive filesystem */
public class C02470Cd {
    public static volatile C02470Cd A01;
    public final SharedPreferences A00;

    public C02470Cd(AnonymousClass022 r2) {
        this.A00 = r2.A01("media_bandwidth_shared_preferences_v2");
    }

    public static final String A00(int i, int i2, int i3) {
        return String.format(Locale.US, "%d_%d_%d_%d_%s", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2), 0, "bandwidths");
    }

    public List A01(int i, int i2, int i3) {
        StringTokenizer stringTokenizer = new StringTokenizer(this.A00.getString(A00(i, i2, i3), ""), ",");
        LinkedList linkedList = new LinkedList();
        while (stringTokenizer.hasMoreTokens()) {
            linkedList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
        }
        return linkedList;
    }
}
