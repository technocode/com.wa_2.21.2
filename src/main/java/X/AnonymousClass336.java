package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.336  reason: invalid class name */
public final /* synthetic */ class AnonymousClass336 implements Comparator {
    public static final /* synthetic */ AnonymousClass336 A00 = new AnonymousClass336();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().substring(0, 2).compareTo(((File) obj2).getName().substring(0, 2));
    }
}
