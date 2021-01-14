package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.3Sr  reason: invalid class name and case insensitive filesystem */
public class C72393Sr implements AnonymousClass12G {
    public final /* synthetic */ C72403Ss A00;

    @Override // X.AnonymousClass12G
    public void AHH(boolean z) {
    }

    @Override // X.AnonymousClass12G
    public void AIV(AnonymousClass12F r1) {
    }

    @Override // X.AnonymousClass12G
    public /* synthetic */ void AIZ(int i) {
    }

    @Override // X.AnonymousClass12G
    public /* synthetic */ void AJu() {
    }

    @Override // X.AnonymousClass12G
    public /* synthetic */ void AKz(AnonymousClass12R r1, Object obj, int i) {
    }

    public C72393Sr(C72403Ss r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass12G
    public void AIX(AnonymousClass11w r5) {
        String str;
        if (r5.type == 1) {
            Exception exc = (Exception) r5.cause;
            if (exc instanceof AnonymousClass13W) {
                AnonymousClass13W r1 = (AnonymousClass13W) exc;
                str = r1.decoderName == null ? r1.getCause() instanceof AnonymousClass13Z ? "error querying decoder" : r1.secureDecoderRequired ? "error no secure decoder" : "no secure decoder" : "error instantiating decoder";
                StringBuilder A0Z = AnonymousClass008.A0Z("ExoPlayerVideoPlayer/error in playback errorMessage=", str, " playerid=");
                C72403Ss r2 = this.A00;
                A0Z.append(r2.hashCode());
                Log.e(A0Z.toString(), r5);
                r2.A0L(r2.A0V.A06(R.string.error_video_playback), true);
            }
        }
        str = null;
        StringBuilder A0Z2 = AnonymousClass008.A0Z("ExoPlayerVideoPlayer/error in playback errorMessage=", str, " playerid=");
        C72403Ss r22 = this.A00;
        A0Z2.append(r22.hashCode());
        Log.e(A0Z2.toString(), r5);
        r22.A0L(r22.A0V.A06(R.string.error_video_playback), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        if (r10 != false) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // X.AnonymousClass12G
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AIY(boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72393Sr.AIY(boolean, int):void");
    }

    @Override // X.AnonymousClass12G
    public void ALC(AnonymousClass14A r5, C232214w r6) {
        StringBuilder A0S = AnonymousClass008.A0S("ExoPlayerVideoPlayer/track selection changed  playerid=");
        A0S.append(hashCode());
        Log.d(A0S.toString());
        C72403Ss r3 = this.A00;
        C231914t r1 = r3.A09.A00;
        if (r1 == null) {
            return;
        }
        if (r1.A00(2) == 1) {
            Log.i("ExoPlayerVideoPlayer/unplayable video track");
            r3.A0L(r3.A0V.A06(R.string.error_video_playback), true);
        } else if (r1.A00(1) == 1) {
            Log.i("ExoPlayerVideoPlayer/unplayable audio track");
            r3.A0L(r3.A0V.A06(R.string.error_video_playback), true);
        }
    }
}
