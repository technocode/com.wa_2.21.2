package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.AnonymousClass27I;
import X.C002001d;
import X.C06140Ry;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.search.verification.client.R;

public class ClearableEditText extends TextInputEditText implements View.OnTouchListener, TextWatcher {
    public Drawable A00;
    public View.OnClickListener A01;
    public boolean A02;
    public boolean A03;
    public boolean A04 = true;
    public final Rect A05 = new Rect();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = R.drawable.ic_backup_cancel;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A0V);
            this.A03 = obtainStyledAttributes.getBoolean(1, false);
            this.A04 = obtainStyledAttributes.getBoolean(3, true);
            this.A02 = obtainStyledAttributes.getBoolean(0, false);
            i = obtainStyledAttributes.getResourceId(2, R.drawable.ic_backup_cancel);
            obtainStyledAttributes.recycle();
        }
        this.A00 = C002001d.A0c(getResources(), i, null);
        setOnTouchListener(this);
        addTextChangedListener(this);
        AnonymousClass0Q7.A0d(this, new AnonymousClass27I(this, this));
    }

    public final void A00(Editable editable) {
        if (this.A02 || (!TextUtils.isEmpty(editable) && isFocusable() && isEnabled())) {
            if (this.A00 != null) {
                boolean z = this.A06.A02().A06;
                Drawable drawable = this.A00;
                if (z) {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        } else if (getClearIconDrawable() != null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void afterTextChanged(Editable editable) {
        A00(editable);
    }

    public static Rect getClearBounds(ClearableEditText clearableEditText) {
        int width;
        int width2;
        Drawable clearIconDrawable = clearableEditText.getClearIconDrawable();
        if (clearIconDrawable == null) {
            return new Rect();
        }
        AnonymousClass01X r2 = clearableEditText.A06;
        if (r2.A02().A06) {
            width = 0;
        } else {
            width = (clearableEditText.getWidth() - clearableEditText.getPaddingRight()) - clearIconDrawable.getIntrinsicWidth();
        }
        if (r2.A02().A06) {
            width2 = clearIconDrawable.getIntrinsicWidth() + clearableEditText.getPaddingLeft();
        } else {
            width2 = clearableEditText.getWidth();
        }
        int bottom = ((clearableEditText.getBottom() - clearableEditText.getTop()) >> 1) - (clearIconDrawable.getIntrinsicHeight() >> 1);
        int bottom2 = (clearableEditText.getBottom() - clearableEditText.getTop()) >> 1;
        Rect rect = clearableEditText.A05;
        rect.left = width;
        rect.right = width2;
        rect.top = bottom;
        rect.bottom = (clearIconDrawable.getIntrinsicHeight() >> 1) + bottom2;
        return rect;
    }

    public Drawable getClearIconDrawable() {
        boolean z = this.A06.A02().A06;
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (z) {
            return compoundDrawables[0];
        }
        return compoundDrawables[2];
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.A03 && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getClearIconDrawable() == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() != 1) {
            return false;
        }
        Rect clearBounds = getClearBounds(this);
        if (x < clearBounds.left || x > clearBounds.right || y < clearBounds.top || y > clearBounds.bottom) {
            return false;
        }
        View.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        setText("");
        requestFocus();
        return this.A04;
    }

    public void setAlwaysShowClearIcon(boolean z) {
        if (z != this.A02) {
            this.A02 = z;
            invalidate();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        A00(getText());
    }

    public void setOnClearIconClickedListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }
}
