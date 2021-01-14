package X;

import java.io.File;

/* renamed from: X.1WC  reason: invalid class name */
public class AnonymousClass1WC {
    public final AnonymousClass2KO A00;
    public final AnonymousClass1W6 A01;
    public final AnonymousClass2TF A02;
    public final C50132Tn A03;
    public final C50162Tq A04;

    public AnonymousClass1WC(AnonymousClass1W6 r2, AnonymousClass2TF r3, C50132Tn r4, AnonymousClass2KO r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r5;
        this.A04 = new C50162Tq();
    }

    public AnonymousClass1WC(AnonymousClass2TF r4, C56862jJ r5) {
        AnonymousClass2KO r2 = r5.A0H;
        AnonymousClass1W6 r1 = r5.A0I;
        if (r1 != null) {
            C50132Tn r0 = r5.A0K.A02;
            this.A01 = r1;
            this.A02 = r4;
            this.A03 = r0;
            this.A00 = r2;
            this.A04 = new C50162Tq();
            return;
        }
        throw null;
    }

    public int A00() {
        if (this instanceof C56902jN) {
            return 1;
        }
        if (!(this instanceof C56892jM)) {
            return !(this instanceof C56882jL) ? 0 : 3;
        }
        return 2;
    }

    public File A01() {
        File file = this.A02.A06;
        if (file != null) {
            return file;
        }
        throw null;
    }

    public String toString() {
        return AnonymousClass008.A0O(new StringBuilder("[job_id="), this.A01.A09, "]");
    }
}
