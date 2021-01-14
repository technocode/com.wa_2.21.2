package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.2ZA  reason: invalid class name */
public abstract class AnonymousClass2ZA extends WaFrameLayout {
    public int A00;
    public ValueAnimator A01;
    public View A02;

    public abstract View getContentView();

    public AnonymousClass2ZA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A00() {
        if (this.A02 != null) {
            ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
            layoutParams.width = this.A02.getWidth();
            getContentView().setLayoutParams(layoutParams);
        }
    }

    public void A01(int i) {
        int i2;
        if (i != this.A00) {
            this.A00 = i;
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z = false;
            if (getVisibility() == 0) {
                z = true;
            }
            if (z) {
                i2 = getHeight();
            } else {
                i2 = 0;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
            this.A01 = ofInt;
            ofInt.addUpdateListener(new AnonymousClass2H4(this));
            this.A01.addListener(new AnonymousClass2HP(this, i));
            this.A01.setDuration(250L);
            this.A01.start();
        }
    }

    public void A02(int i, int i2) {
        if (i != 0) {
            int actionBarSize = getActionBarSize();
            Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i3 = point.y;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            ((View) getParent().getParent()).getLocationOnScreen(iArr2);
            double d = (double) i2;
            int min = Math.min(((i3 / 2) - actionBarSize) - ((int) (1.25d * d)), ((getHeight() + iArr[1]) - iArr2[1]) - ((int) (0.6d * d))) / i2;
            if (i > min) {
                i2 = (min * i2) + ((int) (d * 0.5d));
            } else if (i <= 0 || min != 0) {
                i2 *= i;
            }
            if (i2 != 0) {
                A01(i2);
                return;
            }
        }
        if (getVisibility() == 0) {
            A01(0);
        }
    }

    private int getActionBarSize() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16843499});
        try {
            return (int) obtainStyledAttributes.getDimension(0, 0.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.A02 != null && getVisibility() == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2HQ(this));
        }
    }

    public void setAnchorWidthView(View view) {
        this.A02 = view;
        A00();
    }
}
