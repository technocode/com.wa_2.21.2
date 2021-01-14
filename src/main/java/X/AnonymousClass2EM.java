package X;

import android.util.Size;
import java.util.Comparator;

/* renamed from: X.2EM  reason: invalid class name */
public class AnonymousClass2EM implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
    }
}
