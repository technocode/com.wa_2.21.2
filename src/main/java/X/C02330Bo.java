package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Bo  reason: invalid class name and case insensitive filesystem */
public class C02330Bo {
    public static volatile C02330Bo A09;
    public final AnonymousClass08V A00 = new AnonymousClass08V(250);
    public final AnonymousClass00S A01;
    public final AnonymousClass01K A02;
    public final C015508n A03;
    public final C014508d A04;
    public final AnonymousClass01N A05;
    public final C02340Bp A06;
    public final C02350Bq A07;
    public final Set A08 = new HashSet();

    public C02330Bo(AnonymousClass00S r3, AnonymousClass01K r4, C02340Bp r5, AnonymousClass01N r6, C015508n r7, C014508d r8, C02350Bq r9) {
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r5;
        this.A05 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A07 = r9;
    }

    public static C02330Bo A00() {
        if (A09 == null) {
            synchronized (C02330Bo.class) {
                if (A09 == null) {
                    A09 = new C02330Bo(AnonymousClass00S.A00(), AnonymousClass01K.A00(), C02340Bp.A00(), AnonymousClass01N.A00(), C015508n.A00(), C014508d.A00(), C02350Bq.A00());
                }
            }
        }
        return A09;
    }

    public AnonymousClass2L0 A01(AbstractC007503q r10) {
        AnonymousClass2L0 A012;
        AnonymousClass00S r5 = this.A01;
        long A042 = r5.A04();
        C007303n r7 = r10.A0n;
        AnonymousClass08V r6 = this.A00;
        AnonymousClass2L0 r0 = (AnonymousClass2L0) r6.A03(r7);
        if (r0 != null) {
            return r0;
        }
        C02340Bp r8 = this.A06;
        if (r8.A04()) {
            A012 = r8.A02(r10.A0p);
        } else {
            AnonymousClass02N r3 = r7.A00;
            if (AnonymousClass1VY.A0Y(r3) || AnonymousClass1VY.A0b(r3)) {
                A012 = this.A07.A01(r7);
            } else {
                A012 = this.A07.A02(r10);
            }
        }
        r6.A07(r7, A012);
        AnonymousClass008.A0h(r5, A042, this.A03, "ReceiptManager/getMessageReceipts");
        return A012;
    }
}
