package X;

import java.util.Comparator;

/* renamed from: X.2LD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2LD implements Comparator {
    public static final /* synthetic */ AnonymousClass2LD A00 = new AnonymousClass2LD();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AnonymousClass1VI r8 = (AnonymousClass1VI) obj;
        AnonymousClass1VI r9 = (AnonymousClass1VI) obj2;
        long j = r8.A01;
        if ((j != 0 || r9.A01 != 0) && (j == 0 || r9.A01 == 0)) {
            return j != 0 ? 1 : -1;
        }
        return (r9.A00 > r8.A00 ? 1 : (r9.A00 == r8.A00 ? 0 : -1));
    }
}
