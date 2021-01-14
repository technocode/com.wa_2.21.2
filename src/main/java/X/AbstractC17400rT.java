package X;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: X.0rT  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17400rT {
    public Animatable2.AnimationCallback A00;

    public void A00(Drawable drawable) {
        if (this instanceof AnonymousClass3RY) {
            AnonymousClass3RY r1 = (AnonymousClass3RY) this;
            AnonymousClass02M r4 = r1.A00.A00;
            r4.A02.postDelayed(new RunnableEBaseShape13S0100000_I1_8(r1, 8), 500);
        } else if (this instanceof C71853Qo) {
            AbstractC17400rT r0 = ((C71853Qo) this).A00.A01;
            if (r0 != null) {
                r0.A00(drawable);
            }
        } else if (this instanceof C51782a1) {
            C51782a1 r2 = (C51782a1) this;
            if (drawable instanceof C71913Qu) {
                r2.A00.AQw(r2.A01);
            }
        } else if (this instanceof C51762Zz) {
            C51762Zz r22 = (C51762Zz) this;
            if (drawable instanceof C71913Qu) {
                r22.A00.AQw(r22.A01);
            }
        }
    }
}
