package X;

import android.os.Message;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0XH  reason: invalid class name */
public class AnonymousClass0XH implements AnonymousClass0C0 {
    public static volatile AnonymousClass0XH A0A;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass0EY A02;
    public final AnonymousClass01A A03;
    public final AnonymousClass08C A04;
    public final AnonymousClass01K A05;
    public final AnonymousClass0AP A06;
    public final AnonymousClass0AR A07;
    public final AnonymousClass01R A08;
    public final AnonymousClass00T A09;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{189};
    }

    public AnonymousClass0XH(AnonymousClass009 r1, AnonymousClass01I r2, AnonymousClass00T r3, AnonymousClass0AR r4, AnonymousClass01A r5, AnonymousClass01K r6, AnonymousClass0AP r7, AnonymousClass08C r8, AnonymousClass0EY r9, AnonymousClass01R r10) {
        this.A00 = r1;
        this.A01 = r2;
        this.A09 = r3;
        this.A07 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r8;
        this.A02 = r9;
        this.A08 = r10;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        if (i != 189) {
            return false;
        }
        AnonymousClass0M5 r3 = (AnonymousClass0M5) message.obj;
        AnonymousClass1XX r8 = (AnonymousClass1XX) message.getData().getParcelable("stanzaKey");
        AnonymousClass00E.A04(r8, "stanzaKey is null");
        long A042 = C006803i.A04(r3.A0G("t", null), System.currentTimeMillis());
        AnonymousClass0M5 A0C = r3.A0C(0);
        if (A0C != null) {
            AnonymousClass009 r5 = this.A00;
            AnonymousClass02N r9 = (AnonymousClass02N) A0C.A08(AnonymousClass02N.class, "jid", r5);
            if (r9 == null) {
                StringBuilder A0S = AnonymousClass008.A0S("profile-picture-notification-handler/ignoring notification for invalid jid: ");
                A0S.append(A0C.A0G("jid", null));
                Log.w(A0S.toString());
                return false;
            }
            UserJid userJid = (UserJid) A0C.A08(UserJid.class, "author", r5);
            if (AnonymousClass0M5.A02(A0C, "set")) {
                this.A09.ANF(new RunnableC64592yR(this, r8, r9, userJid, C006803i.A02(A0C.A0G("id", null), -1), A042));
                return true;
            } else if (AnonymousClass0M5.A02(A0C, "delete")) {
                this.A09.ANF(new RunnableC64592yR(this, r8, r9, userJid, -1, A042));
                return true;
            } else if (AnonymousClass0M5.A02(A0C, "request")) {
                this.A09.ANF(new RunnableEBaseShape1S0300000_I0_1(this, r8, r9, 8));
                return true;
            } else {
                this.A07.A0M(r8);
                return true;
            }
        } else {
            throw null;
        }
    }
}
