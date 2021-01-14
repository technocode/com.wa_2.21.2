package X;

import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.MediaData;
import java.io.File;

/* renamed from: X.0M4  reason: invalid class name */
public class AnonymousClass0M4 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public File A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public byte[] A0Q;
    public byte[] A0R;
    public byte[] A0S;
    public byte[] A0T;
    public byte[] A0U;
    public InteractiveAnnotation[] A0V;
    public transient boolean A0W;
    public transient boolean A0X;
    public transient boolean A0Y;
    public transient boolean A0Z;
    public transient boolean A0a;

    public boolean equals(Object obj) {
        return this == obj;
    }

    public AnonymousClass0M4() {
    }

    public AnonymousClass0M4(AnonymousClass0M4 r3) {
        this.A0Q = r3.A0Q;
        this.A0G = r3.A0G;
        this.A0H = r3.A0H;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A0F = r3.A0F;
        this.A0A = r3.A0A;
        this.A04 = r3.A04;
        this.A0R = r3.A0R;
        this.A0M = r3.A0M;
        this.A05 = r3.A05;
        this.A06 = r3.A06;
        this.A0S = r3.A0S;
        this.A0V = r3.A0V;
        this.A0T = r3.A0T;
        this.A0I = r3.A0I;
        this.A0U = r3.A0U;
        this.A0B = r3.A0B;
        this.A07 = r3.A07;
        this.A00 = r3.A00;
        this.A0P = r3.A0P;
        this.A08 = r3.A08;
        this.A0K = r3.A0K;
        this.A0J = r3.A0J;
        this.A01 = r3.A01;
    }

    public static AnonymousClass0M4 A00(MediaData mediaData) {
        AnonymousClass0M4 r2 = new AnonymousClass0M4();
        r2.A0a = false;
        r2.A0Y = false;
        r2.A0W = false;
        r2.A0Z = mediaData.A00;
        r2.A0X = false;
        r2.A0P = mediaData.transferred;
        r2.A0C = mediaData.progress;
        r2.A0F = mediaData.file;
        r2.A0A = mediaData.fileSize;
        r2.A0L = mediaData.autodownloadRetryEnabled;
        r2.A0O = mediaData.transcoded;
        r2.A07 = mediaData.suspiciousContent;
        r2.A0D = mediaData.trimFrom;
        r2.A0E = mediaData.trimTo;
        r2.A02 = mediaData.faceX;
        r2.A03 = mediaData.faceY;
        r2.A0U = mediaData.mediaKey;
        r2.A0Q = mediaData.cipherKey;
        r2.A0S = mediaData.hmacKey;
        r2.A0T = mediaData.iv;
        r2.A08 = mediaData.width;
        r2.A06 = mediaData.height;
        r2.A0H = mediaData.doodleId;
        r2.A0M = mediaData.hasStreamingSidecar;
        r2.A09 = mediaData.cachedDownloadedBytes;
        r2.A05 = mediaData.gifAttribution;
        r2.A00 = mediaData.thumbnailHeightWidthRatio;
        r2.A0I = mediaData.mediaJobUuid;
        r2.A0G = mediaData.directPath;
        r2.A0V = mediaData.interactiveAnnotations;
        r2.A0R = mediaData.firstScanSidecar;
        r2.A04 = mediaData.firstScanLength;
        r2.A0B = mediaData.mediaKeyTimestampMs;
        r2.A01 = r2.A01;
        return r2;
    }

    public MediaData A01() {
        MediaData mediaData = new MediaData();
        mediaData.cipherKey = this.A0Q;
        mediaData.directPath = this.A0G;
        mediaData.doodleId = this.A0H;
        mediaData.faceX = this.A02;
        mediaData.faceY = this.A03;
        mediaData.file = this.A0F;
        mediaData.fileSize = this.A0A;
        mediaData.firstScanLength = this.A04;
        mediaData.firstScanSidecar = this.A0R;
        mediaData.hasStreamingSidecar = this.A0M;
        mediaData.gifAttribution = this.A05;
        mediaData.height = this.A06;
        mediaData.hmacKey = this.A0S;
        mediaData.interactiveAnnotations = this.A0V;
        mediaData.iv = this.A0T;
        mediaData.mediaJobUuid = this.A0I;
        mediaData.mediaKey = this.A0U;
        mediaData.mediaKeyTimestampMs = this.A0B;
        mediaData.suspiciousContent = this.A07;
        mediaData.thumbnailHeightWidthRatio = this.A00;
        mediaData.transferred = this.A0P;
        mediaData.width = this.A08;
        mediaData.autodownloadRetryEnabled = this.A0L;
        mediaData.progress = this.A0C;
        mediaData.A00 = this.A0Z;
        mediaData.transcoded = this.A0O;
        mediaData.trimFrom = this.A0D;
        mediaData.trimTo = this.A0E;
        return mediaData;
    }

    public AnonymousClass0M4 A02() {
        AnonymousClass0M4 r2 = new AnonymousClass0M4(this);
        r2.A0L = this.A0L;
        r2.A0C = this.A0C;
        r2.A0Z = this.A0Z;
        r2.A0O = this.A0O;
        r2.A0D = this.A0D;
        r2.A0E = this.A0E;
        r2.A0M = this.A0M;
        r2.A0N = this.A0N;
        return r2;
    }
}
