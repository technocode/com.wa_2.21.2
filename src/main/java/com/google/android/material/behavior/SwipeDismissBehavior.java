package com.google.android.material.behavior;

import X.AbstractC07570Yg;
import X.AbstractC15250nk;
import X.AnonymousClass1DF;
import X.C15260nl;
import X.C36691mg;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior extends AbstractC07570Yg {
    public float A00 = 0.5f;
    public float A01 = 0.0f;
    public float A02 = 0.5f;
    public int A03 = 2;
    public C15260nl A04;
    public AnonymousClass1DF A05;
    public boolean A06;
    public final AbstractC15250nk A07 = new C36691mg(this);

    @Override // X.AbstractC07570Yg
    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.A06;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A06 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A06 = false;
        }
        if (!z) {
            return false;
        }
        C15260nl r2 = this.A04;
        if (r2 == null) {
            r2 = new C15260nl(coordinatorLayout.getContext(), coordinatorLayout, this.A07);
            this.A04 = r2;
        }
        return r2.A0G(motionEvent);
    }

    @Override // X.AbstractC07570Yg
    public boolean A06(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C15260nl r0 = this.A04;
        if (r0 == null) {
            return false;
        }
        r0.A08(motionEvent);
        return true;
    }
}
