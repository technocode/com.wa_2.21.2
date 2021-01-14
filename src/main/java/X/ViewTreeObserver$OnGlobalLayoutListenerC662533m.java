package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.search.verification.client.R;

/* renamed from: X.33m  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC662533m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass3R6 A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC662533m(AnonymousClass3R6 r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass3R6 r7 = this.A00;
        ViewPager viewPager = ((AbstractC63952xH) r7).A0A;
        int height = viewPager.getHeight();
        int width = viewPager.getWidth();
        if (!(height == 0 || width == 0 || (r7.A01 == width && r7.A00 == height))) {
            r7.A01 = width;
            r7.A00 = height;
            AnonymousClass3RI[] r5 = r7.A0G;
            for (AnonymousClass3RI r2 : r5) {
                if (r2 != null) {
                    r2.A02(r7.A01, r7.A00);
                }
            }
        }
        int width2 = ((View) viewPager.getParent()).getWidth();
        if (width2 != r7.A02) {
            r7.A02 = width2;
            AnonymousClass3R8 r52 = r7.A0W;
            if (r52 != null) {
                int dimensionPixelSize = r52.A08.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_picker_header_item);
                int i = width2 / 9;
                boolean A0M = r52.A0B.A0M();
                RecyclerView recyclerView = r52.A0A;
                int i2 = (i - dimensionPixelSize) >> 1;
                if (A0M) {
                    recyclerView.setPadding(i2, 0, 0, 0);
                } else {
                    recyclerView.setPadding(0, 0, i2, 0);
                }
            }
        }
    }
}
