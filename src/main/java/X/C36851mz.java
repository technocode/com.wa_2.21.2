package X;

import android.os.Handler;

/* renamed from: X.1mz  reason: invalid class name and case insensitive filesystem */
public class C36851mz implements AbstractC24961Du {
    public final /* synthetic */ AbstractC24951Dr A00;

    public C36851mz(AbstractC24951Dr r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC24961Du
    public void A3n(int i) {
        Handler handler = AbstractC24951Dr.A08;
        handler.sendMessage(handler.obtainMessage(1, i, 0, this.A00));
    }

    @Override // X.AbstractC24961Du
    public void APf() {
        Handler handler = AbstractC24951Dr.A08;
        handler.sendMessage(handler.obtainMessage(0, this.A00));
    }
}
