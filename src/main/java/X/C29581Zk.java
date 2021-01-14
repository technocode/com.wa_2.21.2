package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Zk  reason: invalid class name and case insensitive filesystem */
public class C29581Zk extends Button implements AbstractC05570Pf, AbstractC05590Ph {
    public final AnonymousClass0ZW A00;
    public final AnonymousClass0ZX A01;

    public C29581Zk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public C29581Zk(Context context, AttributeSet attributeSet, int i) {
        super(AnonymousClass0ZT.A00(context), attributeSet, i);
        AnonymousClass0ZW r0 = new AnonymousClass0ZW(this);
        this.A00 = r0;
        r0.A08(attributeSet, i);
        AnonymousClass0ZX r02 = new AnonymousClass0ZX(this);
        this.A01 = r02;
        r02.A07(attributeSet, i);
        this.A01.A01();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0ZX r02 = this.A01;
        if (r02 != null) {
            r02.A01();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AbstractC05590Ph.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        AnonymousClass0ZX r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AbstractC05590Ph.A00) {
            return super.getAutoSizeMinTextSize();
        }
        AnonymousClass0ZX r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AbstractC05590Ph.A00) {
            return super.getAutoSizeStepGranularity();
        }
        AnonymousClass0ZX r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC05590Ph.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AnonymousClass0ZX r0 = this.A01;
        return r0 != null ? r0.A0C.A07 : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!AbstractC05590Ph.A00) {
            AnonymousClass0ZX r0 = this.A01;
            if (r0 != null) {
                return r0.A0C.A03;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass0ZX r1 = this.A01;
        if (r1 != null && !AbstractC05590Ph.A00) {
            r1.A0C.A03();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AnonymousClass0ZX r1 = this.A01;
        if (r1 != null && !AbstractC05590Ph.A00 && r1.A09()) {
            r1.A0C.A03();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC05590Ph.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AnonymousClass0ZX r0 = this.A01;
        if (r0 != null) {
            r0.A03(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC05590Ph.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AnonymousClass0ZX r0 = this.A01;
        if (r0 != null) {
            r0.A08(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC05590Ph.A00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AnonymousClass0ZX r0 = this.A01;
        if (r0 != null) {
            r0.A02(i);
        }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0N2.A0Z(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        AnonymousClass0ZX r0 = this.A01;
        if (r0 != null) {
            r0.A0B.setAllCaps(z);
        }
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

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0ZX r0 = this.A01;
        if (r0 != null) {
            r0.A04(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (AbstractC05590Ph.A00) {
            super.setTextSize(i, f);
            return;
        }
        AnonymousClass0ZX r1 = this.A01;
        if (r1 != null && !r1.A09()) {
            r1.A0C.A05(i, f);
        }
    }
}
