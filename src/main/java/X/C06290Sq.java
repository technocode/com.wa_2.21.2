package X;

import java.util.Random;

/* renamed from: X.0Sq  reason: invalid class name and case insensitive filesystem */
public class C06290Sq {
    public static volatile C06290Sq A03;
    public final AnonymousClass009 A00;
    public final C002701k A01;
    public final Random A02 = new Random();

    public C06290Sq(C002701k r2, AnonymousClass009 r3) {
        this.A01 = r2;
        this.A00 = r3;
    }

    public void A00(String str, String str2, Throwable th) {
        StringBuilder A0Y = AnonymousClass008.A0Y(AnonymousClass008.A0M("migration-failed-", str2, "-", str), "\ncaused by: ");
        A0Y.append(th.toString());
        AnonymousClass00A r2 = new AnonymousClass00A(A0Y.toString());
        r2.setStackTrace(th.getStackTrace());
        this.A00.A05(r2, -1);
    }
}
