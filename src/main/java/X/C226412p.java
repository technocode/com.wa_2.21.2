package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.reflect.Method;

/* renamed from: X.12p  reason: invalid class name and case insensitive filesystem */
public final class C226412p {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public C226212n A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final AbstractC226312o A0N;
    public final long[] A0O;

    public C226412p(AbstractC226312o r4) {
        this.A0N = r4;
        if (AnonymousClass0W2.A00 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    public final long A00() {
        AudioTrack audioTrack = this.A0H;
        if (audioTrack != null) {
            long j = this.A0G;
            if (j != -9223372036854775807L) {
                return Math.min(this.A06, this.A0F + ((((SystemClock.elapsedRealtime() * 1000) - j) * ((long) this.A03)) / SearchActionVerificationClientService.MS_TO_NS));
            }
            int playState = audioTrack.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
            if (this.A0M) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.A0C = this.A0A;
                }
                playbackHeadPosition += this.A0C;
            }
            if (AnonymousClass0W2.A00 <= 28) {
                if (playbackHeadPosition == 0) {
                    long j2 = this.A0A;
                    if (j2 > 0 && playState == 3) {
                        if (this.A07 == -9223372036854775807L) {
                            this.A07 = SystemClock.elapsedRealtime();
                        }
                        return j2;
                    }
                }
                this.A07 = -9223372036854775807L;
            }
            if (this.A0A > playbackHeadPosition) {
                this.A0D++;
            }
            this.A0A = playbackHeadPosition;
            return playbackHeadPosition + (this.A0D << 32);
        }
        throw null;
    }

    public boolean A01(long j) {
        if (j <= A00()) {
            if (!this.A0M) {
                return false;
            }
            AudioTrack audioTrack = this.A0H;
            if (audioTrack == null) {
                throw null;
            } else if (!(audioTrack.getPlayState() == 2 && A00() == 0)) {
                return false;
            }
        }
        return true;
    }
}
