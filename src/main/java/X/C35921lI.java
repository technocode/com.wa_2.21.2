package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.1lI  reason: invalid class name and case insensitive filesystem */
public final class C35921lI implements AbstractC241018y {
    public View A00;
    public final ViewGroup A01;
    public final IMapViewDelegate A02;

    public C35921lI(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        C001801b.A1Q(iMapViewDelegate);
        this.A02 = iMapViewDelegate;
        C001801b.A1Q(viewGroup);
        this.A01 = viewGroup;
    }
}
