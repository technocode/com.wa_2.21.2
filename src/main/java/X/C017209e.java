package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.09e  reason: invalid class name and case insensitive filesystem */
public class C017209e extends AnonymousClass01C {
    public static final String[] A00 = {"wa_biz_profiles._id", "wa_biz_profiles.jid", "websites", "email", "business_description", "address", "tag", "latitude", "longitude", "vertical", "has_catalog", "address_postal_code", "address_city_id", "address_city_name", "commerce_experience", "shop_url", "cart_enabled"};

    public C017209e(AnonymousClass08H r1) {
        super(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0208, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0209, code lost:
        if (r8 != null) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0212, code lost:
        if (r5 != null) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0217, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x021a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x021e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0221, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0225, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ea, code lost:
        if (r13 != null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ef, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28231Tk A09(com.whatsapp.jid.UserJid r33) {
        /*
        // Method dump skipped, instructions count: 550
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017209e.A09(com.whatsapp.jid.UserJid):X.1Tk");
    }

    public void A0A(UserJid userJid) {
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot delete business profile details by null jid");
            return;
        }
        A06("wa_biz_profiles", "wa_biz_profiles.jid = ?", new String[]{userJid.getRawString()});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.util.Map r13) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017209e.A0B(java.util.Map):void");
    }
}
