package X;

import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Lh  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC26531Lh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C26621Lq A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC26531Lh(C26621Lq r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        C26621Lq r3 = this.A00;
        int width = r3.A0A.getWidth() / r3.A0A.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_picker_item);
        if (r3.A03 != width) {
            r3.A03 = width;
            C26551Lj[] r32 = r3.A0D;
            for (C26551Lj r0 : r32) {
                if (r0 != null) {
                    r0.notifyDataSetChanged();
                }
            }
        }
    }
}
