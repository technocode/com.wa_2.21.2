package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.style.ImageSpan;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.1hA  reason: invalid class name and case insensitive filesystem */
public class C33671hA implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        if (obj3 != null) {
            C07110Vy r11 = (C07110Vy) obj3;
            CharSequence charSequence = r11.A03;
            Layout layout = r11.A01;
            float f = r11.A00;
            AnonymousClass074 r0 = r11.A02;
            ColorStateList colorStateList = r0.A0N;
            int i = r0.A0K;
            int i2 = r0.A07;
            ImageSpan[] imageSpanArr = r11.A04;
            rCTextView.A09 = charSequence;
            rCTextView.A08 = layout;
            rCTextView.A00 = f;
            rCTextView.A01 = i2;
            if (i != 0) {
                rCTextView.A05 = null;
                rCTextView.A02 = i;
            } else {
                rCTextView.A05 = colorStateList;
                rCTextView.A02 = colorStateList.getDefaultColor();
                Layout layout2 = rCTextView.A08;
                if (layout2 != null) {
                    layout2.getPaint().setColor(rCTextView.A05.getColorForState(rCTextView.getDrawableState(), rCTextView.A02));
                }
            }
            rCTextView.A00(0, 0);
            if (imageSpanArr != null) {
                for (ImageSpan imageSpan : imageSpanArr) {
                    Drawable drawable = imageSpan.getDrawable();
                    drawable.setCallback(rCTextView);
                    drawable.setVisible(true, false);
                }
            }
            rCTextView.A0B = imageSpanArr;
            rCTextView.invalidate();
            return;
        }
        throw new RuntimeException("Missing text layout context!");
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        rCTextView.A09 = null;
        rCTextView.A08 = null;
        rCTextView.A00 = 0.0f;
        rCTextView.A01 = 0;
        rCTextView.A05 = null;
        rCTextView.A02 = 0;
        ImageSpan[] imageSpanArr = rCTextView.A0B;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = rCTextView.A0B[i].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            rCTextView.A0B = null;
        }
        if (obj3 == null) {
            throw new RuntimeException("Missing text layout context!");
        }
    }
}
