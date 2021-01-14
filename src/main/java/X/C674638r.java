package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.List;

/* renamed from: X.38r  reason: invalid class name and case insensitive filesystem */
public class C674638r {
    public static volatile C674638r A0F;
    public final AnonymousClass0C2 A00;
    public final C000300f A01;
    public final AnonymousClass0HJ A02;
    public final AnonymousClass01A A03;
    public final C014308b A04;
    public final AnonymousClass08C A05;
    public final AnonymousClass0L2 A06;
    public final AnonymousClass0HK A07;
    public final AnonymousClass03P A08;
    public final AnonymousClass03C A09;
    public final AnonymousClass01X A0A;
    public final AnonymousClass01T A0B;
    public final AnonymousClass0BB A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass0Z0 A0E;

    public C674638r(AnonymousClass00T r1, C000300f r2, AnonymousClass0L2 r3, AnonymousClass0HJ r4, AnonymousClass01A r5, AnonymousClass03P r6, C014308b r7, AnonymousClass01X r8, AnonymousClass0BB r9, AnonymousClass08C r10, AnonymousClass0Z0 r11, AnonymousClass03C r12, AnonymousClass01T r13, AnonymousClass0C2 r14, AnonymousClass0HK r15) {
        this.A0D = r1;
        this.A01 = r2;
        this.A06 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r6;
        this.A04 = r7;
        this.A0A = r8;
        this.A0C = r9;
        this.A05 = r10;
        this.A0E = r11;
        this.A09 = r12;
        this.A0B = r13;
        this.A00 = r14;
        this.A07 = r15;
    }

    public static AnonymousClass03E A00(Context context, long j) {
        AnonymousClass03E A002 = AnonymousClass0BS.A00(context);
        A002.A0I = "call";
        boolean z = true;
        A002.A03 = 1;
        if (j <= 0) {
            z = false;
        }
        A002.A0V = z;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        A002.A07.when = j;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r37.A08 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        if (r37.A07 != false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A01(android.content.Context r35, int r36, X.C674738s r37) {
        /*
        // Method dump skipped, instructions count: 1047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C674638r.A01(android.content.Context, int, X.38s):android.app.Notification");
    }

    public final Intent A02(Context context, C674738s r9, int i) {
        Intent A052 = VoipActivityV2.A05(context, r9.A02, Boolean.valueOf(!this.A00.A00));
        A052.putExtra("notification_type", i);
        String str = r9.A04;
        A052.putExtra("call_id", str);
        boolean z = r9.A0B;
        if (z) {
            A052.setAction(VoipActivityV2.A1s);
        }
        A052.putExtra("notification_type", i);
        A052.putExtra("call_id", str);
        if (z) {
            A052.setAction(VoipActivityV2.A1s);
        }
        if (r9.A08 && r9.A03 == Voip.CallState.NONE) {
            A052.putExtra("joinable", true);
        }
        return A052;
    }

    public final CharSequence A03(Context context, int i, int i2, int i3) {
        String A062 = this.A0A.A06(i2);
        if (Build.VERSION.SDK_INT < 25 || i != 1) {
            return A062;
        }
        SpannableString spannableString = new SpannableString(A062);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i3)), 0, spannableString.length(), 0);
        return spannableString;
    }

    public final void A04(Context context, boolean z, AnonymousClass03E r13, C674738s r14, String str) {
        if (z) {
            r13.A0A(context.getString(R.string.app_name));
        } else if (str != null) {
            r13.A0A(str);
        } else if (r14 == null) {
        } else {
            if (!r14.A07) {
                r13.A0A(C002001d.A1m(this.A04.A08(this.A03.A0A(r14.A02), false)));
            } else if (r14.A00 <= 0) {
                C007003k A0A2 = this.A03.A0A(r14.A02);
                AnonymousClass01X r7 = this.A0A;
                List list = r14.A05;
                r13.A0A(r7.A0A(R.plurals.group_voip_call_participants_label, (long) (list.size() - 1), this.A04.A04(A0A2), Integer.valueOf(list.size() - 1)));
            }
        }
    }

    public final void A05(AnonymousClass03E r7, C007003k r8, int i, C674738s r10) {
        AnonymousClass0BI r2;
        Voip.CallState callState;
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass0BB r1 = this.A0C;
            Jid A022 = r8.A02(AnonymousClass02N.class);
            if (A022 != null) {
                r2 = (AnonymousClass0BI) r1.A08((AnonymousClass02N) A022);
            } else {
                throw null;
            }
        } else {
            r2 = null;
        }
        if (i == 1 || (r10.A08 && ((callState = r10.A03) == Voip.CallState.NONE || callState == Voip.CallState.ACTIVE_ELSEWHERE))) {
            r7.A03 = 1;
            if (Build.VERSION.SDK_INT >= 26) {
                if (r2 != null) {
                    AnonymousClass0BM r12 = AnonymousClass0BF.A0J;
                    String A002 = r12.A00("voip_notification");
                    if (A002 == null) {
                        A002 = r2.A0M.A0B();
                    } else {
                        AnonymousClass0BF r3 = r2.A0M;
                        if (r3 != null) {
                            String A012 = r12.A01(A002);
                            if ("voip_notification".equals(A012) && AnonymousClass0BN.A00(r3.A08(), A002).getImportance() < 4) {
                                StringBuilder A0S = AnonymousClass008.A0S("chat-settings-store/repairVoIPNotificationChannel repairing channel:");
                                A0S.append(AnonymousClass1VY.A0E(A012, Jid.class));
                                Log.i(A0S.toString());
                                r3.A0G(A012);
                                A002 = r3.A0B();
                            }
                        } else {
                            throw null;
                        }
                    }
                    r7.A0J = A002;
                } else {
                    throw null;
                }
            }
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder("UNKNOWN NOTIFICATION TYPE ");
            sb.append(i);
            AnonymousClass00E.A08(false, sb.toString());
        } else if (Build.VERSION.SDK_INT >= 26) {
            r7.A0J = r2.A0D();
        }
        ContentResolver A062 = this.A08.A06();
        if (A062 != null) {
            Uri A042 = this.A03.A04(r8, A062);
            if (A042 != null) {
                r7.A0P.add(A042.toString());
                return;
            }
            return;
        }
        Log.w("voip/CallNotificationBuilder/addContactToNotification cr == null");
    }
}
