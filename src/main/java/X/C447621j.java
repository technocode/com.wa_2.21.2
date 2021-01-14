package X;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.Build;
import com.whatsapp.jid.Jid;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.21j  reason: invalid class name and case insensitive filesystem */
public class C447621j extends AbstractC28801Vu {
    public static volatile C447621j A0A;
    public final AnonymousClass01I A00;
    public final AnonymousClass0Z6 A01;
    public final AnonymousClass01A A02;
    public final C014308b A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass00G A05;
    public final C28691Vj A06;
    public final C28711Vl A07;
    public final AnonymousClass022 A08;
    public final AnonymousClass0BB A09;

    public C447621j(AnonymousClass00G r1, AnonymousClass0Z6 r2, AnonymousClass01I r3, AnonymousClass01A r4, AnonymousClass03P r5, C014308b r6, AnonymousClass0BB r7, AnonymousClass022 r8, C28691Vj r9, C28711Vl r10) {
        this.A05 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A09 = r7;
        this.A08 = r8;
        this.A06 = r9;
        this.A07 = r10;
    }

    public static C447621j A00() {
        if (A0A == null) {
            synchronized (C447621j.class) {
                if (A0A == null) {
                    A0A = new C447621j(AnonymousClass00G.A01, AnonymousClass0Z6.A00(), AnonymousClass01I.A00(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass0BB.A00(), AnonymousClass022.A00(), C28691Vj.A00(), C28711Vl.A00());
                }
            }
        }
        return A0A;
    }

    public C28791Vt A01(AbstractC007503q r5, C28831Vx r6) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        NotificationChannelGroup notificationChannelGroup;
        AnonymousClass02N r3 = r5.A0n.A00;
        if (r3 != null) {
            AnonymousClass0BB r2 = this.A09;
            if (r2.A08(r3).A09()) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 26 && (notificationChannel = (notificationManager = (NotificationManager) this.A05.A00.getSystemService("notification")).getNotificationChannel(((AnonymousClass0BI) r2.A08(r3)).A0C())) != null) {
                if (notificationChannel.getImportance() == 0) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 28 && (notificationChannelGroup = notificationManager.getNotificationChannelGroup(notificationChannel.getGroup())) != null && notificationChannelGroup.isBlocked()) {
                    return null;
                }
            }
            JSONObject A032 = A03(r5, r6);
            if (A032 != null) {
                return new C28791Vt(A00(), A032);
            }
            return null;
        }
        throw null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0057 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Z6] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(java.lang.String r5, java.util.List r6) {
        /*
            r4 = this;
            java.lang.String r2 = X.C002001d.A1m(r5)
            X.03P r1 = r4.A04
            X.022 r0 = r4.A08
            java.lang.CharSequence r3 = X.C002001d.A1C(r1, r0, r2)
            if (r6 == 0) goto L_0x0057
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0057
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0057
            boolean r0 = r3 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L_0x0050
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
        L_0x0020:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.21f r1 = new X.21f
            r1.<init>(r2)
            X.0Z6 r0 = r4.A01
            r0.A04(r3, r6, r1)
            java.util.Comparator r0 = java.util.Collections.reverseOrder()
            java.util.Collections.sort(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x003a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r1 + 1
            r3.delete(r1, r0)
            goto L_0x003a
        L_0x0050:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r3)
            r3 = r0
            goto L_0x0020
        L_0x0057:
            java.lang.CharSequence r0 = X.C003701u.A00(r3)
            if (r0 != 0) goto L_0x005f
            r0 = 0
            return r0
        L_0x005f:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447621j.A02(java.lang.String, java.util.List):java.lang.String");
    }

    public JSONObject A03(AbstractC007503q r10, C28831Vx r11) {
        C007003k r5;
        AnonymousClass01A r0;
        String str;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!(r10 instanceof C05490Ot) || r10.A0m != 0) {
                if (!(r10 instanceof AnonymousClass0Z9) && !(r10 instanceof C12210hj) && !(r10 instanceof AnonymousClass0Z8)) {
                    if (r10 instanceof AnonymousClass0MI) {
                        AnonymousClass0M3 r02 = (AnonymousClass0M3) r10;
                        jSONObject.put("text", A02(r02.A0v(), r02.A0c));
                        A04(jSONObject, r10);
                        jSONObject.put("type", "image");
                    } else if (r10 instanceof AnonymousClass0MP) {
                        jSONObject.put("type", "audio");
                    } else if (r10 instanceof AnonymousClass0ZC) {
                        AnonymousClass0M3 r03 = (AnonymousClass0M3) r10;
                        jSONObject.put("text", A02(r03.A0v(), r03.A0c));
                        A04(jSONObject, r10);
                        jSONObject.put("type", "video");
                    } else if (r10 instanceof AnonymousClass0ZE) {
                        jSONObject.put("type", "sticker");
                    } else if (r10 instanceof AnonymousClass0ZB) {
                        AnonymousClass0M3 r04 = (AnonymousClass0M3) r10;
                        jSONObject.put("text", A02(r04.A0v(), r04.A0c));
                        A04(jSONObject, r10);
                        jSONObject.put("type", "gif");
                    } else if (r10 instanceof AbstractC02860Dt) {
                        jSONObject.put("type", "location");
                    } else if ((r10 instanceof C04830Lz) || (r10 instanceof AnonymousClass0M1)) {
                        jSONObject.put("type", "contact");
                    } else if (!(r10 instanceof AnonymousClass0M2)) {
                        return null;
                    } else {
                        jSONObject.put("type", "document");
                    }
                }
                return null;
            }
            AnonymousClass0MH r3 = r10.A0F;
            if (r3 == null) {
                str2 = "text";
            } else if (r3.A02 == 5 || !this.A00.A09(r3.A09)) {
                return null;
            } else {
                str2 = "payment";
            }
            jSONObject.put("text", A02(r10.A0D(), r10.A0c));
            A04(jSONObject, r10);
            jSONObject.put("type", str2);
            AnonymousClass02N A072 = r10.A07();
            C007303n r7 = r10.A0n;
            AnonymousClass02N r6 = r7.A00;
            boolean A0Y = AnonymousClass1VY.A0Y(r6);
            if (!A0Y || A072 == null) {
                r0 = this.A02;
                if (r6 != null) {
                    r5 = r0.A0A(r6);
                } else {
                    throw null;
                }
            } else {
                r0 = this.A02;
                r5 = r0.A0A(A072);
            }
            if (!A0Y) {
                str = null;
            } else if (r6 != null) {
                str = this.A03.A08(r0.A0A(r6), false);
            } else {
                throw null;
            }
            jSONObject.putOpt("group_name", str);
            jSONObject.put("author_name", this.A03.A09(r5, false));
            C28691Vj r1 = this.A06;
            Jid jid = r5.A09;
            if (jid != null) {
                C28701Vk r2 = r1.A01;
                jSONObject.put("author_id", r2.A04(r11, jid.getRawString()));
                if (r6 != null) {
                    jSONObject.put("chat_id", r2.A04(r11, r6.getRawString()));
                    C28711Vl r32 = this.A07;
                    JSONArray jSONArray = new JSONArray();
                    JSONArray put = jSONArray.put(1).put(r7.A01).put(r7.A02);
                    if (r6 != null) {
                        put.put(r6.getRawString());
                        jSONObject.put("message_id", r32.A01.A04(r11, jSONArray.toString()));
                        return jSONObject;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        } catch (JSONException unused) {
        }
    }

    public final void A04(JSONObject jSONObject, AbstractC007503q r5) {
        List<Jid> list = r5.A0c;
        if (list != null) {
            for (Jid jid : list) {
                if (this.A00.A09(jid)) {
                    jSONObject.put("user_mentioned", true);
                    return;
                }
            }
        }
    }
}
