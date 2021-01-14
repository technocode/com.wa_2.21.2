package X;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;

/* renamed from: X.3Tr  reason: invalid class name and case insensitive filesystem */
public class C72643Tr extends AnonymousClass0JW {
    public final WeakReference A00;
    public final WeakReference A01;

    public C72643Tr(Context context, AnonymousClass3TC r3) {
        this.A01 = new WeakReference(r3);
        this.A00 = new WeakReference(context);
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        Uri uri;
        Context context;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length <= 0 || (uri = uriArr[0]) == null || (context = (Context) this.A00.get()) == null) {
            return null;
        }
        return RingtoneManager.getRingtone(context, uri);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Ringtone ringtone = (Ringtone) obj;
        AnonymousClass3U7 r2 = ((AnonymousClass3TC) this.A01.get()).A00;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.callState == Voip.CallState.RECEIVED_CALL && r2.A0H != null) {
            Ringtone ringtone2 = r2.A0F;
            if (ringtone2 != null) {
                ringtone2.stop();
            }
            r2.A0F = ringtone;
            if (ringtone != null) {
                try {
                    ringtone.play();
                } catch (Exception e) {
                    Log.e(e);
                    try {
                        r2.A0F.stop();
                    } catch (Exception e2) {
                        Log.e(e2);
                    }
                    r2.A0F = null;
                }
            } else {
                StringBuilder A0S = AnonymousClass008.A0S("voip/ringtone/no-ringtone found for ");
                A0S.append(r2.A0H);
                Log.e(A0S.toString());
            }
        }
    }
}
