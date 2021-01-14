package X;

import java.util.LinkedList;

/* renamed from: X.1Z0  reason: invalid class name */
public class AnonymousClass1Z0 {
    public LinkedList A00 = new LinkedList();
    public AnonymousClass1Z1 A01 = new AnonymousClass1Z1();

    public AnonymousClass1Z0(byte[] bArr) {
        C77683gp r2 = (C77683gp) AnonymousClass078.A02(C77683gp.A03, bArr);
        AnonymousClass3AO r1 = r2.A02;
        this.A01 = new AnonymousClass1Z1(r1 == null ? AnonymousClass3AO.A0E : r1);
        for (AnonymousClass3AO r22 : r2.A01) {
            this.A00.add(new AnonymousClass1Z1(r22));
        }
    }

    public void A00(AnonymousClass1Z1 r4) {
        this.A00.addFirst(this.A01);
        this.A01 = r4;
        LinkedList linkedList = this.A00;
        if (linkedList.size() > 40) {
            linkedList.removeLast();
        }
    }
}
