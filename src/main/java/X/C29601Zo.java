package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: X.1Zo  reason: invalid class name and case insensitive filesystem */
public class C29601Zo extends C13180jl {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public Drawable A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final SeekBar A05;

    public C29601Zo(SeekBar seekBar) {
        super(seekBar);
        this.A05 = seekBar;
    }

    @Override // X.C13180jl
    public void A01(AttributeSet attributeSet, int i) {
        super.A01(attributeSet, i);
        SeekBar seekBar = this.A05;
        AnonymousClass0TL A002 = AnonymousClass0TL.A00(seekBar.getContext(), attributeSet, AnonymousClass0T3.A0B, i);
        Drawable A032 = A002.A03(0);
        if (A032 != null) {
            seekBar.setThumb(A032);
        }
        Drawable A022 = A002.A02(1);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.A02 = A022;
        if (A022 != null) {
            A022.setCallback(seekBar);
            C002001d.A2Y(A022, AnonymousClass0Q7.A05(seekBar));
            if (A022.isStateful()) {
                A022.setState(seekBar.getDrawableState());
            }
            A02();
        }
        seekBar.invalidate();
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(3)) {
            this.A01 = AnonymousClass0WQ.A00(typedArray.getInt(3, -1), this.A01);
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A00 = A002.A01(2);
            this.A03 = true;
        }
        typedArray.recycle();
        A02();
    }

    public final void A02() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return;
        }
        if (this.A03 || this.A04) {
            Drawable A0d = C002001d.A0d(drawable.mutate());
            this.A02 = A0d;
            if (this.A03) {
                C002001d.A2b(A0d, this.A00);
            }
            if (this.A04) {
                C002001d.A2c(this.A02, this.A01);
            }
            if (this.A02.isStateful()) {
                this.A02.setState(this.A05.getDrawableState());
            }
        }
    }
}
