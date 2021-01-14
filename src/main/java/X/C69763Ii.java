package X;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Ii  reason: invalid class name and case insensitive filesystem */
public class C69763Ii extends AbstractC16450pp {
    public final /* synthetic */ AbstractC63952xH A00;

    public C69763Ii(AbstractC63952xH r1) {
        this.A00 = r1;
    }

    public final void A02(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 21) {
            AbstractC63952xH r5 = this.A00;
            if (r5.A04 != null) {
                float f = (recyclerView.getContext().getResources().getDisplayMetrics().density * 0.8f) + 0.5f;
                float min = Math.min(((float) recyclerView.computeVerticalScrollOffset()) / (((float) recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_picker_item)) / 3.0f), 1.0f);
                if (min >= 0.0f && min <= 1.0f) {
                    f *= min;
                }
                r5.A04.A9i().setBackgroundColor(C004402b.A02(C004402b.A03(r5.A06, (int) (min * 13.0f)), r5.A05));
                AnonymousClass0Q7.A0Q(r5.A04.A9i(), f);
            }
        }
    }
}
