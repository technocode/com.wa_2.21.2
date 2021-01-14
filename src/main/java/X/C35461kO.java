package X;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.1kO  reason: invalid class name and case insensitive filesystem */
public final class C35461kO implements AbstractC240818w {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AbstractC240918x A01;

    public C35461kO(AbstractC240918x r1, Bundle bundle) {
        this.A01 = r1;
        this.A00 = bundle;
    }

    @Override // X.AbstractC240818w
    public final int A9B() {
        return 1;
    }

    @Override // X.AbstractC240818w
    public final void ARU(AbstractC241018y r5) {
        AbstractC241018y r3 = this.A01.A01;
        Bundle bundle = this.A00;
        C35921lI r32 = (C35921lI) r3;
        if (r32 != null) {
            try {
                Bundle bundle2 = new Bundle();
                AnonymousClass1BJ.A01(bundle, bundle2);
                IMapViewDelegate iMapViewDelegate = r32.A02;
                iMapViewDelegate.AEh(bundle2);
                AnonymousClass1BJ.A01(bundle2, bundle);
                r32.A00 = (View) BinderC04800Lv.A00(iMapViewDelegate.A9l());
                ViewGroup viewGroup = r32.A01;
                viewGroup.removeAllViews();
                viewGroup.addView(r32.A00);
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            throw null;
        }
    }
}
