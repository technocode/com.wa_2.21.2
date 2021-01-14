package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: X.3Q3  reason: invalid class name */
public class AnonymousClass3Q3 implements AbstractC660432q {
    @Override // X.AbstractC660432q
    public Layout A3M(CharSequence charSequence, TextPaint textPaint, TextView textView, int i) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setUseLineSpacingFromFallbacks(textView.isFallbackLineSpacing()).build();
    }
}
