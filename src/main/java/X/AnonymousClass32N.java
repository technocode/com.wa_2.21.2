package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.32N  reason: invalid class name */
public class AnonymousClass32N {
    public List A00 = new ArrayList();
    public final HashMap A01 = new HashMap();

    public int A00(String str) {
        int i = 0;
        for (AnonymousClass3PP r0 : this.A00) {
            if (r0.A00.A0A.getRawString().equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void A01(AnonymousClass3PP r5) {
        this.A00.add(r5);
        String rawString = r5.A00.A0A.getRawString();
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(rawString)) {
            hashMap.put(rawString, Long.valueOf((long) hashMap.size()));
        }
    }
}
