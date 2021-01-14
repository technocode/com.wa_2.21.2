package X;

import java.util.List;

/* renamed from: X.2yg  reason: invalid class name and case insensitive filesystem */
public class C64742yg {
    public AnonymousClass2XR A00;
    public AnonymousClass3WV A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass02M A03;
    public final C02420Bx A04;
    public final AnonymousClass0C3 A05;
    public final AnonymousClass00S A06;
    public final AnonymousClass00G A07;
    public final AnonymousClass00D A08;
    public final C001000o A09;
    public final C001400w A0A;
    public final C02430Bz A0B;
    public final AnonymousClass09H A0C;
    public final AnonymousClass0K0 A0D;
    public final C02360Br A0E;
    public final AnonymousClass3MA A0F;
    public final AnonymousClass00T A0G;
    public final C02400Bv A0H;
    public final AnonymousClass0C4 A0I;

    public C64742yg(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass02M r4, AnonymousClass009 r5, AnonymousClass00T r6, C02400Bv r7, AnonymousClass0C4 r8, AnonymousClass09H r9, C001400w r10, C02360Br r11, C001000o r12, AnonymousClass00D r13, AnonymousClass0K0 r14, C02430Bz r15, C02420Bx r16, AnonymousClass0C3 r17, AnonymousClass3MA r18) {
        this.A07 = r2;
        this.A06 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A0G = r6;
        this.A0H = r7;
        this.A0I = r8;
        this.A0C = r9;
        this.A0A = r10;
        this.A09 = r12;
        this.A08 = r13;
        this.A0E = r11;
        this.A0D = r14;
        this.A0B = r15;
        this.A04 = r16;
        this.A05 = r17;
        this.A0F = r18;
    }

    public AbstractC64732yf A00() {
        C02430Bz r10 = this.A0B;
        if (r10.A0F.A01()) {
            AnonymousClass2XR r0 = this.A00;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass2XR r02 = new AnonymousClass2XR(this.A06, this.A03, this.A02, this.A0G, this.A0C, this.A0A, this.A0F, this.A09, this.A08, r10, this.A04, this.A05);
            this.A00 = r02;
            return r02;
        }
        if (this.A01 == null) {
            AnonymousClass3WV r1 = new AnonymousClass3WV(this.A03, this.A07, this.A0H, this.A0I, this.A0E, this.A0D, this.A0F);
            this.A01 = r1;
            AnonymousClass0C4 r03 = r1.A08;
            AnonymousClass0KL r2 = r1.A07;
            List list = r03.A0S;
            if (!list.contains(r2)) {
                list.add(r2);
            }
        }
        return this.A01;
    }
}
