package X;

/* renamed from: X.1pQ  reason: invalid class name and case insensitive filesystem */
public class C38161pQ implements AbstractC011006p {
    public final AbstractC011006p A00;

    public C38161pQ(AbstractC011006p r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC011006p
    public AbstractC011306t A49(C38151pP r4, C010106g r5, C011106q r6) {
        C010906o r2 = r6.A01;
        if (!(r2 instanceof C37601oU)) {
            throw null;
        }
        r2.A00();
        try {
            return this.A00.A49(r4, r5, r6);
        } finally {
            r2.A01();
        }
    }
}
