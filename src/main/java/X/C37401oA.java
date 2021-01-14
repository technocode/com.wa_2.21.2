package X;

/* renamed from: X.1oA  reason: invalid class name and case insensitive filesystem */
public class C37401oA implements AbstractC25321Gj {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C38121pM A01;
    public final /* synthetic */ AbstractC008905s[] A02;

    public C37401oA(long j, C38121pM r3, AbstractC008905s[] r4) {
        this.A00 = j;
        this.A01 = r3;
        this.A02 = r4;
    }

    @Override // X.AbstractC25321Gj
    public boolean AR3(AnonymousClass05l r8) {
        AbstractC008905s r82 = (AbstractC008905s) r8;
        long j = this.A00;
        Long l = r82.A04;
        if ((l == null || l.longValue() != j) && !this.A01.AR3(r82)) {
            return false;
        }
        this.A02[0] = r82;
        return true;
    }
}
