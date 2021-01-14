package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0CP  reason: invalid class name */
public class AnonymousClass0CP {
    public static volatile AnonymousClass0CP A0S;
    public final AnonymousClass0CM A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass088 A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass0B3 A05;
    public final C000300f A06;
    public final AnonymousClass0CL A07;
    public final AnonymousClass00S A08;
    public final AnonymousClass00G A09;
    public final AnonymousClass0BV A0A;
    public final C02110Ar A0B;
    public final C002701k A0C;
    public final AnonymousClass00Y A0D;
    public final AnonymousClass0CW A0E;
    public final C02450Cb A0F;
    public final AnonymousClass0CK A0G;
    public final C02530Cl A0H;
    public final C02460Cc A0I;
    public final AnonymousClass0Ci A0J;
    public final C02540Cm A0K;
    public final C02480Ce A0L;
    public final C02520Ck A0M;
    public final AnonymousClass022 A0N;
    public final AnonymousClass0AL A0O;
    public final AnonymousClass0CT A0P;
    public final AnonymousClass00T A0Q;
    public final AnonymousClass0CQ A0R;

    public AnonymousClass0CP(AnonymousClass00G r2, AnonymousClass00S r3, C002701k r4, AnonymousClass02M r5, AnonymousClass009 r6, AnonymousClass01I r7, AnonymousClass00T r8, AnonymousClass088 r9, AnonymousClass0CK r10, AnonymousClass0CL r11, AnonymousClass00Y r12, AnonymousClass0CM r13, C000300f r14, AnonymousClass0CQ r15, AnonymousClass0CT r16, C02450Cb r17, AnonymousClass0AL r18, C02460Cc r19, C02480Ce r20, AnonymousClass0Ci r21, AnonymousClass0BV r22, C02520Ck r23, C02110Ar r24, C02530Cl r25, AnonymousClass0CW r26, AnonymousClass022 r27, C02540Cm r28, AnonymousClass0B3 r29) {
        this.A09 = r2;
        this.A08 = r3;
        this.A0C = r4;
        this.A03 = r5;
        this.A01 = r6;
        this.A04 = r7;
        this.A0Q = r8;
        this.A02 = r9;
        this.A0G = r10;
        this.A07 = r11;
        this.A0D = r12;
        this.A00 = r13;
        this.A06 = r14;
        this.A0R = r15;
        this.A0P = r16;
        this.A0F = r17;
        this.A0O = r18;
        this.A0I = r19;
        this.A0L = r20;
        this.A0J = r21;
        this.A0A = r22;
        this.A0M = r23;
        this.A0B = r24;
        this.A0H = r25;
        this.A0E = r26;
        this.A0N = r27;
        this.A0K = r28;
        this.A05 = r29;
    }

    public static AnonymousClass0CP A00() {
        if (A0S == null) {
            synchronized (AnonymousClass0CP.class) {
                if (A0S == null) {
                    AnonymousClass00G r7 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C002701k A003 = C002701k.A00();
                    AnonymousClass02M A004 = AnonymousClass02M.A00();
                    AnonymousClass009 A005 = AnonymousClass009.A00();
                    AnonymousClass01I A006 = AnonymousClass01I.A00();
                    AnonymousClass00T A007 = C002101e.A00();
                    AnonymousClass088 A008 = AnonymousClass088.A00();
                    AnonymousClass0CK A009 = AnonymousClass0CK.A00();
                    AnonymousClass0CL A0010 = AnonymousClass0CL.A00();
                    AnonymousClass00Y A0011 = AnonymousClass00Y.A00();
                    AnonymousClass0CM A0012 = AnonymousClass0CM.A00();
                    C000300f A0013 = C000300f.A00();
                    AnonymousClass0CQ A0014 = AnonymousClass0CQ.A00();
                    AnonymousClass0CT A0015 = AnonymousClass0CT.A00();
                    C02450Cb A0016 = C02450Cb.A00();
                    AnonymousClass0AL A012 = AnonymousClass0AL.A01();
                    C02460Cc A013 = C02460Cc.A01();
                    if (C02480Ce.A07 == null) {
                        synchronized (C02480Ce.class) {
                            if (C02480Ce.A07 == null) {
                                C02480Ce.A07 = new C02480Ce(AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass09V.A00(), C02510Ch.A08(), C007703s.A00());
                            }
                        }
                    }
                    C02480Ce r25 = C02480Ce.A07;
                    AnonymousClass0Ci A0017 = AnonymousClass0Ci.A00();
                    AnonymousClass0BV A0018 = AnonymousClass0BV.A00();
                    C02520Ck A0019 = C02520Ck.A00();
                    C02110Ar A0020 = C02110Ar.A00();
                    C02530Cl r0 = C02530Cl.A01;
                    if (r0 == null) {
                        r0 = new C02530Cl(AnonymousClass00D.A00());
                        C02530Cl.A01 = r0;
                    }
                    AnonymousClass0CW A0021 = AnonymousClass0CW.A00();
                    AnonymousClass022 A0022 = AnonymousClass022.A00();
                    if (C02540Cm.A02 == null) {
                        synchronized (C02540Cm.class) {
                            if (C02540Cm.A02 == null) {
                                C02540Cm.A02 = new C02540Cm(AnonymousClass0CK.A00(), AnonymousClass0CW.A00());
                            }
                        }
                    }
                    A0S = new AnonymousClass0CP(r7, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A012, A013, r25, A0017, A0018, A0019, A0020, r0, A0021, A0022, C02540Cm.A02, AnonymousClass0B3.A00());
                }
            }
        }
        return A0S;
    }

