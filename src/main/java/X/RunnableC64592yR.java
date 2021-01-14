package X;

import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2yR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC64592yR extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass02N A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ AnonymousClass1XX A04;
    public final /* synthetic */ AnonymousClass0XH A05;

    public /* synthetic */ RunnableC64592yR(AnonymousClass0XH r1, AnonymousClass1XX r2, AnonymousClass02N r3, UserJid userJid, int i, long j) {
        this.A05 = r1;
        this.A04 = r2;
        this.A02 = r3;
        this.A03 = userJid;
        this.A00 = i;
        this.A01 = j;
    }

    public final void run() {
        ProfilePhotoChange profilePhotoChange;
        C007303n r0;
        String num;
        AnonymousClass0XH r5 = this.A05;
        AnonymousClass1XX r4 = this.A04;
        AnonymousClass02N r9 = this.A02;
        UserJid userJid = this.A03;
        int i = this.A00;
        long j = this.A01;
        StringBuilder sb = new StringBuilder("ProfilePictureNotificationHandler/profilephotochange ");
        sb.append(r9);
        sb.append(" author:");
        sb.append(userJid);
        sb.append(" photoId:");
        AnonymousClass008.A1L(sb, i);
        C007003k A0A = r5.A03.A0A(r9);
        AnonymousClass01I r2 = r5.A01;
        r2.A04();
        if (r2.A03 != null) {
            boolean z = true;
            if (!r2.A09(userJid)) {
                r5.A02.A08(r9, i, true);
            }
            if (A0A.A09() && userJid != null && !r2.A09(userJid)) {
                File A032 = r5.A04.A03(A0A);
                if (A032.exists()) {
                    profilePhotoChange = new ProfilePhotoChange();
                    profilePhotoChange.newPhotoId = i;
                    try {
                        profilePhotoChange.oldPhoto = C002001d.A3k(A032);
                    } catch (IOException e) {
                        Log.w("app/xmpp/recv/handle_profile_photo_changed/", e);
                    }
                } else {
                    profilePhotoChange = null;
                }
                AnonymousClass01R r02 = r5.A08;
                String str = r4.A07;
                long j2 = 1000 * j;
                if (str == null) {
                    AnonymousClass0A6 r03 = r02.A04;
                    r0 = AnonymousClass0FI.A07(r03.A01, r03.A00, r9, true);
                } else {
                    r0 = new C007303n(r9, true, str);
                }
                C12120ha r6 = (C12120ha) AnonymousClass01R.A00(r0, j2, 6);
                if (i == -1) {
                    num = null;
                } else {
                    num = Integer.toString(i);
                }
                r6.A0d(num);
                r6.A0Y(userJid);
                r6.A00 = profilePhotoChange;
                AbstractC007503q A022 = r5.A06.A02(r9);
                if (!(A022 instanceof C05390Oi)) {
                    r5.A05.A0J(r6);
                } else {
                    C05390Oi r7 = (C05390Oi) A022;
                    boolean z2 = false;
                    if (r7.A00 == 11) {
                        z2 = true;
                    }
                    if (r6.A0G == null || !r7.A0u() || !userJid.equals(r7.A07())) {
                        z = false;
                    }
                    if (!z2 || !z) {
                        r5.A05.A0J(r6);
                    }
                }
            }
            r5.A07.A0M(r4);
            return;
        }
        throw new AssertionError("local JID unknown");
    }
}
