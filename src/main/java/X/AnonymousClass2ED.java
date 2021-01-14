package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.2ED  reason: invalid class name */
public class AnonymousClass2ED extends OrientationEventListener {
    public int A00 = -1;

    public AnonymousClass2ED(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        if (r3 >= 300) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r3) {
        /*
            r2 = this;
            r0 = 330(0x14a, float:4.62E-43)
            if (r3 >= r0) goto L_0x0029
            r0 = 30
            if (r3 < r0) goto L_0x0029
            r0 = 60
            if (r3 < r0) goto L_0x0014
            r0 = 120(0x78, float:1.68E-43)
            if (r3 >= r0) goto L_0x0014
            r1 = 1
        L_0x0011:
            r2.A00 = r1
            return
        L_0x0014:
            r0 = 150(0x96, float:2.1E-43)
            if (r3 < r0) goto L_0x001e
            r0 = 210(0xd2, float:2.94E-43)
            if (r3 >= r0) goto L_0x001e
            r1 = 2
            goto L_0x0011
        L_0x001e:
            r0 = 240(0xf0, float:3.36E-43)
            if (r3 < r0) goto L_0x0027
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 3
            if (r3 < r0) goto L_0x0011
        L_0x0027:
            r1 = -1
            goto L_0x0011
        L_0x0029:
            r1 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ED.onOrientationChanged(int):void");
    }
}
