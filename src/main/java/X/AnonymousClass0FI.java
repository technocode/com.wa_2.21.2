package X;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0FI  reason: invalid class name */
public class AnonymousClass0FI {
    public static final SecureRandom A00 = new SecureRandom();
    public static final Random A01 = new Random();

    public static String A08(byte b) {
        if (b == 0) {
            return null;
        }
        if (b == 7) {
            return "system";
        }
        if (b == 1 || b == 25 || b == 42) {
            return "image";
        }
        if (b == 2) {
            return "audio";
        }
        if (b == 3 || b == 28 || b == 43) {
            return "video";
        }
        if (b == 13) {
            return "gif";
        }
        if (b == 4) {
            return "vcard";
        }
        if (b == 5) {
            return "location";
        }
        if (b == 16) {
            return "livelocation";
        }
        if (b == 9) {
            return "document";
        }
        if (b == 20) {
            return "sticker";
        }
        if (b == 23) {
            return "product";
        }
        if (b == 37) {
            return "catalog";
        }
        if (b == 24) {
            return "invite";
        }
        if (b == 26) {
            return "document";
        }
        if (b == 29) {
            return "gif";
        }
        if (b == 30) {
            return "location";
        }
        if (b == 45) {
            return "list";
        }
        if (b == 46) {
            return "list_response";
        }
        return null;
    }

    public static boolean A0E(byte b) {
        return b == 13 || b == 29;
    }

    public static boolean A0F(byte b) {
        return b == 1 || b == 23 || b == 37 || b == 2 || b == 3 || b == 13 || b == 9 || b == 20 || b == 25 || b == 26 || b == 28 || b == 29;
    }

    public static boolean A0G(byte b) {
        return b == 3 || b == 28 || b == 43;
    }

    public static boolean A0H(byte b) {
        return b == 42 || b == 43;
    }

    public static boolean A0I(byte b, int i) {
        return b == 0 ? i == 6 : b == 7;
    }

