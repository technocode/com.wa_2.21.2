package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.1tP  reason: invalid class name and case insensitive filesystem */
public class C40521tP implements AnonymousClass1NP {
    @Override // X.AnonymousClass1NP
    public Layout A3L(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
    }
}
