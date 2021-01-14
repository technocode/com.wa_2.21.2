package X;

import android.app.NotificationManager;
import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.0BS  reason: invalid class name */
public final class AnonymousClass0BS {
    public static final HashMap A0D = new HashMap();
    public static final String[] A0E = {"_id"};
    public static volatile AnonymousClass0BS A0F;
    public HashMap A00 = new HashMap();
    public final AnonymousClass0Z6 A01;
    public final AnonymousClass0Z7 A02;
    public final C017009c A03;
    public final AnonymousClass01A A04;
    public final C014308b A05;
    public final AnonymousClass03P A06;
    public final AnonymousClass00G A07;
    public final AnonymousClass01X A08;
    public final AnonymousClass01T A09;
    public final C02150Av A0A;
    public final AnonymousClass022 A0B;
    public final AnonymousClass0BB A0C;

    public AnonymousClass0BS(AnonymousClass00G r2, AnonymousClass0Z6 r3, C02150Av r4, AnonymousClass01A r5, AnonymousClass03P r6, C014308b r7, AnonymousClass01X r8, AnonymousClass0BB r9, C017009c r10, AnonymousClass01T r11, AnonymousClass022 r12, AnonymousClass0Z7 r13) {
        this.A07 = r2;
        this.A01 = r3;
        this.A0A = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A05 = r7;
        this.A08 = r8;
        this.A0C = r9;
        this.A03 = r10;
        this.A09 = r11;
        this.A0B = r12;
        this.A02 = r13;
    }

    public static AnonymousClass03E A00(Context context) {
        AnonymousClass03E r1 = new AnonymousClass03E(context, null);
        r1.A00 = C004302a.A00(context, R.color.primary_notification);
        return r1;
    }

