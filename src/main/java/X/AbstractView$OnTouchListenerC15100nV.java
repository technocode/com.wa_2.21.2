package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* renamed from: X.0nV  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractView$OnTouchListenerC15100nV implements View.OnTouchListener {
    public static final int A0G = ViewConfiguration.getTapTimeout();
    public int A00;
    public int A01;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public float[] A08 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A09 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A0A = {0.0f, 0.0f};
    public float[] A0B = {0.0f, 0.0f};
    public float[] A0C = {0.0f, 0.0f};
    public final View A0D;
    public final Interpolator A0E = new AccelerateInterpolator();
    public final C15080nT A0F = new C15080nT();

    public AbstractView$OnTouchListenerC15100nV(View view) {
        this.A0D = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.A09;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.A0A;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.A01 = 1;
        float[] fArr3 = this.A08;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.A0B;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.A0C;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.A00 = A0G;
        C15080nT r1 = this.A0F;
        r1.A07 = 500;
        r1.A06 = 500;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r2 == 0.0f) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        if (r6.A04 == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0085, code lost:
        if (r6.A04 == false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A00(int r7, float r8, float r9, float r10) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnTouchListenerC15100nV.A00(int, float, float, float):float");
    }

    public final void A01() {
        int i = 0;
        if (this.A07) {
            this.A04 = false;
            return;
        }
        C15080nT r6 = this.A0F;
        if (r6 != null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i2 = (int) (currentAnimationTimeMillis - r6.A09);
            int i3 = r6.A06;
            if (i2 > i3) {
                i = i3;
            } else if (i2 >= 0) {
                i = i2;
            }
            r6.A05 = i;
            r6.A00 = r6.A00(currentAnimationTimeMillis);
            r6.A0A = currentAnimationTimeMillis;
            return;
        }
        throw null;
    }

    public boolean A02() {
        ListView listView;
        int count;
        float f = this.A0F.A02;
        int abs = (int) (f / Math.abs(f));
        if (!(abs == 0 || (count = (listView = ((C30151aq) this).A00).getCount()) == 0)) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs > 0) {
                if (i < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                    return true;
                }
            } else if (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 != 3) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnTouchListenerC15100nV.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
