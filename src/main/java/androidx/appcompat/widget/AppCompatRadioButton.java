package androidx.appcompat.widget;

import X.AbstractC05570Pf;
import X.AbstractC15140nZ;
import X.AnonymousClass05p;
import X.AnonymousClass0ZT;
import X.AnonymousClass0ZW;
import X.AnonymousClass0ZX;
import X.C13160jj;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.search.verification.client.R;

public class AppCompatRadioButton extends RadioButton implements AbstractC05570Pf, AbstractC15140nZ {
    public final AnonymousClass0ZW A00;
    public final C13160jj A01;
    public final AnonymousClass0ZX A02;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        super(AnonymousClass0ZT.A00(context), attributeSet, R.attr.radioButtonStyle);
        C13160jj r0 = new C13160jj(this);
        this.A01 = r0;
        r0.A02(attributeSet, R.attr.radioButtonStyle);
        AnonymousClass0ZW r02 = new AnonymousClass0ZW(this);
        this.A00 = r02;
        r02.A08(attributeSet, R.attr.radioButtonStyle);
        AnonymousClass0ZX r03 = new AnonymousClass0ZX(this);
        this.A02 = r03;
        r03.A07(attributeSet, R.attr.radioButtonStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0ZX r02 = this.A02;
        if (r02 != null) {
            r02.A01();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C13160jj r0 = this.A01;
        return r0 != null ? r0.A00(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // X.AbstractC05570Pf
    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    @Override // X.AbstractC05570Pf
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            return r0.A01();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C13160jj r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C13160jj r0 = this.A01;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AnonymousClass05p.A01(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C13160jj r1 = this.A01;
        if (r1 == null) {
            return;
        }
        if (r1.A04) {
            r1.A04 = false;
            return;
        }
        r1.A04 = true;
        r1.A01();
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A06(colorStateList);
        }
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A07(mode);
        }
    }

    @Override // X.AbstractC15140nZ
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C13160jj r1 = this.A01;
        if (r1 != null) {
            r1.A00 = colorStateList;
            r1.A02 = true;
            r1.A01();
        }
    }

    @Override // X.AbstractC15140nZ
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C13160jj r1 = this.A01;
        if (r1 != null) {
            r1.A01 = mode;
            r1.A03 = true;
            r1.A01();
        }
    }
}
