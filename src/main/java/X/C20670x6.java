package X;

import java.util.LinkedList;

/* renamed from: X.0x6  reason: invalid class name and case insensitive filesystem */
public class C20670x6 {
    public int A00;
    public C20670x6 A01;
    public C20670x6 A02 = null;
    public LinkedList A03;

    public C20670x6(int i, LinkedList linkedList) {
        this.A00 = i;
        this.A03 = linkedList;
        this.A01 = null;
    }

    public String toString() {
        return AnonymousClass008.A0N(AnonymousClass008.A0S("LinkedEntry(key: "), this.A00, ")");
    }
}
