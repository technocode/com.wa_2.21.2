package X;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: X.0nU  reason: invalid class name and case insensitive filesystem */
public class RunnableC15090nU extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AbstractView$OnTouchListenerC15100nV A00;

    public RunnableC15090nU(AbstractView$OnTouchListenerC15100nV r1) {
        this.A00 = r1;
    }

    public void run() {
        View childAt;
        AbstractView$OnTouchListenerC15100nV r5 = this.A00;
        if (r5.A04) {
            if (r5.A07) {
                r5.A07 = false;
                C15080nT r7 = r5.A0F;
                if (r7 != null) {
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    r7.A09 = currentAnimationTimeMillis;
                    r7.A0A = -1;
                    r7.A08 = currentAnimationTimeMillis;
                    r7.A00 = 0.5f;
                    r7.A03 = 0;
                    r7.A04 = 0;
                } else {
                    throw null;
                }
            }
            C15080nT r9 = r5.A0F;
            if ((r9.A0A <= 0 || AnimationUtils.currentAnimationTimeMillis() <= r9.A0A + ((long) r9.A05)) && r5.A02()) {
                if (r5.A06) {
                    r5.A06 = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    r5.A0D.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (r9.A08 != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float A002 = r9.A00(currentAnimationTimeMillis2);
                    r9.A08 = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - r9.A08)) * ((A002 * 4.0f) + (-4.0f * A002 * A002));
                    r9.A03 = (int) (r9.A01 * f);
                    int i = (int) (f * r9.A02);
                    r9.A04 = i;
                    ListView listView = ((C30151aq) r5).A00;
                    if (Build.VERSION.SDK_INT >= 19) {
                        listView.scrollListBy(i);
                    } else {
                        int firstVisiblePosition = listView.getFirstVisiblePosition();
                        if (!(firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null)) {
                            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
                        }
                    }
                    r5.A0D.postOnAnimation(this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            r5.A04 = false;
        }
    }
}
