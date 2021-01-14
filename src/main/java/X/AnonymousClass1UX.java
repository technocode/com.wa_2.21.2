package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.1UX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1UX implements Comparator {
    public static final /* synthetic */ AnonymousClass1UX A00 = new AnonymousClass1UX();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((C28571Uv) ((Map.Entry) obj2).getValue()).compareTo((C28571Uv) ((Map.Entry) obj).getValue());
    }
}
