package X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0py  reason: invalid class name and case insensitive filesystem */
public class RunnableC16540py extends RunnableEmptyBase implements Runnable {
    public int A00;
    public int A01;
    public Interpolator A02;
    public OverScroller A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final /* synthetic */ RecyclerView A06;

    public RunnableC16540py(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        Interpolator interpolator = RecyclerView.A1C;
        this.A02 = interpolator;
        this.A03 = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final int A00(int i, int i2) {
        int height;
        int i3;
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        boolean z = false;
        if (abs > abs2) {
            z = true;
        }
        int sqrt = (int) Math.sqrt((double) 0);
        int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i * i)));
        RecyclerView recyclerView = this.A06;
        if (z) {
            height = recyclerView.getWidth();
        } else {
            height = recyclerView.getHeight();
        }
        float f = (float) height;
        float f2 = (float) (height >> 1);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
        if (sqrt > 0) {
            i3 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) << 2;
        } else {
            if (!z) {
                abs = abs2;
            }
            i3 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
        }
        return Math.min(i3, 2000);
    }

    public void A01() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        RecyclerView recyclerView = this.A06;
        recyclerView.removeCallbacks(this);
        recyclerView.postOnAnimation(this);
    }

    public void A02(int i, int i2, int i3, Interpolator interpolator) {
        if (this.A02 != interpolator) {
            this.A02 = interpolator;
            this.A03 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A01 = 0;
        this.A00 = 0;
        this.A03.startScroll(0, 0, i, i2, i3);
        if (Build.VERSION.SDK_INT < 23) {
            this.A03.computeScrollOffset();
        }
        A01();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: X.0pw */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x015f, code lost:
        if (r2 != false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017a, code lost:
        if (r2 > 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0182, code lost:
        if (r3 <= 0) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        if (r1 == 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        if (r0.getFinalX() != 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        if (r4 != r6) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 421
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC16540py.run():void");
    }
}
