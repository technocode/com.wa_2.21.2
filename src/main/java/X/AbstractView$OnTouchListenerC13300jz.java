package X;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0jz  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractView$OnTouchListenerC13300jz implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int A00;
    public Runnable A01;
    public Runnable A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final int[] A08 = new int[2];

    public void onViewAttachedToWindow(View view) {
    }

    public AbstractView$OnTouchListenerC13300jz(View view) {
        this.A07 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A04 = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.A06 = tapTimeout;
        this.A05 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public AbstractC13080jZ A00() {
        AnonymousClass1Za r0;
        if (this instanceof C29611Zp) {
            return ((C29611Zp) this).A00;
        }
        if (!(this instanceof C29521Zc)) {
            AbstractC12970jO r02 = ((AnonymousClass1ZN) this).A00.A04;
            if (r02 == null || (r0 = ((AnonymousClass1Zb) r02).A00.A06) == null) {
                return null;
            }
            return r0.A00();
        }
        C29531Zd r03 = ((C29521Zc) this).A00.A00.A09;
        if (r03 == null) {
            return null;
        }
        return r03.A00();
    }

    public final void A01() {
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.A01;
        if (runnable2 != null) {
            this.A07.removeCallbacks(runnable2);
        }
    }

    public boolean A02() {
        AbstractC13080jZ A002;
        if (this instanceof C29611Zp) {
            AppCompatSpinner appCompatSpinner = ((C29611Zp) this).A01;
            if (appCompatSpinner.A02.ABa()) {
                return true;
            }
            appCompatSpinner.A01();
            return true;
        } else if (!(this instanceof C29521Zc)) {
            AnonymousClass1ZN r3 = (AnonymousClass1ZN) this;
            ActionMenuItemView actionMenuItemView = r3.A00;
            AnonymousClass0TT r2 = actionMenuItemView.A05;
            if (r2 == null || !r2.AAs(actionMenuItemView.A06) || (A002 = r3.A00()) == null || !A002.ABa()) {
                return false;
            }
            return true;
        } else {
            ((C29521Zc) this).A00.A00.A03();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r1 == 3) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r0 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r0 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r1 != 3) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnTouchListenerC13300jz.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewDetachedFromWindow(View view) {
        this.A03 = false;
        this.A00 = -1;
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
    }
}
