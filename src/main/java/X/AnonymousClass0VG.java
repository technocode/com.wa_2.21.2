package X;

import java.util.ArrayList;

/* renamed from: X.0VG  reason: invalid class name */
public abstract class AnonymousClass0VG {
    public AnonymousClass0VG() {
    }

    public AnonymousClass0VG(C17450rY r1) {
    }

    public boolean A00() {
        if (this instanceof AnonymousClass0VF) {
            AnonymousClass0VF r4 = (AnonymousClass0VF) this;
            int i = 0;
            while (true) {
                ArrayList arrayList = r4.A0C;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (((AnonymousClass0VG) arrayList.get(i)).A00()) {
                    return true;
                }
                i++;
            }
        } else if (!(this instanceof AnonymousClass0VH)) {
            return false;
        } else {
            AnonymousClass0VH r1 = (AnonymousClass0VH) this;
            return r1.A09.A00() || r1.A0A.A00();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(int[] r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass0VF
            if (r0 != 0) goto L_0x0045
            boolean r0 = r5 instanceof X.AnonymousClass0VH
            if (r0 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            r4 = r5
            X.0VH r4 = (X.AnonymousClass0VH) r4
            X.0VK r2 = r4.A09
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0043
            android.content.res.ColorStateList r1 = r2.A01
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r0)
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0043
            r3 = 1
            r2.A00 = r1
        L_0x0026:
            X.0VK r2 = r4.A0A
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0041
            android.content.res.ColorStateList r1 = r2.A01
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r0)
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0041
            r0 = 1
            r2.A00 = r1
        L_0x003f:
            r0 = r0 | r3
            return r0
        L_0x0041:
            r0 = 0
            goto L_0x003f
        L_0x0043:
            r3 = 0
            goto L_0x0026
        L_0x0045:
            r4 = r5
            X.0VF r4 = (X.AnonymousClass0VF) r4
            r3 = 0
            r2 = 0
        L_0x004a:
            java.util.ArrayList r1 = r4.A0C
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0060
            java.lang.Object r0 = r1.get(r3)
            X.0VG r0 = (X.AnonymousClass0VG) r0
            boolean r0 = r0.A01(r6)
            r2 = r2 | r0
            int r3 = r3 + 1
            goto L_0x004a
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VG.A01(int[]):boolean");
    }
}
