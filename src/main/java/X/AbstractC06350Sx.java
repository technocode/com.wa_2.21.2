package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Sx  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06350Sx extends ViewGroup {
    public int A00;
    public AnonymousClass23R A01;
    public ActionMenuView A02;
    public C06330Su A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final AnonymousClass1ZZ A07 = new AnonymousClass1ZZ(this);

    public abstract void setContentHeight(int i);

    public AbstractC06350Sx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.A06 = context;
        } else {
            this.A06 = new ContextThemeWrapper(context, i2);
        }
    }

    public static int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public C06330Su A03(int i, long j) {
        C06330Su r0 = this.A03;
        if (r0 != null) {
            r0.A00();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C06330Su A0E = AnonymousClass0Q7.A0E(this);
            A0E.A02(1.0f);
            A0E.A04(j);
            AnonymousClass1ZZ r1 = this.A07;
            r1.A02.A03 = A0E;
            r1.A00 = i;
            View view = (View) A0E.A01.get();
            if (view != null) {
                A0E.A05(view, r1);
            }
            return A0E;
        }
        C06330Su A0E2 = AnonymousClass0Q7.A0E(this);
        A0E2.A02(0.0f);
        A0E2.A04(j);
        AnonymousClass1ZZ r12 = this.A07;
        r12.A02.A03 = A0E2;
        r12.A00 = i;
        View view2 = (View) A0E2.A01.get();
        if (view2 != null) {
            A0E2.A05(view2, r12);
        }
        return A0E2;
    }

    public int getAnimatedVisibility() {
        if (this.A03 != null) {
            return this.A07.A00;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.A00;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AnonymousClass0T3.A00, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        AnonymousClass23R r4 = this.A01;
        if (r4 != null) {
            Configuration configuration2 = ((AnonymousClass1ZO) r4).A02.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = 2;
                if (i2 >= 360) {
                    i = 3;
                }
            }
            r4.A01 = i;
            AnonymousClass0T8 r1 = ((AnonymousClass1ZO) r4).A05;
            if (r1 != null) {
                r1.A0E(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A04 = false;
        }
        if (!this.A04) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A04 = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A04 = false;
            return true;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A05 = false;
        }
        if (!this.A05) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A05 = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A05 = false;
            return true;
        }
        return true;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C06330Su r0 = this.A03;
            if (r0 != null) {
                r0.A00();
            }
            super.setVisibility(i);
        }
    }
}
