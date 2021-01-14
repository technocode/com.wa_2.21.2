package X;

import android.widget.RatingBar;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallRatingActivity;

/* renamed from: X.37f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C671037f implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ CallRatingActivity A00;

    public /* synthetic */ C671037f(CallRatingActivity callRatingActivity) {
        this.A00 = callRatingActivity;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        CallRatingActivity callRatingActivity = this.A00;
        StringBuilder sb = new StringBuilder("callratingactivity/setOnRatingBarChangeListener rating = ");
        sb.append(f);
        sb.append(", fromUser = ");
        sb.append(z);
        Log.i(sb.toString());
        if (z) {
            int i = (int) f;
            float f2 = (float) i;
            if (((double) (f - f2)) <= 0.2d) {
                callRatingActivity.A04.setRating(f2);
            } else {
                f2 = (float) (i + 1);
                callRatingActivity.A04.setRating(f2);
            }
            if (0.0f < f2) {
                int[] iArr = CallRatingActivity.A0G;
                if (f2 <= ((float) iArr.length)) {
                    callRatingActivity.A05.setText(((AnonymousClass2C0) callRatingActivity).A01.A06(iArr[((int) f2) - 1]));
                    callRatingActivity.A05.setVisibility(0);
                    callRatingActivity.A0D();
                }
            }
            callRatingActivity.A05.setVisibility(4);
            callRatingActivity.A0D();
        }
    }
}
