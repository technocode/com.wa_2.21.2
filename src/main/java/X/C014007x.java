package X;

import java.util.HashMap;

/* renamed from: X.07x  reason: invalid class name and case insensitive filesystem */
public class C014007x extends C014107y {
    public HashMap A00 = new HashMap();

    @Override // X.C014107y
    public Object A01(Object obj) {
        Object A01 = super.A01(obj);
        this.A00.remove(obj);
        return A01;
    }
}
