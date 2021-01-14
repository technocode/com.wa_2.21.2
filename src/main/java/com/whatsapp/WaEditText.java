package com.whatsapp;

import X.AbstractC27141Og;
import X.AnonymousClass01X;
import X.C003701u;
import X.C06140Ry;
import X.C07670Zb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

public class WaEditText extends C07670Zb {
    public Rect A00;
    public AbstractC27141Og A01;
    public boolean A02;
    public final Runnable A03 = new RunnableEBaseShape6S0100000_I1_1(this, 4);

    public WaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null && !isInEditMode()) {
            AnonymousClass01X A002 = AnonymousClass01X.A00();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A23);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(A002.A06(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(A002.A06(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(A002.A06(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(A002.A06(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void A00() {
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            this.A02 = false;
            removeCallbacks(this.A03);
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
            return;
        }
        throw null;
    }

    public void A01(boolean z) {
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager.isFullscreenMode() && !z) {
                return;
            }
            if (inputMethodManager.isActive(this)) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            requestFocus();
            this.A02 = true;
            return;
        }
        throw null;
    }

    public boolean A02(Point point) {
        int i;
        Rect rect = this.A00;
        if (rect == null) {
            return true;
        }
        int i2 = point.x;
        return i2 >= rect.left && i2 <= rect.right && (i = point.y) >= rect.top && i <= rect.bottom;
    }

    @Override // X.C07670Zb
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A02) {
            Runnable runnable = this.A03;
            removeCallbacks(runnable);
            post(runnable);
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(C003701u.A00(getText()));
        }
    }

    public boolean onTextContextMenuItem(int i) {
        AbstractC27141Og r0 = this.A01;
        return (r0 != null && r0.AKw(i)) || super.onTextContextMenuItem(i);
    }

    public void setCursorPosition_internal(int i, int i2) {
        int length = getText().length();
        Selection.setSelection(getText(), Math.min(i, length), Math.min(i2, length));
    }

    public void setOnContextMenuListener(AbstractC27141Og r1) {
        this.A01 = r1;
    }

    public void setSpan_internal(Object obj, int i, int i2, int i3) {
        getText().setSpan(obj, i, Math.min(i2, getText().length()), i3);
    }

    public void setVisibleBounds(Rect rect) {
        this.A00 = rect;
    }
}