    public static int A00(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("unrecognized SignalMessageType; value=", i));
    }

    public static int A01(AbstractC007503q r2, C000300f r3) {
        if (!r3.A0D(AbstractC000400g.A11) || r2.A0n.A02) {
            return Math.max(1, r2.A03);
        }
        int max = Math.max(1, r2.A03 + 1);
        if (max >= r3.A06(AbstractC000400g.A37)) {
            return 127;
        }
        return max;
    }

    public static int A02(AnonymousClass0M3 r1) {
        if (A0q(r1)) {
            return r1.A0n.A02 ? 0 : 1;
        }
        if (A0r(r1)) {
            return 2;
        }
        if (A0p(r1)) {
            return 5;
        }
        return r1.A0n.A02 ? 3 : 4;
    }

    public static long A03(AbstractC007503q r5) {
        if (r5 == null || r5.A0p == 0) {
            return 1;
        }
        return r5.A0p;
    }

    public static Bundle A04(C007303n r3) {
        if (r3 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("message_key_jid", AnonymousClass1VY.A0D(r3.A00));
        bundle.putBoolean("message_key_from_me", r3.A02);
        bundle.putString("message_key_id", r3.A01);
        return bundle;
    }

    public static AnonymousClass02U A05(AbstractC007503q r1) {
        if (r1 instanceof AnonymousClass289) {
            return AnonymousClass02U.A02(r1.A0n.A00);
        }
        return null;
    }

    public static C007303n A06(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        AnonymousClass02N A012 = AnonymousClass02N.A01(bundle.getString("message_key_jid"));
        boolean z = bundle.getBoolean("message_key_from_me");
        String string = bundle.getString("message_key_id");
        if (A012 == null || string == null) {
            return null;
        }
        return new C007303n(A012, z, string);
    }

    public static C007303n A07(AnonymousClass00S r0, AnonymousClass01I r1, AnonymousClass02N r2, boolean z) {
        return new C007303n(r2, z, A09(r0, r1));
    }

    public static String A09(AnonymousClass00S r1, AnonymousClass01I r2) {
        byte[] A0x = A0x(r1, r2, false);
        if (A0x != null) {
            return C007603r.A03(A0x);
        }
        throw new IllegalStateException("message id could not be created");
    }

    public static String A0A(AnonymousClass01X r3, long j) {
        return j <= 0 ? "" : C002001d.A1Y(r3, j);
    }

    public static String A0B(AbstractC007503q r3) {
        StringBuilder A0S = AnonymousClass008.A0S("fmsg/status:");
        A0S.append(r3.A08);
        A0S.append("/type:");
        A0S.append((int) r3.A0m);
        C007303n r1 = r3.A0n;
        if (AnonymousClass1VY.A0Y(r1.A00) && (r3 instanceof C05390Oi)) {
            A0S.append("/grp_action:");
            A0S.append(((C05390Oi) r3).A00);
        }
        A0S.append("/rmt-src:");
        A0S.append(r3.A07());
        A0S.append(" ");
        A0S.append(r1.toString());
        return A0S.toString();
    }

    public static void A0C(AbstractC007503q r3) {
        C05450Op A0u;
        C05450Op A0u2;
        if (r3 != null) {
            if (r3.A0B() != null) {
                r3.A0B().A01 = true;
            }
            if ((r3 instanceof AnonymousClass0M3) && (A0u2 = ((AnonymousClass0M3) r3).A0u()) != null) {
                A0u2.A00 = true;
            }
            AbstractC007503q A09 = r3.A09();
            if (A09 != null) {
                if (A09.A0B() != null) {
                    r3.A09().A0B().A01 = true;
                }
                AbstractC007503q A092 = r3.A09();
                if ((A092 instanceof AnonymousClass0M3) && (A0u = ((AnonymousClass0M3) A092).A0u()) != null) {
                    A0u.A00 = true;
                }
            }
        }
    }

    public static void A0D(AbstractC007503q r5) {
        C05490Ot r2;
        String str;
        if (Build.VERSION.SDK_INT == 23) {
            if (r5 instanceof C02850Ds) {
                C02850Ds r22 = (C02850Ds) r5;
                String str2 = r22.A03;
                if (str2 != null && str2.contains("­")) {
                    r22.A03 = str2.replace("­", "");
                }
            } else if (r5 instanceof AnonymousClass0M3) {
                AnonymousClass0M3 r23 = (AnonymousClass0M3) r5;
                String A0v = r23.A0v();
                if (A0v != null && A0v.contains("­")) {
                    r23.A04 = A0v.replace("­", "");
                }
            } else if ((r5 instanceof C05490Ot) && (str = (r2 = (C05490Ot) r5).A04) != null && str.contains("­")) {
                r2.A04 = str.replace("­", "");
            }
            if (r5.A0p() && r5.A01() == 0) {
                String A0D = r5.A0D();
                if (A0D == null) {
                    throw null;
                } else if (A0D.contains("­")) {
                    r5.A0d(r5.A0D().replace("­", ""));
                }
            }
        }
    }

    public static boolean A0J(AnonymousClass01I r3, AbstractC007503q r4) {
        C007303n r2 = r4.A0n;
        if (r2.A02 || r4.A0m == 15 || !AnonymousClass1VY.A0Y(r2.A00)) {
            return false;
        }
        List list = r4.A0c;
        if (list != null) {
            r3.A04();
            if (list.contains(r3.A03)) {
                return true;
            }
        }
        AbstractC007503q A09 = r4.A09();
        return A09 != null && A09.A0n.A02;
    }

    public static boolean A0K(AnonymousClass01I r2, AbstractC007503q r3) {
        if (!(r3 instanceof C05390Oi)) {
            return false;
        }
        int i = ((C05390Oi) r3).A00;
        if (i == 12 || i == 20 || i == 52) {
            List list = ((C05400Oj) r3).A01;
            r2.A04();
            UserJid userJid = r2.A03;
            if (userJid != null) {
                return list.contains(userJid);
            }
            throw null;
        } else if (i == 4) {
            return r2.A09(r3.A07());
        } else {
            return false;
        }
    }

    public static boolean A0L(AnonymousClass01I r4, AbstractC007503q r5) {
        if (!r5.A0n.A02) {
            return false;
        }
        if (!(r5 instanceof C05390Oi)) {
            return true;
        }
        int i = ((C05390Oi) r5).A00;
        if (!(i == 1 || i == 14 || i == 17)) {
            if (i == 20) {
                List list = ((C05400Oj) r5).A01;
                r4.A04();
                UserJid userJid = r4.A03;
                if (userJid != null) {
                    return list.contains(userJid);
                }
                throw null;
            } else if (!(i == 27 || i == 4 || i == 5 || i == 6 || i == 11 || i == 12)) {
                return false;
            }
        }
        return r4.A09(r5.A07());
    }

    public static boolean A0M(AnonymousClass01I r3, AbstractC007503q r4) {
        C007303n r2 = r4.A0n;
        if (r2.A02 && r4.A08 != 6) {
            r3.A04();
            UserJid userJid = r3.A03;
            if (userJid != null) {
                return userJid.equals(r2.A00);
            }
            throw null;
        }
    }

    public static boolean A0N(C000300f r7, AbstractC007503q r8) {
        if (((r8 instanceof AnonymousClass0Z9) && ((AnonymousClass0Z9) r8).A01 == null) || (r8 instanceof AnonymousClass0ZA) || (r8 instanceof AnonymousClass0ZN)) {
            return false;
        }
        byte b = r8.A0m;
        if (A0H(b) || b == 10 || b == 11 || b == 31 || b == 12 || b == 15) {
            return false;
        }
        r8.A0D();
        if (r8.A0F != null) {
            return false;
        }
        if (A0F(b)) {
            AnonymousClass0M4 r5 = ((AnonymousClass0M3) r8).A02;
            if (r5 == null) {
                Log.e("userActionForwardMessage/media_data is null");
                return false;
            } else if (!(r8 instanceof AnonymousClass0ZC) || !A0t((AnonymousClass0ZC) r8)) {
                File file = r5.A0F;
                if (file == null) {
                    Log.e("userActionForwardMessage/media_data.file is null");
                    return false;
                } else if (!file.exists()) {
                    Log.e("userActionForwardMessage/media_data.file does not exist");
                    return false;
                } else {
                    long j = r5.A0A;
                    if (j != 0 && j != r5.A0F.length()) {
                        StringBuilder A0S = AnonymousClass008.A0S("userActionForwardMessage/original_size:");
                        A0S.append(r5.A0A);
                        A0S.append(" file_length:");
                        A0S.append(r5.A0F.length());
                        Log.w(A0S.toString());
                        return false;
                    } else if (r8.A0n.A02 && !r5.A0P && !r7.A0D(AbstractC000400g.A1e)) {
                        Log.w("userActionForwardMessage/cannot forward partially uploaded message.");
                        return false;
                    }
                }
            }
        }
        if ((r8 instanceof AnonymousClass0M0) || (r8 instanceof AnonymousClass0M3)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r6.A06(X.AbstractC000400g.A36) != 1) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0O(X.C000300f r6, X.AbstractC007503q r7) {
        /*
            boolean r0 = r7 instanceof X.AnonymousClass0M3
            r5 = 0
            if (r0 != 0) goto L_0x0006
            return r5
        L_0x0006:
            int r1 = r7.A03
            r0 = 127(0x7f, float:1.78E-43)
            r4 = 1
            r3 = 0
            if (r1 < r0) goto L_0x000f
            r3 = 1
        L_0x000f:
            boolean r0 = r7 instanceof X.AnonymousClass0MM
            if (r0 == 0) goto L_0x0014
            return r5
        L_0x0014:
            r0 = r7
            X.0M3 r0 = (X.AnonymousClass0M3) r0
            X.0M4 r0 = r0.A02
            if (r0 == 0) goto L_0x003b
            boolean r2 = r0.A0P
        L_0x001d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x002c
            X.03a r0 = X.AbstractC000400g.A36
            int r0 = r6.A06(r0)
            r1 = 1
            if (r0 == r4) goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            X.03n r0 = r7.A0n
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0035
            if (r2 == 0) goto L_0x003a
        L_0x0035:
            if (r1 == 0) goto L_0x0039
            if (r3 != 0) goto L_0x003a
        L_0x0039:
            r5 = 1
        L_0x003a:
            return r5
        L_0x003b:
            r2 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FI.A0O(X.00f, X.03q):boolean");
    }

    public static boolean A0P(AnonymousClass01A r3, AnonymousClass01T r4, AbstractC007503q r5) {
        GroupJid groupJid;
        boolean z;
        C007003k A09;
        AnonymousClass02N r1 = r5.A0n.A00;
        if (r1 instanceof GroupJid) {
            groupJid = (GroupJid) r1;
        } else {
            groupJid = null;
        }
        if (groupJid == null || (((A09 = r3.A09(groupJid)) == null || !A09.A0Q || r4.A05(groupJid)) && r4.A01(groupJid).A0A(r4.A01))) {
            z = true;
        } else {
            z = false;
        }
        if (!A0k(r5) || !z) {
            return false;
        }
        return true;
    }

    public static boolean A0Q(AnonymousClass00S r7, AnonymousClass09J r8, AbstractC007503q r9) {
        boolean containsKey;
        C007303n r6 = r9.A0n;
        boolean z = r6.A02;
        if (z && C12080hW.A00(r9.A08, 4) < 0 && r9.A0E + 86400000 < r7.A05()) {
            Map map = r8.A01;
            synchronized (map) {
                containsKey = map.containsKey(r6);
            }
            if (!containsKey) {
                return true;
            }
        }
        return z && r9.A08 == 7;
    }

    public static boolean A0R(C08560bL r6, AbstractC007503q r7, C000300f r8, AnonymousClass00D r9) {
        byte b;
        boolean z;
        int i;
        int i2;
        int i3;
        if (r6 != null && r6.A0R && !A0S(r7) && (b = r7.A0m) != 8 && !A0U(r7) && !A0Z(r7) && !A0X(r7) && (!(z = r7.A0n.A02) || !A0I(b, r7.A08) || ((C05390Oi) r7).A00 != 21)) {
            if (z) {
                boolean A0I = A0I(b, r7.A08);
                if (A0I && ((C05390Oi) r7).A00 == 27) {
                    return false;
                }
                if (A0I && ((C05390Oi) r7).A00 == 6) {
                    return false;
                }
            }
            if (!A0h(r7) && !A0T(r7)) {
                if (z) {
                    boolean A0I2 = A0I(b, r7.A08);
                    if (A0I2 && ((i3 = ((C05390Oi) r7).A00) == 29 || i3 == 30)) {
                        return false;
                    }
                    if (A0I2 && ((i2 = ((C05390Oi) r7).A00) == 31 || i2 == 32)) {
                        return false;
                    }
                    if (A0I2 && ((i = ((C05390Oi) r7).A00) == 53 || i == 54)) {
                        return false;
                    }
                    if (A0I2 && ((C05390Oi) r7).A00 == 56) {
                        return false;
                    }
                }
                if (!A0Y(r7)) {
                    if (r7 instanceof C05390Oi) {
                        long j = (long) ((C05390Oi) r7).A00;
                        if (j == 62 || j == 63) {
                            return false;
                        }
                    }
                    if (!r8.A0D(AbstractC000400g.A0p) || r9.A00.getBoolean("notify_new_message_for_archived_chats", false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean A0S(AbstractC007503q r1) {
        if (r1.A0f) {
            C007303n r12 = r1.A0n;
            return r12.A02 && !AnonymousClass1VY.A0T(r12.A00);
        }
    }

    public static boolean A0T(AbstractC007503q r6) {
        if ((r6 instanceof C05390Oi) && ((long) ((C05390Oi) r6).A00) == 61) {
            return true;
        }
        return false;
    }

    public static boolean A0U(AbstractC007503q r2) {
        return r2.A0n.A02 && A0I(r2.A0m, r2.A08) && ((C05390Oi) r2).A00 == 19;
    }

    public static boolean A0V(AbstractC007503q r2) {
        if (r2 == null) {
            return true;
        }
        if (!A0b(r2)) {
            return false;
        }
        AbstractC007503q A09 = r2.A09();
        if (A09 == null || A0b(A09)) {
            return true;
        }
        return false;
    }

    public static boolean A0W(AbstractC007503q r2) {
        if (!r2.A0n.A02 || !A0I(r2.A0m, r2.A08)) {
            return false;
        }
        int i = ((C05390Oi) r2).A00;
        return i == 28 || i == 10;
    }

    public static boolean A0X(AbstractC007503q r2) {
        return r2.A0n.A02 && A0I(r2.A0m, r2.A08) && ((C05390Oi) r2).A00 == 57;
    }

    public static boolean A0Y(AbstractC007503q r2) {
        byte b = r2.A0m;
        if (b != 36) {
            return r2.A0n.A02 && A0I(b, r2.A08) && (r2 instanceof C05390Oi) && ((C05390Oi) r2).A00 == 59;
        }
        return true;
    }

    public static boolean A0Z(AbstractC007503q r2) {
        return r2.A0n.A02 && A0I(r2.A0m, r2.A08) && ((C05390Oi) r2).A00 == 18;
    }

    public static boolean A0a(AbstractC007503q r3) {
        if (!(r3 instanceof C05390Oi)) {
            return false;
        }
        int i = ((C05390Oi) r3).A00;
        if (i == 37 || i == 39 || i == 40 || i == 44 || i == 41 || i == 42) {
            return true;
        }
        return false;
    }

    public static boolean A0b(AbstractC007503q r2) {
        C05450Op A0u;
        if (r2.A0B() != null && !r2.A0B().A06()) {
            return false;
        }
        if (!(r2 instanceof AnonymousClass0M3) || (A0u = ((AnonymousClass0M3) r2).A0u()) == null || A0u.A04()) {
            return true;
        }
        return false;
    }

    public static boolean A0c(AbstractC007503q r2) {
        byte b;
        return ((r2 instanceof AnonymousClass0MM) || (b = r2.A0m) == 10 || b == 12 || b == 15 || b == 11 || b == 31) ? false : true;
    }

    public static boolean A0d(AbstractC007503q r2) {
        C05450Op A0u;
        if (!(r2 instanceof AnonymousClass0MI) || (A0u = ((AnonymousClass0M3) r2).A0u()) == null) {
            return false;
        }
        AnonymousClass0M4 r0 = A0u.A04.A02;
        if (r0 == null) {
            throw null;
        } else if (r0.A0M) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A0e(AbstractC007503q r1) {
        if (r1 instanceof AnonymousClass0ZC) {
            C05450Op A0u = ((AnonymousClass0M3) r1).A0u();
            if (A0u != null) {
                AnonymousClass0M4 r0 = A0u.A04.A02;
                if (r0 == null) {
                    throw null;
                } else if (r0.A0M) {
                    boolean z = false;
                    if (!C006803i.A0g()) {
                        z = true;
                    }
                    return z;
                }
            } else {
                throw null;
            }
        }
    }

    public static boolean A0f(AbstractC007503q r1) {
        if (!(r1 instanceof C05490Ot)) {
            return false;
        }
        C05490Ot r12 = (C05490Ot) r1;
        return !TextUtils.isEmpty(r12.A04) || !TextUtils.isEmpty(r12.A02);
    }

    public static boolean A0g(AbstractC007503q r4) {
        if (!(r4 instanceof AnonymousClass0M2)) {
            return false;
        }
        AnonymousClass0M4 r2 = ((AnonymousClass0M3) r4).A02;
        if (r4.A04 != 7 || r2 == null || r2.A01 <= 0) {
            return false;
        }
        return true;
    }

    public static boolean A0h(AbstractC007503q r6) {
        if (!(r6 instanceof C05390Oi)) {
            return false;
        }
        long j = (long) ((C05390Oi) r6).A00;
        if (j == 22 || j == 34 || j == 35 || j == 36 || j == 23 || j == 24 || j == 25 || j == 26 || j == 46 || j == 47 || j == 48 || j == 49 || j == 50 || j == 55) {
            return true;
        }
        return false;
    }

    public static boolean A0i(AbstractC007503q r6) {
        if (1528398000000L > r6.A0E || !r6.A0s(1)) {
            return false;
        }
        byte b = r6.A0m;
        if (b != 0) {
            if (!(b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 9 || b == 23 || b == 32 || b == 37 || b == 13 || b == 14)) {
                switch (b) {
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        } else if ((r6 instanceof C05390Oi) || r6.A0F != null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean A0j(AbstractC007503q r1) {
        return r1.A0s(512) || r1.A0s(4096);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004a, code lost:
        if (r0 == 403) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0k(X.AbstractC007503q r5) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FI.A0k(X.03q):boolean");
    }

    public static boolean A0l(AbstractC007503q r3, long j) {
        boolean z = false;
        if (r3.A02 > 0) {
            z = true;
        }
        if (z) {
            Long l = r3.A0R;
            if (l != null) {
                return l.longValue() < j;
            }
            throw null;
        }
    }

    public static boolean A0m(AbstractC007503q r5, boolean z) {
        C007303n r2 = r5.A0n;
        AnonymousClass02N r1 = r2.A00;
        return z && !(r5 instanceof C05390Oi) && r2.A02 && ((r1 instanceof UserJid) || (r1 instanceof AnonymousClass02X)) && r5.A0C == 0 && r5.A0u == null && r5.A07 == 0;
    }

    public static boolean A0n(AbstractC007503q r6, boolean z) {
        byte b;
        boolean A0W;
        AnonymousClass02N r1;
        int i;
        if ((!A0S(r6) || z) && (((b = r6.A0m) != 24 || !r6.A0n.A02 || z) && b != 8 && !A0U(r6) && !A0Z(r6) && !A0X(r6))) {
            C007303n r2 = r6.A0n;
            if ((!r2.A02 || !A0I(b, r6.A08) || !((i = ((C05390Oi) r6).A00) == 50 || i == 49 || i == 47 || i == 48 || i == 46 || i == 55)) && !A0h(r6) && ((!(A0W = A0W(r6)) || (A0W && z && (r1 = r2.A00) != null && r1.equals(((C12130hb) r6).A01))) && !(r6 instanceof C12160he) && !A0T(r6))) {
                if (!(r6 instanceof C05390Oi)) {
                    return true;
                }
                long j = (long) ((C05390Oi) r6).A00;
                if (j == 62 || j == 63) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean A0o(AnonymousClass0M3 r6) {
        int[] A06;
        C05450Op A0u = r6.A0u();
        if (A0u == null) {
            return false;
        }
        AnonymousClass0M4 r0 = A0u.A04.A02;
        if (r0 == null) {
            throw null;
        } else if (!r0.A0M || (A06 = A0u.A06()) == null || A06.length < 4) {
            return false;
        } else {
            long j = (long) (A06[0] + A06[1] + A06[2]);
            AnonymousClass0M4 r02 = r6.A02;
            if (r02 == null) {
                throw null;
            } else if (r02.A09 >= j) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r4.A0n.A02 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0p(X.AnonymousClass0M3 r4) {
        /*
            boolean r0 = X.C002001d.A3W(r4)
            r3 = 1
            if (r0 == 0) goto L_0x0008
            return r3
        L_0x0008:
            X.0M4 r2 = r4.A02
            if (r2 == 0) goto L_0x0025
            boolean r0 = r2.A0X
            if (r0 == 0) goto L_0x0017
            X.03n r0 = r4.A0n
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x0023
        L_0x001e:
            java.lang.String r0 = r4.A09
            if (r0 == 0) goto L_0x0023
            return r3
        L_0x0023:
            r3 = 0
            return r3
        L_0x0025:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FI.A0p(X.0M3):boolean");
    }

    public static boolean A0q(AnonymousClass0M3 r1) {
        AnonymousClass0M4 r12 = r1.A02;
        if (r12 != null) {
            return r12.A0a && !r12.A0Y;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r4.A0n.A02 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0r(X.AnonymousClass0M3 r4) {
        /*
            boolean r0 = X.C002001d.A3W(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0008
            return r3
        L_0x0008:
            X.0M4 r2 = r4.A02
            if (r2 == 0) goto L_0x0032
            boolean r0 = r2.A0X
            if (r0 == 0) goto L_0x0017
            X.03n r0 = r4.A0n
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x0030
        L_0x001e:
            boolean r0 = r4.A0f
            if (r0 == 0) goto L_0x0031
            X.03n r1 = r4.A0n
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0031
            X.02N r0 = r1.A00
            boolean r0 = X.AnonymousClass1VY.A0T(r0)
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r3 = 1
        L_0x0031:
            return r3
        L_0x0032:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FI.A0r(X.0M3):boolean");
    }

    public static boolean A0s(C05390Oi r1) {
        return A0U(r1) && (r1 instanceof C12150hd) && ((C12150hd) r1).A00 != 0;
    }

    public static boolean A0t(AnonymousClass0ZC r5) {
        AnonymousClass0M4 r1 = ((AnonymousClass0M3) r5).A02;
        return A0G(r5.A0m) && r1 != null && !r5.A0n.A02 && !r1.A0P && r1.A0C > 0;
    }

    public static boolean A0u(AnonymousClass0ML r3) {
        AnonymousClass0M4 r2 = ((AnonymousClass0M3) r3).A02;
        if (!A0G(r3.A0m) || r2 == null || !r3.A0n.A02 || !r3.A0s(1) || r2.A0P || ((AnonymousClass0M3) r3).A09 == null) {
            return false;
        }
        return true;
    }

    public static boolean A0v(AnonymousClass0ML r6) {
        String str;
        AnonymousClass0M4 r4 = ((AnonymousClass0M3) r6).A02;
        StringBuilder sb = new StringBuilder("FMessageUtil/shouldStreamVideo/");
        sb.append("mediaDataV2 is ");
        if (r4 == null) {
            str = "null";
        } else {
            str = "not null";
        }
        sb.append(str);
        sb.append(",isStreamableVideo=");
        sb.append(A0e(r6));
        sb.append(",message.key.from_me=");
        boolean z = r6.A0n.A02;
        sb.append(z);
        sb.append(",isForwardedPartiallyDownloadedVideo=");
        sb.append(A0u(r6));
        if (r4 != null) {
            sb.append(",mediaDataV2.transferred=");
            sb.append(r4.A0P);
            sb.append(",mediaDataV2 is not suspicious content=");
            boolean z2 = false;
            if (r4.A07 == 0) {
                z2 = true;
            }
            sb.append(z2);
        }
        Log.d(sb.toString());
        if (r4 == null || !A0e(r6)) {
            return false;
        }
        if ((!z || A0u(r6)) && !r4.A0P && r4.A07 == 0) {
            return true;
        }
        return false;
    }

    public static boolean A0w(boolean z, int i, int i2) {
        int i3;
        return i2 != 0 && z && !(i2 == 4 && ((i3 = Build.VERSION.SDK_INT) == 21 || i3 == 22)) && i == 1;
    }

    public static byte[] A0x(AnonymousClass00S r6, AnonymousClass01I r7, boolean z) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            long A05 = r6.A05();
            byte[] bArr = new byte[8];
            for (int i = 7; i >= 0; i--) {
                bArr[i] = (byte) ((int) A05);
                A05 >>= 8;
            }
            instance.update(bArr);
            r7.A04();
            UserJid userJid = r7.A03;
            if (userJid != null) {
                instance.update(userJid.getRawString().getBytes());
                byte[] bArr2 = new byte[16];
                if (z) {
                    A00.nextBytes(bArr2);
                } else {
                    A01.nextBytes(bArr2);
                }
                instance.update(bArr2);
                return instance.digest();
            }
            throw null;
        } catch (NoSuchAlgorithmException e) {
            Log.w("unable to provide message id hash due to missing md5 algorithm", e);
            return null;
        }
    }
}
