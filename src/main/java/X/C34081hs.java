package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: X.1hs  reason: invalid class name and case insensitive filesystem */
public final class C34081hs implements AbstractC227513a {
    @Override // X.AbstractC227513a
    public boolean ANU() {
        return false;
    }

    @Override // X.AbstractC227513a
    public int A5K() {
        return MediaCodecList.getCodecCount();
    }

    @Override // X.AbstractC227513a
    public MediaCodecInfo A5L(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // X.AbstractC227513a
    public boolean ABW(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
