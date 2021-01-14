package X;

import android.graphics.Rect;
import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0VM  reason: invalid class name */
public final class AnonymousClass0VM extends AnonymousClass0VN implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C07070Vu A02;
    public C07070Vu A03;
    public C07070Vu A04;
    public C07070Vu A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Double A0F;
    public Double A0G;
    public Double A0H;
    public Float A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N = 0;
    public Integer A0O = 0;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y = 0;
    public Long A0Z;
    public Long A0a;
    public String A0b;
    public List A0c;
    public List A0d;
    public float[] A0e;
    public int[] A0f;
    public final AnonymousClass0VO A0g;
    public final int[] A0h;

    public AnonymousClass0VM(AnonymousClass0VO r4) {
        Boolean bool = Boolean.FALSE;
        this.A0D = bool;
        this.A0B = bool;
        this.A0C = bool;
        this.A08 = bool;
        this.A0E = bool;
        this.A0A = bool;
        this.A06 = bool;
        this.A09 = bool;
        this.A07 = Boolean.TRUE;
        this.A0h = new int[2];
        this.A0P = 0;
        this.A0X = 0;
        this.A0J = 0;
        this.A0L = 0;
        this.A0R = 0;
        this.A0S = 0;
        this.A0U = 0;
        this.A0V = 0;
        this.A0T = 0;
        this.A0Q = 0;
        this.A0Z = 0L;
        this.A0I = Float.valueOf(0.0f);
        this.A0K = 1;
        this.A0W = 0;
        this.A0M = 1;
        this.A0a = 0L;
        Double valueOf = Double.valueOf(0.0d);
        this.A0F = valueOf;
        this.A0H = valueOf;
        this.A0G = valueOf;
        this.A0b = "";
        List list = Collections.EMPTY_LIST;
        this.A0c = list;
        this.A0d = list;
        this.A0g = r4;
    }

    public void A01(AnonymousClass0VP r6, Object obj) {
        int i = r6.A00;
        Rect rect = null;
        int i2 = 0;
        switch (i) {
            case 0:
                this.A08 = (Boolean) obj;
                return;
            case 1:
                this.A0E = (Boolean) obj;
                return;
            case 2:
                if (((Boolean) this.A0g.A00(AnonymousClass0VO.A07)).booleanValue()) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                        i2 = 17;
                    }
                    A01(AnonymousClass0VN.A0g, Integer.valueOf(i2));
                    if (booleanValue) {
                        A01(AnonymousClass0VN.A0f, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A0D = (Boolean) obj;
                return;
            case 4:
                this.A0B = (Boolean) obj;
                return;
            case 5:
                this.A0A = (Boolean) obj;
                return;
            case 6:
                this.A06 = (Boolean) obj;
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
                StringBuilder A0S2 = AnonymousClass008.A0S("Cannot directly set: ");
                A0S2.append(i);
                throw new RuntimeException(A0S2.toString());
            case 8:
                this.A0C = (Boolean) obj;
                return;
            case 9:
                this.A0P = (Integer) obj;
                return;
            case 10:
                int intValue = ((Number) obj).intValue();
                if (intValue != -1) {
                    i2 = intValue;
                }
                this.A0O = Integer.valueOf(i2);
                return;
            case 11:
                this.A0J = (Integer) obj;
                return;
            case 12:
                this.A0L = (Integer) obj;
                return;
            case 13:
                this.A0N = (Integer) obj;
                return;
            case 14:
                this.A0R = (Integer) obj;
                return;
            case 15:
                this.A0S = (Integer) obj;
                return;
            case 17:
                this.A0U = (Integer) obj;
                return;
            case 18:
                return;
            case 19:
                this.A0V = (Integer) obj;
                return;
            case 21:
                this.A0T = (Integer) obj;
                return;
            case 22:
                this.A0Q = (Integer) obj;
                return;
            case 23:
                this.A0W = (Integer) obj;
                return;
            case 24:
                this.A0X = (Integer) obj;
                return;
            case 25:
                this.A0Y = (Integer) obj;
                return;
            case 26:
                this.A0a = (Long) obj;
                return;
            case 29:
                this.A0F = (Double) obj;
                return;
            case 30:
                this.A0H = (Double) obj;
                return;
            case 31:
                this.A0G = (Double) obj;
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                C07070Vu r7 = (C07070Vu) obj;
                this.A04 = r7;
                if (r7 != null) {
                    rect = new Rect(0, 0, r7.A01, r7.A00);
                }
                this.A01 = rect;
                return;
            case 33:
                C07070Vu r72 = (C07070Vu) obj;
                this.A03 = r72;
                if (r72 != null) {
                    rect = new Rect(0, 0, r72.A01, r72.A00);
                }
                this.A00 = rect;
                return;
            case 34:
                this.A05 = (C07070Vu) obj;
                return;
            case 35:
                this.A02 = (C07070Vu) obj;
                return;
            case 36:
                this.A0c = C21980ze.A00((List) obj);
                return;
            case 37:
                this.A0d = C21980ze.A00((List) obj);
                return;
            case 38:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0h;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case 41:
                this.A0b = (String) obj;
                return;
            case 43:
                this.A09 = (Boolean) obj;
                return;
            case 44:
                this.A07 = (Boolean) obj;
                return;
            case 45:
                this.A0Z = (Long) obj;
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                this.A0M = (Integer) obj;
                return;
            case 47:
                this.A0I = (Float) obj;
                return;
            case 48:
                if (Build.VERSION.SDK_INT >= 21) {
                    this.A0e = (float[]) obj;
                    return;
                }
                return;
            case 49:
                this.A0K = (Integer) obj;
                return;
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                if (Build.VERSION.SDK_INT >= 21) {
                    this.A0f = (int[]) obj;
                    return;
                }
                return;
        }
    }

    public boolean A02(C22020zi r5) {
        boolean z;
        if (r5.A0n) {
            A01(AnonymousClass0VN.A09, Integer.valueOf(r5.A09));
            z = true;
        } else {
            z = false;
        }
        if (r5.A0j) {
            A01(AnonymousClass0VN.A07, Integer.valueOf(r5.A08));
            z = true;
        }
        if (r5.A0y) {
            A01(AnonymousClass0VN.A0P, Boolean.valueOf(r5.A0x));
            z = true;
        }
        if (r5.A1I) {
            A01(AnonymousClass0VN.A0R, Boolean.valueOf(r5.A1H));
            z = true;
        }
        if (r5.A15) {
            A01(AnonymousClass0VN.A0Q, Boolean.valueOf(r5.A14));
            z = true;
        }
        if (r5.A1E) {
            A01(AnonymousClass0VN.A0f, Boolean.valueOf(r5.A1D));
            z = true;
        }
        if (r5.A0b) {
            A01(AnonymousClass0VN.A0K, Boolean.valueOf(r5.A0a));
            z = true;
        }
        if (r5.A0d) {
            A01(AnonymousClass0VN.A0L, Boolean.valueOf(r5.A0c));
            z = true;
        }
        if (r5.A1B) {
            A01(AnonymousClass0VN.A0c, Integer.valueOf(r5.A0H));
            z = true;
        }
        if (r5.A1A) {
            A01(AnonymousClass0VN.A0b, r5.A1N);
            z = true;
        }
        if (r5.A0p) {
            A01(AnonymousClass0VN.A0B, Integer.valueOf(r5.A0A));
            z = true;
        }
        if (r5.A0r) {
            A01(AnonymousClass0VN.A0O, Boolean.valueOf(r5.A0q));
            z = true;
        }
        if (r5.A0X) {
            A01(AnonymousClass0VN.A0I, Boolean.valueOf(r5.A0W));
            z = true;
        }
        if (r5.A1J) {
            A01(AnonymousClass0VN.A0j, Integer.valueOf(r5.A0J));
            z = true;
        }
        if (r5.A0U) {
            A01(AnonymousClass0VN.A00, Integer.valueOf(r5.A04));
            z = true;
        }
        if (r5.A0h) {
            A01(AnonymousClass0VN.A05, Integer.valueOf(r5.A06));
            z = true;
        }
        if (r5.A10) {
            A01(AnonymousClass0VN.A0S, Integer.valueOf(r5.A0C));
            z = true;
        }
        if (r5.A11) {
            A01(AnonymousClass0VN.A0T, Integer.valueOf(r5.A0D));
            z = true;
        }
        if (r5.A12) {
            A01(AnonymousClass0VN.A0U, r5.A0N);
            z = true;
        }
        if (r5.A17) {
            A01(AnonymousClass0VN.A0Y, Integer.valueOf(r5.A0F));
            z = true;
        }
        if (r5.A16) {
            A01(AnonymousClass0VN.A0W, Integer.valueOf(r5.A0E));
            z = true;
        }
        if (r5.A0z) {
            A01(AnonymousClass0VN.A0H, Integer.valueOf(r5.A0B));
            z = true;
        }
        if (r5.A0m) {
            A01(AnonymousClass0VN.A08, Long.valueOf(r5.A0L));
            z = true;
        }
        if (r5.A0i) {
            A01(AnonymousClass0VN.A06, Integer.valueOf(r5.A07));
            z = true;
        }
        if (r5.A0V) {
            A01(AnonymousClass0VN.A01, Float.valueOf(r5.A03));
            z = true;
        }
        if (r5.A0e) {
            A01(AnonymousClass0VN.A02, r5.A1L);
            z = true;
        }
        if (r5.A0f) {
            A01(AnonymousClass0VN.A03, Integer.valueOf(r5.A05));
            z = true;
        }
        if (r5.A0g) {
            A01(AnonymousClass0VN.A04, r5.A1M);
            z = true;
        }
        if (r5.A1F) {
            A01(AnonymousClass0VN.A0g, Integer.valueOf(r5.A0I));
            z = true;
        }
        if (r5.A1K) {
            A01(AnonymousClass0VN.A0k, Integer.valueOf(r5.A0K));
            z = true;
        }
        if (r5.A0w) {
            A01(AnonymousClass0VN.A0G, Long.valueOf(r5.A0M));
            z = true;
        }
        if (r5.A0s) {
            A01(AnonymousClass0VN.A0C, Double.valueOf(r5.A00));
            z = true;
        }
        if (r5.A0u) {
            A01(AnonymousClass0VN.A0E, Double.valueOf(r5.A02));
            z = true;
        }
        if (r5.A0t) {
            A01(AnonymousClass0VN.A0D, Double.valueOf(r5.A01));
            z = true;
        }
        if (r5.A0v) {
            A01(AnonymousClass0VN.A0F, r5.A0R);
            z = true;
        }
        if (r5.A0o) {
            A01(AnonymousClass0VN.A0A, r5.A0S);
            z = true;
        }
        if (r5.A13) {
            A01(AnonymousClass0VN.A0V, r5.A0T);
            z = true;
        }
        if (r5.A1C) {
            A01(AnonymousClass0VN.A0e, r5.A0P);
            z = true;
        }
        if (r5.A18) {
            A01(AnonymousClass0VN.A0Z, r5.A0O);
            z = true;
        }
        if (r5.A1G) {
            A01(AnonymousClass0VN.A0i, r5.A0Q);
            z = true;
        }
        if (r5.A0l) {
            A01(AnonymousClass0VN.A0M, Boolean.valueOf(r5.A0k));
            z = true;
        }
        if (!r5.A0Z) {
            return z;
        }
        A01(AnonymousClass0VN.A0J, Boolean.valueOf(r5.A0Y));
        return true;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }
}
