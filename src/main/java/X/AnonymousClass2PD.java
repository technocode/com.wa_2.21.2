package X;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.PhotoViewPager;
import com.whatsapp.gallerypicker.MediaPreviewActivity;

/* renamed from: X.2PD  reason: invalid class name */
public class AnonymousClass2PD implements View.OnTouchListener {
    public float A00;
    public float A01;
    public final /* synthetic */ MediaPreviewActivity A02;

    public AnonymousClass2PD(MediaPreviewActivity mediaPreviewActivity) {
        this.A02 = mediaPreviewActivity;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    MediaPreviewActivity mediaPreviewActivity = this.A02;
                    if (mediaPreviewActivity.A0L.A06 == null) {
                        float y = this.A01 - motionEvent.getY();
                        float x = this.A00 - motionEvent.getX();
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mediaPreviewActivity.A0E.A0S;
                        float f = 0.0f;
                        if (x > 0.0f) {
                            if (linearLayoutManager.A0t() < mediaPreviewActivity.A0O.A05() - 1) {
                                f = Math.abs(x);
                            }
                        } else if (linearLayoutManager.A0r() > 0) {
                            f = Math.abs(x);
                        }
                        float f2 = C002301g.A0K.A00 * 2.0f;
                        if (f >= f2) {
                            this.A00 = -1.0f;
                            this.A01 = -1.0f;
                            return false;
                        } else if (y > f2) {
                            C60752q7 r12 = (C60752q7) view;
                            C54132eP r6 = mediaPreviewActivity.A0L;
                            PhotoViewPager photoViewPager = mediaPreviewActivity.A0F;
                            float x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            r6.A06 = r12;
                            r6.A04 = r12.A02.A0F;
                            r6.A09.setImageDrawable(r12.getDrawable());
                            r6.A09.setMaxWidth(r12.getWidth());
                            r6.A09.setMaxHeight(r12.getHeight());
                            r6.A09.setLayoutParams(new FrameLayout.LayoutParams(r12.getWidth(), r12.getHeight()));
                            r6.A00 = x2;
                            r6.A01 = y2;
                            r6.A06.invalidate();
                            Handler handler = r6.A0C;
                            Runnable runnable = r6.A0D;
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, 100);
                            r6.A05.setBackgroundColor(0);
                            r6.A0A.setTextColor(0);
                            r6.A03.setAlpha(0);
                            r6.A08.setVisibility(0);
                            ViewGroup viewGroup = r6.A07;
                            int[] iArr = r6.A0E;
                            viewGroup.getLocationOnScreen(iArr);
                            int i = iArr[0];
                            int i2 = iArr[1];
                            r6.A06.getLocationOnScreen(iArr);
                            r6.A07.setPadding(iArr[0] - i, iArr[1] - i2, 0, 0);
                            r6.A05.setPadding(0, 0, 0, r6.A08.getHeight() - photoViewPager.getHeight());
                            r6.A0A.getLocationOnScreen(iArr);
                            int A002 = r12.A01.A00();
                            int i3 = mediaPreviewActivity.A01;
                            if (i3 >= 0 && A002 != i3) {
                                mediaPreviewActivity.A01 = A002;
                                ((AbstractC16300pa) mediaPreviewActivity.A0O).A01.A00();
                            }
                        }
                    }
                    return false;
                } else if (action != 3) {
                    return false;
                }
            }
            C54132eP r0 = this.A02.A0L;
            r0.A0C.removeCallbacks(r0.A0D);
            return false;
        }
        this.A00 = motionEvent.getX();
        this.A01 = motionEvent.getY();
        return false;
    }
}
