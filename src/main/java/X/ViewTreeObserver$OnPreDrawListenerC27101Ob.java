package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1Ob  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC27101Ob implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C27131Oe A01;

    public ViewTreeObserver$OnPreDrawListenerC27101Ob(C27131Oe r1, View view) {
        this.A01 = r1;
        this.A00 = view;
    }

    public boolean onPreDraw() {
        View view = this.A00;
        int width = view.getWidth();
        if (width <= 0) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        C27131Oe r5 = this.A01;
        int compoundPaddingRight = width - (r5.A0M.getCompoundPaddingRight() + r5.A0M.getCompoundPaddingLeft());
        String charSequence = r5.A0M.getText().toString();
        float textSize = r5.A0M.getTextSize();
        while (textSize > 1.0f && r5.A0M.getPaint().measureText(charSequence) >= ((float) compoundPaddingRight)) {
            textSize -= 1.0f;
            r5.A0M.setTextSize(textSize);
        }
        return true;
    }
}
