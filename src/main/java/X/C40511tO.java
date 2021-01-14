package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.1tO  reason: invalid class name and case insensitive filesystem */
public class C40511tO implements AnonymousClass1NP {
    @Override // X.AnonymousClass1NP
    public Layout A3L(CharSequence charSequence, TextPaint textPaint, int i) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(1).build();
    }
}
