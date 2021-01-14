package X;

import android.location.Location;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Di  reason: invalid class name and case insensitive filesystem */
public class C02760Di {
    public static volatile C02760Di A0F;
    public final AnonymousClass0C1 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass0EH A03;
    public final C006903j A04;
    public final AnonymousClass0AQ A05;
    public final AnonymousClass01T A06;
    public final AnonymousClass0AN A07;
    public final AnonymousClass0B7 A08;
    public final AnonymousClass098 A09;
    public final AnonymousClass0CF A0A;
    public final AnonymousClass01S A0B;
    public final C02770Dj A0C;
    public final C02800Dm A0D;
    public final AnonymousClass0BB A0E;

    public C02760Di(AnonymousClass00S r1, AnonymousClass01I r2, C006903j r3, AnonymousClass098 r4, AnonymousClass0AN r5, C02770Dj r6, AnonymousClass0CF r7, AnonymousClass0BB r8, AnonymousClass0B7 r9, C02800Dm r10, AnonymousClass0C1 r11, AnonymousClass01S r12, AnonymousClass0EH r13, AnonymousClass01T r14, AnonymousClass0AQ r15) {
        this.A02 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A09 = r4;
        this.A07 = r5;
        this.A0C = r6;
        this.A0A = r7;
        this.A0E = r8;
        this.A08 = r9;
        this.A0D = r10;
        this.A00 = r11;
        this.A0B = r12;
        this.A03 = r13;
        this.A06 = r14;
        this.A05 = r15;
    }

    public static C02760Di A00() {
        if (A0F == null) {
            synchronized (C02760Di.class) {
                if (A0F == null) {
                    A0F = new C02760Di(AnonymousClass00S.A00(), AnonymousClass01I.A00(), C006903j.A00(), AnonymousClass098.A00(), AnonymousClass0AN.A00(), C02770Dj.A00(), AnonymousClass0CF.A00(), AnonymousClass0BB.A00(), AnonymousClass0B7.A00(), C02800Dm.A00(), AnonymousClass0C1.A01(), AnonymousClass01S.A00(), AnonymousClass0EH.A00(), AnonymousClass01T.A00(), AnonymousClass0AQ.A00());
                }
            }
        }
        return A0F;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r2 == null) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x032b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C64392y7 A01(X.AbstractC007503q r10, X.C007303n r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 970
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02760Di.A01(X.03q, X.03n, boolean):X.2y7");
    }

    public Pair A02(AnonymousClass02N r12) {
        List list;
        C007303n r2;
        AbstractC007503q A042;
        List A043;
        AnonymousClass0CF r5 = this.A0A;
        int A012 = r5.A02.A01(r12);
        if (A012 <= 0 || (A042 = r5.A03.A04(r12, A012)) == null) {
            list = null;
            r2 = null;
        } else {
            list = r5.A02(r12, A042.A0p - 1, 20, null);
            if (list == null) {
                list = new ArrayList();
            }
            if (!list.isEmpty()) {
                r2 = ((AbstractC007503q) list.get(0)).A0n;
                if (!(r2 == null || (A043 = r5.A04(r2, 20, null)) == null)) {
                    list.addAll(0, A043);
                }
            }
            r2 = null;
        }
        return Pair.create(r2, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0088, code lost:
        if (r2 == -2) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C64392y7 A03(X.AnonymousClass02N r7) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02760Di.A03(X.02N):X.2y7");
    }

    public boolean A04(String str, AnonymousClass02N r23, long j, boolean z) {
        HashMap hashMap;
        long j2;
        C02920Dz r0;
        C02900Dx r1;
        long j3;
        if (j > 0) {
            hashMap = new HashMap();
            hashMap.put("duration", Long.toString(j));
        } else {
            hashMap = null;
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass01S r4 = this.A0B;
        if (r4.A0e(r23)) {
            byte[] bArr = null;
            if (!z) {
                return false;
            }
            Location A032 = this.A00.A03("web-live-location-participants");
            if (A032 != null) {
                C02770Dj r02 = this.A0C;
                r1 = r02.A05(A032);
                if (r1 != null) {
                    bArr = r02.A04(r1, null).A09();
                }
            } else {
                r1 = null;
            }
            AnonymousClass01I r03 = this.A01;
            r03.A04();
            AnonymousClass0HR r04 = r03.A01;
            if (r04 != null) {
                AnonymousClass02N r2 = (AnonymousClass02N) r04.A09;
                if (r2 != null) {
                    long A042 = r4.A04(r23) / 1000;
                    if (r1 != null) {
                        j3 = (this.A02.A05() - r1.A05) / 1000;
                    } else {
                        j3 = -1;
                    }
                    arrayList.add(new C70493Lg(r2, A042, j3, bArr));
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        Iterator it = r4.A08(r23).iterator();
        while (it.hasNext()) {
            C02900Dx r9 = (C02900Dx) it.next();
            UserJid userJid = r9.A06;
            synchronized (r4.A0R) {
                Map map = (Map) r4.A0C().get(r23);
                if (map == null || (r0 = (C02920Dz) map.get(userJid)) == null) {
                    j2 = -1;
                } else {
                    j2 = r0.A00;
                }
            }
            arrayList.add(new C70493Lg(userJid, j2 / 1000, (this.A02.A05() - r9.A05) / 1000, null));
        }
        this.A0D.A04(str, arrayList, 29, false, Collections.emptyMap(), hashMap);
        return true;
    }
}
