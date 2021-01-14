package X;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0bd  reason: invalid class name and case insensitive filesystem */
public class C08740bd {
    public AnonymousClass019 A00 = new C08750be(this);
    public AtomicBoolean A01 = new AtomicBoolean();
    public final AnonymousClass0Yj A02 = new AnonymousClass0Yj();
    public final AnonymousClass0Yj A03 = new AnonymousClass0Yj();
    public final AnonymousClass0Yj A04 = new AnonymousClass0Yj();
    public final AnonymousClass0Yj A05 = new AnonymousClass0Yj();
    public final AnonymousClass0Yj A06 = new AnonymousClass0Yj();
    public final AnonymousClass0Yj A07 = new AnonymousClass0Yj();
    public final C02270Bi A08 = new C02270Bi();
    public final C02270Bi A09 = new C02270Bi();
    public final C02270Bi A0A = new C02270Bi();
    public final C02270Bi A0B = new C02270Bi();
    public final C02270Bi A0C = new C02270Bi();
    public final AnonymousClass01A A0D;
    public final C014308b A0E;
    public final AnonymousClass0AM A0F;
    public final C08680bX A0G;
    public final C08680bX A0H;

    public C08740bd(AnonymousClass0XL r4, AnonymousClass01A r5, C014308b r6, AnonymousClass0AM r7, AbstractC02280Bj r8, AbstractC02280Bj r9, AbstractC02280Bj r10) {
        C08680bX r1 = new C08680bX();
        r1.A01 = 100;
        this.A0G = r1;
        this.A0H = new C08680bX();
        this.A0D = r5;
        this.A0E = r6;
        this.A0F = r7;
        A00(false);
        r4.A01(this.A05, this.A04, new C08760bf(this));
        r4.A01(this.A02, this.A07, new C08770bg(this));
        r4.A01(this.A03, this.A07, new C08780bh(this));
        this.A04.A09(this.A06, new AnonymousClass3NE(this));
        this.A06.A09(r9, new AnonymousClass3NF(this));
        this.A06.A09(r8, new AnonymousClass3ND(this));
        this.A06.A09(r10, new AnonymousClass3NG(this));
    }

    public void A00(boolean z) {
        Boolean bool;
        this.A0B.A07(Boolean.TRUE);
        this.A05.A07(C08590bO.A00());
        AnonymousClass0Yj r3 = this.A06;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        r3.A07(new Pair(bool, 0));
        this.A07.A07(this.A0H);
        this.A0G.A0F = true;
    }
}
