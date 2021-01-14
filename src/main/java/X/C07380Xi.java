package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0Xi  reason: invalid class name and case insensitive filesystem */
public final class C07380Xi extends View {
    public final /* synthetic */ int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07380Xi(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A00, 1073741824));
    }
}
