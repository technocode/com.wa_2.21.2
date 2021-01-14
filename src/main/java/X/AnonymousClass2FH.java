package X;

import java.util.Comparator;

/* renamed from: X.2FH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2FH implements Comparator {
    public static final /* synthetic */ AnonymousClass2FH A00 = new AnonymousClass2FH();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j;
        C48172Le r7 = (C48172Le) obj2;
        C77303fw r0 = ((C48172Le) obj).A03;
        long j2 = 0;
        if (r0 != null) {
            j = r0.A01;
        } else {
            j = 0;
        }
        C77303fw r02 = r7.A03;
        if (r02 != null) {
            j2 = r02.A01;
        }
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
