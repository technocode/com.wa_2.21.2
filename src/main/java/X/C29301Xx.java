package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.1Xx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C29301Xx implements Comparator {
    public static final /* synthetic */ C29301Xx A00 = new C29301Xx();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
    }
}
