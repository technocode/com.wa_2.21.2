package X;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0pv  reason: invalid class name and case insensitive filesystem */
public class C16510pv {
    public int A00 = 0;
    public int A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = -1;
    public Interpolator A05 = null;
    public boolean A06 = false;

    public void A00(RecyclerView recyclerView) {
        int i = this.A04;
        if (i >= 0) {
            this.A04 = -1;
            recyclerView.A0W(i);
            this.A06 = false;
        } else if (this.A06) {
            Interpolator interpolator = this.A05;
            if (interpolator == null || this.A01 >= 1) {
                int i2 = this.A01;
                if (i2 >= 1) {
                    if (interpolator == null) {
                        RunnableC16540py r5 = recyclerView.A10;
                        if (i2 == Integer.MIN_VALUE) {
                            int i3 = this.A02;
                            int i4 = this.A03;
                            r5.A02(i3, i4, r5.A00(i3, i4), RecyclerView.A1C);
                        } else {
                            int i5 = this.A02;
                            int i6 = this.A03;
                            if (r5 != null) {
                                r5.A02(i5, i6, i2, RecyclerView.A1C);
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        recyclerView.A10.A02(this.A02, this.A03, i2, interpolator);
                    }
                    int i7 = this.A00 + 1;
                    this.A00 = i7;
                    if (i7 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.A06 = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.A00 = 0;
        }
    }
}
