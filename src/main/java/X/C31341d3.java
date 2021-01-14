package X;

import android.database.Cursor;

/* renamed from: X.1d3  reason: invalid class name and case insensitive filesystem */
public final class C31341d3 implements AbstractC17950sX {
    public final AbstractC30681bk A00;
    public final AbstractC16780qQ A01;

    public C31341d3(AbstractC16780qQ r2) {
        this.A01 = r2;
        this.A00 = new C453124f(r2);
    }

    public Long A00(String str) {
        C30721bp A002 = C30721bp.A00("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            A002.A03[1] = 1;
        } else {
            A002.A02(1, str);
        }
        AbstractC16780qQ r0 = this.A01;
        r0.A01();
        Long l = null;
        Cursor A003 = C16830qW.A00(r0, A002, false);
        try {
            if (A003.moveToFirst() && !A003.isNull(0)) {
                l = Long.valueOf(A003.getLong(0));
            }
            return l;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public void A01(C17940sW r3) {
        AbstractC16780qQ r1 = this.A01;
        r1.A01();
        r1.A02();
        try {
            this.A00.A03(r3);
            r1.A04();
        } finally {
            r1.A03();
        }
    }
}
