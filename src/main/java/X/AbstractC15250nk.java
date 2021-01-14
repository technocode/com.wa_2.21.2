package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.whatsapp.voipcalling.CallResponseLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.0nk  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC15250nk {
    public int A00(View view) {
        if (!(this instanceof C36691mg)) {
            return 0;
        }
        return view.getWidth();
    }

    public int A01(View view) {
        if (this instanceof C54282ee) {
            return view.getHeight();
        }
        if (!(this instanceof C36701mj)) {
            return 0;
        }
        BottomSheetBehavior bottomSheetBehavior = ((C36701mj) this).A00;
        if (bottomSheetBehavior.A0J) {
            return bottomSheetBehavior.A08;
        }
        return bottomSheetBehavior.A02;
    }

    public int A02(View view, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this instanceof AnonymousClass3TZ) {
            return view.getLeft();
        }
        if (this instanceof C54282ee) {
            return view.getLeft();
        }
        if (this instanceof C36701mj) {
            return view.getLeft();
        }
        C36691mg r3 = (C36691mg) this;
        boolean z = false;
        if (AnonymousClass0Q7.A05(view) == 1) {
            z = true;
        }
        int i6 = r3.A02.A03;
        if (i6 == 0) {
            if (z) {
                i3 = r3.A01 - view.getWidth();
                i5 = r3.A01;
            } else {
                i3 = r3.A01;
                i4 = view.getWidth();
                i5 = i4 + i3;
            }
        } else if (i6 != 1) {
            i3 = r3.A01 - view.getWidth();
            i5 = view.getWidth() + r3.A01;
        } else if (z) {
            i3 = r3.A01;
            i4 = view.getWidth();
            i5 = i4 + i3;
        } else {
            i3 = r3.A01 - view.getWidth();
            i5 = r3.A01;
        }
        return Math.min(Math.max(i3, i), i5);
    }

    public int A03(View view, int i, int i2) {
        int i3;
        int i4;
        if (this instanceof AnonymousClass3TZ) {
            CallResponseLayout callResponseLayout = ((AnonymousClass3TZ) this).A02;
            int paddingTop = callResponseLayout.getPaddingTop();
            return Math.min(Math.max(i, paddingTop), callResponseLayout.getHeight() - view.getHeight());
        } else if (this instanceof C54282ee) {
            C54282ee r1 = (C54282ee) this;
            int width = r1.A01 - view.getWidth();
            return Math.min(Math.max(width, i), view.getWidth() + r1.A01);
        } else if (!(this instanceof C36701mj)) {
            return view.getTop();
        } else {
            BottomSheetBehavior bottomSheetBehavior = ((C36701mj) this).A00;
            if (bottomSheetBehavior.A0I) {
                i3 = bottomSheetBehavior.A03;
            } else {
                i3 = 0;
            }
            if (bottomSheetBehavior.A0J) {
                i4 = bottomSheetBehavior.A08;
            } else {
                i4 = bottomSheetBehavior.A02;
            }
            if (i >= i3) {
                i3 = i;
                if (i > i4) {
                    return i4;
                }
            }
            return i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (java.lang.Math.abs(r2) >= java.lang.Math.round(((float) r10.getWidth()) * 0.5f)) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0126, code lost:
        if (r6 < java.lang.Math.abs(r6 - r7.A02)) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0128, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0141, code lost:
        if (r0 > r3) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r10, float r11, float r12) {
        /*
        // Method dump skipped, instructions count: 524
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC15250nk.A04(android.view.View, float, float):void");
    }

    public void A05(View view, int i) {
        if (this instanceof AnonymousClass3TZ) {
            AnonymousClass3TZ r1 = (AnonymousClass3TZ) this;
            r1.A00 = view.getLeft();
            r1.A01 = view.getTop();
            CallResponseLayout callResponseLayout = r1.A02;
            if (callResponseLayout.A05) {
                callResponseLayout.A01.setAnimation(null);
                callResponseLayout.A00.setVisibility(8);
            }
        } else if (this instanceof C54282ee) {
            C54282ee r7 = (C54282ee) this;
            if (r7.A00 == -1) {
                r7.A00 = i;
                r7.A01 = view.getTop();
            }
            ViewParent parent = view.getParent();
            if (parent != null) {
                if (parent instanceof CoordinatorLayout) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        if (((C14270lr) viewGroup.getChildAt(i2).getLayoutParams()).A0A == r7.A02) {
                            return;
                        }
                    }
                }
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (this instanceof C36691mg) {
            C36691mg r12 = (C36691mg) this;
            r12.A00 = i;
            r12.A01 = view.getLeft();
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public void A06(View view, int i, int i2, int i3, int i4) {
        if (this instanceof AnonymousClass3TZ) {
            AnonymousClass3TZ r1 = (AnonymousClass3TZ) this;
            CallResponseLayout callResponseLayout = r1.A02;
            if (!callResponseLayout.A05 && r1.A01 - view.getTop() > callResponseLayout.A02.getScaledTouchSlop() && callResponseLayout.A00.getVisibility() == 0) {
                callResponseLayout.A00.clearAnimation();
                callResponseLayout.A00.setVisibility(4);
            }
        } else if (this instanceof C54282ee) {
            AnonymousClass2PS r3 = ((C54282ee) this).A02.A06;
            if (r3 != null) {
                r3.AKE(view, Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) view.getHeight())));
            }
        } else if (!(this instanceof C36701mj)) {
            C36691mg r32 = (C36691mg) this;
            float f = (float) r32.A01;
            SwipeDismissBehavior swipeDismissBehavior = r32.A02;
            float width = (((float) view.getWidth()) * swipeDismissBehavior.A01) + f;
            float width2 = (((float) view.getWidth()) * swipeDismissBehavior.A00) + ((float) r32.A01);
            float f2 = (float) i;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f2 - width) / (width2 - width))), 1.0f));
            }
        } else {
            ((C36701mj) this).A00.A0A(i2);
        }
    }

    public boolean A07(View view, int i) {
        WeakReference weakReference;
        View view2;
        boolean z;
        if (this instanceof AnonymousClass3TZ) {
            return view == ((AnonymousClass3TZ) this).A02.A01;
        }
        if (this instanceof C54282ee) {
            return !((C54282ee) this).A02.A0C;
        }
        if (!(this instanceof C36701mj)) {
            C36691mg r2 = (C36691mg) this;
            if (r2.A00 == -1) {
                SwipeDismissBehavior swipeDismissBehavior = r2.A02;
                if (!(swipeDismissBehavior instanceof BaseTransientBottomBar$Behavior)) {
                    z = true;
                } else if (((BaseTransientBottomBar$Behavior) swipeDismissBehavior).A00 != null) {
                    z = view instanceof C24941Dq;
                } else {
                    throw null;
                }
                return z;
            }
        }
        BottomSheetBehavior bottomSheetBehavior = ((C36701mj) this).A00;
        int i2 = bottomSheetBehavior.A0B;
        if (i2 == 1 || bottomSheetBehavior.A0O || ((i2 == 3 && bottomSheetBehavior.A01 == i && (view2 = (View) bottomSheetBehavior.A0F.get()) != null && view2.canScrollVertically(-1)) || (weakReference = bottomSheetBehavior.A0G) == null || weakReference.get() != view)) {
            return false;
        }
        return true;
    }
}
