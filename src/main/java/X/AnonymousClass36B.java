package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.Conversation;
import com.whatsapp.conversationrow.ContactSyncActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.36B  reason: invalid class name */
public class AnonymousClass36B {
    public static volatile AnonymousClass36B A0C;
    public final AnonymousClass02M A00;
    public final C000300f A01;
    public final AnonymousClass0DH A02;
    public final AnonymousClass01A A03;
    public final AnonymousClass08B A04;
    public final C014308b A05;
    public final AnonymousClass0I9 A06;
    public final AnonymousClass0XN A07;
    public final AnonymousClass0HN A08;
    public final AnonymousClass03P A09;
    public final AnonymousClass03S A0A;
    public final AnonymousClass00T A0B;

    public AnonymousClass36B(AnonymousClass02M r1, AnonymousClass00T r2, C000300f r3, AnonymousClass0DH r4, AnonymousClass01A r5, AnonymousClass03P r6, C014308b r7, AnonymousClass08B r8, AnonymousClass0XN r9, AnonymousClass0HN r10, AnonymousClass03S r11, AnonymousClass0I9 r12) {
        this.A00 = r1;
        this.A0B = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A09 = r6;
        this.A05 = r7;
        this.A04 = r8;
        this.A07 = r9;
        this.A08 = r10;
        this.A0A = r11;
        this.A06 = r12;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x041e, code lost:
        if (r8.equals("vnd.android.cursor.item/photo") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0427, code lost:
        if (r8.equals("vnd.android.cursor.item/im") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0430, code lost:
        if (r8.equals("vnd.android.cursor.item/nickname") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x03eb, code lost:
        if (r8.equals("vnd.android.cursor.item/email_v2") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03f4, code lost:
        if (r8.equals("vnd.android.cursor.item/contact_event") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03ff, code lost:
        if (r8.equals("vnd.android.cursor.item/postal-address_v2") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x040a, code lost:
        if (r8.equals("vnd.android.cursor.item/phone_v2") == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0415, code lost:
        if (r8.equals("vnd.android.cursor.item/organization") == false) goto L_0x0316;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.app.Activity r28, X.AnonymousClass1Z4 r29, android.graphics.Bitmap r30, boolean r31) {
        /*
        // Method dump skipped, instructions count: 1130
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36B.A00(android.app.Activity, X.1Z4, android.graphics.Bitmap, boolean):android.content.Intent");
    }

    public static AnonymousClass36B A01() {
        if (A0C == null) {
            synchronized (AnonymousClass36B.class) {
                if (A0C == null) {
                    A0C = new AnonymousClass36B(AnonymousClass02M.A00(), C002101e.A00(), C000300f.A00(), AnonymousClass0DH.A00(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass08B.A00, AnonymousClass0XN.A00(), AnonymousClass0HN.A00(), AnonymousClass03S.A00(), AnonymousClass0I9.A00());
                }
            }
        }
        return A0C;
    }

    public void A02(Context context, UserJid userJid, String str) {
        AnonymousClass0QW r0;
        AnonymousClass01A r3 = this.A03;
        C007003k A0A2 = r3.A0A(userJid);
        C000300f r2 = this.A01;
        C002801l r1 = AbstractC000400g.A0Z;
        if (!r2.A0D(r1) || A0A2.A0T || TextUtils.isEmpty(str)) {
            if (r2.A0D(r1) && (((r0 = A0A2.A08) == null || TextUtils.isEmpty(r0.A01)) && !A0A2.A0W && !A0A2.A0T)) {
                this.A0B.ANF(new RunnableEBaseShape9S0200000_I1_4(this, userJid, 28));
            }
            context.startActivity(Conversation.A04(context, r3.A0A(userJid)));
            return;
        }
        context.startActivity(new Intent(context, ContactSyncActivity.class).putExtra("user_jid", AnonymousClass1VY.A0D(userJid)).addFlags(335544320));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        if (r1 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0122, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.util.ArrayList r23, java.util.List r24, java.lang.String r25, java.lang.String r26) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36B.A03(java.util.ArrayList, java.util.List, java.lang.String, java.lang.String):void");
    }
}
