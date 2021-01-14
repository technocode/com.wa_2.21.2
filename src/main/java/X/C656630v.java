package X;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: X.30v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C656630v implements Comparator {
    public static final /* synthetic */ C656630v A00 = new C656630v();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Pair) obj2).second).compareTo((Integer) ((Pair) obj).second);
    }
}
