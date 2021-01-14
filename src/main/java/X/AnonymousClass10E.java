package X;

import java.util.TreeMap;

/* renamed from: X.10E  reason: invalid class name */
public class AnonymousClass10E {
    public AnonymousClass10D A00;
    public boolean A01;

    public AnonymousClass10E(AnonymousClass10P r3) {
        int[] iArr;
        TreeMap treeMap = r3.A07.A01;
        if (treeMap != null && (iArr = (int[]) treeMap.get("trace_config.duration_condition")) != null && iArr.length > 0) {
            this.A00 = new AnonymousClass10D(iArr);
            this.A01 = true;
        }
    }
}
