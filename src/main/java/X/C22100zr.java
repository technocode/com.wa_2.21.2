package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.0zr  reason: invalid class name and case insensitive filesystem */
public class C22100zr {
    public static long A00;
    public static final C21120yD A01 = new C21120yD();

    public static void A00() {
        if (0 != 0) {
            throw null;
        }
        SystemClock.elapsedRealtime();
        List list = A01.A00;
        if (list.size() > 0) {
            list.get(0);
            throw null;
        }
    }

    public static void A01(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraInventory");
        sb.append(": ");
        sb.append(str);
        sb.toString();
        A00();
    }

    public static void A02(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.toString();
        A00();
    }
}
