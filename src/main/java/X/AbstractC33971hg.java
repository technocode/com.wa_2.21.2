package X;

/* renamed from: X.1hg  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC33971hg extends AbstractC227012v {
    public long A00;

    public void A02() {
        if (!(this instanceof C462028p)) {
            AnonymousClass28k r5 = (AnonymousClass28k) this;
            AnonymousClass25Z r4 = r5.A00;
            Object obj = r4.A07;
            synchronized (obj) {
                ((AbstractC227012v) r5).A00 = 0;
                r5.A01 = null;
                AbstractC33971hg[] r2 = r4.A0C;
                int i = r4.A01;
                r4.A01 = i + 1;
                r2[i] = r5;
                if (!r4.A09.isEmpty() && r4.A01 > 0) {
                    obj.notify();
                }
            }
            return;
        }
        C462028p r3 = (C462028p) this;
        AbstractC455125c r22 = r3.A00;
        if (r22 != null) {
            ((AbstractC227012v) r3).A00 = 0;
            r3.A01 = null;
            r22.A04.add(r3);
            return;
        }
        throw null;
    }
}
