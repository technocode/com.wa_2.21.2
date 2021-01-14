package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1Li  reason: invalid class name and case insensitive filesystem */
public class C26541Li extends ViewGroup {
    public final /* synthetic */ C26551Lj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26541Li(C26551Lj r1, Context context) {
        super(context);
        this.A00 = r1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = (float) (i3 - i);
        int i5 = i4 - i2;
        C26551Lj r8 = this.A00;
        float f2 = f / ((float) r8.A03.A03);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            float f3 = ((float) i6) * f2;
            View childAt = getChildAt(i6);
            if (r8.A02.A0M()) {
                childAt.layout((int) f3, 0, (int) (f3 + f2), i5);
            } else {
                float f4 = f - f3;
                childAt.layout((int) (f4 - f2), 0, (int) f4, i5);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        C26621Lq r7 = this.A00.A03;
        float f = (float) (size / r7.A03);
        for (int i3 = 0; i3 < childCount; i3++) {
            float f2 = ((float) i3) * f;
            getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(((int) (f2 + f)) - ((int) f2), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), r7.A01);
    }
}
