package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.0CO  reason: invalid class name */
public class AnonymousClass0CO {
    public static volatile AnonymousClass0CO A04;
    public AnonymousClass0GF A00 = null;
    public ArrayList A01;
    public boolean A02 = false;
    public final AnonymousClass00G A03;

    public AnonymousClass0CO(AnonymousClass00G r2) {
        this.A03 = r2;
    }

    public static AnonymousClass0CO A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0CO.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0CO(AnonymousClass00G.A01);
                }
            }
        }
        return A04;
    }

    public C12520iE A01(String str) {
        synchronized (this) {
            if (this.A00 == null) {
                try {
                    A06();
                    AnonymousClass0GF r3 = new AnonymousClass0GF(this.A01.size());
                    Iterator it = this.A01.iterator();
                    while (it.hasNext()) {
                        C12520iE r1 = (C12520iE) it.next();
                        r3.A03(r1.A02, r1);
                    }
                    this.A00 = r3;
                } catch (IOException unused) {
                    throw new RuntimeException("empty metadata");
                }
            }
        }
        try {
            return (C12520iE) this.A00.A01(str);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    public String A02(int i, String str) {
        String[] strArr;
        A06();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C12520iE r6 = (C12520iE) it.next();
            int i2 = r6.A00;
            if (i2 == i) {
                if (i2 == 7 || i2 == 241 || i2 == 998) {
                    int length = str.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        String[] strArr2 = r6.A0B;
                        if (strArr2 == null) {
                            return str;
                        }
                        if (r6.A00(length - i3) <= 0) {
                            return str.substring(i3);
                        }
                        for (String str2 : strArr2) {
                            if (str2.charAt(0) == str.charAt(i3)) {
                            }
                        }
                        return str.substring(i3);
                    }
                    return str;
                }
                for (int i4 = 0; i4 < str.length() && (strArr = r6.A0B) != null; i4++) {
                    int i5 = 0;
                    boolean z = false;
                    while (true) {
                        if (i5 < strArr.length) {
                            if (z) {
                                break;
                            }
                            if (strArr[i5].charAt(0) == str.charAt(i4)) {
                                z = true;
                            }
                            i5++;
                        } else if (!z) {
                            return str.substring(i4);
                        }
                    }
                }
                return str;
            }
        }
        return str;
    }

    public String A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        A06();
        try {
            int parseInt = Integer.parseInt(str);
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C12520iE r1 = (C12520iE) it.next();
                if (r1.A00 == parseInt) {
                    return r1.A04;
                }
            }
            return "";
        } catch (NumberFormatException e) {
            Log.i("countries/get-tos-region", e);
            return "";
        }
    }

    public String A04(String str) {
        A06();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C12520iE r1 = (C12520iE) it.next();
            if (r1.A03.startsWith(str)) {
                return r1.A02;
            }
        }
        return "";
    }

    public String A05(String str) {
        A06();
        int length = str.length();
        if (length == 2) {
            C12520iE A012 = A01(str.toUpperCase(Locale.US));
            if (A012 != null) {
                return Integer.toString(A012.A00);
            }
        } else if (length != 3 || str.equals("999")) {
            return null;
        } else {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C12520iE r4 = (C12520iE) it.next();
                int[] iArr = r4.A07;
                if (iArr != null) {
                    for (int i : iArr) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        if (str.equals(sb.toString())) {
                            return Integer.toString(r4.A00);
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A06() {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CO.A06():void");
    }
}
