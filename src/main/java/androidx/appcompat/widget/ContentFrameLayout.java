package androidx.appcompat.widget;

import X.AnonymousClass0MW;
import X.AnonymousClass0T4;
import X.AnonymousClass0T6;
import X.AnonymousClass0T7;
import X.AnonymousClass0T8;
import X.C06330Su;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    public TypedValue A00;
    public TypedValue A01;
    public TypedValue A02;
    public TypedValue A03;
    public TypedValue A04;
    public TypedValue A05;
    public AnonymousClass0T7 A06;
    public final Rect A07 = new Rect();

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void A00(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        TypedValue typedValue = this.A00;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A00 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedHeightMinor() {
        TypedValue typedValue = this.A01;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A01 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedWidthMajor() {
        TypedValue typedValue = this.A02;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A02 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedWidthMinor() {
        TypedValue typedValue = this.A03;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A03 = typedValue2;
        return typedValue2;
    }

    public TypedValue getMinWidthMajor() {
        TypedValue typedValue = this.A04;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A04 = typedValue2;
        return typedValue2;
    }

    public TypedValue getMinWidthMinor() {
        TypedValue typedValue = this.A05;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A05 = typedValue2;
        return typedValue2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass0T7 r0 = this.A06;
        if (r0 != null) {
            AnonymousClass0MW r2 = ((AnonymousClass0T6) r0).A00;
            AnonymousClass0T4 r02 = r2.A0L;
            if (r02 != null) {
                r02.A3p();
            }
            if (r2.A09 != null) {
                r2.A08.getDecorView().removeCallbacks(r2.A0O);
                if (r2.A09.isShowing()) {
                    try {
                        r2.A09.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                r2.A09 = null;
            }
            C06330Su r03 = r2.A0M;
            if (r03 != null) {
                r03.A00();
            }
            AnonymousClass0T8 r1 = r2.A0K(0).A0A;
            if (r1 != null) {
                r1.A0F(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(AnonymousClass0T7 r1) {
        this.A06 = r1;
    }
}
