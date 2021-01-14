package X;

import android.database.Cursor;

/* renamed from: X.0Dt  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC02860Dt extends AbstractC007503q {
    public double A00;
    public double A01;
    public int A02;

    public AbstractC02860Dt(C007303n r2, long j, byte b) {
        super(r2, j, b);
        super.A01 = 1;
        this.A02 = 0;
    }

    public AbstractC02860Dt(AbstractC02860Dt r10, C007303n r11, long j) {
        super(r10, r11, j, true, r10.A0m);
        super.A01 = 1;
        this.A00 = r10.A00;
        this.A01 = r10.A01;
        this.A02 = r10.A02;
    }

    public AbstractC02860Dt(AbstractC02860Dt r3, C007303n r4, long j, boolean z, byte b) {
        super(r3, r4, j, z, b);
        super.A01 = 1;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
    }

    @Override // X.AbstractC007503q
    public C05440On A0B() {
        C05440On A0B = super.A0B();
        if (A0B != null) {
            return A0B;
        }
        throw null;
    }

    public void A0u(Cursor cursor) {
        this.A00 = cursor.getDouble(cursor.getColumnIndexOrThrow("latitude"));
        this.A01 = cursor.getDouble(cursor.getColumnIndexOrThrow("longitude"));
        A0B().A04(cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail")), true);
    }

    public void A0v(Cursor cursor, AnonymousClass01I r4) {
        this.A00 = cursor.getDouble(cursor.getColumnIndexOrThrow("latitude"));
        this.A01 = cursor.getDouble(cursor.getColumnIndexOrThrow("longitude"));
        this.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("map_download_status"));
    }
}
