package X;

import java.util.LinkedList;

/* renamed from: X.1UN  reason: invalid class name */
public class AnonymousClass1UN {
    public boolean A00;
    public final AnonymousClass1UO A01;
    public final LinkedList A02;

    public AnonymousClass1UN() {
        this.A02 = new LinkedList();
        this.A00 = false;
        this.A00 = true;
        this.A01 = new AnonymousClass1UO();
    }

    public AnonymousClass1UN(byte[] bArr) {
        this.A02 = new LinkedList();
        this.A00 = false;
        C77683gp r2 = (C77683gp) AnonymousClass078.A02(C77683gp.A03, bArr);
        AnonymousClass3AO r1 = r2.A02;
        this.A01 = new AnonymousClass1UO(r1 == null ? AnonymousClass3AO.A0E : r1);
        this.A00 = false;
        for (AnonymousClass3AO r22 : r2.A01) {
            this.A02.add(new AnonymousClass1UO(r22));
        }
    }
}
