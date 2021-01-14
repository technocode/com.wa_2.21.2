package com.google.android.exoplayer2.ui;

import X.AnonymousClass0W2;
import X.AnonymousClass154;
import X.C002001d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class DefaultTimeBar extends View {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Paint A0G = new Paint();
    public final Paint A0H = new Paint();
    public final Paint A0I = new Paint();
    public final Paint A0J = new Paint();
    public final Paint A0K;
    public final Paint A0L = new Paint();
    public final Point A0M;
    public final Rect A0N = new Rect();
    public final Rect A0O = new Rect();
    public final Rect A0P = new Rect();
    public final Rect A0Q = new Rect();
    public final Drawable A0R;
    public final Runnable A0S;
    public final StringBuilder A0T;
    public final Formatter A0U;
    public final CopyOnWriteArraySet A0V;
    public final int[] A0W;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.A0K = paint;
        paint.setAntiAlias(true);
        this.A0V = new CopyOnWriteArraySet();
        this.A0W = new int[2];
        this.A0M = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.A0A = (int) ((((float) -50) * f) + 0.5f);
        int i = (int) ((((float) 4) * f) + 0.5f);
        int i2 = (int) ((((float) 26) * f) + 0.5f);
        int i3 = (int) ((((float) 12) * f) + 0.5f);
        int i4 = (int) ((((float) 0) * f) + 0.5f);
        int i5 = (int) ((((float) 16) * f) + 0.5f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass154.A01, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(9);
                this.A0R = drawable;
                if (drawable != null) {
                    int i6 = AnonymousClass0W2.A00;
                    if (i6 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i6 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    i2 = Math.max(this.A0R.getMinimumHeight(), i2);
                }
                this.A09 = obtainStyledAttributes.getDimensionPixelSize(2, i);
                this.A0F = obtainStyledAttributes.getDimensionPixelSize(11, i2);
                this.A08 = obtainStyledAttributes.getDimensionPixelSize(1, i);
                this.A0D = obtainStyledAttributes.getDimensionPixelSize(10, i3);
                this.A0B = obtainStyledAttributes.getDimensionPixelSize(7, i4);
                this.A0C = obtainStyledAttributes.getDimensionPixelSize(8, i5);
                int i7 = obtainStyledAttributes.getInt(5, -1);
                int i8 = obtainStyledAttributes.getInt(6, -16777216 | i7);
                int i9 = i7 & 16777215;
                int i10 = obtainStyledAttributes.getInt(3, -872415232 | i9);
                int i11 = obtainStyledAttributes.getInt(12, i9 | 855638016);
                int i12 = obtainStyledAttributes.getInt(0, -1291845888);
                int i13 = obtainStyledAttributes.getInt(4, (16777215 & i12) | 855638016);
                this.A0J.setColor(i7);
                this.A0K.setColor(i8);
                this.A0H.setColor(i10);
                this.A0L.setColor(i11);
                this.A0G.setColor(i12);
                this.A0I.setColor(i13);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.A09 = i;
            this.A0F = i2;
            this.A08 = i;
            this.A0D = i3;
            this.A0B = i4;
            this.A0C = i5;
            this.A0J.setColor(-1);
            this.A0K.setColor(-1);
            this.A0H.setColor(-855638017);
            this.A0L.setColor(872415231);
            this.A0G.setColor(-1291845888);
            this.A0R = null;
        }
        StringBuilder sb = new StringBuilder();
        this.A0T = sb;
        this.A0U = new Formatter(sb, Locale.getDefault());
        this.A0S = new RunnableEBaseShape5S0100000_I1_0(this, 39);
        Drawable drawable2 = this.A0R;
        if (drawable2 != null) {
            this.A0E = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.A0E = (Math.max(this.A0B, Math.max(this.A0D, this.A0C)) + 1) / 2;
        }
        this.A03 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A00 = 20;
        setFocusable(true);
        if (AnonymousClass0W2.A00 >= 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public final void A00() {
        this.A07 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.A0V.iterator();
        if (it.hasNext()) {
            it.next();
            getScrubberPosition();
            throw null;
        }
    }

    public final void A01() {
        this.A07 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.A0V.iterator();
        if (it.hasNext()) {
            it.next();
            getScrubberPosition();
            throw null;
        }
    }

    public final void A02() {
        long j;
        Rect rect = this.A0N;
        Rect rect2 = this.A0O;
        rect.set(rect2);
        Rect rect3 = this.A0P;
        rect3.set(rect2);
        if (this.A07) {
            j = this.A06;
        } else {
            j = this.A05;
        }
        if (this.A03 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.A02) / this.A03)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.A03)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.A0Q);
    }

    public final void A03(float f) {
        Rect rect = this.A0P;
        Rect rect2 = this.A0O;
        rect.right = Math.max(rect2.left, Math.min((int) f, rect2.right));
    }

    public final boolean A04(long j) {
        if (this.A03 <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long max = Math.max(0L, Math.min(scrubberPosition + j, this.A03));
        this.A06 = max;
        if (max == scrubberPosition) {
            return false;
        }
        if (!this.A07) {
            A00();
        }
        Iterator it = this.A0V.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        A02();
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0R;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private long getPositionIncrement() {
        long j = this.A04;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.A03;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return j2 / ((long) this.A00);
    }

    private String getProgressText() {
        StringBuilder sb = this.A0T;
        Formatter formatter = this.A0U;
        long j = this.A05;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        if (j5 > 0) {
            return formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString();
        }
        return formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    private long getScrubberPosition() {
        Rect rect = this.A0O;
        if (rect.width() <= 0 || this.A03 == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.A0P.width()) * this.A03) / ((long) rect.width());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0R;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.A0O;
        int height = rect.height();
        int centerY = rect.centerY() - (height >> 1);
        int i2 = height + centerY;
        if (this.A03 <= 0) {
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i2, this.A0L);
        } else {
            Rect rect2 = this.A0N;
            int i3 = rect2.left;
            int i4 = rect2.right;
            int max = Math.max(rect.left, i4);
            Rect rect3 = this.A0P;
            int max2 = Math.max(max, rect3.right);
            int i5 = rect.right;
            if (max2 < i5) {
                canvas.drawRect((float) max2, (float) centerY, (float) i5, (float) i2, this.A0L);
            }
            int max3 = Math.max(i3, rect3.right);
            if (i4 > max3) {
                canvas.drawRect((float) max3, (float) centerY, (float) i4, (float) i2, this.A0H);
            }
            if (rect3.width() > 0) {
                canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i2, this.A0J);
            }
        }
        if (this.A03 > 0) {
            Rect rect4 = this.A0P;
            int max4 = Math.max(rect4.left, Math.min(rect4.right, rect.right));
            int centerY2 = rect4.centerY();
            Drawable drawable = this.A0R;
            if (drawable == null) {
                if (this.A07 || isFocused()) {
                    i = this.A0C;
                } else if (isEnabled()) {
                    i = this.A0D;
                } else {
                    i = this.A0B;
                }
                canvas.drawCircle((float) max4, (float) centerY2, (float) (i >> 1), this.A0K);
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth() >> 1;
                int intrinsicHeight = drawable.getIntrinsicHeight() >> 1;
                drawable.setBounds(max4 - intrinsicWidth, centerY2 - intrinsicHeight, max4 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.A03 > 0) {
            int i = AnonymousClass0W2.A00;
            if (i >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else if (i >= 16) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0012
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0029
            switch(r5) {
                case 21: goto L_0x0017;
                case 22: goto L_0x0018;
                case 23: goto L_0x0029;
                default: goto L_0x0012;
            }
        L_0x0012:
            boolean r0 = super.onKeyDown(r5, r6)
            return r0
        L_0x0017:
            long r0 = -r0
        L_0x0018:
            boolean r0 = r4.A04(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Runnable r2 = r4.A0S
            r4.removeCallbacks(r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r2, r0)
            return r3
        L_0x0029:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0012
            java.lang.Runnable r0 = r4.A0S
            r4.removeCallbacks(r0)
            r0.run()
            return r3
            switch-data {21->0x0017, 22->0x0018, 23->0x0029, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.A0F;
        int i6 = ((i4 - i2) - i5) >> 1;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i7 = this.A09;
        int i8 = ((i5 - i7) / 2) + i6;
        Rect rect = this.A0Q;
        rect.set(paddingLeft, i6, paddingRight, i5 + i6);
        Rect rect2 = this.A0O;
        int i9 = rect.left;
        int i10 = this.A0E;
        rect2.set(i9 + i10, i8, rect.right - i10, i7 + i8);
        A02();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.A0F;
        } else if (mode != 1073741824) {
            size = Math.min(this.A0F, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.A0R;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.A0R;
        if (drawable != null && AnonymousClass0W2.A00 >= 23 && drawable.setLayoutDirection(i)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r2 != 3) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.A03 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (A04(-getPositionIncrement())) {
                A01();
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (A04(getPositionIncrement())) {
                A01();
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.A0G.setColor(i);
        invalidate(this.A0Q);
    }

    public void setBufferedColor(int i) {
        this.A0H.setColor(i);
        invalidate(this.A0Q);
    }

    public void setBufferedPosition(long j) {
        this.A02 = j;
        A02();
    }

    public void setDuration(long j) {
        this.A03 = j;
        if (this.A07 && j == -9223372036854775807L) {
            A01();
        }
        A02();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.A07 && !z) {
            A01();
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        C002001d.A39(z);
        this.A00 = i;
        this.A04 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z = false;
        if (j > 0) {
            z = true;
        }
        C002001d.A39(z);
        this.A00 = -1;
        this.A04 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.A0I.setColor(i);
        invalidate(this.A0Q);
    }

    public void setPlayedColor(int i) {
        this.A0J.setColor(i);
        invalidate(this.A0Q);
    }

    public void setPosition(long j) {
        this.A05 = j;
        setContentDescription(getProgressText());
        A02();
    }

    public void setScrubberColor(int i) {
        this.A0K.setColor(i);
        invalidate(this.A0Q);
    }

    public void setUnplayedColor(int i) {
        this.A0L.setColor(i);
        invalidate(this.A0Q);
    }
}
