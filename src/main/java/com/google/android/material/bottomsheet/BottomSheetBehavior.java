package com.google.android.material.bottomsheet;

import X.AbstractC07570Yg;
import X.AbstractC15250nk;
import X.AnonymousClass008;
import X.AnonymousClass0Q7;
import X.AnonymousClass1DH;
import X.C08030aM;
import X.C14270lr;
import X.C15260nl;
import X.C36701mj;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends AbstractC07570Yg {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = 4;
    public VelocityTracker A0C;
    public C15260nl A0D;
    public AnonymousClass1DH A0E;
    public WeakReference A0F;
    public WeakReference A0G;
    public Map A0H;
    public boolean A0I = true;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final AbstractC15250nk A0P = new C36701mj(this);

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08030aM.A0G);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            A0C(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            A0C(i2);
        }
        this.A0J = obtainStyledAttributes.getBoolean(1, false);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        if (this.A0I != z) {
            this.A0I = z;
            if (this.A0G != null) {
                A09();
            }
            if (!z || this.A0B != 6) {
                i = this.A0B;
            } else {
                i = 3;
            }
            A0B(i);
        }
        this.A0N = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.A00 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static BottomSheetBehavior A00(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C14270lr) {
            AbstractC07570Yg r1 = ((C14270lr) layoutParams).A0A;
            if (r1 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) r1;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @Override // X.AbstractC07570Yg
    public void A03(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int i2;
        float yVelocity;
        int top = view.getTop();
        if (this.A0I) {
            i2 = this.A03;
        } else {
            i2 = 0;
        }
        int i3 = 3;
        if (top == i2) {
            A0B(3);
        } else if (view2 == this.A0F.get() && this.A0L) {
            if (this.A06 <= 0) {
                if (this.A0J) {
                    VelocityTracker velocityTracker = this.A0C;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A00);
                        yVelocity = this.A0C.getYVelocity(this.A01);
                    }
                    if (A0G(view, yVelocity)) {
                        i2 = this.A08;
                        i3 = 5;
                    }
                }
                if (this.A06 == 0) {
                    int top2 = view.getTop();
                    if (this.A0I) {
                        int i4 = this.A03;
                        int abs = Math.abs(top2 - i4);
                        i2 = this.A02;
                        if (abs < Math.abs(top2 - i2)) {
                            i2 = i4;
                        }
                    } else {
                        int i5 = this.A04;
                        if (top2 < i5) {
                            i2 = i5;
                            if (top2 < Math.abs(top2 - this.A02)) {
                                i2 = 0;
                            }
                        } else {
                            int abs2 = Math.abs(top2 - i5);
                            i2 = this.A02;
                            if (abs2 < Math.abs(top2 - i2)) {
                                i2 = i5;
                            }
                        }
                        i3 = 6;
                    }
                } else {
                    i2 = this.A02;
                }
                i3 = 4;
            }
            if (this.A0D.A0J(view, view.getLeft(), i2)) {
                A0B(2);
                view.postOnAnimation(new RunnableEBaseShape0S0201000_I0(this, view, i3, 3));
            } else {
                A0B(i3);
            }
            this.A0L = false;
        }
    }

    @Override // X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.A0B(view, i);
        this.A08 = coordinatorLayout.getHeight();
        if (this.A0M) {
            int i2 = this.A0A;
            if (i2 == 0) {
                i2 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
                this.A0A = i2;
            }
            this.A07 = Math.max(i2, this.A08 - ((coordinatorLayout.getWidth() * 9) >> 4));
        } else {
            this.A07 = this.A09;
        }
        int max = Math.max(0, this.A08 - view.getHeight());
        this.A03 = max;
        int i3 = this.A08;
        int i4 = i3 / 2;
        this.A04 = i4;
        A09();
        int i5 = this.A0B;
        if (i5 == 3) {
            int i6 = 0;
            if (this.A0I) {
                i6 = max;
            }
            AnonymousClass0Q7.A0U(view, i6);
        } else if (i5 == 6) {
            AnonymousClass0Q7.A0U(view, i4);
        } else if (this.A0J && i5 == 5) {
            AnonymousClass0Q7.A0U(view, i3);
        } else if (i5 == 4) {
            AnonymousClass0Q7.A0U(view, this.A02);
        } else if (i5 == 1 || i5 == 2) {
            AnonymousClass0Q7.A0U(view, top - view.getTop());
        }
        if (this.A0D == null) {
            this.A0D = new C15260nl(coordinatorLayout.getContext(), coordinatorLayout, this.A0P);
        }
        this.A0G = new WeakReference(view);
        this.A0F = new WeakReference(A08(view));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0081, code lost:
        if (r9.A0H(r10, r1, r8.A05) != false) goto L_0x0083;
     */
    @Override // X.AbstractC07570Yg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A05(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.AbstractC07570Yg
    public boolean A06(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A0B == 1 && actionMasked == 0) {
            return true;
        }
        C15260nl r0 = this.A0D;
        if (r0 != null) {
            r0.A08(motionEvent);
        }
        if (actionMasked == 0) {
            this.A01 = -1;
            VelocityTracker velocityTracker = this.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0C = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A0C;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A0C = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (actionMasked == 2 && !this.A0K) {
            float abs = Math.abs(((float) this.A05) - motionEvent.getY());
            C15260nl r1 = this.A0D;
            if (abs > ((float) r1.A06)) {
                r1.A0A(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0K;
    }

    public final int A07() {
        if (this.A0M) {
            return -1;
        }
        return this.A09;
    }

    public View A08(View view) {
        if (AnonymousClass0Q7.A0k(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View A082 = A08(viewGroup.getChildAt(i));
            if (A082 != null) {
                return A082;
            }
        }
        return null;
    }

    public final void A09() {
        if (this.A0I) {
            this.A02 = Math.max(this.A08 - this.A07, this.A03);
        } else {
            this.A02 = this.A08 - this.A07;
        }
    }

    public void A0A(int i) {
        AnonymousClass1DH r3;
        int i2;
        View view = (View) this.A0G.get();
        if (view != null && (r3 = this.A0E) != null) {
            int i3 = this.A02;
            if (i > i3) {
                r3.A00(view, ((float) (i3 - i)) / ((float) (this.A08 - i3)));
                return;
            }
            float f = (float) (i3 - i);
            if (this.A0I) {
                i2 = this.A03;
            } else {
                i2 = 0;
            }
            r3.A00(view, f / ((float) (i3 - i2)));
        }
    }

    public void A0B(int i) {
        AnonymousClass1DH r0;
        if (this.A0B != i) {
            this.A0B = i;
            if (i == 6 || i == 3) {
                A0F(true);
            } else if (i == 5 || i == 4) {
                A0F(false);
            }
            View view = (View) this.A0G.get();
            if (view != null && (r0 = this.A0E) != null) {
                r0.A01(view, i);
            }
        }
    }

    public final void A0C(int i) {
        WeakReference weakReference;
        View view;
        if (i == -1) {
            if (!this.A0M) {
                this.A0M = true;
            } else {
                return;
            }
        } else if (this.A0M || this.A09 != i) {
            this.A0M = false;
            this.A09 = Math.max(0, i);
            this.A02 = this.A08 - i;
        } else {
            return;
        }
        if (this.A0B == 4 && (weakReference = this.A0G) != null && (view = (View) weakReference.get()) != null) {
            view.requestLayout();
        }
    }

    public final void A0D(int i) {
        if (i != this.A0B) {
            WeakReference weakReference = this.A0G;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !AnonymousClass0Q7.A0i(view)) {
                        A0E(view, i);
                    } else {
                        view.post(new RunnableEBaseShape0S0201000_I0(this, view, i, 2));
                    }
                }
            } else if (i == 4 || i == 3 || i == 6 || (this.A0J && i == 5)) {
                this.A0B = i;
            }
        }
    }

    public void A0E(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.A02;
        } else if (i == 6) {
            i2 = this.A04;
            if (this.A0I && i2 <= (i3 = this.A03)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = this.A0I ? this.A03 : 0;
        } else if (!this.A0J || i != 5) {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Illegal state argument: ", i));
        } else {
            i2 = this.A08;
        }
        if (this.A0D.A0J(view, view.getLeft(), i2)) {
            A0B(2);
            view.postOnAnimation(new RunnableEBaseShape0S0201000_I0(this, view, i, 3));
            return;
        }
        A0B(i);
    }

    public final void A0F(boolean z) {
        WeakReference weakReference = this.A0G;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int childCount = viewGroup.getChildCount();
                if (z) {
                    if (this.A0H == null) {
                        this.A0H = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != this.A0G.get()) {
                        Map map = this.A0H;
                        if (z) {
                            map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            AnonymousClass0Q7.A0W(childAt, 4);
                        } else if (map != null && map.containsKey(childAt)) {
                            AnonymousClass0Q7.A0W(childAt, ((Number) this.A0H.get(childAt)).intValue());
                        }
                    }
                }
                if (!z) {
                    this.A0H = null;
                }
            }
        }
    }

    public boolean A0G(View view, float f) {
        if (this.A0N) {
            return true;
        }
        if (view.getTop() < this.A02) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.A02)) / ((float) this.A09) <= 0.5f) {
            return false;
        }
        return true;
    }
}
