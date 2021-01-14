package X;

/* renamed from: X.1of  reason: invalid class name and case insensitive filesystem */
public class C37711of extends AbstractC16450pp {
    public final AnonymousClass05q A00;
    public final AnonymousClass2AX A01;

    public C37711of(AnonymousClass2AX r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C37711of)) {
            return false;
        }
        AnonymousClass2AX r3 = ((C37711of) obj).A01;
        AbstractC009505y r1 = r3.A0C;
        AnonymousClass2AX r2 = this.A01;
        if (r1 == r2.A0C && r3.A04 == r2.A04) {
            return true;
        }
        return false;
    }
}
