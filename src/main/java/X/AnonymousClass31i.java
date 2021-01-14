package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.31i  reason: invalid class name */
public final /* synthetic */ class AnonymousClass31i implements Comparator {
    public static final /* synthetic */ AnonymousClass31i A00 = new AnonymousClass31i();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
