package X;

import android.content.Context;

/* renamed from: X.1kS  reason: invalid class name and case insensitive filesystem */
public final class C35501kS implements AnonymousClass194 {
    @Override // X.AnonymousClass194
    public final AnonymousClass193 ARo(Context context, String str, AnonymousClass192 r6) {
        AnonymousClass193 r2 = new AnonymousClass193();
        int ARf = r6.ARf(context, str, true);
        r2.A01 = ARf;
        if (ARf != 0) {
            r2.A02 = 1;
        } else {
            int A79 = r6.A79(context, str);
            r2.A00 = A79;
            if (A79 != 0) {
                r2.A02 = -1;
                return r2;
            }
        }
        return r2;
    }
}
