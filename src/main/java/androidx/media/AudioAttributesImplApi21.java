package androidx.media;

import X.AnonymousClass008;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public int A00 = -1;
    public AudioAttributes A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.A01.equals(((AudioAttributesImplApi21) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("AudioAttributesCompat: audioattributes=");
        A0S.append(this.A01);
        return A0S.toString();
    }
}
