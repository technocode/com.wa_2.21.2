package X;

import com.whatsapp.util.Log;

/* renamed from: X.2g6  reason: invalid class name and case insensitive filesystem */
public class C55162g6 implements AbstractC07200Wh {
    public final /* synthetic */ C10300eP A00;

    public C55162g6(C10300eP r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        throw new IllegalStateException("must not be called");
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        throw new IllegalStateException("must not be called");
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        C10300eP r2 = this.A00;
        r2.A00 = -2;
        AnonymousClass008.A1U(AnonymousClass008.A0S("searchSupportTask/externalStorage/avail external storage not calculated, state="), r2.A03);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        this.A00.A00 = -2;
        Log.i("searchSupportTask/externalStorage/avail external storage not calculated, permission denied");
    }
}
