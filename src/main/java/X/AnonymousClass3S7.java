package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.3S7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3S7 implements AbstractC03150Ez {
    public final /* synthetic */ C02780Dk A00;
    public final /* synthetic */ AnonymousClass02M A01;
    public final /* synthetic */ AnonymousClass0M2 A02;
    public final /* synthetic */ WeakReference A03;

    public /* synthetic */ AnonymousClass3S7(WeakReference weakReference, AnonymousClass02M r2, C02780Dk r3, AnonymousClass0M2 r4) {
        this.A03 = weakReference;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        WeakReference weakReference = this.A03;
        AnonymousClass02M r1 = this.A01;
        C02780Dk r4 = this.A00;
        AnonymousClass0M2 r3 = this.A02;
        Uri uri = (Uri) obj;
        if (weakReference.get() != null) {
            r1.A02();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, ((AnonymousClass0M3) r3).A07);
            intent.setFlags(1);
            r4.A05((Context) weakReference.get(), intent);
        }
    }
}
