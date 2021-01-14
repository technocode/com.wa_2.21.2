package X;

import java.util.Comparator;

/* renamed from: X.13b  reason: invalid class name and case insensitive filesystem */
public final class C227613b implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        AnonymousClass13V r6 = (AnonymousClass13V) obj2;
        int i = 0;
        int i2 = 0;
        if (((AnonymousClass13V) obj).A02.startsWith("OMX.google")) {
            i2 = -1;
        }
        if (r6.A02.startsWith("OMX.google")) {
            i = -1;
        }
        return i2 - i;
    }
}
