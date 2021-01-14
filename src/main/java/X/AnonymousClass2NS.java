package X;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaEditText;

/* renamed from: X.2NS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2NS implements View.OnTouchListener {
    public final /* synthetic */ C53392d8 A00;

    public /* synthetic */ AnonymousClass2NS(C53392d8 r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        C53392d8 r4 = this.A00;
        if (!(motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Point point = new Point(((int) x) + iArr[0], ((int) y) + iArr[1]);
            WaEditText waEditText = r4.A0G;
            if (AnonymousClass1MI.A00(point, waEditText) && waEditText.A02(point)) {
                r4.A03(waEditText);
                return true;
            } else if (motionEvent.getY() < 0.0f) {
                return true;
            }
        }
        C26621Lq r1 = r4.A06;
        AnonymousClass1Nh r0 = r1.A0C;
        if (r0 == null || !r0.isShowing()) {
            return false;
        }
        AnonymousClass1Nh r42 = r1.A0C;
        if (r42 != null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            ViewGroup viewGroup = (ViewGroup) r42.getContentView();
            view.getLocationOnScreen(r42.A02);
            int[] iArr2 = r42.A02;
            int i2 = x2 + iArr2[0];
            int i3 = y2 + iArr2[1];
            int childCount = viewGroup.getChildCount();
            View view2 = r42.A00;
            r42.A00 = null;
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    i4 = 0;
                    break;
                }
                View childAt = viewGroup.getChildAt(i4);
                childAt.getLocationOnScreen(r42.A02);
                int i5 = r42.A02[0];
                if (i2 > i5 && i2 < childAt.getWidth() + i5 && i3 > (i = r42.A02[1]) && i3 < childAt.getHeight() + i) {
                    childAt.setPressed(true);
                    r42.A00 = childAt;
                    break;
                }
                i4++;
            }
            if (!(view2 == null || view2 == r42.A00)) {
                view2.setPressed(false);
            }
            if (motionEvent.getAction() != 1 || r42.A00 == null) {
                return false;
            }
            int[] iArr3 = r42.A03[i4];
            AbstractC26941Ng r02 = r42.A01;
            if (r02 != null) {
                r02.AKD(iArr3);
            }
            r42.dismiss();
            return false;
        }
        throw null;
    }
}
