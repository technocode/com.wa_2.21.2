package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.0Pe  reason: invalid class name and case insensitive filesystem */
public class C05560Pe extends TextView implements AbstractC05570Pf, AbstractC05580Pg, AbstractC05590Ph {
    public Future A00;
    public final AnonymousClass0ZW A01;
    public final AnonymousClass0ZY A02;
    public final AnonymousClass0ZX A03;

    public C05560Pe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C05560Pe(Context context, AttributeSet attributeSet, int i) {
        super(AnonymousClass0ZT.A00(context), attributeSet, i);
        AnonymousClass0ZW r0 = new AnonymousClass0ZW(this);
        this.A01 = r0;
        r0.A08(attributeSet, i);
        AnonymousClass0ZX r02 = new AnonymousClass0ZX(this);
        this.A03 = r02;
        r02.A07(attributeSet, i);
        this.A03.A01();
        this.A02 = new AnonymousClass0ZY(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass0ZW r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0ZX r02 = this.A03;
        if (r02 != null) {
            r02.A01();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AbstractC05590Ph.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AbstractC05590Ph.A00) {
            return super.getAutoSizeMinTextSize();
        }
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AbstractC05590Ph.A00) {
            return super.getAutoSizeStepGranularity();
        }
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC05590Ph.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AnonymousClass0ZX r0 = this.A03;
        return r0 != null ? r0.A0C.A07 : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!AbstractC05590Ph.A00) {
            AnonymousClass0ZX r0 = this.A03;
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // X.AbstractC05570Pf
    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass0ZW r0 = this.A01;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    @Override // X.AbstractC05570Pf
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass0ZW r0 = this.A01;
        if (r0 != null) {
            return r0.A01();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C07660Za r0 = this.A03.A08;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C07660Za r0 = this.A03.A08;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public CharSequence getText() {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                AnonymousClass0N2.A1O(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        AnonymousClass0ZY r1;
        if (Build.VERSION.SDK_INT >= 28 || (r1 = this.A02) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = r1.A00;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) r1.A01.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public C06970Vk getTextMetricsParamsCompat() {
        return AnonymousClass0N2.A0d(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0N2.A1C(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass0ZX r1 = this.A03;
        if (r1 != null && !AbstractC05590Ph.A00) {
            r1.A0C.A03();
        }
    }

    public void onMeasure(int i, int i2) {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                AnonymousClass0N2.A1O(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AnonymousClass0ZX r1 = this.A03;
        if (r1 != null && !AbstractC05590Ph.A00 && r1.A09()) {
            r1.A0C.A03();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC05590Ph.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A03(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC05590Ph.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A08(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC05590Ph.A00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A02(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass0ZW r0 = this.A01;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass0ZW r0 = this.A01;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = AnonymousClass05p.A01(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = AnonymousClass05p.A01(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = AnonymousClass05p.A01(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = AnonymousClass05p.A01(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = AnonymousClass05p.A01(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = AnonymousClass05p.A01(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = AnonymousClass05p.A01(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = AnonymousClass05p.A01(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0N2.A0Z(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            AnonymousClass0N2.A1I(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            AnonymousClass0N2.A1J(this, i);
        }
    }

    public void setLineHeight(int i) {
        C001801b.A1K(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(AnonymousClass0W9 r1) {
        AnonymousClass0N2.A1O(this, r1);
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass0ZW r0 = this.A01;
        if (r0 != null) {
            r0.A06(colorStateList);
        }
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass0ZW r0 = this.A01;
        if (r0 != null) {
            r0.A07(mode);
        }
    }

    @Override // X.AbstractC05580Pg
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        AnonymousClass0ZX r2 = this.A03;
        C07660Za r1 = r2.A08;
        if (r1 == null) {
            r1 = new C07660Za();
            r2.A08 = r1;
        }
        r1.A00 = colorStateList;
        boolean z = false;
        if (colorStateList != null) {
            z = true;
        }
        r1.A02 = z;
        r2.A05 = r1;
        r2.A09 = r1;
        r2.A06 = r1;
        r2.A03 = r1;
        r2.A07 = r1;
        r2.A04 = r1;
        r2.A01();
    }

    @Override // X.AbstractC05580Pg
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        AnonymousClass0ZX r2 = this.A03;
        C07660Za r1 = r2.A08;
        if (r1 == null) {
            r1 = new C07660Za();
            r2.A08 = r1;
        }
        r1.A01 = mode;
        boolean z = false;
        if (mode != null) {
            z = true;
        }
        r1.A03 = z;
        r2.A05 = r1;
        r2.A09 = r1;
        r2.A06 = r1;
        r2.A03 = r1;
        r2.A07 = r1;
        r2.A04 = r1;
        r2.A01();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0ZX r0 = this.A03;
        if (r0 != null) {
            r0.A04(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        AnonymousClass0ZY r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A02) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.A00 = textClassifier;
        }
    }

    public void setTextFuture(Future future) {
        this.A00 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C06970Vk r6) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT >= 18) {
            TextDirectionHeuristic textDirectionHeuristic2 = r6.A02;
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            int i = 1;
            if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
                if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                    i = 2;
                } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                    i = 3;
                } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                    i = 4;
                } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                    i = 5;
                } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                    i = 6;
                } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                    i = 7;
                }
            }
            setTextDirection(i);
        }
        if (Build.VERSION.SDK_INT < 23) {
            TextPaint textPaint = r6.A03;
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(r6.A03);
        setBreakStrategy(r6.A00);
        setHyphenationFrequency(r6.A01);
    }

    public void setTextSize(int i, float f) {
        if (AbstractC05590Ph.A00) {
            super.setTextSize(i, f);
            return;
        }
        AnonymousClass0ZX r1 = this.A03;
        if (r1 != null && !r1.A09()) {
            r1.A0C.A05(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface A002;
        if (!(typeface == null || i <= 0 || (A002 = AnonymousClass0My.A00(getContext(), typeface, i)) == null)) {
            typeface = A002;
        }
        super.setTypeface(typeface, i);
    }
}
