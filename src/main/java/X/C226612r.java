package X;

import android.media.AudioTrack;

/* renamed from: X.12r  reason: invalid class name and case insensitive filesystem */
public class C226612r extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C33891hY A01;

    public C226612r(C33891hY r1, AudioTrack audioTrack) {
        this.A01 = r1;
        this.A00 = audioTrack;
    }

    public void run() {
        try {
            AudioTrack audioTrack = this.A00;
            audioTrack.flush();
            audioTrack.release();
        } finally {
            this.A01.A0e.open();
        }
    }
}
