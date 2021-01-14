package androidx.media;

import X.AbstractC17470rb;
import X.AbstractC17480rc;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC17470rb r3) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        AbstractC17480rc r1 = audioAttributesCompat.A00;
        if (r3.A09(1)) {
            r1 = r3.A03();
        }
        audioAttributesCompat.A00 = (AudioAttributesImpl) r1;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC17470rb r2) {
        if (r2 != null) {
            AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
            r2.A06(1);
            r2.A08(audioAttributesImpl);
            return;
        }
        throw null;
    }
}
