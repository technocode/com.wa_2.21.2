package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2He  reason: invalid class name and case insensitive filesystem */
public class C47282He {
    public static volatile C47282He A09;
    public final AnonymousClass0GG A00;
    public final AnonymousClass02M A01;
    public final C04360Kb A02;
    public final AnonymousClass01A A03;
    public final AnonymousClass04j A04;
    public final AnonymousClass0A8 A05;
    public final AnonymousClass0EO A06;
    public final AnonymousClass0AR A07;
    public final AnonymousClass0C4 A08;

    public C47282He(AnonymousClass02M r1, AnonymousClass0C4 r2, AnonymousClass0AR r3, C04360Kb r4, AnonymousClass01A r5, AnonymousClass0GG r6, AnonymousClass0EO r7, AnonymousClass04j r8, AnonymousClass0A8 r9) {
        this.A01 = r1;
        this.A08 = r2;
        this.A07 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r6;
        this.A06 = r7;
        this.A04 = r8;
        this.A05 = r9;
    }

    public static C47282He A00() {
        if (A09 == null) {
            synchronized (C47282He.class) {
                if (A09 == null) {
                    A09 = new C47282He(AnonymousClass02M.A00(), AnonymousClass0C4.A00(), AnonymousClass0AR.A00(), C04360Kb.A00(), AnonymousClass01A.A00(), AnonymousClass0GG.A00(), AnonymousClass0EO.A00(), AnonymousClass04j.A00(), AnonymousClass0A8.A00);
                }
            }
        }
        return A09;
    }

    public void A01(Activity activity, AnonymousClass2ZH r21, C007003k r22, String str, String str2) {
        Boolean bool;
        AbstractC47272Hd r1;
        if (r22.A09()) {
            AnonymousClass0AR r12 = this.A07;
            AnonymousClass0C4 r4 = this.A08;
            AnonymousClass0EO r5 = this.A06;
            AnonymousClass0A8 r6 = this.A05;
            Jid A022 = r22.A02(AnonymousClass02U.class);
            if (A022 != null) {
                r12.A08(new C59012mu(this, r4, r5, r6, (AnonymousClass02U) A022, r22, r21));
                return;
            }
            throw null;
        }
        Jid A023 = r22.A02(UserJid.class);
        if (A023 != null) {
            UserJid userJid = (UserJid) A023;
            AnonymousClass0GG r0 = this.A00;
            if (str != null) {
                bool = r0.A01(userJid);
            } else {
                bool = null;
            }
            r0.A08(activity, null, null, false, new C27911Sc(true, userJid, str, bool, str2));
            this.A02.A0I(userJid, true, true);
            if (r21 != null && (r1 = r21.A00) != null) {
                r1.ALb(r21.A01);
                return;
            }
            return;
        }
        throw null;
    }

    public void A02(C007003k r7, String str) {
        C04360Kb r4 = this.A02;
        Jid A022 = r7.A02(AnonymousClass02N.class);
        if (A022 != null) {
            r4.A0G((AnonymousClass02N) A022, str, null, !r7.A09());
            r7.A0U = true;
            AnonymousClass01A r42 = this.A03;
            if (r42 != null) {
                r7.A0U = true;
                AnonymousClass01B r2 = r42.A04;
                if (r2 != null) {
                    C04600Kz A023 = AnonymousClass01C.A02();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("is_spam_reported", Boolean.valueOf(r7.A0U));
                    r2.A0G(contentValues, r7.A09);
                    StringBuilder sb = new StringBuilder("updated is reported spam for jid=");
                    sb.append(r7.A09);
                    sb.append(' ');
                    sb.append(contentValues);
                    sb.append(" | time: ");
                    sb.append(A023.A00());
                    Log.i(sb.toString());
                    r42.A02.A00(r7);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public boolean A03(Context context) {
        if (this.A04.A05()) {
            return true;
        }
        Log.w("spamreportmanager/spam/report/no-network-cannot-block-report");
        boolean A022 = AnonymousClass04j.A02(context);
        int i = R.string.no_network_cannot_block;
        if (A022) {
            i = R.string.no_network_cannot_block_airplane;
        }
        this.A01.A06(i, 0);
        return false;
    }
}
