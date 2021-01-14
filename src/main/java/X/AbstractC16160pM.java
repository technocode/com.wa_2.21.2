package X;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0pM  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16160pM {
    public static final Interpolator A01 = new animation.InterpolatorC16140pK();
    public static final Interpolator A02 = new animation.InterpolatorC16150pL();
    public int A00 = -1;

    public static void A00(AbstractC11910hD r2) {
        View view = r2.A0H;
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                AnonymousClass0Q7.A0Q(view, ((Number) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static void A01(RecyclerView recyclerView, AbstractC11910hD r9, float f, float f2, boolean z) {
        View view = r9.A0H;
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(AnonymousClass0Q7.A00(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float A002 = AnonymousClass0Q7.A00(childAt);
                    if (A002 > f3) {
                        f3 = A002;
                    }
                }
            }
            AnonymousClass0Q7.A0Q(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public final int A02(RecyclerView recyclerView) {
        int i = 196611;
        int i2 = 3084;
        if (AnonymousClass0Q7.A05(recyclerView) != 0) {
            i = 198667;
            i2 = 1028;
        }
        return i | i2;
    }

    public int A03(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.A00;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.A00 = i3;
        }
        int abs = Math.abs(i2);
        int signum = (int) Math.signum((float) i2);
        float f = (float) abs;
        float f2 = 1.0f;
        int interpolation = (int) (((animation.InterpolatorC16150pL) A02).getInterpolation(Math.min(1.0f, (f * 1.0f) / ((float) i))) * ((float) (signum * i3)));
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        int interpolation2 = (int) (((animation.InterpolatorC16140pK) A01).getInterpolation(f2) * ((float) interpolation));
        if (interpolation2 != 0) {
            return interpolation2;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }
}
