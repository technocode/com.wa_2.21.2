package X;

/* renamed from: X.2TC  reason: invalid class name */
public class AnonymousClass2TC {
    public byte A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public final int A0B = 3;

    public C43951zG A00() {
        Long l;
        Long l2;
        Long l3;
        C43951zG r2 = new C43951zG();
        r2.A01 = Integer.valueOf(this.A0B);
        r2.A00 = Integer.valueOf(C002001d.A00(this.A00, 0, false));
        Long l4 = this.A0A;
        Long l5 = null;
        if (l4 == null || (l3 = this.A09) == null) {
            l = null;
        } else {
            l = AnonymousClass008.A06(l4, l3.longValue());
        }
        r2.A09 = l;
        Long l6 = this.A08;
        if (!(l6 == null || (l2 = this.A07) == null)) {
            l5 = AnonymousClass008.A06(l6, l2.longValue());
        }
        r2.A02 = l5;
        r2.A07 = Long.valueOf(this.A05);
        r2.A08 = Long.valueOf(this.A06);
        r2.A05 = Long.valueOf(this.A03);
        r2.A03 = Long.valueOf(this.A01);
        r2.A06 = Long.valueOf(this.A04);
        r2.A04 = Long.valueOf(this.A02);
        return r2;
    }

    public String toString() {
        return A00().toString();
    }
}
