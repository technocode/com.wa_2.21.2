package X;

import com.whatsapp.util.Log;

/* renamed from: X.31k  reason: invalid class name and case insensitive filesystem */
public class C657531k {
    public static volatile C657531k A03;
    public final AnonymousClass00G A00;
    public final C02660Cy A01;
    public final AnonymousClass03U A02;

    public C657531k(AnonymousClass00G r1, AnonymousClass03U r2, C02660Cy r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final AbstractC28621Va A00(AnonymousClass21W r6, String str) {
        AbstractC28621Va A012 = r6.A01(str, this.A02, null);
        AnonymousClass21V r2 = (AnonymousClass21V) A012;
        if (r2.A2o() >= 400) {
            StringBuilder A0S = AnonymousClass008.A0S("WallpaperDownloader/download/Error, code=");
            A0S.append(r2.A2o());
            Log.e(A0S.toString());
            return null;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("WallpaperDownloader/download/Response code from server=");
        A0S2.append(r2.A2o());
        Log.d(A0S2.toString());
        return A012;
    }
}
