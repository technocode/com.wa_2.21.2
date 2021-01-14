package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1pK  reason: invalid class name and case insensitive filesystem */
public class C38101pK implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setVisibility(((AnonymousClass29Y) obj2).A00);
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AnonymousClass29Y) obj2).A00 != ((AnonymousClass29Y) obj).A00;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setVisibility(0);
    }
}
