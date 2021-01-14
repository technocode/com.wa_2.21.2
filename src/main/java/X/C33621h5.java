package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: X.1h5  reason: invalid class name and case insensitive filesystem */
public class C33621h5 implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        AnonymousClass25I r5 = (AnonymousClass25I) obj2;
        if (Build.VERSION.SDK_INT >= 17) {
            view.setBackgroundColor(r5.A00);
        } else {
            view.setBackgroundDrawable(new ColorDrawable(r5.A00));
        }
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AnonymousClass25I) obj).A00 != ((AnonymousClass25I) obj2).A00;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
    }
}
