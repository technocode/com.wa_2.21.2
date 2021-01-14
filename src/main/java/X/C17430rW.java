package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: X.0rW  reason: invalid class name and case insensitive filesystem */
public class C17430rW extends Drawable.ConstantState {
    public AnimatorSet A00;
    public AnonymousClass05V A01;
    public AnonymousClass0V9 A02;
    public ArrayList A03;

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
