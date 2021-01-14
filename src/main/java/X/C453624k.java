package X;

/* renamed from: X.24k  reason: invalid class name and case insensitive filesystem */
public final class C453624k extends AbstractC31571dR {
    public void A07(AnonymousClass1EY r6) {
        RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0;
        AbstractC18210sy r2;
        C18240t1 r0;
        if (r6 != null) {
            Object obj = this.value;
            if (obj == null) {
                if (r6.isDone()) {
                    if (AbstractC31571dR.A00.A02(this, null, AbstractC31571dR.A00(r6))) {
                        AbstractC31571dR.A03(this);
                        return;
                    }
                    return;
                }
                runnableEBaseShape5S0200000_I1_0 = new RunnableEBaseShape5S0200000_I1_0(r6, this, 20);
                r2 = AbstractC31571dR.A00;
                if (r2.A02(this, null, runnableEBaseShape5S0200000_I1_0)) {
                    try {
                        r6.A1o(runnableEBaseShape5S0200000_I1_0, EnumC18270t4.A01);
                        return;
                    } catch (Throwable unused) {
                        r0 = C18240t1.A01;
                    }
                } else {
                    obj = this.value;
                }
            }
            if (obj instanceof C18220sz) {
                r6.cancel(((C18220sz) obj).A01);
                return;
            }
            return;
        }
        throw null;
        r2.A02(this, runnableEBaseShape5S0200000_I1_0, r0);
    }

    public void A08(Object obj) {
        if (obj == null) {
            obj = AbstractC31571dR.A01;
        }
        if (AbstractC31571dR.A00.A02(this, null, obj)) {
            AbstractC31571dR.A03(this);
        }
    }

    public void A09(Throwable th) {
        if (th != null) {
            if (AbstractC31571dR.A00.A02(this, null, new C18240t1(th))) {
                AbstractC31571dR.A03(this);
                return;
            }
            return;
        }
        throw null;
    }
}