    public C40531tQ A01(List list, AnonymousClass0M4 r19, byte b, int i, String str, Uri uri, AbstractC007503q r24, List list2, boolean z, int i2, List list3) {
        String str2;
        StringBuilder sb = new StringBuilder("mediafactory/createmediamessages/uri=");
        sb.append(uri);
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            byte[] A0x = AnonymousClass0FI.A0x(this.A08, this.A04, false);
            if (A0x != null) {
                str2 = C007603r.A03(A0x);
            } else {
                throw new IllegalStateException("multicast id could not be created");
            }
        } else {
            str2 = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A05((AnonymousClass02N) it.next(), r19.A02(), b, i, str, uri, r24, str2, list2, z, i2, list3));
        }
        return new C40531tQ(arrayList);
    }

    public AnonymousClass1W6 A02(String str) {
        if (str == null) {
            return null;
        }
        AnonymousClass0Ci r4 = this.A0J;
        synchronized (r4) {
            AnonymousClass08V r2 = r4.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(1);
            if (r2.A03(sb.toString()) == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(1);
            return (AnonymousClass1W6) r2.A03(sb2.toString());
        }
    }

    public AnonymousClass1W6 A03(String str, boolean z, boolean z2) {
        if (str == null) {
            return null;
        }
        AnonymousClass0Ci r1 = this.A0J;
        int i = 1;
        if (z2) {
            i = 3;
        }
        AnonymousClass1W6 A032 = r1.A03(str, i);
        if (A032 == null) {
            return null;
        }
        if (z || z2) {
            A032.A02++;
        }
        return A032;
    }

    public C60622pp A04(AnonymousClass1WC r42) {
        if (A06().booleanValue()) {
            return new C60762qA(this.A09, this.A08, this.A0C, this.A03, this.A01, this.A0Q, this.A02, this.A0G, this.A07, this.A00, this.A06, this.A0P, this.A0F, this.A0I, this.A0L, this.A0A, this.A0M, this.A0B, this.A0H, this.A0E, this.A0N, this.A0K, this.A05, r42);
        }
        return new C60622pp(this.A08, this.A03, this.A01, this.A0Q, this.A02, this.A0G, this.A07, this.A06, this.A0P, this.A0F, this.A0I, this.A0L, this.A0A, this.A0M, this.A0B, this.A0H, this.A0E, this.A0N, this.A0K, r42);
    }

    public AnonymousClass0M3 A05(AnonymousClass02N r18, AnonymousClass0M4 r19, byte b, int i, String str, Uri uri, AbstractC007503q r24, String str2, List list, boolean z, int i2, List list2) {
        AnonymousClass0M3 A032 = this.A0O.A03(r18, r19, this.A08.A05(), 0, b, 1, null, 0, i, r24);
        if (str != null) {
            A032.A04 = str.trim();
            if (TextUtils.isEmpty(A032.A0v())) {
                A032.A04 = null;
            }
        }
        File file = r19.A0F;
        if (file != null) {
            A032.A08 = file.getName();
            A032.A01 = r19.A0F.length();
        } else if (uri != null) {
            A032.A08 = uri.toString();
            A032.A01 = 0;
        } else {
            throw null;
        }
        if (b == 2 || b == 3 || b == 43 || b == 13) {
            long j = r19.A0D;
            if (j > 0 || r19.A0E > 0) {
                A032.A00 = (int) ((r19.A0E - j) / 1000);
            } else {
                A032.A00 = C02230Bd.A08(r19.A0F);
            }
        }
        A032.A0n(list);
        r19.A0A = A032.A01;
        r19.A0L = true;
        A032.A0e(str2);
        if (z) {
            A032.A0O(4);
        }
        if (list2 != null && !list2.isEmpty()) {
            r19.A0V = (InteractiveAnnotation[]) list2.toArray(new InteractiveAnnotation[0]);
        }
        if (i2 > 0) {
            A032.A0O(1);
            ((AbstractC007503q) A032).A03 = i2;
        }
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r1 == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A06() {
        /*
            r3 = this;
            X.01k r1 = r3.A0C
            r0 = 147(0x93, float:2.06E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0014
            X.00f r1 = r3.A06
            X.01l r0 = X.AbstractC000400g.A2h
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x0021
        L_0x0014:
            X.0CQ r2 = r3.A0R
            monitor-enter(r2)
            boolean r1 = r2.A01     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001d:
            monitor-exit(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CP.A06():java.lang.Boolean");
    }
}
