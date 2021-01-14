package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* renamed from: X.1T7  reason: invalid class name */
public class AnonymousClass1T7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public View A00;
    public AnonymousClass05q A01;
    public AbstractC009505y A02;
    public AbstractC009505y A03;
    public String A04;
    public boolean A05;

    public final void A00() {
        AnonymousClass05q r4 = this.A01;
        if (r4 != null) {
            this.A05 = false;
            AbstractC009505y r3 = this.A03;
            if (r3 != null) {
                ArrayList arrayList = new ArrayList();
                String str = this.A04;
                if (arrayList.size() == 0) {
                    arrayList.add(C008805h.A0T(str));
                    C008805h.A0P(r3, new C010106g(arrayList), r4);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r2 == 8) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r2 == 8) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r5 = this;
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x001e
            X.05q r0 = r5.A01
            if (r0 == 0) goto L_0x001e
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x001f
            int r2 = r1.getVisibility()
            r0 = 4
            if (r2 == r0) goto L_0x0018
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 != 0) goto L_0x001f
            r5.A00()
        L_0x001e:
            return
        L_0x001f:
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x001e
            android.view.View r0 = r5.A00
            int r2 = r0.getVisibility()
            r0 = 4
            if (r2 == r0) goto L_0x0031
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x001e
            X.05q r4 = r5.A01
            if (r4 == 0) goto L_0x001e
            r0 = 1
            r5.A05 = r0
            X.05y r3 = r5.A02
            if (r3 == 0) goto L_0x001e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r1 = r5.A04
            int r0 = r2.size()
            if (r0 != 0) goto L_0x005c
            X.06t r0 = X.C008805h.A0T(r1)
            r2.add(r0)
            X.06g r0 = new X.06g
            r0.<init>(r2)
            X.C008805h.A0P(r3, r0, r4)
            return
        L_0x005c:
            java.lang.String r1 = "arguments have to be continuous"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T7.onGlobalLayout():void");
    }
}
