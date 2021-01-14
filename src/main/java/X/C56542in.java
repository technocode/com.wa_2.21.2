package X;

import android.util.Pair;

/* renamed from: X.2in  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56542in implements AbstractC49902Sq {
    public final /* synthetic */ C04430Ki A00;

    public /* synthetic */ C56542in(C04430Ki r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC49902Sq
    public final boolean A21(Object obj, AnonymousClass0M3 r5, AnonymousClass0M4 r6) {
        AnonymousClass2TL r4 = (AnonymousClass2TL) obj;
        C05430Om r2 = r5.A0N;
        if (r2 == null) {
            r2 = new C05430Om();
            r5.A0N = r2;
            r5.A0O(2048);
        }
        r2.A08 = r4.A02;
        Pair pair = r4.A01;
        if (pair == null) {
            return true;
        }
        r2.A01 = ((Number) pair.first).intValue();
        r2.A00 = ((Number) pair.second).intValue();
        return true;
    }
}
