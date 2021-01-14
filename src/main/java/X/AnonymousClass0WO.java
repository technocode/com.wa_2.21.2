package X;

import android.os.Build;
import java.security.InvalidParameterException;

/* renamed from: X.0WO  reason: invalid class name */
public class AnonymousClass0WO {
    public static AnonymousClass0WO A04;
    public static AnonymousClass0WO A05;
    public static AnonymousClass0WO A06;
    public static AnonymousClass0WO A07;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        A04 = new AnonymousClass0WO(null, str, str2, i);
        A05 = new AnonymousClass0WO(null, str, str2, -1);
        String str3 = Build.PRODUCT;
        A06 = new AnonymousClass0WO(str3, null, null, i);
        A07 = new AnonymousClass0WO(str3, null, null, -1);
    }

    public AnonymousClass0WO(String str, String str2) {
        this("", str, str2, -1);
    }

    public AnonymousClass0WO(String str, String str2, String str3, int i) {
        str = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        str3 = str3 == null ? "" : str3;
        if (str2.isEmpty() == str3.isEmpty()) {
            this.A03 = str;
            this.A01 = str2;
            this.A02 = str3;
            this.A00 = i;
            return;
        }
        throw new InvalidParameterException("Must specify manufacturer and model");
    }

    public String A00() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(':');
        sb.append(this.A02);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r5.A02.isEmpty() != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r4.A02.isEmpty() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.AnonymousClass0WO
            r3 = 0
            if (r0 != 0) goto L_0x0006
            return r3
        L_0x0006:
            X.0WO r5 = (X.AnonymousClass0WO) r5
            java.lang.String r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r4.A02
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            java.lang.String r0 = r5.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = r5.A02
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r2 == 0) goto L_0x004b
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = r4.A00()
            java.lang.String r0 = r5.A00()
            boolean r0 = r1.equals(r0)
        L_0x003c:
            if (r0 == 0) goto L_0x004a
            int r2 = r4.A00
            r1 = -1
            if (r2 == r1) goto L_0x0049
            int r0 = r5.A00
            if (r0 == r1) goto L_0x0049
            if (r2 != r0) goto L_0x004a
        L_0x0049:
            r3 = 1
        L_0x004a:
            return r3
        L_0x004b:
            java.lang.String r2 = r4.A03
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x004a
            java.lang.String r1 = r5.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x004a
            boolean r0 = r2.equals(r1)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WO.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2.A02.isEmpty() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int hashCode() {
        /*
            r2 = this;
            java.lang.String r0 = r2.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r2.A02
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r2.A00()
        L_0x001d:
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r0 = r0.hashCode()
            return r0
        L_0x0033:
            java.lang.String r0 = r2.A03
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WO.hashCode():int");
    }
}
