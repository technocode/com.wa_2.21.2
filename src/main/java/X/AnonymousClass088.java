package X;

import com.whatsapp.NativeMediaHandler;

/* renamed from: X.088  reason: invalid class name */
public class AnonymousClass088 extends AnonymousClass089 {
    public static volatile AnonymousClass088 A00;

    public AnonymousClass088(AnonymousClass00G r1, AnonymousClass03R r2, NativeMediaHandler nativeMediaHandler, C007703s r4) {
        super(r1, r2, nativeMediaHandler, r4);
    }

    public static AnonymousClass088 A00() {
        if (A00 == null) {
            synchronized (AnonymousClass088.class) {
                if (A00 == null) {
                    AnonymousClass00G r4 = AnonymousClass00G.A01;
                    AnonymousClass03R A002 = AnonymousClass03R.A00();
                    if (NativeMediaHandler.A01 == null) {
                        synchronized (NativeMediaHandler.class) {
                            if (NativeMediaHandler.A01 == null) {
                                NativeMediaHandler.A01 = new NativeMediaHandler(r4);
                            }
                        }
                    }
                    A00 = new AnonymousClass088(r4, A002, NativeMediaHandler.A01, C007703s.A00());
                }
            }
        }
        return A00;
    }
}
