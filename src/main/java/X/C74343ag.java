package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: X.3ag  reason: invalid class name and case insensitive filesystem */
public class C74343ag extends AbstractC72633Tq {
    public final AudioDeviceCallback A00 = new AnonymousClass396(this);
    public final AnonymousClass03P A01;

    public C74343ag(AnonymousClass03P r2) {
        this.A01 = r2;
    }

    @Override // X.AbstractC72633Tq
    public void A00() {
        AudioManager A09 = this.A01.A09();
        if (A09 != null) {
            A09.registerAudioDeviceCallback(this.A00, null);
        }
    }

    @Override // X.AbstractC72633Tq
    public void A01() {
        AudioManager A09 = this.A01.A09();
        if (A09 != null) {
            A09.unregisterAudioDeviceCallback(this.A00);
        }
    }

    @Override // X.AbstractC72633Tq
    public boolean A03() {
        AudioManager A09 = this.A01.A09();
        if (A09 == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : A09.getDevices(2)) {
            int type = audioDeviceInfo.getType();
            if (type == 4 || type == 3 || type == 11 || (Build.VERSION.SDK_INT >= 26 && type == 22)) {
                return true;
            }
        }
        return false;
    }
}
