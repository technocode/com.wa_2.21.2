package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;

/* renamed from: X.0jj  reason: invalid class name and case insensitive filesystem */
public class C13160jj {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CompoundButton A05;

    public C13160jj(CompoundButton compoundButton) {
        this.A05 = compoundButton;
    }

    public int A00(int i) {
        Drawable A0V;
        return (Build.VERSION.SDK_INT >= 17 || (A0V = AnonymousClass0N2.A0V(this.A05)) == null) ? i : i + A0V.getIntrinsicWidth();
    }

    public void A01() {
        CompoundButton compoundButton = this.A05;
        Drawable A0V = AnonymousClass0N2.A0V(compoundButton);
        if (A0V == null) {
            return;
        }
        if (this.A02 || this.A03) {
            Drawable mutate = C002001d.A0d(A0V).mutate();
            if (this.A02) {
                C002001d.A2b(mutate, this.A00);
            }
            if (this.A03) {
                C002001d.A2c(mutate, this.A01);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.util.AttributeSet r6, int r7) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13160jj.A02(android.util.AttributeSet, int):void");
    }
}
