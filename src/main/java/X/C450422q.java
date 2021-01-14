package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: X.22q  reason: invalid class name and case insensitive filesystem */
public class C450422q implements AbstractC29171Xj {
    public int A00 = 0;
    public C05330Oc A01;
    public AnonymousClass0J5 A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final AnonymousClass09K A07;
    public final AnonymousClass0CW A08;
    public final C05330Oc A09;
    public final C05330Oc A0A;
    public final AnonymousClass0CT A0B;
    public final AnonymousClass0FA A0C;
    public final AnonymousClass03Y A0D;
    public final String A0E;
    public final String A0F;

    public C450422q(AnonymousClass03Y r7, AnonymousClass0CT r8, AnonymousClass09K r9, AnonymousClass0CW r10, C05330Oc r11, C05330Oc r12, String str, long j, String str2, int i, int i2, long j2, boolean z) {
        AnonymousClass0FA r3;
        this.A0B = r8;
        this.A0A = r11;
        this.A09 = r12;
        this.A0E = str;
        this.A05 = j;
        this.A0F = str2;
        this.A0D = r7;
        this.A07 = r9;
        this.A08 = r10;
        this.A04 = i;
        this.A03 = i2;
        this.A06 = j2;
        if (i2 <= 0 || !z) {
            r3 = null;
        } else {
            r3 = new AnonymousClass0FA(new Random(), i2, 3000);
        }
        this.A0C = r3;
        A02(false);
    }

    public static C05330Oc A00(Collection collection, String str, String str2, String str3, boolean z) {
        Set set;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C05330Oc r2 = (C05330Oc) it.next();
            if (r2.A04.endsWith(".whatsapp.net") && (str == null || str.equals(r2.A08))) {
                if (z) {
                    Set set2 = r2.A0B;
                    if (set2 != null && !set2.contains(str2)) {
                    }
                } else {
                    Set set3 = r2.A09;
                    if (set3 != null && !set3.contains(str2)) {
                    }
                }
                if (str3 == null || ((set = r2.A0A) != null && set.contains(str3))) {
                    return r2;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r47 != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        if (r26 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C450422q A01(X.AnonymousClass00S r35, X.C002701k r36, X.AnonymousClass03Y r37, X.AnonymousClass009 r38, X.C000300f r39, X.AnonymousClass0CT r40, X.AnonymousClass09K r41, X.AnonymousClass0CW r42, X.C05320Ob r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, int r47, long r48) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C450422q.A01(X.00S, X.01k, X.03Y, X.009, X.00f, X.0CT, X.09K, X.0CW, X.0Ob, java.lang.String, java.lang.String, java.lang.String, int, long):X.22q");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r15.A07.A05 == false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(boolean r16) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C450422q.A02(boolean):void");
    }

    @Override // X.AbstractC29171Xj
    public long A4t() {
        AnonymousClass0FA r2 = this.A0C;
        if (r2 != null && this.A00 >= this.A04) {
            Long A012 = r2.A01();
            if (A012 != null) {
                return A012.longValue();
            }
            Log.e("Mms4RouteSupplier/getBackoffTime unexpected exponential backoff of null");
        }
        return this.A06;
    }

    @Override // X.AbstractC29171Xj
    public int A5l() {
        return this.A00;
    }

    @Override // X.AbstractC29171Xj
    public AnonymousClass0J5 A5o() {
        return this.A02;
    }

    @Override // X.AbstractC29171Xj
    public void AFg(boolean z, int i) {
        if (i != -1) {
            this.A0B.A07(i);
        }
        this.A00++;
        A02(z);
    }
}
