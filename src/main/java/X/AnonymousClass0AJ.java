package X;

import android.content.ContentValues;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0AJ  reason: invalid class name */
public class AnonymousClass0AJ extends AnonymousClass01C {
    public static final String[] A00 = {"jid", "entry_point_type", "entry_point_id", "entry_point_time"};

    public AnonymousClass0AJ(AnonymousClass08H r1) {
        super(r1);
    }

    public void A09(C28241Tl r7) {
        Jid jid = r7.A01;
        if (jid == null) {
            AnonymousClass00E.A08(false, "setOrUpdateLastEntryPoint/jid is null");
            return;
        }
        C04600Kz A02 = AnonymousClass01C.A02();
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("jid", jid.getRawString());
        contentValues.put("entry_point_type", r7.A03);
        contentValues.put("entry_point_id", r7.A02);
        contentValues.put("entry_point_time", Long.valueOf(r7.A00));
        try {
            A08("wa_last_entry_point", contentValues);
        } catch (IllegalArgumentException e) {
            StringBuilder A0S = AnonymousClass008.A0S("setOrUpdateLastEntryPoint/unable to update entry point for jid ");
            A0S.append(jid);
            String obj = A0S.toString();
            if (obj != null) {
                Log.e(obj, e);
            } else {
                throw null;
            }
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("setOrUpdateLastEntryPoint/updated entry point for jid=");
        A0S2.append(jid);
        A0S2.append(' ');
        A0S2.append(contentValues);
        A0S2.append(" | time: ");
        AnonymousClass008.A0r(A02, A0S2);
    }
}
