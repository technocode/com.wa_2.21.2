package X;

import java.util.Comparator;

/* renamed from: X.2P7  reason: invalid class name */
public class AnonymousClass2P7 implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        AnonymousClass2P8 r6 = (AnonymousClass2P8) obj;
        AnonymousClass2P8 r7 = (AnonymousClass2P8) obj2;
        long j = r6.A01;
        long j2 = r7.A01;
        if (j != j2) {
            return j < j2 ? 1 : -1;
        }
        return r6.A03 - r7.A03;
    }
}
