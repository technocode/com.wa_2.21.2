package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: X.0pG  reason: invalid class name and case insensitive filesystem */
public final class C16100pG implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C16110pH r7 = (C16110pH) obj;
        C16110pH r8 = (C16110pH) obj2;
        RecyclerView recyclerView = r7.A03;
        boolean z = false;
        if (recyclerView == null) {
            z = true;
        }
        boolean z2 = false;
        if (r8.A03 == null) {
            z2 = true;
        }
        if (z == z2) {
            boolean z3 = r7.A04;
            if (z3 == r8.A04) {
                int i = r8.A02 - r7.A02;
                if (i != 0) {
                    return i;
                }
                int i2 = r7.A00 - r8.A00;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (z3) {
                return -1;
            }
        } else if (recyclerView == null) {
            return 1;
        } else {
            return -1;
        }
        return 1;
    }
}
