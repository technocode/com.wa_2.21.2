package X;

import android.os.Build;
import android.view.View;
import java.util.Comparator;

/* renamed from: X.0lu  reason: invalid class name and case insensitive filesystem */
public class C14300lu implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        View view = (View) obj2;
        float A01 = AnonymousClass0Q7.A01((View) obj);
        float z = Build.VERSION.SDK_INT >= 21 ? view.getZ() : 0.0f;
        if (A01 > z) {
            return -1;
        }
        return A01 < z ? 1 : 0;
    }
}
