package X;

/* renamed from: X.1o8  reason: invalid class name and case insensitive filesystem */
public class C37391o8 implements AbstractC25321Gj {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AbstractC008905s[] A01;

    public C37391o8(long j, AbstractC008905s[] r3) {
        this.A00 = j;
        this.A01 = r3;
    }

    @Override // X.AbstractC25321Gj
    public boolean AR3(AnonymousClass05l r8) {
        AbstractC008905s r82 = (AbstractC008905s) r8;
        long j = this.A00;
        Long l = r82.A04;
        if (l == null || l.longValue() != j) {
            return false;
        }
        this.A01[0] = r82;
        return true;
    }
}
