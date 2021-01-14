package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.2My  reason: invalid class name and case insensitive filesystem */
public class C48602My extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC48612Mz A01;

    public C48602My(AbstractC48612Mz r1, View view) {
        this.A01 = r1;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        AbstractC48612Mz r3 = this.A01;
        View view = this.A00;
        if (r3 instanceof C53162cd) {
            C53162cd r32 = (C53162cd) r3;
            C60492pZ r1 = r32.A00;
            r1.A07 = !r1.A07;
            r32.A01 = false;
            ((AbstractC48612Mz) r32).A00 = 1.0f;
            view.invalidate();
        } else if (!(r3 instanceof C53132ca)) {
            AnonymousClass2cY r33 = (AnonymousClass2cY) r3;
            C60482pY r12 = r33.A00;
            r12.A0A = Boolean.valueOf(!r12.A0A.booleanValue());
            r33.A01 = false;
            ((AbstractC48612Mz) r33).A00 = 1.0f;
            view.invalidate();
        } else {
            C53132ca r34 = (C53132ca) r3;
            C59452nh r13 = r34.A00;
            r13.A01 = Boolean.valueOf(!r13.A01.booleanValue());
            r34.A01 = false;
            ((AbstractC48612Mz) r34).A00 = 1.0f;
            view.invalidate();
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        AbstractC48612Mz r1 = this.A01;
        r1.A01 = true;
        r1.A00 = -1.0f;
    }
}
