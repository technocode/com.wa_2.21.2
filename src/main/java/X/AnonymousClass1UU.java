package X;

import java.util.Comparator;

/* renamed from: X.1UU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1UU implements Comparator {
    public static final /* synthetic */ AnonymousClass1UU A00 = new AnonymousClass1UU();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C08570bM r6 = (C08570bM) obj;
        C08570bM r7 = (C08570bM) obj2;
        long j = r6.A00;
        long j2 = r7.A00;
        if (j != j2) {
            return j < j2 ? 1 : -1;
        }
        return r6.A01.getRawString().compareTo(r7.A01.getRawString());
    }
}
