package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPaymentInviteOrSetupJob;
import java.util.Arrays;

/* renamed from: X.0Xm  reason: invalid class name and case insensitive filesystem */
public class C07400Xm {
    public static volatile C07400Xm A06;
    public final AnonymousClass01J A00;
    public final AnonymousClass00S A01;
    public final C01980Ae A02;
    public final C02010Ah A03;
    public final C02040Ak A04;
    public final C018809u A05 = C018809u.A00("PaymentInviteOrSetupNotifier", "notification", "COMMON");

    public C07400Xm(AnonymousClass00S r4, AnonymousClass01J r5, C02010Ah r6, C01980Ae r7, C02040Ak r8) {
        this.A01 = r4;
        this.A00 = r5;
        this.A03 = r6;
        this.A02 = r7;
        this.A04 = r8;
    }

    public static C07400Xm A00() {
        if (A06 == null) {
            synchronized (C07400Xm.class) {
                if (A06 == null) {
                    A06 = new C07400Xm(AnonymousClass00S.A00(), AnonymousClass01J.A00(), C02010Ah.A00(), C01980Ae.A00(), C02040Ak.A00());
                }
            }
        }
        return A06;
    }

    public static final String A01(String str, UserJid userJid) {
        String[] split = str.split(";");
        if (split.length <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userJid.getRawString());
            sb.append(";");
            return sb.toString();
        } else if (Arrays.asList(split).contains(userJid.getRawString())) {
            return str;
        } else {
            StringBuilder A0S = AnonymousClass008.A0S(str);
            A0S.append(userJid.getRawString());
            A0S.append(";");
            return A0S.toString();
        }
    }

    public static final String A02(String str, UserJid userJid) {
        String[] split = str.split(";");
        int length = split.length;
        String str2 = "";
        if (length > 0) {
            for (String str3 : split) {
                if (!userJid.getRawString().equals(str3)) {
                    str2 = AnonymousClass008.A0L(str2, str3, ";");
                }
            }
        }
        return str2;
    }

    public void A03(UserJid userJid) {
        AnonymousClass01J r2 = this.A00;
        r2.A00.A01(new SendPaymentInviteOrSetupJob(userJid, false));
        C02010Ah r5 = this.A03;
        String string = r5.A01().getString("payments_inviter_jids", "");
        String A022 = A02(string, userJid);
        AnonymousClass008.A0q(r5, "payments_inviter_jids", A022);
        this.A05.A07(null, AnonymousClass008.A0M("removeInviterJid old invitees: ", string, "; saved new invitees: ", A022), null);
    }
}
