package X;

import android.os.Bundle;

/* renamed from: X.2OC  reason: invalid class name */
public class AnonymousClass2OC {
    public static volatile AnonymousClass2OC A06;
    public final AnonymousClass04j A00;
    public final AnonymousClass03P A01;
    public final AnonymousClass03S A02;
    public final AnonymousClass01X A03;
    public final AnonymousClass0KP A04;
    public final AnonymousClass00T A05;

    public AnonymousClass2OC(AnonymousClass00T r1, AnonymousClass03P r2, AnonymousClass01X r3, AnonymousClass04j r4, AnonymousClass03S r5, AnonymousClass0KP r6) {
        this.A05 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r5;
        this.A04 = r6;
    }

    public static AnonymousClass2OC A00() {
        if (A06 == null) {
            synchronized (AnonymousClass2OC.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass2OC(C002101e.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), AnonymousClass04j.A00(), AnonymousClass03S.A00(), AnonymousClass0KP.A00());
                }
            }
        }
        return A06;
    }

    public void A01(ActivityC004702f r15, String str, boolean z, Bundle bundle) {
        this.A05.ANC(new C39451rY(r15, this.A01, this.A03, this.A00, this.A02, this.A04, false, false, z, str, bundle), new String[0]);
    }
}
