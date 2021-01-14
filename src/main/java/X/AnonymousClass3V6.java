package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3V6  reason: invalid class name */
public class AnonymousClass3V6 implements AbstractC011006p {
    public AnonymousClass36G A00;
    public final AnonymousClass3AU A01;
    public final AbstractC02170Ax A02 = C72943Uw.A00;
    public final AbstractC02170Ax A03 = C72903Us.A00;
    public final AbstractC02170Ax A04 = AnonymousClass3V1.A00;
    public final AbstractC02170Ax A05 = C72953Ux.A00;
    public final AbstractC02170Ax A06 = C72963Uy.A00;
    public final AbstractC02170Ax A07 = AnonymousClass3V0.A00;
    public final AbstractC02170Ax A08 = C72933Uv.A00;

    public AnonymousClass3V6(AnonymousClass3AU r2) {
        this.A01 = r2;
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

    public final UserJid A01(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return UserJid.get(str);
            } catch (AnonymousClass02Y e) {
                UserJid fromIdentifier = UserJid.getFromIdentifier(str);
                StringBuilder A0S = AnonymousClass008.A0S("bloks/openchat - Jid missing suffix: ");
                A0S.append(e.getMessage());
                ((AnonymousClass009) this.A03.get()).A04(A0S.toString(), null, true);
                return fromIdentifier;
            }
        } else {
            throw new AnonymousClass02Y("Jid is Empty");
        }
    }

    public final C74403ao A02() {
        AnonymousClass3AU r2 = this.A01;
        if (r2 instanceof C74403ao) {
            return (C74403ao) r2;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Expected BkWaBloksActivityExtensions -- got: ");
        A0S.append(r2.getClass().getSimpleName());
        throw new IllegalStateException(A0S.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (r13.equals("bk.action.navigation.SetNavBar") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r13.equals("wa.action.SendFieldStat") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r13.equals("bk.action.io.clipboard.SetString") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        if (r13.equals("bk.action.logging.LogEvent") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r13.equals("wa.action.TimeInFuture") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        if (r13.equals("bk.action.navigation.OpenUrl") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        if (r13.equals("wa.action.FormatStringV2") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        if (r13.equals("wa.action.GetChildNode") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (r13.equals("wa.action.HandleError") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
        if (r13.equals("bk.action.bloks.OpenScreen") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        if (r13.equals("wa.action.StartFieldStatTimer") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        if (r13.equals("wa.action.navigation.OpenNativeActionSheet") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00da, code lost:
        if (r13.equals("wa.action.OpenUrl") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e7, code lost:
        if (r13.equals("wa.action.GetAttributeValue") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f3, code lost:
        if (r13.equals("bk.action.bloks.LaunchDialog") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0100, code lost:
        if (r13.equals("wa.action.navigation.OpenScreenWithOptions") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        if (r13.equals("wa.action.GetFieldStatElapsedTime") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0118, code lost:
        if (r13.equals("ig.action.navigation.OpenScreen") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        if (r13.equals("wa.action.ResetFieldStats") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0131, code lost:
        if (r13.equals("bk.action.bloks.AsyncAction") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013e, code lost:
        if (r13.equals("wa.action.SendFieldStatV2") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014b, code lost:
        if (r13.equals("wa.action.DismissProgressBar") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0157, code lost:
        if (r13.equals("wa.action.shops.TOSaccept") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0162, code lost:
        if (r13.equals("bk.action.navigation.CloseScreen") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016e, code lost:
        if (r13.equals("wa.action.share.Text") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017b, code lost:
        if (r13.equals("wa.action.navigation.OpenChat") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0186, code lost:
        if (r13.equals("bk.action.session_store.Get") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0192, code lost:
        if (r13.equals("bk.action.io.Toast") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019f, code lost:
        if (r13.equals("wa.action.FinishActivity") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ac, code lost:
        if (r13.equals("wa.action.GetIntentParameter") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b9, code lost:
        if (r13.equals("wa.action.navigation.OpenContactInfo") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c6, code lost:
        if (r13.equals("wa.action.Logging") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d3, code lost:
        if (r13.equals("wa.action.GetFieldStatEventId") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e0, code lost:
        if (r13.equals("wa.action.PopScreen") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ed, code lost:
        if (r13.equals("wa.action.FormatString") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f9, code lost:
        if (r13.equals("bk.action.io.DebugToast") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0206, code lost:
        if (r13.equals("wa.action.DismissDialog") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0213, code lost:
        if (r13.equals("wa.action.ShowProgressBar") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0220, code lost:
        if (r13.equals("wa.action.bloks.LaunchDialog") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022d, code lost:
        if (r13.equals("wa.action.FinishActivityWithResult") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        if (r13.equals("bk.action.io.CurrentTimeMillis") == false) goto L_0x0012;
     */
    @Override // X.AbstractC011006p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC011306t A49(X.C38151pP r22, X.C010106g r23, X.C011106q r24) {
        /*
        // Method dump skipped, instructions count: 3342
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V6.A49(X.1pP, X.06g, X.06q):X.06t");
    }
}
