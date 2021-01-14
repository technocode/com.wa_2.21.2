package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.28m  reason: invalid class name */
public final class AnonymousClass28m extends AbstractC455125c {
    public static final int[] A0C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, AnonymousClass0PW.A03, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] A0D = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A0E = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A0F = {174, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] A0G = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] A0H = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final int[] A0I = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public AnonymousClass14K A04 = new AnonymousClass14K(0, 4);
    public List A05;
    public List A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final C233815n A0A = new C233815n();
    public final ArrayList A0B = new ArrayList();

    public AnonymousClass28m(String str, int i) {
        this.A08 = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 3 || i == 4) {
            this.A09 = 2;
        } else {
            this.A09 = 1;
        }
        A02(0);
        A01();
    }

    public final List A00() {
        float f;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.A0B;
            if (i4 >= arrayList2.size()) {
                return arrayList;
            }
            AnonymousClass14K r6 = (AnonymousClass14K) arrayList2.get(i4);
            if (r6 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i5 = 0; i5 < r6.A07.size(); i5++) {
                    spannableStringBuilder.append((CharSequence) r6.A07.get(i5));
                    spannableStringBuilder.append('\n');
                }
                spannableStringBuilder.append((CharSequence) r6.A00());
                if (spannableStringBuilder.length() != 0) {
                    int i6 = r6.A02 + r6.A04;
                    int length = (32 - i6) - spannableStringBuilder.length();
                    int i7 = i6 - length;
                    if (r6.A00 == 2 && (Math.abs(i7) < 3 || length < 0)) {
                        f = 0.5f;
                        i = 1;
                    } else if (r6.A00 != 2 || i7 <= 0) {
                        f = ((((float) i6) / 32.0f) * 0.8f) + 0.1f;
                        i = 0;
                    } else {
                        f = ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f;
                        i = 2;
                    }
                    if (r6.A00 == 1 || (i2 = r6.A03) > 7) {
                        i2 = (r6.A03 - 15) - 2;
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    arrayList.add(new AnonymousClass14E(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i2, 1, i3, f, i, Float.MIN_VALUE));
                }
                i4++;
            } else {
                throw null;
            }
        }
    }

    public final void A01() {
        this.A04.A02(this.A02);
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        arrayList.add(this.A04);
    }

    public final void A02(int i) {
        int i2 = this.A02;
        if (i2 != i) {
            this.A02 = i;
            A01();
            if (i2 == 3 || i == 1 || i == 0) {
                this.A05 = Collections.emptyList();
            }
        }
    }

    @Override // X.AbstractC455125c, X.AbstractC227312y
    public void flush() {
        super.flush();
        this.A05 = null;
        this.A06 = null;
        A02(0);
        this.A03 = 4;
        this.A04.A01 = 4;
        A01();
        this.A07 = false;
        this.A00 = 0;
        this.A01 = 0;
    }
}
