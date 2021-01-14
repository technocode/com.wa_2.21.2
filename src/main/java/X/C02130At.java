package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0At  reason: invalid class name and case insensitive filesystem */
public class C02130At implements AbstractC02140Au {
    public static volatile C02130At A0D;
    public final AnonymousClass01I A00;
    public final AnonymousClass01A A01;
    public final C014308b A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass0AP A05;
    public final C014508d A06;
    public final C02040Ak A07;
    public final C01970Ad A08;
    public final C018809u A09 = C018809u.A00("PaymentStatusNotifier", "notification", "COMMON");
    public final C02150Av A0A;
    public final AnonymousClass01R A0B;
    public final AbstractC02190Az A0C;

    public C02130At(AnonymousClass00S r4, AnonymousClass01I r5, C02150Av r6, AnonymousClass01A r7, C014308b r8, AnonymousClass01X r9, C01970Ad r10, AnonymousClass0AP r11, C014508d r12, AnonymousClass01R r13, C02040Ak r14, AbstractC02190Az r15) {
        this.A03 = r4;
        this.A00 = r5;
        this.A0A = r6;
        this.A01 = r7;
        this.A02 = r8;
        this.A04 = r9;
        this.A08 = r10;
        this.A05 = r11;
        this.A06 = r12;
        this.A0B = r13;
        this.A07 = r14;
        this.A0C = r15;
    }

    public static C02130At A00() {
        if (A0D == null) {
            synchronized (C02130At.class) {
                if (A0D == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass01I A003 = AnonymousClass01I.A00();
                    C02150Av A022 = C02150Av.A02();
                    AnonymousClass01A A004 = AnonymousClass01A.A00();
                    C014308b A005 = C014308b.A00();
                    AnonymousClass01X A006 = AnonymousClass01X.A00();
                    C01970Ad A007 = C01970Ad.A00();
                    AnonymousClass0AP A008 = AnonymousClass0AP.A00();
                    C02010Ah.A00();
                    C014508d A009 = C014508d.A00();
                    C01980Ae.A00();
                    A0D = new C02130At(A002, A003, A022, A004, A005, A006, A007, A008, A009, AnonymousClass01R.A01(), C02040Ak.A00(), new C02180Ay(C02160Aw.A00, null));
                }
            }
        }
        return A0D;
    }

    public synchronized void A01() {
        String str;
        AnonymousClass01K r4 = (AnonymousClass01K) this.A0C.get();
        C01970Ad r0 = this.A08;
        r0.A04();
        List A0P = r0.A05.A0P();
        C01970Ad r02 = this.A08;
        r02.A04();
        ArrayList arrayList = (ArrayList) A0P;
        arrayList.addAll(r02.A05.A0Q());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0MH r6 = (AnonymousClass0MH) it.next();
            C05480Os A0A2 = this.A0B.A0A(r6.A08, this.A03.A05(), 44);
            A0A2.A01 = r6.A09;
            A0A2.A00 = r6.A0A;
            C02150Av r1 = this.A0A;
            String str2 = r6.A0E;
            C05900Qy r03 = r6.A06;
            if (r1 != null) {
                if (r03 == null) {
                    str = "";
                } else {
                    str = TextUtils.join(";", Arrays.asList(str2, Long.toString(r03.A00.scaleByPowerOfTen(3).longValue())));
                }
                A0A2.A03 = str;
                A0A2.A02 = new C007303n(r6.A08, r6.A0M, r6.A0H);
                r4.A0e(A0A2, 16);
                synchronized (r4) {
                    AbstractC007503q A092 = r4.A09(r6);
                    if (A092 != null) {
                        r6.A01 = 16;
                        A092.A0F = r6;
                        r4.A0b.A01(A092, 16);
                        r4.A0X.A0N(A092, null);
                    }
                }
            } else {
                throw null;
            }
        }
    }

    @Override // X.AbstractC02140Au
    public void AGf() {
        String str;
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        if (r0.A00 != null && this.A07.A02()) {
            C014508d r02 = this.A06;
            r02.A05();
            if (r02.A01) {
                synchronized (this) {
                    AnonymousClass01K r4 = (AnonymousClass01K) this.A0C.get();
                    C01970Ad r03 = this.A08;
                    r03.A04();
                    List A0P = r03.A05.A0P();
                    C01970Ad r04 = this.A08;
                    r04.A04();
                    ArrayList arrayList = (ArrayList) A0P;
                    arrayList.addAll(r04.A05.A0Q());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AnonymousClass0MH r6 = (AnonymousClass0MH) it.next();
                        C05480Os A0A2 = this.A0B.A0A(r6.A08, this.A03.A05(), 44);
                        A0A2.A01 = r6.A09;
                        A0A2.A00 = r6.A0A;
                        C02150Av r1 = this.A0A;
                        String str2 = r6.A0E;
                        C05900Qy r05 = r6.A06;
                        if (r1 != null) {
                            if (r05 == null) {
                                str = "";
                            } else {
                                str = TextUtils.join(";", Arrays.asList(str2, Long.toString(r05.A00.scaleByPowerOfTen(3).longValue())));
                            }
                            A0A2.A03 = str;
                            A0A2.A02 = new C007303n(r6.A08, r6.A0M, r6.A0H);
                            r4.A0e(A0A2, 16);
                            synchronized (r4) {
                                AbstractC007503q A092 = r4.A09(r6);
                                if (A092 != null) {
                                    r6.A01 = 16;
                                    A092.A0F = r6;
                                    r4.A0b.A01(A092, 16);
                                    r4.A0X.A0N(A092, null);
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }
        }
    }
}
