package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.0kM  reason: invalid class name and case insensitive filesystem */
public class C13510kM extends TouchDelegate {
    public boolean A00;
    public final int A01;
    public final Rect A02 = new Rect();
    public final Rect A03 = new Rect();
    public final Rect A04 = new Rect();
    public final View A05;

    public C13510kM(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.A01 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.A04.set(rect);
        Rect rect3 = this.A03;
        rect3.set(rect);
        int i = -this.A01;
        rect3.inset(i, i);
        this.A02.set(rect2);
        this.A05 = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r7.A03.contains(r1, r4) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13510kM.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
