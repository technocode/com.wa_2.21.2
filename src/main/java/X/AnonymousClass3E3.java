package X;

import com.whatsapp.util.Log;

/* renamed from: X.3E3  reason: invalid class name */
public class AnonymousClass3E3 implements AbstractC61562tN {
    public final /* synthetic */ C61322sz A00;
    public final /* synthetic */ AbstractC61522tJ A01;

    public AnonymousClass3E3(C61322sz r1, AbstractC61522tJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC61562tN
    public void AFb(C61072sS r2) {
        Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
        this.A01.AGx(r2);
    }

    @Override // X.AbstractC61562tN
    public void AJa(C68653Ea r3) {
        this.A00.A00(r3, this.A01);
    }
}
