package X;

/* renamed from: X.0HG  reason: invalid class name */
public class AnonymousClass0HG {
    public static volatile AnonymousClass0HG A02;
    public final AnonymousClass00Y A00;
    public final AnonymousClass0HH A01;

    public AnonymousClass0HG(AnonymousClass00Y r1, AnonymousClass0HH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass0HG A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0HG.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0HG(AnonymousClass00Y.A00(), AnonymousClass0HH.A00());
                }
            }
        }
        return A02;
    }

    public final void A01(Integer num) {
        AnonymousClass357 A022 = this.A01.A02();
        if (A022 != null) {
            AnonymousClass21M r3 = new AnonymousClass21M();
            r3.A02 = Long.valueOf((long) A022.A00);
            r3.A01 = Long.valueOf((long) A022.A02);
            r3.A00 = num;
            this.A00.A0B(r3, null, false);
        }
    }

    public final void A02(Integer num) {
        AnonymousClass357 A022 = this.A01.A02();
        if (A022 != null) {
            AnonymousClass21N r3 = new AnonymousClass21N();
            r3.A02 = Long.valueOf((long) A022.A00);
            r3.A01 = Long.valueOf((long) A022.A02);
            r3.A00 = num;
            this.A00.A0B(r3, null, false);
        }
    }
}
