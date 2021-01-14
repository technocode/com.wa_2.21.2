package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.1Xw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C29291Xw implements Comparator {
    public static final /* synthetic */ C29291Xw A00 = new C29291Xw();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (((File) obj2).lastModified() > ((File) obj).lastModified() ? 1 : (((File) obj2).lastModified() == ((File) obj).lastModified() ? 0 : -1));
    }
}
