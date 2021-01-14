package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.396  reason: invalid class name */
public class AnonymousClass396 extends AudioDeviceCallback {
    public final /* synthetic */ C74343ag A00;

    public AnonymousClass396(C74343ag r1) {
        this.A00 = r1;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A02();
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A02();
    }
}
