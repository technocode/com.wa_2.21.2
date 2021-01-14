package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Locale;

/* renamed from: X.3AC  reason: invalid class name */
public class AnonymousClass3AC extends Handler {
    public final /* synthetic */ VoipPhysicalCamera A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3AC(VoipPhysicalCamera voipPhysicalCamera, Looper looper) {
        super(looper);
        this.A00 = voipPhysicalCamera;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            VoipPhysicalCamera voipPhysicalCamera = this.A00;
            boolean z = false;
            if (voipPhysicalCamera.lastCameraCallbackTs > 0) {
                z = true;
            }
            AnonymousClass00E.A08(z, "last camera callback ts should not be 0");
            long elapsedRealtime = SystemClock.elapsedRealtime() - voipPhysicalCamera.lastCameraCallbackTs;
            if (elapsedRealtime > 2000) {
                Log.e(String.format(Locale.getDefault(), "%dms since last callback, will try restarting camera.", Long.valueOf(elapsedRealtime)));
                voipPhysicalCamera.stopOnCameraThread();
                if (voipPhysicalCamera.startOnCameraThread() != 0) {
                    voipPhysicalCamera.stopOnCameraThread();
                }
            }
            voipPhysicalCamera.startPeriodicCameraCallbackCheck();
        } else if (i == 2) {
            this.A00.onFrameAvailableOnCameraThread();
        }
    }
}
