package X;

import android.graphics.Rect;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.List;

/* renamed from: X.0VN  reason: invalid class name */
public abstract class AnonymousClass0VN {
    public static final AnonymousClass0VP A00 = new AnonymousClass0VP(11);
    public static final AnonymousClass0VP A01 = new AnonymousClass0VP(47);
    public static final AnonymousClass0VP A02 = new AnonymousClass0VP(48);
    public static final AnonymousClass0VP A03 = new AnonymousClass0VP(49);
    public static final AnonymousClass0VP A04 = new AnonymousClass0VP(50);
    public static final AnonymousClass0VP A05 = new AnonymousClass0VP(12);
    public static final AnonymousClass0VP A06 = new AnonymousClass0VP(46);
    public static final AnonymousClass0VP A07 = new AnonymousClass0VP(13);
    public static final AnonymousClass0VP A08 = new AnonymousClass0VP(45);
    public static final AnonymousClass0VP A09 = new AnonymousClass0VP(10);
    public static final AnonymousClass0VP A0A = new AnonymousClass0VP(36);
    public static final AnonymousClass0VP A0B = new AnonymousClass0VP(9);
    public static final AnonymousClass0VP A0C = new AnonymousClass0VP(29);
    public static final AnonymousClass0VP A0D = new AnonymousClass0VP(31);
    public static final AnonymousClass0VP A0E = new AnonymousClass0VP(30);
    public static final AnonymousClass0VP A0F = new AnonymousClass0VP(41);
    public static final AnonymousClass0VP A0G = new AnonymousClass0VP(26);
    public static final AnonymousClass0VP A0H = new AnonymousClass0VP(22);
    public static final AnonymousClass0VP A0I = new AnonymousClass0VP(6);
    public static final AnonymousClass0VP A0J = new AnonymousClass0VP(44);
    public static final AnonymousClass0VP A0K = new AnonymousClass0VP(0);
    public static final AnonymousClass0VP A0L = new AnonymousClass0VP(1);
    public static final AnonymousClass0VP A0M = new AnonymousClass0VP(43);
    public static final AnonymousClass0VP A0N = new AnonymousClass0VP(7);
    public static final AnonymousClass0VP A0O = new AnonymousClass0VP(5);
    public static final AnonymousClass0VP A0P = new AnonymousClass0VP(2);
    public static final AnonymousClass0VP A0Q = new AnonymousClass0VP(4);
    public static final AnonymousClass0VP A0R = new AnonymousClass0VP(3);
    public static final AnonymousClass0VP A0S = new AnonymousClass0VP(14);
    public static final AnonymousClass0VP A0T = new AnonymousClass0VP(15);
    public static final AnonymousClass0VP A0U = new AnonymousClass0VP(35);
    public static final AnonymousClass0VP A0V = new AnonymousClass0VP(37);
    public static final AnonymousClass0VP A0W = new AnonymousClass0VP(21);
    public static final AnonymousClass0VP A0X = new AnonymousClass0VP(16);
    public static final AnonymousClass0VP A0Y = new AnonymousClass0VP(17);
    public static final AnonymousClass0VP A0Z = new AnonymousClass0VP(33);
    public static final AnonymousClass0VP A0a = new AnonymousClass0VP(18);
    public static final AnonymousClass0VP A0b = new AnonymousClass0VP(38);
    public static final AnonymousClass0VP A0c = new AnonymousClass0VP(19);
    public static final AnonymousClass0VP A0d = new AnonymousClass0VP(39);
    public static final AnonymousClass0VP A0e = new AnonymousClass0VP(32);
    public static final AnonymousClass0VP A0f = new AnonymousClass0VP(8);
    public static final AnonymousClass0VP A0g = new AnonymousClass0VP(23);
    public static final AnonymousClass0VP A0h = new AnonymousClass0VP(20);
    public static final AnonymousClass0VP A0i = new AnonymousClass0VP(34);
    public static final AnonymousClass0VP A0j = new AnonymousClass0VP(24);
    public static final AnonymousClass0VP A0k = new AnonymousClass0VP(25);

