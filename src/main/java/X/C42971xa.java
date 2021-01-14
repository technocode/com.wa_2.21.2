package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1xa  reason: invalid class name and case insensitive filesystem */
public class C42971xa implements AbstractC011006p {
    public C43331yC A00;
    public final AnonymousClass009 A01 = AnonymousClass009.A00();
    public final AnonymousClass02M A02 = AnonymousClass02M.A00();
    public final AnonymousClass01I A03 = AnonymousClass01I.A00();
    public final C28081Su A04 = C28081Su.A02;
    public final AnonymousClass1T6 A05;
    public final AnonymousClass03P A06 = AnonymousClass03P.A00();
    public final AnonymousClass00S A07 = AnonymousClass00S.A00();

    public C42971xa(AnonymousClass1T6 r2, C43331yC r3) {
        this.A05 = r2;
        this.A00 = r3;
    }

    public static final HashMap A00(Map map) {
        String str;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Number) {
                hashMap.put(C008805h.A0b((AbstractC011306t) entry.getKey()), entry.getValue().toString());
            } else {
                Object A0b = C008805h.A0b((AbstractC011306t) entry.getKey());
                if (entry.getValue() != AnonymousClass1H5.A00) {
                    str = C008805h.A0a((AbstractC011306t) entry.getValue()).toString();
                } else {
                    str = null;
                }
                hashMap.put(A0b, str);
            }
        }
        return hashMap;
    }

    public static Map A01(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(C008805h.A0T(entry.getKey()), C008805h.A0T(entry.getValue()));
        }
        return hashMap;
    }

    public static Map A02(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(C008805h.A0T(entry.getKey()), C008805h.A0T(entry.getValue()));
        }
        return hashMap;
    }

    public final HashMap A03(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object A0b = C008805h.A0b((AbstractC011306t) entry.getKey());
            if (entry.getValue() instanceof AnonymousClass27G) {
                String str = null;
                try {
                    hashMap.put(A0b, entry.getValue() != AnonymousClass1H5.A00 ? A03((Map) C008805h.A0b((AbstractC011306t) entry.getValue())) : null);
                } catch (ClassCastException unused) {
                    if (entry.getValue() != AnonymousClass1H5.A00) {
                        str = C008805h.A0a((AbstractC011306t) entry.getValue()).toString();
                    }
                    hashMap.put(A0b, str);
                }
            }
        }
        return hashMap;
    }

    public final void A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                UserJid.get(str);
            } catch (AnonymousClass02Y e) {
                UserJid.getFromIdentifier(str);
                AnonymousClass009 r3 = this.A01;
                StringBuilder A0S = AnonymousClass008.A0S("bloks/openchat - Jid missing suffix: ");
                A0S.append(e.getMessage());
                r3.A04(A0S.toString(), null, true);
            }
        } else {
            throw new AnonymousClass02Y("Jid is Empty");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r14.equals("wa.action.CheckPin") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        if (r14.equals("wa.action.AsyncRequest") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r14.equals("bk.action.array.Map") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        if (r14.equals("wa.action.SendFieldStat") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r14.equals("bk.action.io.clipboard.SetString") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r14.equals("wa.action.TimeInFuture") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        if (r14.equals("wa.action.ShowAlertDialog") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r14.equals("bk.action.navigation.OpenUrl") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if (r14.equals("wa.action.FormatStringV2") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ba, code lost:
        if (r14.equals("wa.action.GetChildNode") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r14.equals("wa.action.HandleError") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x080f, code lost:
        if (r3.equals("v") != false) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d2, code lost:
        if (r14.equals("bk.action.bloks.OpenScreen") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00df, code lost:
        if (r14.equals("wa.action.StartFieldStatTimer") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ec, code lost:
        if (r14.equals("wa.action.OpenUrl") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f8, code lost:
        if (r14.equals("wa.action.bloks.OpenScreenWithBackpress") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        if (r14.equals("wa.action.SaveScreenParam") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
        if (r14.equals("wa.action.GetAttributeValue") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        if (r14.equals("bk.action.bloks.LaunchDialog") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012a, code lost:
        if (r14.equals("wa.action.GetFieldStatElapsedTime") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0135, code lost:
        if (r14.equals("ig.action.navigation.OpenScreen") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0142, code lost:
        if (r14.equals("wa.action.IQRequest") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014f, code lost:
        if (r14.equals("wa.action.ResetFieldStats") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015c, code lost:
        if (r14.equals("wa.action.CheckCardNumber") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0169, code lost:
        if (r14.equals("wa.action.array.Foldl") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0176, code lost:
        if (r14.equals("wa.action.SendFieldStatV2") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0183, code lost:
        if (r14.equals("wa.action.DismissProgressBar") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018f, code lost:
        if (r14.equals("wa.action.shops.TOSaccept") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019c, code lost:
        if (r14.equals("wa.action.CheckCpfCnpj") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a8, code lost:
        if (r14.equals("wa.action.navigation.OpenChat") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b3, code lost:
        if (r14.equals("bk.action.session_store.Get") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01bf, code lost:
        if (r14.equals("bk.action.io.Toast") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01cc, code lost:
        if (r14.equals("wa.action.GetProcessedData") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        if (r14.equals("wa.action.FinishActivity") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e6, code lost:
        if (r14.equals("wa.action.GetIntentParameter") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f3, code lost:
        if (r14.equals("wa.action.LoadScreenParam") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ff, code lost:
        if (r14.equals("wa.action.navigation.OpenContactInfo") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020c, code lost:
        if (r14.equals("wa.action.Logging") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0219, code lost:
        if (r14.equals("wa.action.GetFieldStatEventId") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0226, code lost:
        if (r14.equals("wa.action.PopScreen") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0233, code lost:
        if (r14.equals("wa.action.FormatString") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r14.equals("bk.action.io.CurrentTimeMillis") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023f, code lost:
        if (r14.equals("bk.action.io.DebugToast") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024c, code lost:
        if (r14.equals("wa.action.DismissDialog") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0259, code lost:
        if (r14.equals("wa.action.ShowProgressBar") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0266, code lost:
        if (r14.equals("wa.action.bloks.LaunchDialog") == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0273, code lost:
        if (r14.equals("wa.action.FinishActivityWithResult") == false) goto L_0x0011;
     */
    @Override // X.AbstractC011006p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC011306t A49(X.C38151pP r18, X.C010106g r19, X.C011106q r20) {
        /*
        // Method dump skipped, instructions count: 3766
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42971xa.A49(X.1pP, X.06g, X.06q):X.06t");
    }
}
