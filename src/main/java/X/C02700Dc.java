package X;

import java.util.Collections;

/* renamed from: X.0Dc  reason: invalid class name and case insensitive filesystem */
public class C02700Dc extends AnonymousClass0DZ {
    public final AnonymousClass00S A00;
    public final AnonymousClass01K A01;
    public final AnonymousClass0CG A02;

    public C02700Dc(AnonymousClass00S r1, AnonymousClass01K r2, AnonymousClass0CG r3, AnonymousClass0DU r4) {
        super(r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final C52792bl A00(AbstractC007503q r8, boolean z, long j) {
        AnonymousClass02N A07;
        C007303n r2 = r8.A0n;
        AnonymousClass02N r1 = r2.A00;
        if (AnonymousClass1VY.A0Y(r1) || AnonymousClass1VY.A0T(r1)) {
            A07 = r8.A07();
        } else {
            A07 = null;
        }
        return new C52792bl(null, r2, z, j, null, false, A07);
    }

    public final void A06(C52792bl r5, AbstractC007503q r6) {
        boolean z = r5.A02;
        if (z && !r6.A0j) {
            this.A02.A04(Collections.singleton(r6), true, false);
        } else if (!z && r6.A0j) {
            this.A02.A06(Collections.singleton(r6), false);
        }
    }
}
