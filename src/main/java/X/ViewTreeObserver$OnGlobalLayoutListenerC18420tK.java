package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0tK  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC18420tK implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(new LinkedList());

    public ViewTreeObserver$OnGlobalLayoutListenerC18420tK(View view) {
        float f;
        this.A02 = view;
        this.A00 = false;
        float f2 = view.getContext().getResources().getDisplayMetrics().density * 100.0f;
        if (f2 >= 0.0f) {
            f = f2 + 0.5f;
        } else {
            f = f2 - 0.5f;
        }
        this.A01 = (int) f;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void onGlobalLayout() {
        int height;
        AbstractC009505y r2;
        AbstractC009505y r22;
        Rect rect = new Rect();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (view.getRootWindowInsets() != null) {
                defaultDisplay.getRealSize(point);
                height = point.y - view.getRootWindowInsets().getStableInsetBottom();
            } else {
                defaultDisplay.getSize(point);
                height = point.y;
            }
        } else if (i >= 21) {
            Display defaultDisplay2 = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            Point point2 = new Point();
            defaultDisplay2.getSize(point2);
            height = point2.y;
        } else {
            height = view.getRootView().getHeight();
        }
        int i2 = height - rect.bottom;
        boolean z = this.A00;
        if (!z && i2 > this.A01) {
            this.A00 = true;
            List<C31781dn> list = this.A03;
            synchronized (list) {
                for (C31781dn r3 : list) {
                    if (!(r3 == null || (r22 = r3.A00.A02) == null)) {
                        C008805h.A0P(r22, new C010106g(new ArrayList()), r3.A01);
                    }
                }
            }
        } else if (z) {
            int i3 = this.A01;
            if (i2 > i3) {
                List list2 = this.A03;
                synchronized (list2) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            } else if (i2 < i3) {
                this.A00 = false;
                List<C31781dn> list3 = this.A03;
                synchronized (list3) {
                    for (C31781dn r32 : list3) {
                        if (!(r32 == null || (r2 = r32.A00.A01) == null)) {
                            C008805h.A0P(r2, new C010106g(new ArrayList()), r32.A01);
                        }
                    }
                }
            }
        }
    }
}
