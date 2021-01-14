package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.search.verification.client.R;

/* renamed from: X.0aK  reason: invalid class name and case insensitive filesystem */
public class C08010aK extends ImageButton {
    public int A00 = getVisibility();

    public C08010aK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public final void A00(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.A00 = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.A00;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.A00 = i;
    }
}
