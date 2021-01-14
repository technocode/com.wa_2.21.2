package X;

import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.List;

/* renamed from: X.0zh  reason: invalid class name and case insensitive filesystem */
public class C22010zh {
    public double A00;
    public double A01;
    public double A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public long A0L;
    public long A0M;
    public C07070Vu A0N;
    public C07070Vu A0O;
    public C07070Vu A0P;
    public C07070Vu A0Q;
    public String A0R;
    public List A0S;
    public List A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public float[] A1L;
    public int[] A1M;
    public int[] A1N;

    public C22020zi A00() {
        if (!this.A14 || !this.A1H) {
            return new C22020zi(this);
        }
        throw new IllegalStateException("Unable to build setting modifications, video stabilization will not work correctly if optical stabilization is also enabled, please enable one at a time only.");
    }

    public void A01(AnonymousClass0VP r5, Object obj) {
        int i = r5.A00;
        switch (i) {
            case 0:
                this.A0a = ((Boolean) obj).booleanValue();
                this.A0b = true;
                return;
            case 1:
                this.A0c = ((Boolean) obj).booleanValue();
                this.A0d = true;
                return;
            case 2:
                this.A0x = ((Boolean) obj).booleanValue();
                this.A0y = true;
                return;
            case 3:
                this.A1H = ((Boolean) obj).booleanValue();
                this.A1I = true;
                return;
            case 4:
                this.A14 = ((Boolean) obj).booleanValue();
                this.A15 = true;
                return;
            case 5:
                this.A0q = ((Boolean) obj).booleanValue();
                this.A0r = true;
                return;
            case 6:
                this.A0W = ((Boolean) obj).booleanValue();
                this.A0X = true;
                return;
            case 7:
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
            case AnonymousClass0PW.A01:
            case 27:
            case 28:
            case 39:
            case 40:
            case 42:
            default:
                StringBuilder A0S2 = AnonymousClass008.A0S("Invalid Settings key: ");
                A0S2.append(i);
                throw new RuntimeException(A0S2.toString());
            case 8:
                this.A1D = ((Boolean) obj).booleanValue();
                this.A1E = true;
                return;
            case 9:
                this.A0A = ((Number) obj).intValue();
                this.A0p = true;
                return;
            case 10:
                this.A09 = ((Number) obj).intValue();
                this.A0n = true;
                return;
            case 11:
                this.A04 = ((Number) obj).intValue();
                this.A0U = true;
                return;
            case 12:
                this.A06 = ((Number) obj).intValue();
                this.A0h = true;
                return;
            case 13:
                this.A08 = ((Number) obj).intValue();
                this.A0j = true;
                return;
            case 14:
                this.A0C = ((Number) obj).intValue();
                this.A10 = true;
                return;
            case 15:
                this.A0D = ((Number) obj).intValue();
                this.A11 = true;
                return;
            case 17:
                this.A0F = ((Number) obj).intValue();
                this.A17 = true;
                return;
            case 18:
                this.A0G = ((Number) obj).intValue();
                this.A19 = true;
                return;
            case 19:
                this.A0H = ((Number) obj).intValue();
                this.A1B = true;
                return;
            case 21:
                this.A0E = ((Number) obj).intValue();
                this.A16 = true;
                return;
            case 22:
                this.A0B = ((Number) obj).intValue();
                this.A0z = true;
                return;
            case 23:
                this.A0I = ((Number) obj).intValue();
                this.A1F = true;
                return;
            case 24:
                this.A0J = ((Number) obj).intValue();
                this.A1J = true;
                return;
            case 25:
                this.A0K = ((Number) obj).intValue();
                this.A1K = true;
                return;
            case 26:
                this.A0M = ((Number) obj).longValue();
                this.A0w = true;
                return;
            case 29:
                this.A00 = ((Number) obj).doubleValue();
                this.A0s = true;
                return;
            case 30:
                this.A02 = ((Number) obj).doubleValue();
                this.A0u = true;
                return;
            case 31:
                this.A01 = ((Number) obj).doubleValue();
                this.A0t = true;
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                this.A0P = (C07070Vu) obj;
                this.A1C = true;
                return;
            case 33:
                this.A0O = (C07070Vu) obj;
                this.A18 = true;
                return;
            case 34:
                this.A0Q = (C07070Vu) obj;
                this.A1G = true;
                return;
            case 35:
                this.A0N = (C07070Vu) obj;
                this.A12 = true;
                return;
            case 36:
                this.A0S = C21980ze.A00((List) obj);
                this.A0o = true;
                return;
            case 37:
                this.A0T = C21980ze.A00((List) obj);
                this.A13 = true;
                return;
            case 38:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    this.A1N = new int[]{iArr[0], iArr[1]};
                    this.A1A = true;
                    return;
                }
                return;
            case 41:
                this.A0R = (String) obj;
                this.A0v = true;
                return;
            case 43:
                this.A0k = ((Boolean) obj).booleanValue();
                this.A0l = true;
                return;
            case 44:
                this.A0Y = ((Boolean) obj).booleanValue();
                this.A0Z = true;
                return;
            case 45:
                this.A0L = ((Number) obj).longValue();
                this.A0m = true;
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                this.A07 = ((Number) obj).intValue();
                this.A0i = true;
                return;
            case 47:
                this.A03 = ((Number) obj).floatValue();
                this.A0V = true;
                return;
            case 48:
                if (Build.VERSION.SDK_INT >= 21) {
                    float[] fArr = (float[]) obj;
                    if (fArr == null || fArr.length == 4) {
                        this.A1L = fArr;
                        this.A0e = true;
                        return;
                    }
                    throw new IllegalArgumentException("Color Correction Gains invalid length");
                }
                return;
            case 49:
                this.A05 = ((Number) obj).intValue();
                this.A0f = true;
                return;
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                if (Build.VERSION.SDK_INT >= 21) {
                    int[] iArr2 = (int[]) obj;
                    if (iArr2 == null || iArr2.length == 18) {
                        this.A1M = iArr2;
                        this.A0g = true;
                        return;
                    }
                    throw new IllegalArgumentException("Color Correction Transform invalid length");
                }
                return;
        }
    }
}
