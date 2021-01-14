package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1gx  reason: invalid class name and case insensitive filesystem */
public class C33551gx implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        C33451gn r5 = (C33451gn) obj;
        AnonymousClass25H r6 = (AnonymousClass25H) obj2;
        if (r6 != null) {
            r5.setOnTouchListener(null);
            r5.A02 = null;
            View.OnClickListener onClickListener = r6.A05;
            if (onClickListener != null) {
                r5.setOnClickListener(onClickListener);
            }
            r5.setOnFocusChangeListener(null);
            r5.setFocusable(false);
            r5.setFocusableInTouchMode(false);
            r5.setEnabled(r6.A06);
            if (r6.A00 != -1) {
                r5.setClickable(false);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        C33451gn r4 = (C33451gn) obj;
        r4.setOnTouchListener(null);
        r4.A02 = null;
        r4.setOnClickListener(null);
        r4.setClickable(false);
        r4.setOnLongClickListener(null);
        r4.setLongClickable(false);
        r4.setOnFocusChangeListener(null);
        r4.setFocusable(false);
        r4.setFocusableInTouchMode(false);
    }
}
