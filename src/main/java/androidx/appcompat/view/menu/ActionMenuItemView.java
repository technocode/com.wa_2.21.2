package androidx.appcompat.view.menu;

import X.AbstractC12970jO;
import X.AbstractC13070jY;
import X.AbstractC13140jg;
import X.AbstractView$OnTouchListenerC13300jz;
import X.AnonymousClass0N2;
import X.AnonymousClass0T3;
import X.AnonymousClass0T8;
import X.AnonymousClass0TT;
import X.AnonymousClass1ZN;
import X.AnonymousClass1ZT;
import X.C05560Pe;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ActionMenuItemView extends C05560Pe implements View.OnClickListener, AbstractC13070jY, AbstractC13140jg {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public AbstractC12970jO A04;
    public AnonymousClass0TT A05;
    public AnonymousClass1ZT A06;
    public AbstractView$OnTouchListenerC13300jz A07;
    public CharSequence A08;
    public boolean A09 = A01();
    public boolean A0A;

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A02, 0, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.A00 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.A02 = -1;
        setSaveEnabled(false);
    }

    public final void A00() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A08);
        if (this.A03 != null && ((this.A06.A06 & 4) != 4 || (!this.A09 && !this.A0A))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.A08;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.A06.A0H;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.A06.A0I;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.A06.A0K;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z3) {
                charSequence3 = this.A06.A0I;
            }
            AnonymousClass0N2.A19(this, charSequence3);
            return;
        }
        AnonymousClass0N2.A19(this, charSequence5);
    }

    public final boolean A01() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // X.AbstractC13070jY
    public void AAn(AnonymousClass1ZT r3, int i) {
        CharSequence charSequence;
        this.A06 = r3;
        setIcon(r3.getIcon());
        if (1 != 0) {
            charSequence = r3.getTitleCondensed();
        } else {
            charSequence = r3.A0I;
        }
        setTitle(charSequence);
        setId(r3.A0R);
        int i2 = 8;
        if (r3.isVisible()) {
            i2 = 0;
        }
        setVisibility(i2);
        setEnabled(r3.isEnabled());
        if (r3.hasSubMenu() && this.A07 == null) {
            this.A07 = new AnonymousClass1ZN(this);
        }
    }

    @Override // X.AbstractC13140jg
    public boolean ACE() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // X.AbstractC13140jg
    public boolean ACF() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.A06.getIcon() == null;
    }

    @Override // X.AbstractC13070jY
    public AnonymousClass1ZT getItemData() {
        return this.A06;
    }

    public void onClick(View view) {
        AnonymousClass0TT r1 = this.A05;
        if (r1 != null) {
            r1.AAs(this.A06);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A09 = A01();
        A00();
    }

    @Override // X.C05560Pe
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i5 = this.A02) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = this.A01;
            i3 = Math.min(size, i4);
        } else {
            i3 = this.A01;
            i4 = i3;
        }
        if (mode != 1073741824 && i4 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!z && this.A03 != null) {
            super.setPadding((getMeasuredWidth() - this.A03.getBounds().width()) >> 1, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC13300jz r0;
        if (!this.A06.hasSubMenu() || (r0 = this.A07) == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setExpandedFormat(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            AnonymousClass1ZT r0 = this.A06;
            if (r0 != null) {
                AnonymousClass0T8 r1 = r0.A0E;
                r1.A0D = true;
                r1.A0E(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A03 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A00;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
                intrinsicHeight = i;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        A00();
    }

    public void setItemInvoker(AnonymousClass0TT r1) {
        this.A05 = r1;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.A02 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC12970jO r1) {
        this.A04 = r1;
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A00();
    }
}
