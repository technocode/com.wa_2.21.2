package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1gw  reason: invalid class name and case insensitive filesystem */
public class C33541gw implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setLayerType(((AnonymousClass25H) obj2).A01, null);
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AnonymousClass25H) obj).A01 != ((AnonymousClass25H) obj2).A01;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setLayerType(0, null);
    }
}
