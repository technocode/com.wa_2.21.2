package X;

import com.whatsapp.util.Log;

/* renamed from: X.2cw  reason: invalid class name and case insensitive filesystem */
public class C53352cw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractC02620Cu A02;

    public C53352cw(AbstractC02620Cu r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public void A00() {
        AbstractC02620Cu r3 = this.A02;
        int i = this.A00;
        boolean z = true;
        if (r3.A00(i) != 1) {
            z = false;
        }
        AnonymousClass00E.A07(z);
        r3.A05(i);
        Log.e("CategoryManager/onManifestError/manifest was errory");
        r3.A08(2, i);
        r3.A0C(null);
    }

    public void A01(AnonymousClass2NI r12) {
        long j;
        AbstractC02620Cu r6 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        boolean z = true;
        if (r6.A00(i) != 1) {
            z = false;
        }
        AnonymousClass00E.A07(z);
        r6.A05(i);
        String A03 = r6.A03();
        if (r12 == null) {
            StringBuilder sb = new StringBuilder("CategoryManager/onManifestReady/No info in manifest for category ");
            sb.append(A03);
            Log.e(sb.toString());
            r6.A08(2, i);
            r6.A0C(null);
            return;
        }
        AnonymousClass00E.A07(A03.equals(r12.A01));
        AnonymousClass2NI A012 = r6.A01();
        if (A012 != null) {
            if (A012.A01(i).equals(r12.A01(i))) {
                if (r6.A0E(i)) {
                    StringBuilder sb2 = new StringBuilder("CategoryManager/onManifestReady/category ");
                    sb2.append(A03);
                    sb2.append(" is up-to-date as confirmed from manifest, and category content is present.");
                    Log.d(sb2.toString());
                    r6.A08(5, i);
                    r6.A0C(A012.A01(i));
                    r6.A06(i);
                    return;
                }
                StringBuilder sb3 = new StringBuilder("CategoryManager/onManifestReady/category ");
                sb3.append(A03);
                sb3.append(" has up-to-date hash against manifest's, but content is not present, clearing local hash too.");
                Log.d(sb3.toString());
                r6.A0D(null, null, i);
            } else if (!r6.A0E(i)) {
                StringBuilder sb4 = new StringBuilder("CategoryManager/onManifestReady/category ");
                sb4.append(A03);
                sb4.append(" has stale hash against manifest's, but content is not present, clearing local hash too.");
                Log.d(sb4.toString());
                r6.A0D(null, null, i);
            }
        }
        if (i2 == 0) {
            synchronized (r6) {
                Long l = (Long) r6.A03.get(i);
                if (l == null) {
                    j = 0;
                } else {
                    j = l.longValue();
                }
            }
            if (j + 3600000 > r6.A08.A05()) {
                StringBuilder sb5 = new StringBuilder("CategoryManager/onManifestReady/Last failure is fresh, network fetch throttled for category ");
                sb5.append(A03);
                Log.d(sb5.toString());
                r6.A08(4, i);
                r6.A0C(null);
                return;
            }
        }
        Log.d("CategoryManager/onManifestReady/Starting thread to download category data.");
        r6.A08(3, i);
        r6.A0E.ANF(new RunnableEBaseShape0S1201000_I0(r6, i, r12, null, 2));
    }
}
