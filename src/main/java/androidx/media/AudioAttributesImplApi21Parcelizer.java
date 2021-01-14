package androidx.media;

import X.AbstractC17470rb;
import X.C30931cE;
import android.media.AudioAttributes;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC17470rb r3) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) r3.A01(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = r3.A00(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC17470rb r4) {
        if (r4 != null) {
            AudioAttributes audioAttributes = audioAttributesImplApi21.A01;
            r4.A06(1);
            ((C30931cE) r4).A05.writeParcelable(audioAttributes, 0);
            r4.A07(audioAttributesImplApi21.A00, 2);
            return;
        }
        throw null;
    }
}
