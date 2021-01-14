package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.3Rm  reason: invalid class name and case insensitive filesystem */
public class C72093Rm implements AbstractC663834a {
    @Override // X.AbstractC663834a
    public void AP6(TextView textView) {
    }

    @Override // X.AbstractC663834a
    public Layout A3N(CharSequence charSequence, TextView textView, int i) {
        Layout layout = textView.getLayout();
        return new StaticLayout(C003701u.A00(charSequence), textView.getPaint(), i, layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), true);
    }
}
