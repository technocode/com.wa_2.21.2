package X;

import java.util.Arrays;

/* renamed from: X.0vr  reason: invalid class name and case insensitive filesystem */
public final class C19940vr {
    public C19930vq A00;
    public final C19930vq A01;
    public final String A02;

    public C19940vr(String str) {
        C19930vq r0 = new C19930vq();
        this.A01 = r0;
        this.A00 = r0;
        this.A02 = str;
    }

    public final void A00(String str, Object obj) {
        C19930vq r1 = new C19930vq();
        this.A00.A00 = r1;
        this.A00 = r1;
        r1.A01 = obj;
        if (str != null) {
            r1.A02 = str;
            return;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        String str = "";
        for (C19930vq r4 = this.A01.A00; r4 != null; r4 = r4.A00) {
            Object obj = r4.A01;
            sb.append(str);
            String str2 = r4.A02;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
