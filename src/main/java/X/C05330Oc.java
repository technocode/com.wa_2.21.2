package X;

import java.util.Set;

/* renamed from: X.0Oc  reason: invalid class name and case insensitive filesystem */
public class C05330Oc {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final Set A0A;
    public final Set A0B;
    public final boolean A0C;

    public C05330Oc(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Set set, Set set2, Set set3, String str9, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = str5;
        this.A01 = str6;
        this.A02 = str7;
        this.A03 = str8;
        this.A0B = set;
        this.A09 = set2;
        this.A0A = set3;
        String str10 = "fallback";
        this.A08 = !str10.equals(str9) ? "primary" : str10;
        this.A0C = z;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("RouteHost{hostname='");
        AnonymousClass008.A1W(A0S, this.A04, '\'', ", upload=");
        Object obj = this.A0B;
        Object obj2 = "all";
        if (obj == null) {
            obj = obj2;
        }
        A0S.append(obj);
        A0S.append(", download=");
        Set set = this.A09;
        if (set != null) {
            obj2 = set;
        }
        A0S.append(obj2);
        A0S.append(", downloadBuckets=");
        Object obj3 = this.A0A;
        if (obj3 == null) {
            obj3 = "null";
        }
        A0S.append(obj3);
        A0S.append(", type=");
        A0S.append(this.A08);
        A0S.append(", forceIp=");
        A0S.append(this.A0C);
        A0S.append('}');
        return A0S.toString();
    }
}
