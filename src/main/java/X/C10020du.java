package X;

import java.util.List;

/* renamed from: X.0du  reason: invalid class name and case insensitive filesystem */
public class C10020du extends AnonymousClass0JW {
    public AnonymousClass1X3 A00;
    public final AnonymousClass0AM A01;
    public final C01970Ad A02;
    public final AnonymousClass3GN A03;
    public final AnonymousClass2w3 A04;
    public final C02150Av A05;
    public final String A06;
    public final boolean A07 = true;
    public final boolean A08;

    public C10020du(C02150Av r2, AnonymousClass0AM r3, C01970Ad r4, AnonymousClass2w3 r5, String str, boolean z, AnonymousClass1X3 r8, AnonymousClass3GN r9) {
        this.A06 = str;
        this.A08 = z;
        this.A01 = r3;
        this.A03 = r9;
        this.A00 = r8;
        this.A02 = r4;
        this.A04 = r5;
        this.A05 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass02R r6 = (AnonymousClass02R) obj;
        AnonymousClass3GN r4 = this.A03;
        String str = this.A06;
        AnonymousClass1X3 r2 = this.A00;
        Object obj2 = r6.A00;
        if (obj2 != null) {
            List list = (List) obj2;
            Object obj3 = r6.A01;
            if (obj3 != null) {
                r4.A00(str, r2, list, (List) obj3);
                return;
            }
            throw null;
        }
        throw null;
    }
}
