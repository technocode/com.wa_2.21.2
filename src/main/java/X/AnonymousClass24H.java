package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.24H  reason: invalid class name */
public final class AnonymousClass24H extends AbstractC30831c1 {
    @Override // X.AbstractC17220rB
    public float A6Y(ViewGroup viewGroup, View view) {
        int A05 = AnonymousClass0Q7.A05(viewGroup);
        float translationX = view.getTranslationX();
        float width = (float) viewGroup.getWidth();
        if (A05 == 1) {
            return translationX - width;
        }
        return translationX + width;
    }
}
