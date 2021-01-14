package X;

import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.Locale;

/* renamed from: X.0BG  reason: invalid class name */
public class AnonymousClass0BG {
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public AnonymousClass0BH A04;
    public AnonymousClass0BH A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final C000300f A0I;
    public final AnonymousClass03P A0J;
    public final AnonymousClass00S A0K;
    public final AnonymousClass03S A0L;
    public final AnonymousClass0BF A0M;

    public AnonymousClass0BG(AnonymousClass00S r2, C000300f r3, AnonymousClass03P r4, AnonymousClass03S r5, AnonymousClass0BF r6) {
        this.A0K = r2;
        this.A0I = r3;
        this.A0J = r4;
        this.A0L = r5;
        this.A0M = r6;
    }

    public long A00() {
        return A01();
    }

    public long A01() {
        long j = this.A02;
        if (j == -1) {
            return j;
        }
        if (j > this.A0K.A05()) {
            return this.A02;
        }
        return 0;
    }

    public final AnonymousClass0BG A02() {
        String str = this.A0C;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str)) {
            return this;
        }
        if (GroupJid.getNullable(str) != null) {
            AnonymousClass0BB r0 = AnonymousClass0BB.A0R;
            if (r0 != null) {
                return r0.A04();
            }
            throw null;
        }
        AnonymousClass0BB r02 = AnonymousClass0BB.A0R;
        if (r02 != null) {
            return r02.A05();
        }
        throw null;
    }

    public String A03() {
        String str;
        if (((!this.A0H || (str = this.A06) == null) && (str = A02().A06) == null) || !C006803i.A0l(this.A0J, this.A0L, Uri.parse(str), false)) {
            return Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        return str;
    }

    public String A04() {
        if (!this.A0H || TextUtils.isEmpty(this.A07)) {
            return A02().A07;
        }
        return this.A07;
    }

    public String A05() {
        if (!this.A0H || TextUtils.isEmpty(this.A08)) {
            return A02().A08;
        }
        return this.A08;
    }

    public String A06() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Integer.toString(0);
        }
        if (!this.A0H || TextUtils.isEmpty(this.A09)) {
            return A02().A09;
        }
        return this.A09;
    }

    public String A07() {
        String str;
        if (((!this.A0H || (str = this.A0A) == null) && (str = A02().A0A) == null) || (Build.VERSION.SDK_INT < 26 && !C006803i.A0l(this.A0J, this.A0L, Uri.parse(str), false))) {
            return Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        return str;
    }

    public String A08() {
        if (!this.A0H || TextUtils.isEmpty(this.A0B)) {
            return A02().A0B;
        }
        return this.A0B;
    }

    public boolean A09() {
        return A00() != 0;
    }

    public boolean A0A() {
        return this.A0F || !A09();
    }

    public boolean A0B() {
        if (!this.A0H) {
            return A02().A0D;
        }
        return this.A0D;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "jid: %s deleted:%d muteEndTime:%d showNotificationWhenMuted:%b useCustomNotification:%b messageTone:%s messageVibrate:%s messagePopup:%s messageLight:%s callTone:%s callVibrate:%s statusMuted:%b pinned:%b pinned_time:%d lowPriorityNotifications:%b mediaVisibility:%d", AnonymousClass1VY.A0E(this.A0C, Jid.class), Long.valueOf(this.A01), Long.valueOf(this.A02), Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0H), this.A0A, this.A0B, this.A09, this.A08, this.A06, this.A07, Boolean.valueOf(this.A0G), Boolean.valueOf(this.A0E), Long.valueOf(this.A03), Boolean.valueOf(this.A0D), Integer.valueOf(this.A00));
    }
}
