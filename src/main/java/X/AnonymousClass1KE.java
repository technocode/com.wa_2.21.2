package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.1KE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1KE implements Comparator {
    public static final /* synthetic */ AnonymousClass1KE A00 = new AnonymousClass1KE();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
    }
}
