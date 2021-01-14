package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Zb  reason: invalid class name and case insensitive filesystem */
public class C07670Zb extends EditText implements AbstractC05570Pf {
    public final AnonymousClass0ZW A00;
    public final AnonymousClass0ZY A01;
    public final AnonymousClass0ZX A02;

    public C07670Zb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public C07670Zb(Context context, AttributeSet attributeSet, int i) {
        super(AnonymousClass0ZT.A00(context), attributeSet, R.attr.editTextStyle);
        AnonymousClass0ZW r0 = new AnonymousClass0ZW(this);
        this.A00 = r0;
        r0.A08(attributeSet, R.attr.editTextStyle);
        AnonymousClass0ZX r02 = new AnonymousClass0ZX(this);
        this.A02 = r02;
        r02.A07(attributeSet, R.attr.editTextStyle);
        this.A02.A01();
        this.A01 = new AnonymousClass0ZY(this);
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

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        AnonymousClass0ZY r1;
        if (Build.VERSION.SDK_INT >= 28 || (r1 = this.A01) == null) {
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0N2.A0Z(this, callback));
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
        AnonymousClass0ZX r0 = this.A02;
        if (r0 != null) {
            r0.A04(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        AnonymousClass0ZY r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A01) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.A00 = textClassifier;
        }
    }
}
