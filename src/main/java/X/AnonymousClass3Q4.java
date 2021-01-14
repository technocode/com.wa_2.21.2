package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: X.3Q4  reason: invalid class name */
public class AnonymousClass3Q4 implements AbstractC660432q {
    @Override // X.AbstractC660432q
    public Layout A3M(CharSequence charSequence, TextPaint textPaint, TextView textView, int i) {
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
    }
}
