package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* renamed from: X.1a2  reason: invalid class name */
public class AnonymousClass1a2 implements AbstractC13770kz {
    public Drawable A00;
    public final /* synthetic */ CardView A01;

    public AnonymousClass1a2(CardView cardView) {
        this.A01 = cardView;
    }

    public void A00(int i, int i2, int i3, int i4) {
        CardView cardView = this.A01;
        cardView.A05.set(i, i2, i3, i4);
        Rect rect = cardView.A04;
        AnonymousClass1a2.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }
}
