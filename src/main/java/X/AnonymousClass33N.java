package X;

import java.util.List;

/* renamed from: X.33N  reason: invalid class name */
public class AnonymousClass33N {
    public int A00;
    public long A01;
    public String A02;
    public List A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public AnonymousClass33N(AnonymousClass33M r3) {
        String str = r3.A0B;
        if (str != null) {
            this.A0D = str;
            String str2 = r3.A0D;
            if (str2 != null) {
                this.A0F = str2;
                String str3 = r3.A0F;
                if (str3 != null) {
                    this.A0H = str3;
                    this.A09 = r3.A02;
                    this.A08 = r3.A01;
                    this.A05 = r3.A0N;
                    this.A0I = r3.A0G;
                    this.A0J = r3.A0H;
                    List list = r3.A0I;
                    if (list != null) {
                        this.A03 = list;
                        this.A0N = r3.A0O;
                        List list2 = r3.A0J;
                        if (list2 != null) {
                            this.A04 = list2;
                            this.A0E = r3.A0C;
                            this.A01 = r3.A00;
                            this.A02 = r3.A05;
                            this.A0A = r3.A08;
                            this.A0B = r3.A09;
                            this.A0L = r3.A0L;
                            this.A0G = r3.A0E;
                            this.A0C = r3.A0A;
                            this.A0K = r3.A0K;
                            this.A0M = r3.A0M;
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public String A00() {
        if (this.A0N) {
            return null;
        }
        StringBuilder A0S = AnonymousClass008.A0S("https://static.whatsapp.net/sticker?img=");
        A0S.append(this.A0A);
        return A0S.toString();
    }

    public boolean A01() {
        String str;
        String str2 = this.A02;
        return (str2 == null || (str = this.A0E) == null || str2.equals(str)) ? false : true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StickerPack{");
        stringBuffer.append("id='");
        AnonymousClass008.A1J(stringBuffer, this.A0D, ", name='");
        AnonymousClass008.A1J(stringBuffer, this.A0F, ", publisher='");
        AnonymousClass008.A1J(stringBuffer, this.A0H, ", description='");
        AnonymousClass008.A1J(stringBuffer, this.A09, ", size=");
        stringBuffer.append(this.A08);
        stringBuffer.append(", isDownloading=");
        stringBuffer.append(this.A05);
        stringBuffer.append(", trayImageId='");
        AnonymousClass008.A1J(stringBuffer, this.A0I, ", trayImagePreviewId='");
        AnonymousClass008.A1J(stringBuffer, this.A0J, ", previewImageIds=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", stickers=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", order=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isThirdParty=");
        stringBuffer.append(this.A0N);
        stringBuffer.append(", imageDataHash='");
        AnonymousClass008.A1J(stringBuffer, this.A0E, ", downloadedSize=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", downloadedImageDataHash='");
        AnonymousClass008.A1J(stringBuffer, this.A02, ", downloadedTrayImageId='");
        AnonymousClass008.A1J(stringBuffer, this.A0A, ", downloadedTrayImagePreviewId='");
        AnonymousClass008.A1J(stringBuffer, this.A0B, ", isUnseen=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", isNew=");
        stringBuffer.append(this.A06);
        stringBuffer.append(", avoidCaching=");
        stringBuffer.append(this.A0L);
        stringBuffer.append(", playLink='");
        AnonymousClass008.A1J(stringBuffer, this.A0G, ", iOSLink='");
        AnonymousClass008.A1J(stringBuffer, this.A0C, ", animatedPack=");
        stringBuffer.append(this.A0K);
        stringBuffer.append(", downloadedAnimatedPack=");
        stringBuffer.append(this.A0M);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
