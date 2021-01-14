package X;

import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2jI  reason: invalid class name and case insensitive filesystem */
public class C56852jI implements AbstractRunnableC49892Sp {
    public final int A00;
    public final AnonymousClass0Eg A01;
    public final AnonymousClass2T4 A02;
    public final C56932jQ A03;
    public final String A04;

    public C56852jI(AnonymousClass0Eg r1, AnonymousClass2T4 r2, String str, int i, C56932jQ r5) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = str;
        this.A00 = i;
        this.A03 = r5;
    }

    @Override // X.AbstractRunnableC49892Sp
    public AnonymousClass2T4 A7L() {
        return this.A02;
    }

    public void run() {
        AnonymousClass0Eg r1 = this.A01;
        String str = this.A04;
        int i = this.A00;
        File file = null;
        if (r1 != null) {
            AnonymousClass00E.A00();
            AnonymousClass1VZ A05 = r1.A06.A05();
            C59852oO r3 = new C59852oO(r1.A05, r1.A02, r1.A03, r1.A07, str, i, r1.A08, A05, AnonymousClass0Eg.A0C);
            r3.A03(r3.A04());
            GifCacheItemSerializable A002 = A05.A00(str);
            if (A002 == null || (file = new File(A002.filePath)) == null) {
                StringBuilder A0S = AnonymousClass008.A0S("MediaLoadGifJob/failed to load, name: ");
                A0S.append(str);
                A0S.append(", attribution:");
                A0S.append(i);
                Log.e(A0S.toString());
            }
            this.A03.A00(file, true);
            return;
        }
        throw null;
    }
}
