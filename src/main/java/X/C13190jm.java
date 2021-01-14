package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.search.verification.client.R;

/* renamed from: X.0jm  reason: invalid class name and case insensitive filesystem */
public class C13190jm extends RatingBar {
    public final C13180jl A00;

    public C13190jm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C13180jl r0 = new C13180jl(this);
        this.A00 = r0;
        r0.A01(attributeSet, R.attr.ratingBarStyle);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
