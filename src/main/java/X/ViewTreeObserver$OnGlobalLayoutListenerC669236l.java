package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.util.Log;

/* renamed from: X.36l  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC669236l implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver A00;
    public final /* synthetic */ ScaleGestureDetector$OnScaleGestureListenerC669436n A01;
    public final /* synthetic */ boolean A02;

    public ViewTreeObserver$OnGlobalLayoutListenerC669236l(ScaleGestureDetector$OnScaleGestureListenerC669436n r1, ViewTreeObserver viewTreeObserver, boolean z) {
        this.A01 = r1;
        this.A00 = viewTreeObserver;
        this.A02 = z;
    }

    public void onGlobalLayout() {
        Log.d("DraggableChildContainer/setOneTimeLayoutListener onGlobalLayout Called");
        this.A00.removeOnGlobalLayoutListener(this);
        ScaleGestureDetector$OnScaleGestureListenerC669436n r4 = this.A01;
        View view = r4.A0C;
        if (view != null && r4.A0J) {
            view.setPivotX((float) (view.getMeasuredWidth() >> 1));
            View view2 = r4.A0C;
            view2.setPivotY((float) (view2.getMeasuredHeight() >> 1));
            if (this.A02) {
                int i = r4.A09;
                int i2 = r4.A0A;
                r4.A09();
                r4.A0Q.A0J(r4.A0C, i, i2);
                r4.A04 = i;
                r4.A05 = i2;
            } else {
                int A022 = r4.A02(r4.A0C.getWidth());
                int A03 = r4.A03(r4.A0C.getHeight());
                r4.A09();
                r4.A0Q.A0J(r4.A0C, A022, A03);
                r4.A04 = A022;
                r4.A05 = A03;
            }
            r4.A0J = false;
        } else if (view != null && !r4.A0K) {
            int A023 = r4.A02(view.getWidth());
            int A032 = r4.A03(r4.A0C.getHeight());
            r4.A09();
            r4.A0Q.A0J(r4.A0C, A023, A032);
            r4.A04 = A023;
            r4.A05 = A032;
        }
    }
}
