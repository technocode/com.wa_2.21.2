package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.0Fh  reason: invalid class name */
public class AnonymousClass0Fh {
    public static volatile AnonymousClass0Fh A00;

    public static AnonymousClass0Fh A00() {
        if (A00 == null) {
            synchronized (AnonymousClass0Fh.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass0Fh();
                }
            }
        }
        return A00;
    }

    public static boolean A01() {
        try {
            Voip.CallState currentCallState = Voip.getCurrentCallState();
            if (currentCallState == null || currentCallState == Voip.CallState.NONE) {
                return false;
            }
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public static boolean A02() {
        try {
            Voip.CallState currentCallState = Voip.getCurrentCallState();
            if (currentCallState == null || currentCallState == Voip.CallState.NONE || currentCallState == Voip.CallState.ACTIVE_ELSEWHERE) {
                return false;
            }
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public static boolean A03() {
        try {
            Voip.CallState currentCallState = Voip.getCurrentCallState();
            if (currentCallState == null || currentCallState != Voip.CallState.ACTIVE_ELSEWHERE) {
                return false;
            }
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public boolean A04() {
        CallInfo callInfo;
        if (!A01() || (callInfo = Voip.getCallInfo()) == null || !callInfo.videoEnabled) {
            return false;
        }
        return true;
    }
}
