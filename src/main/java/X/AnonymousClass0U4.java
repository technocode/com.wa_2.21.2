package X;

import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.0U4  reason: invalid class name */
public class AnonymousClass0U4 implements AnonymousClass0U5 {
    public static final AnonymousClass0U4 A00 = new AnonymousClass0U4();

    @Override // X.AnonymousClass0U5
    public int A2d(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        int i4 = 2;
        while (i < i3 && i4 == 2) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i));
            i4 = 1;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                        case 17:
                            break;
                        default:
                            i4 = 2;
                            break;
                    }
                }
                i4 = 0;
            }
            i++;
        }
        return i4;
    }
}
