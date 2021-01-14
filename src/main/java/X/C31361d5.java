package X;

import android.database.Cursor;

/* renamed from: X.1d5  reason: invalid class name and case insensitive filesystem */
public final class C31361d5 implements AbstractC17970sZ {
    public final AbstractC30681bk A00;
    public final AbstractC16780qQ A01;
    public final AbstractC16810qT A02;

    public C31361d5(AbstractC16780qQ r2) {
        this.A01 = r2;
        this.A00 = new C453224g(r2);
        this.A02 = new C31351d4(r2);
    }

    public C17960sY A00(String str) {
        C30721bp A002 = C30721bp.A00("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            A002.A03[1] = 1;
        } else {
            A002.A02(1, str);
        }
        AbstractC16780qQ r2 = this.A01;
        r2.A01();
        C17960sY r0 = null;
        Cursor A003 = C16830qW.A00(r2, A002, false);
        try {
            int A08 = AnonymousClass0N2.A08(A003, "work_spec_id");
            int A082 = AnonymousClass0N2.A08(A003, "system_id");
            if (A003.moveToFirst()) {
                r0 = new C17960sY(A003.getString(A08), A003.getInt(A082));
            }
            return r0;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public void A01(C17960sY r3) {
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

    public void A02(String str) {
        AbstractC16780qQ r4 = this.A01;
        r4.A01();
        AbstractC16810qT r3 = this.A02;
        AbstractC30751bt A002 = r3.A00();
        if (str == null) {
            ((C30791bx) A002).A00.bindNull(1);
        } else {
            ((C30791bx) A002).A00.bindString(1, str);
        }
        r4.A02();
        AnonymousClass248 r1 = (AnonymousClass248) A002;
        try {
            r1.A00.executeUpdateDelete();
            r4.A04();
            r4.A03();
            if (r1 == r3.A02) {
                r3.A01.set(false);
            }
        } catch (Throwable th) {
            r4.A03();
            r3.A02(A002);
            throw th;
        }
    }
}
