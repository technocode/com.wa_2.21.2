package com.whatsapp.gesture;

import X.AbstractC07570Yg;
import X.AbstractC15250nk;
import X.AnonymousClass0Q7;
import X.AnonymousClass2PS;
import X.C15260nl;
import X.C54282ee;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.ref.WeakReference;

public class VerticalSwipeDismissBehavior extends AbstractC07570Yg {
    public float A00 = 0.2f;
    public float A01;
    public float A02 = 0.0f;
    public int A03;
    public VelocityTracker A04;
    public C15260nl A05;
    public AnonymousClass2PS A06;
    public WeakReference A07;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AbstractC15250nk A0D = new C54282ee(this);

    public VerticalSwipeDismissBehavior(Context context) {
        this.A01 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // X.AbstractC07570Yg
    public void A03(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        WeakReference weakReference = this.A07;
        if (weakReference != null && view2 == weakReference.get() && this.A0A) {
            VelocityTracker velocityTracker = this.A04;
            if (velocityTracker == null) {
                yVelocity = 0.0f;
            } else {
                velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A01);
                yVelocity = this.A04.getYVelocity(this.A03);
            }
            if (A08(view, yVelocity, 0)) {
                this.A06.AF9(view);
            } else if (this.A05.A0J(view, view.getLeft(), 0)) {
                view.postOnAnimation(new RunnableEBaseShape1S0210000_I1(this, view, false, 5));
            }
            this.A0A = false;
        }
    }

    @Override // X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        int top = view.getTop();
        coordinatorLayout.A0B(view, i);
        if (this.A0A) {
            AnonymousClass0Q7.A0U(view, top - view.getTop());
        }
        this.A07 = new WeakReference(A07(view));
        return true;
    }

    @Override // X.AbstractC07570Yg
    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A04;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A04 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A04;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A04 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        boolean z = this.A09;
        if (actionMasked == 0) {
            z = coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A09 = z;
            WeakReference weakReference = this.A07;
            if (!(weakReference == null || (view2 = (View) weakReference.get()) == null || !coordinatorLayout.A0H(view2, (int) motionEvent.getX(), (int) motionEvent.getY()))) {
                this.A03 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.A0C = true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A0C = false;
            this.A09 = false;
            this.A03 = -1;
        }
        if (!z) {
            return false;
        }
        C15260nl r2 = this.A05;
        if (r2 == null) {
            if (this.A0B) {
                float f = this.A02;
                r2 = new C15260nl(coordinatorLayout.getContext(), coordinatorLayout, this.A0D);
                r2.A06 = (int) ((1.0f / f) * ((float) r2.A06));
            } else {
                r2 = new C15260nl(coordinatorLayout.getContext(), coordinatorLayout, this.A0D);
            }
            this.A05 = r2;
        }
        return r2.A0G(motionEvent);
    }

    @Override // X.AbstractC07570Yg
    public boolean A06(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A04;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A04 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A04;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A04 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        C15260nl r0 = this.A05;
        if (r0 == null) {
            return false;
        }
        r0.A08(motionEvent);
        return true;
    }

    public final View A07(View view) {
        if (AnonymousClass0Q7.A0k(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View A072 = A07(viewGroup.getChildAt(i));
            if (A072 != null) {
                return A072;
            }
        }
        return null;
    }

    public final boolean A08(View view, float f, int i) {
        if (Math.abs(f) <= ((float) (view.getHeight() << 1)) && Math.abs(view.getTop() - i) < Math.round(((float) view.getHeight()) * 0.2f)) {
            return false;
        }
        return true;
    }
}
