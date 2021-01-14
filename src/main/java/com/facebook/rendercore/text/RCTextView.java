package com.facebook.rendercore.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class RCTextView extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public Paint A06;
    public Path A07;
    public Layout A08;
    public CharSequence A09;
    public boolean A0A;
    public ImageSpan[] A0B;

    public RCTextView(Context context) {
        super(context);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public final void A00(int i, int i2) {
        if (Color.alpha(this.A01) == 0) {
            return;
        }
        if (this.A04 != i || this.A03 != i2) {
            this.A04 = i;
            this.A03 = i2;
            Paint paint = this.A06;
            if (paint == null) {
                paint = new Paint();
                this.A06 = paint;
            }
            paint.setColor(this.A01);
            this.A0A = true;
            invalidate();
        }
    }

    public void draw(Canvas canvas) {
        int save;
        boolean z;
        super.draw(canvas);
        if (this.A08 != null) {
            if (this.A00 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                save = 0;
                z = false;
            } else {
                save = canvas.save();
                canvas.translate(0.0f, this.A00);
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                z = true;
            }
            this.A08.draw(canvas, getSelectionPath(), this.A06, 0);
            if (z) {
                canvas.restoreToCount(save);
            }
        }
    }

    private Path getSelectionPath() {
        if (this.A04 == this.A03 || Color.alpha(this.A01) == 0) {
            return null;
        }
        if (this.A0A) {
            Path path = this.A07;
            if (path == null) {
                path = new Path();
                this.A07 = path;
            }
            this.A08.getSelectionPath(this.A04, this.A03, path);
            this.A0A = false;
        }
        return this.A07;
    }

    public CharSequence getText() {
        return this.A09;
    }

    private CharSequence getTextForAccessibility() {
        CharSequence charSequence = this.A09;
        if (charSequence == null || charSequence.length() < 1000000) {
            return this.A09;
        }
        if (!Character.isHighSurrogate(this.A09.charAt(999999)) || !Character.isLowSurrogate(this.A09.charAt(1000000))) {
            return this.A09.subSequence(0, 1000000);
        }
        return this.A09.subSequence(0, 999999);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence textForAccessibility = getTextForAccessibility();
        if (!TextUtils.isEmpty(textForAccessibility)) {
            accessibilityNodeInfo.setText(textForAccessibility);
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            accessibilityNodeInfo.addAction(131072);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!TextUtils.isEmpty(this.A09)) {
            accessibilityEvent.getText().add(getTextForAccessibility());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float paragraphLeft;
        float lineMax;
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            A00(0, 0);
            return false;
        }
        int x = (int) motionEvent.getX();
        int lineForVertical = this.A08.getLineForVertical((int) motionEvent.getY());
        int i = -1;
        if (this.A08.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            paragraphLeft = this.A08.getLineLeft(lineForVertical);
            lineMax = this.A08.getLineRight(lineForVertical);
        } else {
            boolean z = false;
            if (this.A08.getParagraphDirection(lineForVertical) == -1) {
                z = true;
            }
            Layout layout = this.A08;
            if (z) {
                paragraphLeft = ((float) layout.getWidth()) - this.A08.getLineMax(lineForVertical);
                lineMax = (float) this.A08.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = (float) layout.getParagraphLeft(lineForVertical);
                lineMax = this.A08.getLineMax(lineForVertical);
            }
        }
        float f = (float) x;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                i = this.A08.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        CharSequence charSequence = this.A09;
        if (!(charSequence instanceof Spanned) || i < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(i, i, ClickableSpan.class)) == null || clickableSpanArr.length <= 0 || (clickableSpan = clickableSpanArr[0]) == null) {
            A00(0, 0);
            return super.onTouchEvent(motionEvent);
        }
        if (actionMasked == 1) {
            A00(0, 0);
            clickableSpan.onClick(this);
        } else if (actionMasked == 0) {
            setSelection(clickableSpan);
            return true;
        }
        return true;
    }

    private void setSelection(ClickableSpan clickableSpan) {
        Spanned spanned = (Spanned) this.A09;
        A00(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }
}
