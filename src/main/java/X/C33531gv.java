package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.1gv  reason: invalid class name and case insensitive filesystem */
public class C33531gv implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        ((C33451gn) obj).setForegroundCompat(((AnonymousClass25H) obj2).A04);
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((AnonymousClass25H) obj).A04;
        Drawable drawable2 = ((AnonymousClass25H) obj2).A04;
        if (drawable == null) {
            if (drawable2 != null) {
                return true;
            }
            return false;
        } else if (drawable2 == null || drawable.equals(drawable2)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        ((C33451gn) obj).setForegroundCompat(null);
    }
}
