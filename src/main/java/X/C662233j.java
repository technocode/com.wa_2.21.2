package X;

import java.util.Comparator;

/* renamed from: X.33j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C662233j implements Comparator {
    public static final /* synthetic */ C662233j A00 = new C662233j();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C29241Xq r3 = (C29241Xq) obj;
        C29241Xq r4 = (C29241Xq) obj2;
        if (r3 == r4) {
            return 0;
        }
        if (r3 == null) {
            return -1;
        }
        if (r4 == null) {
            return 1;
        }
        String str = r3.A0B;
        if (str == null) {
            str = "";
        }
        String str2 = r4.A0B;
        if (str2 == null) {
            str2 = "";
        }
        return str.compareTo(str2);
    }
}
