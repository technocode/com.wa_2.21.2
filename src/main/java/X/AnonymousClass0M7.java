package X;

/* renamed from: X.0M7  reason: invalid class name */
public abstract class AnonymousClass0M7 {
    public static final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 19) goto L_0x0011;
     */
    static {
        /*
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Sony"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0011
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            X.AnonymousClass0M7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0M7.<clinit>():void");
    }

    public int A00() {
        if (!(this instanceof AnonymousClass0M6)) {
            AnonymousClass2d1 r3 = (AnonymousClass2d1) this;
            int i = r3.A00;
            int[] iArr = r3.A01;
            if (i >= iArr.length) {
                return 0;
            }
            int i2 = iArr[i];
            r3.A00 = i + 1;
            return i2;
        }
        AnonymousClass0M6 r32 = (AnonymousClass0M6) this;
        int i3 = r32.A00;
        if (i3 >= r32.A01) {
            return 0;
        }
        int codePointAt = Character.codePointAt(r32.A02, i3);
        r32.A00 = Character.charCount(codePointAt) + r32.A00;
        int i4 = 65536 | codePointAt;
        if (!A00 || !C28051Sr.A1o(i4)) {
            return codePointAt;
        }
        return i4;
    }
}
