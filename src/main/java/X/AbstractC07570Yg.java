package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior;
import com.google.android.material.transformation.ExpandableBehavior;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* renamed from: X.0Yg  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC07570Yg {
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean A06(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public AbstractC07570Yg() {
    }

    public AbstractC07570Yg(Context context, AttributeSet attributeSet) {
    }

    public void A00(C14270lr r2) {
        if (!(this instanceof FabTransformationBehavior)) {
            if ((this instanceof FloatingActionButton$BaseBehavior) && r2.A01 == 0) {
                r2.A01 = 80;
            }
        } else if (r2.A01 == 0) {
            r2.A01 = 80;
        }
    }

    public boolean A01(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this instanceof FabTransformationScrimBehavior) {
            return view2 instanceof C08000aJ;
        }
        if (!(this instanceof FabTransformationBehavior)) {
            if (!(this instanceof AppBarLayout.ScrollingViewBehavior)) {
                return false;
            }
            return view2 instanceof AppBarLayout;
        } else if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof C08000aJ)) {
            return false;
        } else {
            int i = ((C08000aJ) view2).A0F.A00;
            if (i == 0 || i == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public boolean A02(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this instanceof ExpandableBehavior) {
            ExpandableBehavior expandableBehavior = (ExpandableBehavior) this;
            AbstractC08020aL r8 = (AbstractC08020aL) view2;
            boolean AB2 = r8.AB2();
            int i = expandableBehavior.A00;
            if (AB2) {
                if (!(i == 0 || i == 2)) {
                    return false;
                }
            } else if (i != 1) {
                return false;
            }
            int i2 = 2;
            if (AB2) {
                i2 = 1;
            }
            expandableBehavior.A00 = i2;
            return expandableBehavior.A07((View) r8, view, AB2, true);
        } else if (this instanceof FloatingActionButton$BaseBehavior) {
            FloatingActionButton$BaseBehavior floatingActionButton$BaseBehavior = (FloatingActionButton$BaseBehavior) this;
            C08000aJ r7 = (C08000aJ) view;
            if (view2 instanceof AppBarLayout) {
                floatingActionButton$BaseBehavior.A08(coordinatorLayout, (AppBarLayout) view2, r7);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C14270lr) && (((C14270lr) layoutParams).A0A instanceof BottomSheetBehavior)) {
                    floatingActionButton$BaseBehavior.A07(view2, r7);
                    return false;
                }
            }
            return false;
        } else if (!(this instanceof AppBarLayout.ScrollingViewBehavior)) {
            return false;
        } else {
            HeaderScrollingViewBehavior headerScrollingViewBehavior = (HeaderScrollingViewBehavior) this;
            AbstractC07570Yg r2 = ((C14270lr) view2.getLayoutParams()).A0A;
            if (r2 instanceof AppBarLayout.BaseBehavior) {
                AnonymousClass0Q7.A0U(view, (((view2.getBottom() - view.getTop()) + ((AppBarLayout.BaseBehavior) r2).A02) + headerScrollingViewBehavior.A01) - headerScrollingViewBehavior.A07(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.A07) {
                    boolean z = false;
                    if (view.getScrollY() > 0) {
                        z = true;
                    }
                    if (appBarLayout.A09 != z) {
                        appBarLayout.A09 = z;
                        appBarLayout.refreshDrawableState();
                    }
                }
            }
            return false;
        }
    }

    public void A03(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }
}
