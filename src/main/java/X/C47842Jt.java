package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.2Jt  reason: invalid class name and case insensitive filesystem */
public final class C47842Jt {
    public final Collection A00;
    public final Collection A01;

    public C47842Jt(String... strArr) {
        Collection emptySet;
        int length = strArr.length;
        if (length == 0) {
            emptySet = Collections.emptySet();
        } else if (length == 1) {
            emptySet = Collections.singleton(strArr[0]);
        } else if (length == 2 || length == 3 || length == 4 || length == 5) {
            emptySet = Arrays.asList(strArr);
        } else {
            emptySet = new HashSet(Arrays.asList(strArr));
        }
        this.A00 = emptySet;
        this.A01 = new HashSet();
        for (String str : strArr) {
            Collection collection = this.A01;
            Object[] objArr = (Object[]) C47852Ju.A02.A00.get(str);
            if (objArr != null) {
                Collections.addAll(collection, objArr);
            } else {
                throw null;
            }
        }
    }
}
