package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.2dO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53512dO implements AnonymousClass1KW {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ WeakReference A01;

    public /* synthetic */ C53512dO(WeakReference weakReference, Intent intent) {
        this.A01 = weakReference;
        this.A00 = intent;
    }

    @Override // X.AnonymousClass1KW
    public final void AJg(boolean z) {
        Context context;
        WeakReference weakReference = this.A01;
        Intent intent = this.A00;
        if (z && (context = (Context) weakReference.get()) != null) {
            context.startActivity(intent);
        }
    }
}
