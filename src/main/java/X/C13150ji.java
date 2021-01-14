package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: X.0ji  reason: invalid class name and case insensitive filesystem */
public class C13150ji extends CheckedTextView {
    public static final int[] A01 = {16843016};
    public final AnonymousClass0ZX A00;

    public C13150ji(Context context, AttributeSet attributeSet) {
        super(AnonymousClass0ZT.A00(context), attributeSet, 16843720);
        AnonymousClass0ZX r0 = new AnonymousClass0ZX(this);
        this.A00 = r0;
        r0.A07(attributeSet, 16843720);
        this.A00.A01();
        AnonymousClass0TL A002 = AnonymousClass0TL.A00(getContext(), attributeSet, A01, 16843720);
        setCheckMarkDrawable(A002.A02(0));
        A002.A02.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass0ZX r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0N2.A1C(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AnonymousClass05p.A01(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0N2.A0Z(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0ZX r0 = this.A00;
        if (r0 != null) {
            r0.A04(context, i);
        }
    }
}
