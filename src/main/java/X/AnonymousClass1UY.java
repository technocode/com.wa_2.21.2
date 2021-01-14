package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.1UY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1UY implements Comparator {
    public static final /* synthetic */ AnonymousClass1UY A00 = new AnonymousClass1UY();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj2).getValue()).compareTo((Integer) ((Map.Entry) obj).getValue());
    }
}