    public static AnonymousClass0BS A01() {
        if (A0F == null) {
            synchronized (AnonymousClass0BS.class) {
                if (A0F == null) {
                    AnonymousClass00G r3 = AnonymousClass00G.A01;
                    AnonymousClass0Z6 A002 = AnonymousClass0Z6.A00();
                    AnonymousClass009.A00();
                    A0F = new AnonymousClass0BS(r3, A002, C02150Av.A02(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass0BB.A00(), C017009c.A00(), AnonymousClass01T.A00(), AnonymousClass022.A00(), AnonymousClass0Z7.A00());
                }
            }
        }
        return A0F;
    }

    public static CharSequence A02(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static CharSequence A03(CharSequence charSequence, boolean z) {
        if (!z) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(2), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static Integer A04(String str) {
        int i;
        if (str == null) {
            return null;
        }
        try {
            i = Integer.parseInt(str, 16);
        } catch (NumberFormatException unused) {
            i = 16777215;
        }
        int i2 = i | -16777216;
        if (i2 != -16777216) {
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static String A05(int i) {
        String hexString = Integer.toHexString(16777215 & i);
        int length = hexString.length();
        if (length == 6) {
            return hexString;
        }
        if (length < 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("000000".substring(length));
            sb.append(hexString);
            return sb.toString();
        }
        AnonymousClass008.A0u("notification-utils/convertNotificationLightColor could not parse:", i);
        return "FFFFFF";
    }

    public static String A06(Context context, AnonymousClass01X r2, String str) {
        if (TextUtils.isEmpty(str)) {
            return r2.A06(R.string.settings_sound_silent);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(str));
        if (ringtone == null) {
            return null;
        }
        try {
            return ringtone.getTitle(context);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("notification-utils/unable to get ringtone name/");
            sb.append(e);
            Log.d(sb.toString());
            return null;
        }
    }

    public static String A07(AnonymousClass00G r7, AnonymousClass01X r8, AbstractC007503q r9) {
        int i;
        int i2;
        String str;
        if (r9 instanceof AnonymousClass0MN) {
            return A09(null, "📷", r8.A06(R.string.view_once_photo));
        }
        if (r9 instanceof AnonymousClass0MK) {
            return A09(null, "🎥", r8.A06(R.string.view_once_video));
        }
        if (r9 instanceof AnonymousClass0Z8) {
            return ((AnonymousClass0Z8) r9).A7h(r8);
        }
        if (r9 instanceof AnonymousClass0Z9) {
            return A09(((AnonymousClass0Z9) r9).A07, "🛒", r8.A06(R.string.conversations_most_recent_product));
        }
        if (r9 instanceof AnonymousClass0ZA) {
            return A09(((AnonymousClass0ZA) r9).A11(r7.A00, r8), "🛒", r8.A06(R.string.conversations_most_recent_cart));
        }
        if (r9 instanceof AnonymousClass0MI) {
            String A0v = ((AnonymousClass0M3) r9).A0v();
            AnonymousClass1XN r1 = r9.A0A().A00;
            if (r1 != null && !TextUtils.isEmpty(r1.A00)) {
                A0v = r1.A00;
            }
            return A09(A0v, "📷", r8.A06(R.string.conversations_most_recent_image));
        } else if (r9 instanceof AnonymousClass0MP) {
            AnonymousClass0M3 r92 = (AnonymousClass0M3) r9;
            StringBuilder sb = new StringBuilder();
            int i3 = ((AbstractC007503q) r92).A04;
            if (i3 == 1) {
                str = "🎤";
            } else {
                str = "🎵";
            }
            StringBuilder A0S = AnonymousClass008.A0S(AnonymousClass008.A0O(sb, str, " "));
            int i4 = R.string.conversations_most_recent_audio;
            if (i3 == 1) {
                i4 = R.string.conversations_most_recent_voice;
            }
            String A0E2 = AnonymousClass008.A0E(r8, i4, A0S);
            int i5 = r92.A00;
            if (i5 == 0) {
                return A0E2;
            }
            StringBuilder A0Y = AnonymousClass008.A0Y(A0E2, " (");
            A0Y.append(C002001d.A1W(r8, (long) i5));
            A0Y.append(")");
            return A0Y.toString();
        } else if (r9 instanceof AnonymousClass0ZB) {
            return A09(((AnonymousClass0M3) r9).A0v(), "👾", r8.A06(R.string.conversations_most_recent_gif));
        } else {
            if (r9 instanceof AnonymousClass0ZC) {
                AnonymousClass0M3 r3 = (AnonymousClass0M3) r9;
                String A0v2 = r3.A0v();
                AnonymousClass1XN r12 = r9.A0A().A00;
                if (r12 != null && !TextUtils.isEmpty(r12.A00)) {
                    A0v2 = r12.A00;
                }
                String A092 = A09(A0v2, "🎥", r8.A06(R.string.conversations_most_recent_video));
                int i6 = r3.A00;
                if (i6 == 0) {
                    return A092;
                }
                StringBuilder A0Y2 = AnonymousClass008.A0Y(A092, " (");
                A0Y2.append(C002001d.A1W(r8, (long) i6));
                A0Y2.append(")");
                return A0Y2.toString();
            } else if (r9 instanceof AnonymousClass0M2) {
                AnonymousClass0M2 r93 = (AnonymousClass0M2) r9;
                if (AnonymousClass0FI.A0g(r93)) {
                    String A0w = r93.A0w();
                    AnonymousClass0M4 r0 = ((AnonymousClass0M3) r93).A02;
                    if (r0 != null) {
                        i2 = r0.A01;
                    } else {
                        i2 = 0;
                    }
                    if (!TextUtils.isEmpty(A0w)) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("👤 ");
                        A0S2.append(C003701u.A07(A0w, 128));
                        return A0S2.toString();
                    }
                    StringBuilder A0S3 = AnonymousClass008.A0S("👤 ");
                    if (i2 == 1) {
                        return AnonymousClass008.A0E(r8, R.string.conversations_most_recent_contact, A0S3);
                    }
                    A0S3.append(r8.A0A(R.plurals.n_contacts_message_title, (long) i2, Integer.valueOf(i2)));
                    return A0S3.toString();
                }
                String A093 = A09(((AnonymousClass0M3) r93).A04, "📄", r8.A06(R.string.conversations_most_recent_document));
                int i7 = r93.A00;
                if (i7 == 0) {
                    return A093;
                }
                StringBuilder A0Y3 = AnonymousClass008.A0Y(A093, " (");
                A0Y3.append(AnonymousClass0ZD.A06(r8, ((AnonymousClass0M3) r93).A07, i7));
                A0Y3.append(")");
                return A0Y3.toString();
            } else if (r9 instanceof AnonymousClass0ZE) {
                return AnonymousClass008.A0E(r8, R.string.conversations_most_recent_sticker, AnonymousClass008.A0S("💟 "));
            } else {
                if (r9 instanceof AnonymousClass0ZF) {
                    return AnonymousClass008.A0E(r8, R.string.conversations_most_recent_group_invite, AnonymousClass008.A0S("👥 "));
                }
                if (r9 instanceof AnonymousClass0M1) {
                    StringBuilder A0S4 = AnonymousClass008.A0S("👤 ");
                    A0S4.append(AnonymousClass0ZG.A08(r8, (AnonymousClass0M1) r9));
                    return A0S4.toString();
                } else if (r9 instanceof C04830Lz) {
                    C04830Lz r94 = (C04830Lz) r9;
                    if (TextUtils.isEmpty(r94.A00)) {
                        return AnonymousClass008.A0E(r8, R.string.conversations_most_recent_contact, AnonymousClass008.A0S("👤 "));
                    }
                    StringBuilder A0S5 = AnonymousClass008.A0S("👤 ");
                    A0S5.append(C003701u.A07(r94.A00, 128));
                    return A0S5.toString();
                } else if (r9 instanceof C05470Or) {
                    return A09(((C05470Or) r9).A01, "📌", r8.A06(R.string.conversations_most_recent_location));
                } else {
                    if (r9 instanceof C02850Ds) {
                        return A09(((C02850Ds) r9).A03, "📌", r8.A06(R.string.conversations_most_recent_live_location));
                    }
                    if (r9 instanceof AnonymousClass0ZH) {
                        int A0x = ((AnonymousClass0ZH) r9).A0x();
                        if (A0x == 0) {
                            i = R.string.conversations_most_recent_voice_call_missed;
                        } else if (A0x == 1) {
                            i = R.string.conversations_most_recent_video_call_missed;
                        } else if (A0x == 2) {
                            i = R.string.conversations_most_recent_group_voice_call_missed;
                        } else if (A0x != 3) {
                            StringBuilder sb2 = new StringBuilder("unknown call type ");
                            sb2.append(A0x);
                            AnonymousClass00E.A08(false, sb2.toString());
                            i = R.string.conversations_most_recent_voice_call_missed;
                        } else {
                            i = R.string.conversations_most_recent_group_video_call_missed;
                        }
                        return r8.A06(i);
                    } else if (AnonymousClass0ZG.A0K(r9)) {
                        AnonymousClass0MH r02 = r9.A0F;
                        if (r02 == null) {
                            return r8.A06(R.string.conversations_most_recent_decryption_failure);
                        }
                        int i8 = r02.A02;
                        int i9 = R.string.notification_future_payment;
                        if (i8 != 5) {
                            i9 = R.string.payment;
                        }
                        return r8.A06(i9);
                    } else if (r9 instanceof AnonymousClass0ZI) {
                        AnonymousClass0MH r03 = r9.A0F;
                        if (r03 == null || r03.A02 == 5) {
                            return r8.A06(R.string.notification_future_message);
                        }
                        return r8.A06(R.string.payment);
                    } else if (r9 instanceof AnonymousClass0ZJ) {
                        boolean z = r9.A0n.A02;
                        int i10 = R.string.revoked_msg_incoming;
                        if (z) {
                            i10 = R.string.revoked_msg_outgoing;
                        }
                        return r8.A06(i10);
                    } else if (r9 instanceof AnonymousClass0ZK) {
                        boolean z2 = r9.A0n.A02;
                        int i11 = R.string.payment_my_request_declined;
                        if (z2) {
                            i11 = R.string.payment_request_declined_by_me;
                        }
                        return r8.A06(i11);
                    } else if (r9 instanceof AnonymousClass0ZM) {
                        boolean z3 = r9.A0n.A02;
                        int i12 = R.string.payment_request_canceled;
                        if (z3) {
                            i12 = R.string.payment_request_canceled_by_me;
                        }
                        return r8.A06(i12);
                    } else if (!(r9 instanceof AnonymousClass0ZN)) {
                        return r8.A06(R.string.conversations_most_recent_unknown);
                    } else {
                        AnonymousClass0ZN r95 = (AnonymousClass0ZN) r9;
                        if (TextUtils.isEmpty(r95.A0v())) {
                            return r95.A0u();
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(r95.A0v());
                        sb3.append(" ");
                        sb3.append(r95.A0u());
                        return sb3.toString();
                    }
                }
            }
        }
    }

    public static String A08(String str) {
        if (str == null || ((long) str.length()) <= 1024) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) str.subSequence(0, 1020));
        sb.append("…");
        return sb.toString();
    }

    public static String A09(String str, String str2, String str3) {
        String A082 = A08(str);
        if (TextUtils.isEmpty(str)) {
            return AnonymousClass008.A0L(str2, " ", str3);
        }
        return AnonymousClass008.A0L(str2, " ", A082);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0074, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0.booleanValue() != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(android.content.Context r10, X.AnonymousClass03P r11, android.net.Uri r12, X.AnonymousClass03E r13, X.C04260Jr r14, X.C04270Js r15) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BS.A0A(android.content.Context, X.03P, android.net.Uri, X.03E, X.0Jr, X.0Js):void");
    }

    public static long[] A0B(String str) {
        char c;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                } else {
                    return null;
                }
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                if (str.equals("2")) {
                    c = 1;
                    break;
                } else {
                    return null;
                }
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        if (c == 0) {
            return new long[]{0, 300, 200, 300, 200};
        }
        if (c == 1) {
            return new long[]{0, 300, 200, 300, 200};
        }
        if (c == 2) {
            return new long[]{0, 750, 250, 750, 250};
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0ZO A0C(X.AbstractC007503q r8, X.C007003k r9) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BS.A0C(X.03q, X.03k):X.0ZO");
    }

    public CharSequence A0D(AbstractC007503q r12, C007003k r13, boolean z, boolean z2) {
        CharSequence A032;
        if (r12 == null) {
            A032 = "";
        } else {
            AnonymousClass00G r0 = this.A07;
            byte b = r12.A0m;
            if (b != 0) {
                AnonymousClass01X r7 = this.A08;
                String A072 = A07(r0, r7, r12);
                boolean z3 = false;
                if (b == 12) {
                    z3 = true;
                }
                if (r13.A09()) {
                    if (z) {
                        if (!r12.A0n.A02) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(A0E(r12.A07()));
                            sb.append(" @ ");
                            sb.append(this.A05.A08(r13, false));
                            sb.append(": ");
                            sb.append((Object) A03(A072, z3));
                            A032 = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.A05.A08(r13, false));
                            sb2.append(": ");
                            sb2.append((Object) A03(A072, z3));
                            A032 = sb2.toString();
                        }
                    } else if (!z2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(A0E(r12.A07()));
                        sb3.append(": ");
                        A032 = TextUtils.concat(A02(sb3.toString()), A03(A072, z3));
                    } else if (!r12.A0n.A02) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(A0E(r12.A07()));
                        sb4.append(" ");
                        A032 = TextUtils.concat(A02(C002001d.A1m(sb4.toString())), A03(C002001d.A1m(A072), z3));
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(r7.A06(R.string.you));
                        sb5.append(" ");
                        A032 = TextUtils.concat(A02(sb5.toString()), A03(C002001d.A1m(A072), z3));
                    }
                } else if (z) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.A05.A08(r13, false));
                    sb6.append(": ");
                    sb6.append((Object) A03(A072, z3));
                    A032 = sb6.toString();
                } else if (!z2) {
                    A032 = A03(A072, z3);
                } else if (!r12.A0n.A02) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(this.A05.A08(r13, false));
                    sb7.append(" ");
                    A032 = TextUtils.concat(A02(C002001d.A1m(sb7.toString())), A03(C002001d.A1m(A072), z3));
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(r7.A06(R.string.you));
                    sb8.append(" ");
                    A032 = TextUtils.concat(A02(sb8.toString()), A03(C002001d.A1m(A072), z3));
                }
            } else if (!(r12 instanceof C05390Oi)) {
                A032 = C002001d.A1C(this.A06, this.A0B, C002001d.A1m(A08(r12.A0D())));
                AnonymousClass0MH r02 = r12.A0F;
                if (r02 != null) {
                    if (r02.A02 != 5) {
                        A032 = this.A0A.A0L(r12, false);
                    } else {
                        A032 = this.A08.A06(R.string.notification_future_payment);
                    }
                }
                if (r13.A09()) {
                    if (!z) {
                        boolean z4 = r12.A0n.A02;
                        if (z2) {
                            if (!z4) {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(A0E(r12.A07()));
                                sb9.append(" ");
                                A032 = TextUtils.concat(A02(C002001d.A1m(sb9.toString())), A032);
                            } else {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(this.A08.A06(R.string.you));
                                sb10.append(" ");
                                A032 = TextUtils.concat(A02(sb10.toString()), A032);
                            }
                        } else if (!z4) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(A0E(r12.A07()));
                            sb11.append(": ");
                            A032 = TextUtils.concat(A02(sb11.toString()), A032);
                        } else {
                            StringBuilder A0S = AnonymousClass008.A0S("messagePreview/missing_rmt_src:");
                            A0S.append(AnonymousClass0FI.A0B(r12));
                            Log.e(A0S.toString());
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(this.A08.A06(R.string.contact));
                            sb12.append(": ");
                            sb12.append((Object) A032);
                            A032 = sb12.toString();
                        }
                    } else if (!r12.A0n.A02) {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(A0E(r12.A07()));
                        sb13.append(" @ ");
                        sb13.append(this.A05.A08(r13, false));
                        sb13.append(": ");
                        sb13.append((Object) A032);
                        A032 = sb13.toString();
                    } else {
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append(this.A05.A08(r13, false));
                        sb14.append(": ");
                        sb14.append((Object) A032);
                        A032 = sb14.toString();
                    }
                } else if (z) {
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(this.A05.A08(r13, false));
                    sb15.append(": ");
                    sb15.append((Object) A032);
                    A032 = sb15.toString();
                } else if (z2) {
                    if (!r12.A0n.A02) {
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append(C002001d.A1m(this.A05.A08(r13, false)));
                        sb16.append(" ");
                        A032 = TextUtils.concat(A02(sb16.toString()), A032);
                    } else {
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append(this.A08.A06(R.string.you));
                        sb17.append(" ");
                        A032 = TextUtils.concat(A02(sb17.toString()), A032);
                    }
                }
            } else if (z) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(this.A05.A08(r13, false));
                sb18.append(": ");
                sb18.append(this.A02.A07((C05390Oi) r12, false));
                A032 = sb18.toString();
            } else {
                A032 = this.A02.A07((C05390Oi) r12, false);
            }
        }
        return this.A01.A01(this.A07.A00, A032, r12.A0c);
    }

    public final String A0E(AnonymousClass02N r4) {
        if (r4 != null) {
            return this.A05.A08(this.A04.A0A(r4), false);
        }
        Log.w("notification/messagepreview/getname remote_resource null");
        return "";
    }

    public boolean A0F(C007003k r6) {
        NotificationManager.Policy notificationPolicy;
        NotificationManager notificationManager = (NotificationManager) this.A07.A00.getSystemService("notification");
        if (Build.VERSION.SDK_INT < 28 || notificationManager == null || notificationManager.getCurrentInterruptionFilter() == 1 || notificationManager.getCurrentInterruptionFilter() == 0 || (notificationPolicy = notificationManager.getNotificationPolicy()) == null) {
            return false;
        }
        StringBuilder A0S = AnonymousClass008.A0S("NotificationUtils/isDNDTurnedOn NotificationManager policy ");
        A0S.append(notificationPolicy.toString());
        Log.i(A0S.toString());
        if ((notificationPolicy.priorityCategories & 8) == 0) {
            Log.i("VNotificationUtils/isDNDTurnedOn Calls not allowed in DND");
            return true;
        }
        int i = notificationPolicy.priorityCallSenders;
        if (i == 1) {
            if (r6.A08 == null) {
                return true;
            }
            return false;
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
    }
}
