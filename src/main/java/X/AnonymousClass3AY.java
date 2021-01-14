package X;

/* renamed from: X.3AY  reason: invalid class name */
public class AnonymousClass3AY {
    public int A00 = 0;
    public AbstractC28141Tb A01;
    public AbstractC28161Td A02;
    public AbstractC28171Te A03;
    public final AnonymousClass3VK A04;

    public AnonymousClass3AY(AnonymousClass3VK r2) {
        this.A04 = r2;
    }

    public void A00() {
        AnonymousClass3VK r2 = this.A04;
        AbstractC28171Te r0 = this.A03;
        AbstractC28141Tb r5 = this.A01;
        AbstractC28161Td r6 = this.A02;
        int i = this.A00;
        if (r2 != null) {
            C28131Ta r4 = new C28131Ta();
            if (r0 != null) {
                try {
                    r0.AIf(r4);
                } catch (Exception e) {
                    r4.A00 = e;
                }
            }
            if (1 == i) {
                if (!((AnonymousClass04j) r2.A01.get()).A05()) {
                    r4.A00 = new C28151Tc("Require Internet");
                }
            } else if (2 == i && !((AnonymousClass04j) r2.A01.get()).A05()) {
                r4.A00 = new C43381yH();
            }
            if (r4.A00 != null || r5 == null) {
                r2.A00(r6, r4);
            } else {
                ((AnonymousClass00T) r2.A02.get()).ANF(new RunnableEBaseShape1S0401000_I1(r2, 0, r4, r5, r6, 0));
            }
        } else {
            throw null;
        }
    }
}
