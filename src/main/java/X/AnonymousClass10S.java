package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.10S  reason: invalid class name */
public class AnonymousClass10S implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
