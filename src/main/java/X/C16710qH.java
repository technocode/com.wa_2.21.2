package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0qH  reason: invalid class name and case insensitive filesystem */
public class C16710qH {
    public final AbstractC16700qG A00;
    public final Set A01;
    public final int[] A02;
    public final String[] A03;

    public C16710qH(AbstractC16700qG r3, int[] iArr, String[] strArr) {
        this.A00 = r3;
        this.A02 = iArr;
        this.A03 = strArr;
        if (iArr.length == 1) {
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.A01 = Collections.unmodifiableSet(hashSet);
        }
    }
}
