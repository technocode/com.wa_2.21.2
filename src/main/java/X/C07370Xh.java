package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Xh  reason: invalid class name and case insensitive filesystem */
public final class C07370Xh extends View {
    public C07370Xh(Context context) {
        super(context);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDimensionPixelSize(R.dimen.tab_height), 1073741824));
    }
}
