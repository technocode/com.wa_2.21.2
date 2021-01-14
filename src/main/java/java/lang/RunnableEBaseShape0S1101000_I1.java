package java.lang;

import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass02M;
import X.AnonymousClass0JJ;
import X.AnonymousClass16O;
import X.AnonymousClass1Y6;
import X.AnonymousClass3MG;
import X.C34531if;
import X.C34541ih;
import X.C456025m;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$TryAgainDialogFragment;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.util.Log;
import java.io.IOException;

public class RunnableEBaseShape0S1101000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    public RunnableEBaseShape0S1101000_I1(Object obj, String str, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = i;
    }

    public final void run() {
        long j;
        switch (this.A03) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                String str = this.A02;
                int i = this.A00;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-activity/auth-request asking GoogleAuthUtil for token for ");
                    sb.append(AnonymousClass0JJ.A0B(str));
                    Log.i(sb.toString());
                    restoreFromBackupActivity.A0F = C34531if.A04(restoreFromBackupActivity, str);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("gdrive-activity/auth-request for account ");
                    sb2.append(AnonymousClass0JJ.A0B(str));
                    sb2.append(", token has been received.");
                    Log.i(sb2.toString());
                    Intent intent = new Intent();
                    intent.putExtra("authtoken", restoreFromBackupActivity.A0F);
                    intent.putExtra("authAccount", str);
                    restoreFromBackupActivity.onActivityResult(i, -1, intent);
                    restoreFromBackupActivity.A0M.open();
                    return;
                } catch (C456025m e) {
                    AnonymousClass02M r2 = ((ActivityC004702f) restoreFromBackupActivity).A0F;
                    r2.A02.post(new RunnableEBaseShape7S0100000_I1_2(restoreFromBackupActivity, 13));
                    Log.e("gdrive-activity/gps-unavailable", e);
                    restoreFromBackupActivity.A0F = null;
                    return;
                } catch (C34541ih e2) {
                    restoreFromBackupActivity.A0M.close();
                    restoreFromBackupActivity.A0F = null;
                    restoreFromBackupActivity.A0g(25, null);
                    AnonymousClass02M r22 = ((ActivityC004702f) restoreFromBackupActivity).A0F;
                    r22.A02.post(new RunnableEBaseShape1S0201000_I1(e2, i, restoreFromBackupActivity, 8));
                    return;
                } catch (IOException e3) {
                    Log.e("gdrive-activity/auth-request", e3);
                    restoreFromBackupActivity.A0F = null;
                    restoreFromBackupActivity.A0M.open();
                    AnonymousClass02M r23 = ((ActivityC004702f) restoreFromBackupActivity).A0F;
                    r23.A02.post(new RunnableEBaseShape7S0100000_I1_2(restoreFromBackupActivity, 15));
                    return;
                } catch (AnonymousClass16O | SecurityException e4) {
                    Log.e("gdrive-activity/auth-request", e4);
                    restoreFromBackupActivity.A0F = null;
                    restoreFromBackupActivity.A0M.open();
                    AnonymousClass02M r24 = ((ActivityC004702f) restoreFromBackupActivity).A0F;
                    r24.A02.post(new RunnableEBaseShape1S1100000_I1(restoreFromBackupActivity, str, 11));
                    return;
                }
            case 1:
                AnonymousClass1Y6 r3 = (AnonymousClass1Y6) this.A01;
                String str2 = this.A02;
                int i2 = this.A00;
                r3.A0E = false;
                ((ActivityC004702f) r3).A0K.A00();
                if (str2 != null) {
                    r3.A0A = str2;
                    ContactQrMyCodeFragment contactQrMyCodeFragment = r3.A08;
                    if (contactQrMyCodeFragment != null) {
                        contactQrMyCodeFragment.A01 = str2;
                        ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A00;
                        if (contactQrContactCardView != null) {
                            contactQrContactCardView.setQrCode(AnonymousClass008.A0K("https://wa.me/qr/", str2));
                        }
                    }
                    if (r3.A0F) {
                        r3.APo(R.string.contact_qr_revoke_success);
                        return;
                    }
                    return;
                } else if (i2 == 0) {
                    ((ActivityC004702f) r3).A0F.A06(R.string.no_internet_message, 1);
                    return;
                } else if (r3.A0F) {
                    r3.APo(R.string.contact_qr_revoke_failure);
                    return;
                } else {
                    r3.APm(new BaseQrActivity$TryAgainDialogFragment());
                    return;
                }
            case 2:
                String str3 = this.A02;
                int i3 = this.A00;
                AnonymousClass1Y6 r25 = (AnonymousClass1Y6) ((AnonymousClass3MG) this.A01).A02.A00.get();
                if (r25 != null) {
                    if (!(str3 == null && i3 == 0)) {
                        AnonymousClass008.A0m(((ActivityC004702f) r25).A0J, "contact_qr_code", str3);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - r25.A00;
                    AnonymousClass02M r4 = ((ActivityC004702f) r25).A0F;
                    RunnableEBaseShape0S1101000_I1 runnableEBaseShape0S1101000_I1 = new RunnableEBaseShape0S1101000_I1(r25, str3, i3, 1);
                    if (elapsedRealtime < 500) {
                        j = 500 - elapsedRealtime;
                    } else {
                        j = 0;
                    }
                    r4.A02.postDelayed(runnableEBaseShape0S1101000_I1, j);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
