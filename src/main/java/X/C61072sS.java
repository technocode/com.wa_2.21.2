package X;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: X.2sS  reason: invalid class name and case insensitive filesystem */
public class C61072sS implements Serializable {
    public String action;
    public String authTicketFp;
    public int code;
    public AnonymousClass0M5 keyNode;
    public long nextAttemptTs;
    public int remainingRetries;
    public AnonymousClass0M5 stepUpNode;
    public String text;

    public C61072sS() {
        this.code = 0;
    }

    public C61072sS(int i) {
        this.code = i;
    }

    public C61072sS(AnonymousClass0M5 r6) {
        String str;
        String str2;
        String str3;
        String str4;
        AnonymousClass0OS A0A = r6.A0A("error-code");
        String str5 = null;
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        this.code = C006803i.A02(str, 0);
        AnonymousClass0OS A0A2 = r6.A0A("error-text");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        this.text = str2;
        AnonymousClass0OS A0A3 = r6.A0A("remaining-retries");
        if (A0A3 != null) {
            str3 = A0A3.A03;
        } else {
            str3 = null;
        }
        this.remainingRetries = C006803i.A02(str3, -1);
        AnonymousClass0OS A0A4 = r6.A0A("next-retry-ts");
        if (A0A4 != null) {
            str4 = A0A4.A03;
        } else {
            str4 = null;
        }
        this.nextAttemptTs = C006803i.A04(str4, 0);
        AnonymousClass0OS A0A5 = r6.A0A("auth-ticket-fp");
        this.authTicketFp = A0A5 != null ? A0A5.A03 : str5;
        int i = this.code;
        if (i == 1448) {
            this.keyNode = r6.A0D("key");
        } else if (i == 10718) {
            this.remainingRetries = 0;
        } else if (i == 454) {
            this.stepUpNode = r6.A0D("step_up");
        }
    }

    public static C61072sS A00(AnonymousClass0M5 r2) {
        String str;
        AnonymousClass0OS A0A = r2.A0A("error-code");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return new C61072sS(r2);
        }
        AnonymousClass0M5 A0D = r2.A0D("pin");
        if (A0D != null) {
            return new C61072sS(A0D);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("[ code: ");
        A0S.append(this.code);
        A0S.append(" text: ");
        A0S.append(this.text);
        A0S.append(" remaining-retries: ");
        A0S.append(this.remainingRetries);
        A0S.append(" next-attempt-ts: ");
        A0S.append(this.nextAttemptTs);
        String str2 = this.authTicketFp;
        if (str2 != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S(" auth-ticket-fp: ");
            A0S2.append(str2);
            str = A0S2.toString();
        } else {
            str = "";
        }
        A0S.append(str);
        A0S.append(" key-node: ");
        return AnonymousClass008.A0O(A0S, this.keyNode != null ? "set" : "null", " ]");
    }
}
