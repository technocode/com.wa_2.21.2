package androidx.media;

import X.AnonymousClass008;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r2 == 7) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if ((r3 & 4) == 4) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.media.AudioAttributesImplBase
            r5 = 0
            if (r0 != 0) goto L_0x0006
            return r5
        L_0x0006:
            androidx.media.AudioAttributesImplBase r7 = (androidx.media.AudioAttributesImplBase) r7
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 != r0) goto L_0x002e
            int r4 = r6.A01
            int r3 = r7.A01
            int r2 = r7.A02
            r0 = -1
            if (r2 == r0) goto L_0x002f
            r0 = 6
            if (r2 == r0) goto L_0x0039
            r0 = 7
            if (r2 != r0) goto L_0x001f
        L_0x001d:
            r3 = r3 | 1
        L_0x001f:
            r0 = r3 & 273(0x111, float:3.83E-43)
            if (r4 != r0) goto L_0x002e
            int r1 = r6.A03
            int r0 = r7.A03
            if (r1 != r0) goto L_0x002e
            int r0 = r6.A02
            if (r0 != r2) goto L_0x002e
            r5 = 1
        L_0x002e:
            return r5
        L_0x002f:
            r1 = r3 & 1
            r0 = 1
            if (r1 == r0) goto L_0x001d
            r1 = 4
            r0 = r3 & r1
            if (r0 != r1) goto L_0x001f
        L_0x0039:
            r3 = r3 | 4
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesImplBase.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A03), Integer.valueOf(this.A02)});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        int i = this.A02;
        if (i != -1) {
            sb.append(" stream=");
            sb.append(i);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i2 = this.A03;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = AnonymousClass008.A0F("unknown usage ", i2);
                break;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.A00);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.A01).toUpperCase());
        return sb.toString();
    }
}
