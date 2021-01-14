package X;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.1r2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39151r2 implements AbstractC03150Ez {
    public final /* synthetic */ C02780Dk A00;
    public final /* synthetic */ C04360Kb A01;
    public final /* synthetic */ AnonymousClass0M3 A02;
    public final /* synthetic */ WeakReference A03;

    public /* synthetic */ C39151r2(C04360Kb r1, WeakReference weakReference, C02780Dk r3, AnonymousClass0M3 r4) {
        this.A01 = r1;
        this.A03 = weakReference;
        this.A00 = r3;
        this.A02 = r4;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        this.A01.A0P(this.A03, this.A00, this.A02, (Uri) obj);
    }
}
