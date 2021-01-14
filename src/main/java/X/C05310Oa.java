package X;

import android.content.Context;
import android.graphics.Paint;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Oa  reason: invalid class name and case insensitive filesystem */
public class C05310Oa extends C05240Nt {
    public static C05310Oa A01;
    public int A00;

    public C05310Oa(Context context, Paint paint) {
        super(context, paint);
    }

    public static C05240Nt A01(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dialog_emoji_size);
        if (A01 != null) {
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dialog_emoji_size);
            C05310Oa r1 = A01;
            if (dimensionPixelSize2 == r1.A00) {
                return r1;
            }
        }
        Paint paint = new Paint();
        paint.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.dialog_emoji_size));
        C05310Oa r12 = new C05310Oa(context, paint);
        A01 = r12;
        r12.A00 = dimensionPixelSize;
        return r12;
    }
}
