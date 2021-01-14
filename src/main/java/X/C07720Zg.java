package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.0Zg  reason: invalid class name and case insensitive filesystem */
public class C07720Zg implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C09550d8 r1 = (C09550d8) ((View) obj).getLayoutParams();
        C09550d8 r3 = (C09550d8) ((View) obj2).getLayoutParams();
        boolean z = r1.A04;
        if (z != r3.A04) {
            return z ? 1 : -1;
        }
        return r1.A03 - r3.A03;
    }
}
