package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.3Rl  reason: invalid class name and case insensitive filesystem */
public class C72083Rl implements AbstractC663834a {
    @Override // X.AbstractC663834a
    public Layout A3N(CharSequence charSequence, TextView textView, int i) {
        Layout layout = textView.getLayout();
        return StaticLayout.Builder.obtain(C003701u.A00(charSequence), 0, charSequence.length(), textView.getPaint(), i).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
    }

    @Override // X.AbstractC663834a
    public void AP6(TextView textView) {
        textView.setBreakStrategy(0);
    }
}
