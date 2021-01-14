package X;

import android.content.Context;

/* renamed from: X.1kT  reason: invalid class name and case insensitive filesystem */
public final class C35511kT implements AnonymousClass194 {
    @Override // X.AnonymousClass194
    public final AnonymousClass193 ARo(Context context, String str, AnonymousClass192 r7) {
        AnonymousClass193 r3 = new AnonymousClass193();
        r3.A00 = r7.A79(context, str);
        int ARf = r7.ARf(context, str, true);
        r3.A01 = ARf;
        int i = r3.A00;
        if (i == 0 && ARf == 0) {
            r3.A02 = 0;
            return r3;
        } else if (ARf >= i) {
            r3.A02 = 1;
            return r3;
        } else {
            r3.A02 = -1;
            return r3;
        }
    }
}
