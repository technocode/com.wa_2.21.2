package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.10o  reason: invalid class name and case insensitive filesystem */
public class C222210o {
    public static int A0D;
    public double A00 = 0.005d;
    public double A01;
    public double A02 = 0.005d;
    public double A03;
    public double A04 = 0.0d;
    public C222310p A05;
    public CopyOnWriteArraySet A06 = new CopyOnWriteArraySet();
    public boolean A07 = true;
    public final C222110n A08 = new C222110n();
    public final C222110n A09 = new C222110n();
    public final C222110n A0A = new C222110n();
    public final C222510r A0B;
    public final String A0C;

    public C222210o(C222510r r4) {
        this.A0B = r4;
        StringBuilder A0S = AnonymousClass008.A0S("spring:");
        int i = A0D;
        A0D = i + 1;
        A0S.append(i);
        this.A0C = A0S.toString();
        this.A05 = C222310p.A02;
    }

    public void A00(double d) {
        if (this.A01 != d || !A01()) {
            this.A03 = this.A08.A00;
            this.A01 = d;
            this.A0B.A00(this.A0C);
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public boolean A01() {
        C222110n r5 = this.A08;
        if (Math.abs(r5.A01) <= 0.005d) {
            return Math.abs(this.A01 - r5.A00) <= 0.005d || this.A05.A01 == 0.0d;
        }
        return false;
    }
}
