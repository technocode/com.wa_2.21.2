package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: X.1ht  reason: invalid class name and case insensitive filesystem */
public final class C34091ht implements AbstractC227513a {
    public MediaCodecInfo[] A00;
    public final int A01;

    @Override // X.AbstractC227513a
    public boolean ANU() {
        return true;
    }

    public C34091ht(boolean z) {
        this.A01 = z ? 1 : 0;
    }

    @Override // X.AbstractC227513a
    public int A5K() {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    @Override // X.AbstractC227513a
    public MediaCodecInfo A5L(int i) {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i];
    }

    @Override // X.AbstractC227513a
    public boolean ABW(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
