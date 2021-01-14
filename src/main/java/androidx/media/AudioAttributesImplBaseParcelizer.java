package androidx.media;

import X.AbstractC17470rb;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC17470rb r3) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.A03 = r3.A00(audioAttributesImplBase.A03, 1);
        audioAttributesImplBase.A00 = r3.A00(audioAttributesImplBase.A00, 2);
        audioAttributesImplBase.A01 = r3.A00(audioAttributesImplBase.A01, 3);
        audioAttributesImplBase.A02 = r3.A00(audioAttributesImplBase.A02, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC17470rb r3) {
        if (r3 != null) {
            r3.A07(audioAttributesImplBase.A03, 1);
            r3.A07(audioAttributesImplBase.A00, 2);
            r3.A07(audioAttributesImplBase.A01, 3);
            r3.A07(audioAttributesImplBase.A02, 4);
            return;
        }
        throw null;
    }
}
