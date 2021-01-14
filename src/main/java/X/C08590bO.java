package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0bO  reason: invalid class name and case insensitive filesystem */
public class C08590bO {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public C08590bO(List list, List list2, List list3, List list4) {
        this.A01 = list;
        this.A02 = list2;
        this.A03 = list3;
        this.A00 = list4;
    }

    public static C08590bO A00() {
        return new C08590bO(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    public C08590bO A01() {
        return new C08590bO(new ArrayList(this.A01), new ArrayList(this.A02), new ArrayList(this.A03), new ArrayList(this.A00));
    }
}
