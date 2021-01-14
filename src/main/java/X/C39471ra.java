package X;

import com.whatsapp.util.Log;

/* renamed from: X.1ra  reason: invalid class name and case insensitive filesystem */
public class C39471ra implements AbstractC07200Wh {
    public final /* synthetic */ C39481rb A00;

    public C39471ra(C39481rb r1) {
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
        C39481rb r2 = this.A00;
        r2.A00 = -2;
        AnonymousClass008.A1U(AnonymousClass008.A0S("contactsupporttask/externalstorage/avail external storage not calculated, state="), r2.A02);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        this.A00.A00 = -2;
        Log.i("contactsupporttask/externalstorage/avail external storage not calculated, permission denied");
    }
}
