package X;

import android.media.AudioAttributes;

/* renamed from: X.12X  reason: invalid class name */
public final class AnonymousClass12X {
    public static final AnonymousClass12X A02 = new AnonymousClass12X();
    public AudioAttributes A00;
    public final int A01 = 1;

    public AudioAttributes A00() {
        AudioAttributes audioAttributes = this.A00;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes build = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(this.A01).build();
        this.A00 = build;
        return build;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AnonymousClass12X.class == obj.getClass() && this.A01 == ((AnonymousClass12X) obj).A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 506447 + this.A01;
    }
}
