package X;

import java.util.ArrayList;

/* renamed from: X.17q  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC238017q {
    public Object A00;
    public boolean A01 = false;
    public final /* synthetic */ AbstractC238217s A02;

    public AbstractC238017q(AbstractC238217s r2, Object obj) {
        this.A02 = r2;
        this.A00 = obj;
    }

    public final void A00() {
        synchronized (this) {
            this.A00 = null;
        }
        ArrayList arrayList = this.A02.A0N;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