    public Object A00(AnonymousClass0VP r8) {
        if (!(this instanceof C33361gc)) {
            AnonymousClass0VM r5 = (AnonymousClass0VM) this;
            int i = r8.A00;
            Float valueOf = Float.valueOf(0.0f);
            boolean z = true;
            switch (i) {
                case 0:
                    return r5.A08;
                case 1:
                    return r5.A0E;
                case 2:
                    if (((Number) r5.A00(A0g)).intValue() != 17) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 3:
                    return r5.A0D;
                case 4:
                    return r5.A0B;
                case 5:
                    return r5.A0A;
                case 6:
                    return r5.A06;
                case 7:
                    if (r5.A0O.intValue() != 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 8:
                    return r5.A0C;
                case 9:
                    return r5.A0P;
                case 10:
                    return r5.A0O;
                case 11:
                    return r5.A0J;
                case 12:
                    return r5.A0L;
                case 13:
                    return r5.A0N;
                case 14:
                    return r5.A0R;
                case 15:
                    return r5.A0S;
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                    C07070Vu r0 = r5.A03;
                    if (r0 == null) {
                        return 0;
                    }
                    return Integer.valueOf(r0.A01 * r0.A00);
                case 17:
                    return r5.A0U;
                case 18:
                    return 35;
                case 19:
                    return r5.A0V;
                case AnonymousClass0PW.A01:
                    return 0;
                case 21:
                    return r5.A0T;
                case 22:
                    return r5.A0Q;
                case 23:
                    return r5.A0W;
                case 24:
                    return r5.A0X;
                case 25:
                    return r5.A0Y;
                case 26:
                    return r5.A0a;
                case 27:
                case 28:
                    return valueOf;
                case 29:
                    return r5.A0F;
                case 30:
                    return r5.A0H;
                case 31:
                    return r5.A0G;
                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                    return r5.A04;
                case 33:
                    return r5.A03;
                case 34:
                    return r5.A05;
                case 35:
                    return r5.A02;
                case 36:
                    return r5.A0c;
                case 37:
                    return r5.A0d;
                case 38:
                    int[] iArr = r5.A0h;
                    return new int[]{iArr[0], iArr[1]};
                case 39:
                    return new Rect(r5.A01);
                case 40:
                    return new Rect(r5.A00);
                case 41:
                    return r5.A0b;
                case 42:
                    return "";
                case 43:
                    return r5.A09;
                case 44:
                    return r5.A07;
                case 45:
                    return r5.A0Z;
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                    return r5.A0M;
                case 47:
                    return r5.A0I;
                case 48:
                    return r5.A0e;
                case 49:
                    return r5.A0K;
                case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                    return r5.A0f;
                default:
                    StringBuilder A0S2 = AnonymousClass008.A0S("Invalid Settings key: ");
                    A0S2.append(i);
                    throw new RuntimeException(A0S2.toString());
            }
        } else {
            C33361gc r52 = (C33361gc) this;
            int i2 = r8.A00;
            boolean z2 = false;
            switch (i2) {
                case 0:
                    return r52.A06;
                case 1:
                    return r52.A07;
                case 2:
                    if (C21990zf.A01 && ((Number) r52.A00(A0g)).intValue() == 17) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                case 3:
                    return r52.A08;
                case 4:
                    return Boolean.FALSE;
                case 5:
                    return Boolean.FALSE;
                case 6:
                    return Boolean.FALSE;
                case 7:
                    int intValue = r52.A0I.intValue();
                    if (intValue == -1 || intValue == 0) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                case 8:
                    return r52.A09;
                case 9:
                    return r52.A0J;
                case 10:
                    return r52.A0I;
                case 11:
                    return r52.A0F;
                case 12:
                    return r52.A0G;
                case 13:
                    return r52.A0H;
                case 14:
                    return r52.A0L;
                case 15:
                    return r52.A0M;
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                    C07070Vu r02 = r52.A03;
                    if (r02 == null) {
                        return 0;
                    }
                    return Integer.valueOf(r02.A01 * r02.A00);
                case 17:
                    return r52.A0O;
                case 18:
                    return r52.A0P;
                case 19:
                    return r52.A0Q;
                case AnonymousClass0PW.A01:
                    int intValue2 = r52.A0Q.intValue();
                    int[] iArr2 = r52.A0a;
                    int i3 = 0;
                    int i4 = iArr2[0];
                    int i5 = iArr2[1];
                    for (Number number : (List) r52.A0Z.A00(AnonymousClass0VO.A0c)) {
                        int intValue3 = number.intValue();
                        int i6 = intValue3 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                        if (i6 >= i4 && i6 <= i5 && i6 > i3) {
                            i3 = intValue3;
                        }
                    }
                    if (i3 != 0) {
                        intValue2 = i3;
                    }
                    return Integer.valueOf(intValue2);
                case 21:
                    return r52.A0N;
                case 22:
                    return r52.A0K;
                case 23:
                    return r52.A0R;
                case 24:
                    return r52.A0S;
                case 25:
                    return r52.A0T;
                case 26:
                    return r52.A0U;
                case 27:
                    return r52.A0E;
                case 28:
                    return r52.A0D;
                case 29:
                    return r52.A0A;
                case 30:
                    return r52.A0C;
                case 31:
                    return r52.A0B;
                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                    return r52.A04;
                case 33:
                    return r52.A03;
                case 34:
                    return r52.A05;
                case 35:
                    return r52.A02;
                case 36:
                    return r52.A0X;
                case 37:
                    return r52.A0Y;
                case 38:
                    int[] iArr3 = r52.A0a;
                    return new int[]{iArr3[0], iArr3[1]};
                case 39:
                    return new Rect(r52.A01);
                case 40:
                    return new Rect(r52.A00);
                case 41:
                    return r52.A0V;
                case 42:
                    return r52.A0W;
                default:
                    StringBuilder A0S3 = AnonymousClass008.A0S("Invalid Settings key: ");
                    A0S3.append(i2);
                    throw new RuntimeException(A0S3.toString());
            }
        }
    }
}
