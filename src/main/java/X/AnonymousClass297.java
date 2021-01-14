package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* renamed from: X.297  reason: invalid class name */
public final class AnonymousClass297 extends BinderC458126l implements AnonymousClass176, AnonymousClass177 {
    public static AbstractC34691j1 A07 = C24561Bl.A00;
    public AbstractC236717b A00;
    public C238417u A01;
    public AbstractC458426o A02;
    public Set A03;
    public final Context A04;
    public final Handler A05;
    public final AbstractC34691j1 A06;

    public AnonymousClass297(Context context, Handler handler, C238417u r4, AbstractC34691j1 r5) {
        this.A04 = context;
        this.A05 = handler;
        C001801b.A1R(r4, "ClientSettings must not be null");
        this.A01 = r4;
        this.A03 = r4.A05;
        this.A06 = r5;
    }

    @Override // X.AnonymousClass176
    public final void AEX(Bundle bundle) {
        this.A02.ARV(this);
    }

    @Override // X.AnonymousClass177
    public final void AEY(C34661ix r2) {
        ((C34741j9) this.A00).A00(r2);
    }

    @Override // X.AnonymousClass176
    public final void AEZ(int i) {
        this.A02.A3k();
    }

    @Override // X.AbstractC24521Bh
    public final void ARZ(C36171lh r4) {
        this.A05.post(new RunnableEBaseShape5S0200000_I1_0(r4, this, 37));
    }
}
