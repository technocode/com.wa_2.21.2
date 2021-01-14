package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Zm  reason: invalid class name and case insensitive filesystem */
public class C29591Zm extends MultiAutoCompleteTextView implements AbstractC05570Pf {
    public static final int[] A02 = {16843126};
    public final AnonymousClass0ZW A00;
    public final AnonymousClass0ZX A01;

    public C29591Zm(Context context, AttributeSet attributeSet) {
        super(AnonymousClass0ZT.A00(context), attributeSet, R.attr.autoCompleteTextViewStyle);
        AnonymousClass0TL A002 = AnonymousClass0TL.A00(getContext(), attributeSet, A02, R.attr.autoCompleteTextViewStyle);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setDropDownBackgroundDrawable(A002.A02(0));
        }
        typedArray.recycle();
        AnonymousClass0ZW r0 = new AnonymousClass0ZW(this);
        this.A00 = r0;
        r0.A08(attributeSet, R.attr.autoCompleteTextViewStyle);
        AnonymousClass0ZX r02 = new AnonymousClass0ZX(this);
        this.A01 = r02;
        r02.A07(attributeSet, R.attr.autoCompleteTextViewStyle);
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0N2.A1C(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AnonymousClass05p.A01(getContext(), i));
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
}
