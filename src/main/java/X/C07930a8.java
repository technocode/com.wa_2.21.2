package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0a8  reason: invalid class name and case insensitive filesystem */
public class C07930a8 implements AnonymousClass0TF {
    public final Rect A00 = new Rect();
    public final /* synthetic */ ViewPager A01;

    public C07930a8(ViewPager viewPager) {
        this.A01 = viewPager;
    }

    @Override // X.AnonymousClass0TF
    public C06730Um ACw(View view, C06730Um r11) {
        C06730Um r7;
        C06730Um A0F = AnonymousClass0Q7.A0F(view, r11);
        if (A0F.A06()) {
            return A0F;
        }
        Rect rect = this.A00;
        rect.left = A0F.A02();
        rect.top = A0F.A04();
        rect.right = A0F.A03();
        rect.bottom = A0F.A01();
        ViewPager viewPager = this.A01;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewPager.getChildAt(i);
            if (Build.VERSION.SDK_INT >= 21) {
                WindowInsets windowInsets = (WindowInsets) A0F.A00;
                WindowInsets dispatchApplyWindowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                if (!dispatchApplyWindowInsets.equals(windowInsets)) {
                    windowInsets = new WindowInsets(dispatchApplyWindowInsets);
                }
                r7 = C06730Um.A00(windowInsets);
            } else {
                r7 = A0F;
            }
            rect.left = Math.min(r7.A02(), rect.left);
            rect.top = Math.min(r7.A04(), rect.top);
            rect.right = Math.min(r7.A03(), rect.right);
            rect.bottom = Math.min(r7.A01(), rect.bottom);
        }
        return A0F.A05(rect.left, rect.top, rect.right, rect.bottom);
    }
}
