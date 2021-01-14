package X;

import com.facebook.soloader.SoLoader;

/* renamed from: X.03w  reason: invalid class name and case insensitive filesystem */
public class C008003w {
    public static AnonymousClass040 A00;

    public static void A00(String str) {
        synchronized (C008003w.class) {
            if (A00 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        if (A00 != null) {
            SoLoader.A03(str);
            return;
        }
        throw null;
    }
}
