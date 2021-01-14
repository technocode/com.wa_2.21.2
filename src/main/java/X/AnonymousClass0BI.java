package X;

import android.app.NotificationChannel;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0BI  reason: invalid class name */
public class AnonymousClass0BI extends AnonymousClass0BG {
    public AnonymousClass0BI(AnonymousClass00S r1, C000300f r2, AnonymousClass03P r3, AnonymousClass03S r4, AnonymousClass0BF r5) {
        super(r1, r2, r3, r4, r5);
    }

    @Override // X.AnonymousClass0BG
    public long A00() {
        NotificationChannel A01;
        if (!this.A0H || (A01 = AnonymousClass0BF.A01(this.A0M, this.A0C)) == null || A01.getImportance() >= 3) {
            return A01();
        }
        StringBuilder A0S = AnonymousClass008.A0S("chat-settings-store/getMuteEndTime notification channel muted for:");
        A0S.append(AnonymousClass1VY.A0E(this.A0C, Jid.class));
        Log.i(A0S.toString());
        return -1;
    }

    @Override // X.AnonymousClass0BG
    public boolean A0A() {
        NotificationChannel A01;
        if (!this.A0H || (A01 = AnonymousClass0BF.A01(this.A0M, this.A0C)) == null || A01.getImportance() != 0) {
            return super.A0A();
        }
        StringBuilder A0S = AnonymousClass008.A0S("chat-settings-store/getShowNotifications notification channel disabled for:");
        A0S.append(AnonymousClass1VY.A0E(this.A0C, Jid.class));
        Log.i(A0S.toString());
        return false;
    }

    public String A0C() {
        String A00;
        Uri parse;
        AnonymousClass0BM r1 = AnonymousClass0BF.A0J;
        String A002 = r1.A00(this.A0C);
        if (!TextUtils.isEmpty(A002)) {
            return A002;
        }
        if (this.A0H) {
            StringBuilder A0S = AnonymousClass008.A0S("chat-settings-store/getNotificationChannelId missing channel for chat with custom notifications:");
            A0S.append(AnonymousClass1VY.A0E(this.A0C, Jid.class));
            Log.i(A0S.toString());
            AnonymousClass0BF r2 = this.A0M;
            String str = this.A0C;
            CharSequence A0A = r2.A0A(str);
            int i = 4;
            if (A0B()) {
                i = 3;
            }
            r2.A0C(str, A0A, i, this.A08, this.A0B, r2.A09(this.A0A), "channel_group_chats");
            return r1.A00(this.A0C);
        }
        if (AnonymousClass1VY.A0Y(AnonymousClass02N.A01(this.A0C))) {
            A00 = r1.A00("group_chat_defaults");
        } else {
            A00 = r1.A00("individual_chat_defaults");
        }
        if (this.A0I.A0D(AbstractC000400g.A1n)) {
            return A00;
        }
        AnonymousClass0BF r6 = this.A0M;
        int i2 = 4;
        if (A0B()) {
            i2 = 3;
        }
        String A05 = A05();
        String A08 = A08();
        String A07 = A07();
        if (r6 != null) {
            String A01 = r1.A01(A00);
            if ((!"group_chat_defaults".equals(A01) && !"individual_chat_defaults".equals(A01)) || r6.A08().getNotificationChannel(A00).getImportance() >= 3) {
                return A00;
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("chat-settings-store/repairDefaultChannelIfNeeded repairing channel:");
            A0S2.append(AnonymousClass1VY.A0E(A01, Jid.class));
            Log.i(A0S2.toString());
            r6.A0G(A01);
            CharSequence A0A2 = r6.A0A(A01);
            if (A07 == null) {
                parse = Settings.System.DEFAULT_NOTIFICATION_URI;
            } else {
                parse = Uri.parse(A07);
            }
            return r6.A0C(A01, A0A2, i2, A05, A08, parse, "channel_group_chats");
        }
        throw null;
    }

    public String A0D() {
        AnonymousClass0BF r3 = this.A0M;
        AnonymousClass0BM r2 = AnonymousClass0BF.A0J;
        String A00 = r2.A00("silent_notifications");
        if (r3 != null) {
            String A01 = r2.A01(A00);
            if (!"silent_notifications".equals(A01) || r3.A08().getNotificationChannel(A00).getImportance() <= 2) {
                return A00;
            }
            StringBuilder A0S = AnonymousClass008.A0S("chat-settings-store/repairSilentNotificationChannel repairing channel:");
            A0S.append(AnonymousClass1VY.A0E(A01, Jid.class));
            Log.i(A0S.toString());
            r3.A0G(A01);
            return r3.A0C(A01, r3.A0A(A01), 2, null, null, null, null);
        }
        throw null;
    }
}
