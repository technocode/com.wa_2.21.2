package X;

/* renamed from: X.0VI  reason: invalid class name */
public abstract class AnonymousClass0VI extends AnonymousClass0VG {
    public int A00;
    public int A01 = 0;
    public String A02;
    public AnonymousClass0VJ[] A03 = null;

    public AnonymousClass0VI() {
        super(null);
    }

    public AnonymousClass0VI(AnonymousClass0VI r2) {
        super(null);
        this.A02 = r2.A02;
        this.A00 = r2.A00;
        this.A03 = AnonymousClass0N2.A1r(r2.A03);
    }

    public AnonymousClass0VJ[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public void setPathData(AnonymousClass0VJ[] r6) {
        AnonymousClass0VJ[] r4 = this.A03;
        if (!AnonymousClass0N2.A1o(r4, r6)) {
            this.A03 = AnonymousClass0N2.A1r(r6);
            return;
        }
        for (int i = 0; i < r6.length; i++) {
            r4[i].A00 = r6[i].A00;
            for (int i2 = 0; i2 < r6[i].A01.length; i2++) {
                r4[i].A01[i2] = r6[i].A01[i2];
            }
        }
    }
}
