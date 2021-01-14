package X;

import android.view.View;

/* renamed from: X.2Ya  reason: invalid class name and case insensitive filesystem */
public class C51262Ya implements AbstractC14990nD {
    @Override // X.AbstractC14990nD
    public void ACi(View view) {
        if (this instanceof C58882mh) {
            C58882mh r2 = (C58882mh) this;
            if (r2.A00 != 0) {
                view.setTranslationX(0.0f);
            }
            if (r2.A01 != 0) {
                view.setTranslationY(0.0f);
            }
        } else if (this instanceof C58872mg) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }
}
