package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.23Q  reason: invalid class name */
public class AnonymousClass23Q extends C08490bD implements AbstractC13140jg {
    public final /* synthetic */ AnonymousClass23R A00;

    @Override // X.AbstractC13140jg
    public boolean ACE() {
        return false;
    }

    @Override // X.AbstractC13140jg
    public boolean ACF() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass23Q(AnonymousClass23R r3, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.A00 = r3;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AnonymousClass0N2.A19(this, getContentDescription());
        setOnTouchListener(new C29521Zc(this, this));
    }

    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.A00.A03();
        return true;
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) >> 1;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) >> 1;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) >> 1;
            C002001d.A2a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
