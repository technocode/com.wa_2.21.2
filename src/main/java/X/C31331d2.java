package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1d2  reason: invalid class name and case insensitive filesystem */
public final class C31331d2 implements AbstractC17930sV {
    public final AbstractC30681bk A00;
    public final AbstractC16780qQ A01;

    public C31331d2(AbstractC16780qQ r2) {
        this.A01 = r2;
        this.A00 = new C453024e(r2);
    }

    public List A00(String str) {
        C30721bp A002 = C30721bp.A00("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            A002.A03[1] = 1;
        } else {
            A002.A02(1, str);
        }
        AbstractC16780qQ r0 = this.A01;
        r0.A01();
        Cursor A003 = C16830qW.A00(r0, A002, false);
        try {
            ArrayList arrayList = new ArrayList(A003.getCount());
            while (A003.moveToNext()) {
                arrayList.add(A003.getString(0));
            }
            return arrayList;
        } finally {
            A003.close();
            A002.A01();
        }
    }
}
