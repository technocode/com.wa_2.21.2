package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.MediaData;
import com.whatsapp.TextData;
import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.03q  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC007503q {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public AnonymousClass0MH A0F;
    public AnonymousClass02N A0G;
    public C05420Ol A0H;
    public C007303n A0I;
    public EnumC05410Ok A0J;
    public AbstractC007503q A0K;
    public AnonymousClass1XE A0L;
    public C05440On A0M;
    public C05430Om A0N;
    public AnonymousClass0OB A0O;
    public Integer A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public List A0c;
    public List A0d;
    public Map A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public byte[] A0l;
    public final byte A0m;
    public final C007303n A0n;
    public final Object A0o;
    public volatile long A0p;
    public volatile long A0q;
    public volatile boolean A0r;
    public transient long A0s;
    public transient long A0t;
    public transient DeviceJid A0u;
    public transient boolean A0v;
    public transient boolean A0w;
    public final transient long A0x;

    public AbstractC007503q(C007303n r5, long j, byte b) {
        this.A0v = false;
        this.A0w = false;
        this.A0D = -1;
        this.A0J = EnumC05410Ok.NONE;
        this.A0p = -1;
        this.A0q = -1;
        this.A0P = null;
        this.A0Y = null;
        this.A09 = 0;
        this.A0o = new Object();
        if (r5 != null) {
            this.A0n = r5;
            this.A0E = j;
            this.A0m = b;
            this.A0x = SystemClock.uptimeMillis();
            return;
        }
        throw null;
    }

    public AbstractC007503q(AbstractC007503q r8, C007303n r9, long j, boolean z) {
        this(r8, r9, j, z, r8.A0m);
    }

    public AbstractC007503q(AbstractC007503q r5, C007303n r6, long j, boolean z, byte b) {
        this(r6, j, b);
        ArrayList arrayList;
        AnonymousClass0MH r2;
        synchronized (r5.A0o) {
            this.A0X = r5.A0X;
            this.A0l = r5.A0l;
        }
        this.A01 = r5.A01;
        this.A04 = r5.A04;
        A0n(r5.A0c);
        this.A0I = r5.A0I;
        if (z) {
            this.A0G = r5.A07();
            this.A0u = r5.A0u;
            if (r5.A0M() != null) {
                arrayList = new ArrayList(r5.A0M());
            } else {
                arrayList = null;
            }
            this.A0d = arrayList;
            this.A0a = r5.A0a;
            this.A0Z = r5.A0Z;
            this.A0f = r5.A0f;
            this.A06 = r5.A06;
            this.A0J = r5.A0J;
            this.A0P = r5.A0P;
            this.A0B = r5.A0B;
            this.A0K = r5.A0K;
            this.A0U = r5.A0U;
            this.A0A = r5.A0A;
            this.A0O = r5.A0O;
            this.A0T = r5.A0T;
            this.A0S = r5.A0S;
            this.A00 = r5.A00;
            this.A05 = r5.A05;
            this.A03 = r5.A03;
            A00(r5, this, false);
            AnonymousClass0MH r3 = r5.A0F;
            if (r3 != null && (r2 = this.A0F) != null) {
                synchronized (r3) {
                    if (TextUtils.isEmpty(r2.A0G) || r2.A0G.equals(r3.A0G)) {
                        r2.A0G = r3.A0G;
                        r2.A01 = r3.A01;
                        r2.A05 = r3.A05;
                    }
                }
            }
        }
    }

    public static void A00(AbstractC007503q r2, AbstractC007503q r3, boolean z) {
        AbstractC007503q r1;
        if (!(r2.A0B() == null || r3.A0B() == null || !r2.A0B().A06())) {
            r3.A0B().A04(r2.A0B().A08(), z);
        }
        AbstractC007503q r22 = r2.A0K;
        if (r22 != null && (r1 = r3.A0K) != null) {
            A00(r22, r1, true);
        }
    }

    public int A01() {
        int i;
        synchronized (this.A0o) {
            i = this.A01;
        }
        return i;
    }

    public int A02() {
        if (this instanceof AnonymousClass2A4) {
            return ((AnonymousClass2A4) this).A00;
        }
        if (this instanceof C05400Oj) {
            return ((C05400Oj) this).A00;
        }
        if (this instanceof C12140hc) {
            return ((C12140hc) this).A01;
        }
        if (this instanceof C12180hg) {
            return ((C12180hg) this).A00;
        }
        if (this instanceof C02850Ds) {
            return ((C02850Ds) this).A00;
        }
        if (this instanceof AnonymousClass0ZI) {
            return ((AnonymousClass0ZI) this).A00;
        }
        if (this instanceof AnonymousClass0M3) {
            AnonymousClass0M3 r1 = (AnonymousClass0M3) this;
            if (!(r1 instanceof AnonymousClass0M2)) {
                return r1.A00;
            }
            return ((AnonymousClass0M2) r1).A00;
        } else if (!(this instanceof C12220hk)) {
            return 0;
        } else {
            return ((C12220hk) this).A00;
        }
    }

    public int A03() {
        if (this instanceof C05490Ot) {
            return ((C05490Ot) this).A00;
        }
        if (this instanceof C12150hd) {
            return ((C12150hd) this).A00;
        }
        if (!(this instanceof C12140hc)) {
            return 0;
        }
        return ((C12140hc) this).A00;
    }

    public int A04() {
        String str;
        if (!(this instanceof AnonymousClass0M3)) {
            str = null;
        } else {
            str = ((AnonymousClass0M3) this).A0A;
        }
        if (TextUtils.isEmpty(str)) {
            A0P(64);
        }
        return this.A05;
    }

    public long A05() {
        if (this instanceof C05390Oi) {
            return (long) ((C05390Oi) this).A00;
        }
        if (this instanceof AnonymousClass0M3) {
            return ((AnonymousClass0M3) this).A01;
        }
        if (this instanceof C02850Ds) {
            return ((C02850Ds) this).A01;
        }
        if (!(this instanceof C12220hk)) {
            return 0;
        }
        return (long) ((C12220hk) this).A01;
    }

    public long A06() {
        long j;
        if (A0r()) {
            j = 1;
        } else {
            j = 0;
        }
        if (this.A0K != null || this.A0B > 0) {
            j |= 2;
        }
        if (this.A0b != null) {
            j |= 4;
        }
        return A0q() ? j | 8 : j;
    }

    public AnonymousClass02N A07() {
        if (!(this instanceof C12130hb)) {
            return this.A0G;
        }
        return null;
    }

    public UserJid A08() {
        if (!(this instanceof C05390Oi)) {
            AnonymousClass02N r1 = this.A0n.A00;
            if (AnonymousClass1VY.A0Y(r1) || AnonymousClass1VY.A0T(r1)) {
                r1 = this.A0G;
            }
            return (UserJid) r1;
        }
        C05390Oi r12 = (C05390Oi) this;
        if (!(r12 instanceof C05480Os)) {
            return null;
        }
        return ((C05480Os) r12).A01;
    }

    public AbstractC007503q A09() {
        boolean z;
        if (!(this instanceof C05390Oi)) {
            z = !(this instanceof C12190hh);
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return this.A0K;
    }

    public AnonymousClass1XE A0A() {
        AnonymousClass1XE r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1XE r02 = new AnonymousClass1XE();
        this.A0L = r02;
        return r02;
    }

    public C05440On A0B() {
        C05440On r1;
        synchronized (this.A0o) {
            r1 = this.A0M;
            if (r1 == null && C05440On.A01(this.A0m)) {
                r1 = new C05440On(this);
                this.A0M = r1;
            }
        }
        return r1;
    }

    public Object A0C() {
        String str;
        UserJid userJid;
        if (this instanceof C05490Ot) {
            C05490Ot r1 = (C05490Ot) this;
            TextData textData = r1.A01;
            if (textData == null) {
                return r1.A06;
            }
            return textData;
        } else if (this instanceof C12120ha) {
            return ((C12120ha) this).A00;
        } else {
            if (this instanceof C05480Os) {
                C007303n r3 = ((C05480Os) this).A02;
                if (r3 == null) {
                    return null;
                }
                String[] strArr = new String[3];
                AnonymousClass02N r0 = r3.A00;
                if (r0 != null) {
                    str = r0.getRawString();
                } else {
                    str = "null";
                }
                strArr[0] = str;
                strArr[1] = String.valueOf(r3.A02);
                strArr[2] = r3.A01;
                return TextUtils.join(";", Arrays.asList(strArr));
            } else if (this instanceof C12130hb) {
                C12130hb r2 = (C12130hb) this;
                if (((C05390Oi) r2).A00 != 10 || (userJid = r2.A00) == null) {
                    return null;
                }
                return userJid.getRawString();
            } else if (this instanceof C05400Oj) {
                C05400Oj r12 = (C05400Oj) this;
                if (r12 instanceof C12100hY) {
                    return ((C12100hY) r12).A01;
                }
                if (r12.A01.size() > 0) {
                    return AnonymousClass1VY.A0F(r12.A01);
                }
                return null;
            } else if (this instanceof AnonymousClass0M3) {
                AnonymousClass0M4 r02 = ((AnonymousClass0M3) this).A02;
                if (r02 == null) {
                    return null;
                }
                return r02.A01();
            } else if (!(this instanceof AbstractC02860Dt)) {
                return null;
            } else {
                int i = ((AbstractC02860Dt) this).A02;
                if (i == 1) {
                    i = 0;
                }
                return Integer.valueOf(i);
            }
        }
    }

    public String A0D() {
        String valueOf;
        String valueOf2;
        String obj;
        String str;
        byte[] bArr;
        if (this instanceof C12120ha) {
            return ((C12120ha) this).A0v();
        }
        if (this instanceof C12100hY) {
            return ((C12100hY) this).A0v();
        }
        if (this instanceof C12170hf) {
            C12170hf r0 = (C12170hf) this;
            synchronized (this) {
                valueOf = String.valueOf(r0.A00);
            }
            return valueOf;
        } else if (this instanceof C12160he) {
            C12160he r02 = (C12160he) this;
            synchronized (this) {
                valueOf2 = String.valueOf(r02.A00);
            }
            return valueOf2;
        } else if (this instanceof AnonymousClass0ZP) {
            AnonymousClass0ZP r1 = (AnonymousClass0ZP) this;
            synchronized (r1.A0o) {
                AnonymousClass1XU r03 = r1.A00;
                if (r03 == null) {
                    return null;
                }
                if (TextUtils.isEmpty(r03.A01)) {
                    obj = r1.A00.A03;
                } else {
                    StringBuilder sb = new StringBuilder();
                    AnonymousClass1XU r12 = r1.A00;
                    sb.append(r12.A03);
                    sb.append("\n");
                    sb.append(r12.A01);
                    obj = sb.toString();
                }
                return obj;
            }
        } else if (!(this instanceof C04830Lz)) {
            synchronized (this.A0o) {
                if (this.A01 == 1) {
                    return null;
                }
                String str2 = this.A0X;
                if (str2 == null && (bArr = this.A0l) != null) {
                    str2 = AnonymousClass0M5.A00(bArr);
                    this.A0X = str2;
                }
                return str2;
            }
        } else {
            C04830Lz r04 = (C04830Lz) this;
            synchronized (r04.A0o) {
                str = r04.A01;
            }
            return str;
        }
    }

    public String A0E() {
        UserJid userJid;
        if (!(this instanceof C05390Oi)) {
            List list = this.A0d;
            if (list != null) {
                return TextUtils.join(",", AnonymousClass1VY.A0g(list));
            }
            return AnonymousClass1VY.A0D(this.A0G);
        }
        C05390Oi r2 = (C05390Oi) this;
        if (r2 instanceof AnonymousClass2A5) {
            return ((AnonymousClass2A5) r2).A01;
        }
        if (r2 instanceof AnonymousClass2A4) {
            return ((C05480Os) r2).A03;
        }
        if (!(r2 instanceof C12130hb)) {
            return AnonymousClass1VY.A0D(r2.A0G);
        }
        C12130hb r22 = (C12130hb) r2;
        if (((C05390Oi) r22).A00 != 10 || (userJid = r22.A01) == null) {
            return null;
        }
        return userJid.getRawString();
    }

    public String A0F() {
        UserJid userJid;
        if (this instanceof C05490Ot) {
            return ((C05490Ot) this).A04;
        }
        if (this instanceof C05480Os) {
            C05480Os r1 = (C05480Os) this;
            if (r1 instanceof AnonymousClass2A5) {
                return ((AnonymousClass2A5) r1).A03;
            }
            if (!(r1 instanceof AnonymousClass2A4)) {
                return r1.A03;
            }
            return ((AnonymousClass2A4) r1).A02;
        } else if (this instanceof C12130hb) {
            C12130hb r2 = (C12130hb) this;
            if (((C05390Oi) r2).A00 != 28 || (userJid = r2.A01) == null) {
                return null;
            }
            return userJid.getRawString();
        } else if (this instanceof C12150hd) {
            return ((C12150hd) this).A01;
        } else {
            if (this instanceof AnonymousClass0ZL) {
                return ((AnonymousClass0ZL) this).A00;
            }
            if (this instanceof AnonymousClass0M3) {
                return ((AnonymousClass0M3) this).A04;
            }
            if (this instanceof C02850Ds) {
                return ((C02850Ds) this).A03;
            }
            if (this instanceof AnonymousClass0ZF) {
                return ((AnonymousClass0ZF) this).A03;
            }
            if (!(this instanceof AnonymousClass0Oo)) {
                return null;
            }
            AnonymousClass0Oo r12 = (AnonymousClass0Oo) this;
            if (r12.A00) {
                return r12.A01 ? "video" : "audio";
            }
            return null;
        }
    }

    public String A0G() {
        if (this instanceof C05480Os) {
            C05480Os r1 = (C05480Os) this;
            if (r1 instanceof AnonymousClass2A5) {
                return ((AnonymousClass2A5) r1).A04;
            }
            if (!(r1 instanceof AnonymousClass2A4)) {
                return AnonymousClass1VY.A0D(r1.A01);
            }
            return ((AnonymousClass2A4) r1).A03;
        } else if (!(this instanceof AnonymousClass0M3)) {
            return null;
        } else {
            return ((AnonymousClass0M3) this).A05;
        }
    }

    public String A0H() {
        if (this instanceof C05480Os) {
            C05480Os r1 = (C05480Os) this;
            if (r1 instanceof AnonymousClass2A5) {
                return ((AnonymousClass2A5) r1).A00;
            }
            if (!(r1 instanceof AnonymousClass2A4)) {
                return AnonymousClass1VY.A0D(r1.A00);
            }
            return ((AnonymousClass2A4) r1).A01;
        } else if (!(this instanceof AnonymousClass0M3)) {
            return null;
        } else {
            return ((AnonymousClass0M3) this).A06;
        }
    }

    public String A0I() {
        if (this instanceof C05490Ot) {
            return ((C05490Ot) this).A03;
        }
        if (!(this instanceof AnonymousClass0M3)) {
            return null;
        }
        return ((AnonymousClass0M3) this).A07;
    }

    public String A0J() {
        UserJid userJid;
        if (this instanceof C05490Ot) {
            return ((C05490Ot) this).A02;
        }
        if (this instanceof C12130hb) {
            C12130hb r2 = (C12130hb) this;
            if (((C05390Oi) r2).A00 != 28 || (userJid = r2.A00) == null) {
                return null;
            }
            return userJid.getRawString();
        } else if (this instanceof C12110hZ) {
            return ((C12110hZ) this).A00;
        } else {
            if (this instanceof AnonymousClass0ZJ) {
                return ((AnonymousClass0ZJ) this).A00;
            }
            if (this instanceof C05470Or) {
                return ((C05470Or) this).A0x();
            }
            if (this instanceof C02850Ds) {
                C02900Dx r4 = ((C02850Ds) this).A02;
                if (r4 == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r4.A06.getRawString());
                sb.append(",");
                sb.append(Double.toString(r4.A00));
                sb.append(",");
                sb.append(Double.toString(r4.A01));
                sb.append(",");
                sb.append(Long.toString(r4.A05));
                return sb.toString();
            } else if (this instanceof AnonymousClass0M3) {
                AnonymousClass0M3 r1 = (AnonymousClass0M3) this;
                if (!(r1 instanceof AnonymousClass0M2)) {
                    return r1.A08;
                }
                return r1.A0w();
            } else if (this instanceof AnonymousClass0M1) {
                return ((AnonymousClass0M1) this).A00;
            } else {
                if (this instanceof C04830Lz) {
                    return ((C04830Lz) this).A00;
                }
                if (!(this instanceof C12220hk)) {
                    return null;
                }
                C12220hk r12 = (C12220hk) this;
                if (((AnonymousClass0Oo) r12).A00) {
                    return Long.toString(r12.A02);
                }
                return null;
            }
        }
    }

    public String A0K() {
        if (this instanceof C05490Ot) {
            return ((C05490Ot) this).A05;
        }
        if (this instanceof AnonymousClass2A5) {
            return ((AnonymousClass2A5) this).A02;
        }
        if (this instanceof AnonymousClass2A4) {
            return ((AnonymousClass2A4) this).A04;
        }
        if (this instanceof C12180hg) {
            return ((C12180hg) this).A01;
        }
        if (this instanceof C05470Or) {
            return ((C05470Or) this).A02;
        }
        if (!(this instanceof AnonymousClass0M3)) {
            return null;
        }
        return ((AnonymousClass0M3) this).A09;
    }

    public String A0L() {
        String str;
        if (this instanceof C05490Ot) {
            return A0D();
        }
        if (this instanceof C05390Oi) {
            C05390Oi r2 = (C05390Oi) this;
            if (!(r2 instanceof C12100hY)) {
                return r2.A0D();
            }
            C12100hY r22 = (C12100hY) r2;
            synchronized (r22.A0o) {
                str = r22.A00;
            }
            return str;
        } else if ((this instanceof AnonymousClass0ZJ) || (this instanceof AbstractC450022m) || (this instanceof AbstractC05460Oq)) {
            return null;
        } else {
            if (this instanceof AnonymousClass0ZL) {
                return ((AnonymousClass0ZL) this).A00;
            }
            if (this instanceof AnonymousClass0ZN) {
                return null;
            }
            if (this instanceof AnonymousClass0M3) {
                return ((AnonymousClass0M3) this).A04;
            }
            if (this instanceof C05470Or) {
                return null;
            }
            if (this instanceof C02850Ds) {
                return ((C02850Ds) this).A03;
            }
            if (this instanceof C449922l) {
                return null;
            }
            if (this instanceof AnonymousClass0ZF) {
                return ((AnonymousClass0ZF) this).A03;
            }
            if ((this instanceof AnonymousClass0ZI) || (this instanceof C12190hh)) {
                return null;
            }
            if (this instanceof AnonymousClass0M1) {
                return ((AnonymousClass0M1) this).A00;
            }
            if (!(this instanceof C04830Lz)) {
                return !(this instanceof AnonymousClass0Oo) ? null : null;
            }
            return ((C04830Lz) this).A00;
        }
    }

    public List A0M() {
        if (!(this instanceof C05390Oi)) {
            return this.A0d;
        }
        C05390Oi r1 = (C05390Oi) this;
        if (r1 instanceof C05480Os) {
            AnonymousClass00E.A08(false, "should not be called for FMessageSystemPayment");
            return null;
        } else if (r1 instanceof C05400Oj) {
            return ((C05400Oj) r1).A01;
        } else {
            AnonymousClass00E.A08(false, "should not be called for FMessageSystem");
            return null;
        }
    }

    public void A0N() {
        if (this instanceof C05390Oi) {
            AnonymousClass00E.A08(false, "Cannot change status for FMessageSystem");
        } else if (!(this instanceof AnonymousClass0Oo)) {
            this.A08 = 0;
        } else {
            AnonymousClass00E.A08(false, "Cannot change status for calls message type");
        }
    }

    public void A0O(int i) {
        if (!(this instanceof C12190hh)) {
            this.A05 = i | this.A05;
        } else if (i != 512) {
            this.A05 = i | this.A05;
        }
    }

    public void A0P(int i) {
        this.A05 = (i ^ -1) & this.A05;
    }

    public void A0Q(int i) {
        if (this instanceof C12190hh) {
            return;
        }
        if (i <= 0) {
            this.A02 = 0;
            A0P(256);
            return;
        }
        this.A02 = i;
        A0O(256);
    }

    public void A0R(int i) {
        if (this instanceof AnonymousClass2A4) {
            ((AnonymousClass2A4) this).A00 = i;
        } else if (this instanceof C05400Oj) {
            ((C05400Oj) this).A00 = i;
        } else if (this instanceof C12140hc) {
            ((C12140hc) this).A01 = i;
        } else if (this instanceof C12180hg) {
            ((C12180hg) this).A00 = i;
        } else if (this instanceof C02850Ds) {
            ((C02850Ds) this).A00 = i;
        } else if (this instanceof AnonymousClass0ZI) {
            ((AnonymousClass0ZI) this).A00 = i;
        } else if (this instanceof AnonymousClass0M3) {
            AnonymousClass0M3 r1 = (AnonymousClass0M3) this;
            if (!(r1 instanceof AnonymousClass0M2)) {
                r1.A00 = i;
            } else {
                ((AnonymousClass0M2) r1).A00 = i;
            }
        } else if (this instanceof C12220hk) {
            C12220hk r12 = (C12220hk) this;
            if (i > 0) {
                ((AnonymousClass0Oo) r12).A00 = true;
                r12.A00 = i;
            }
        }
    }

    public void A0S(int i) {
        if (this instanceof C05490Ot) {
            ((C05490Ot) this).A00 = i;
        } else if (this instanceof C12150hd) {
            ((C12150hd) this).A00 = i;
        } else if (this instanceof C12140hc) {
            ((C12140hc) this).A00 = i;
        }
    }

    public void A0T(int i) {
        if (C12080hW.A00(this.A08, i) > 0) {
            StringBuilder A0S2 = AnonymousClass008.A0S("FMessage/setStatus/statusDowngrade/key=");
            A0S2.append(this.A0n);
            A0S2.append("; type=");
            A0S2.append((int) this.A0m);
            A0S2.append("; current=");
            A0S2.append(this.A08);
            A0S2.append("; new=");
            A0S2.append(i);
            String obj = A0S2.toString();
            Log.e(obj);
            AnonymousClass00E.A08(false, obj);
        }
        this.A08 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r3 == r5) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(int r5) {
        /*
            r4 = this;
            int r3 = r4.A09
            if (r3 == 0) goto L_0x0007
            r2 = 0
            if (r3 != r5) goto L_0x0008
        L_0x0007:
            r2 = 1
        L_0x0008:
            java.lang.String r0 = "FMessage/setStorageType/should only update storage type when it is undefined; current="
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            r1.append(r3)
            java.lang.String r0 = "; new="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00E.A08(r2, r0)
            r4.A09 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC007503q.A0U(int):void");
    }

    public void A0V(long j) {
        if (this instanceof AnonymousClass0M3) {
            ((AnonymousClass0M3) this).A01 = j;
        } else if (this instanceof C02850Ds) {
            ((C02850Ds) this).A01 = j;
        } else if (this instanceof C12220hk) {
            C12220hk r3 = (C12220hk) this;
            if (j > 0) {
                ((AnonymousClass0Oo) r3).A00 = true;
                r3.A01 = (int) j;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(android.database.Cursor r7) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC007503q.A0W(android.database.Cursor):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0X(X.C015308l r18, android.database.Cursor r19) {
        /*
        // Method dump skipped, instructions count: 991
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC007503q.A0X(X.08l, android.database.Cursor):void");
    }

    public void A0Y(AnonymousClass02N r5) {
        if (!(this instanceof C05390Oi)) {
            this.A0G = r5;
            this.A0d = null;
            return;
        }
        C05390Oi r3 = (C05390Oi) this;
        if (!(r3 instanceof C05480Os)) {
            if (!(r3 instanceof C12130hb) && r5 != null) {
                if (r3.A0u()) {
                    r3.A0G = r5;
                    return;
                }
                StringBuilder A0S2 = AnonymousClass008.A0S("FMessageSystem/setRemoteResourceJid/should not be called for FMessageSystem, key = ");
                A0S2.append(r3.A0n.toString());
                A0S2.append(" action = ");
                A0S2.append(r3.A00);
                Log.e(A0S2.toString());
            }
        } else if (r5 != null) {
            if (!r3.A0u()) {
                StringBuilder A0S3 = AnonymousClass008.A0S("should not be called for FMessageSystem, key = ");
                A0S3.append(r3.A0n.toString());
                A0S3.append(" action = ");
                A0S3.append(r3.A00);
                AnonymousClass00E.A08(false, A0S3.toString());
            }
            r3.A0G = r5;
        }
    }

    public void A0Z(AbstractC007503q r4) {
        ArrayList arrayList;
        this.A0p = r4.A0p;
        this.A0q = r4.A0q;
        this.A0E = r4.A0E;
        this.A0C = r4.A0C;
        this.A0G = r4.A07();
        this.A0u = r4.A0u;
        if (r4.A0M() != null) {
            arrayList = new ArrayList(r4.A0M());
        } else {
            arrayList = null;
        }
        this.A0d = arrayList;
        this.A0D = r4.A0D;
        this.A0g = r4.A0g;
        this.A0r = r4.A0r;
        AnonymousClass0MH r2 = r4.A0F;
        if (r2 != null && (this.A0F == null || r2.A02 != 4)) {
            this.A0b = r4.A0b;
            this.A0F = r2;
        }
        boolean z = false;
        if (r4.A02 > 0) {
            z = true;
        }
        if (z) {
            this.A02 = r4.A02;
            this.A0R = r4.A0R;
        }
    }

    public void A0a(AbstractC007503q r4) {
        boolean z;
        boolean z2;
        if (r4 != null) {
            if (!(this instanceof C05390Oi)) {
                z = !(this instanceof C12190hh);
            } else {
                z = false;
            }
            boolean z3 = false;
            if (!z) {
                AnonymousClass00E.A08(false, "message type is not allowed to have a quoted message");
                return;
            }
            if (!(r4 instanceof C05390Oi)) {
                z2 = !(r4 instanceof C12190hh);
            } else {
                z2 = false;
            }
            if (!z2) {
                AnonymousClass00E.A08(false, "message type can not be a quoted message");
                return;
            }
            if (r4.A09 == 2) {
                z3 = true;
            }
            AnonymousClass00E.A08(z3, "quoted message should be marked StorageType.QUOTED");
            r4.A0a(null);
        }
        this.A0K = r4;
    }

    public void A0b(Long l) {
        if (!(this instanceof C12190hh)) {
            this.A0Q = l;
            return;
        }
        AnonymousClass00E.A08(false, "For FMessageEphemeralSettingChange the setting timestamp is the timestamp");
        this.A0Q = l;
    }

    public void A0c(Object obj) {
        Object obj2;
        AnonymousClass0M4 r8;
        if (this instanceof C05490Ot) {
            C05490Ot r1 = (C05490Ot) this;
            if (obj instanceof TextData) {
                r1.A0v((TextData) obj);
            } else if ((obj instanceof byte[]) || obj == null) {
                r1.A06 = (byte[]) obj;
            } else {
                StringBuilder A0S2 = AnonymousClass008.A0S("FMessageText/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
                A0S2.append(obj.getClass());
                AnonymousClass00E.A08(false, A0S2.toString());
            }
        } else if (this instanceof C12120ha) {
            C12120ha r12 = (C12120ha) this;
            if (obj instanceof ProfilePhotoChange) {
                r12.A00 = (ProfilePhotoChange) obj;
            }
        } else if (this instanceof C05480Os) {
            C05480Os r5 = (C05480Os) this;
            if (obj instanceof String) {
                String[] split = ((String) obj).split(";");
                boolean z = false;
                if (split.length == 3) {
                    z = true;
                }
                AnonymousClass00E.A08(z, "Wrong format of expired reference key.");
                r5.A02 = new C007303n(UserJid.getNullable(split[0]), Boolean.valueOf(split[1]).booleanValue(), split[2]);
            }
        } else if (this instanceof C12130hb) {
            C12130hb r2 = (C12130hb) this;
            if (((C05390Oi) r2).A00 == 10 && (obj instanceof String)) {
                r2.A00 = UserJid.getNullable((String) obj);
            }
        } else if (this instanceof C05400Oj) {
            C05400Oj r13 = (C05400Oj) this;
            if (r13 instanceof C12100hY) {
                C12100hY r14 = (C12100hY) r13;
                if (obj instanceof String) {
                    r14.A01 = (String) obj;
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() > 0 && (list.get(0) instanceof String)) {
                    r13.A01 = AnonymousClass1VY.A0G(UserJid.class, list);
                }
            }
        } else if (this instanceof AnonymousClass0M3) {
            AnonymousClass0M3 r22 = (AnonymousClass0M3) this;
            if (obj instanceof AnonymousClass0M4) {
                r22.A02 = (AnonymousClass0M4) obj;
            } else if (obj instanceof MediaData) {
                r22.A02 = AnonymousClass0M4.A00((MediaData) obj);
            } else {
                StringBuilder A0S3 = AnonymousClass008.A0S("FMessageMedia/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
                if (obj == null) {
                    obj2 = "null";
                } else {
                    obj2 = obj.getClass();
                }
                A0S3.append(obj2);
                Log.e(A0S3.toString());
                r22.A02 = new AnonymousClass0M4();
            }
        } else if (this instanceof AbstractC02860Dt) {
            AbstractC02860Dt r4 = (AbstractC02860Dt) this;
            if (obj instanceof AnonymousClass0M4) {
                r8 = (AnonymousClass0M4) obj;
            } else if (obj instanceof MediaData) {
                r8 = AnonymousClass0M4.A00((MediaData) obj);
            } else if (obj instanceof Integer) {
                r4.A02 = ((Number) obj).intValue();
                return;
            } else if (obj == null) {
                r4.A02 = 2;
                return;
            } else {
                StringBuilder A0S4 = AnonymousClass008.A0S("FMessageLocation/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
                A0S4.append(obj.getClass());
                AnonymousClass00E.A08(false, A0S4.toString());
                r4.A02 = 2;
                return;
            }
            if (r8.A0P) {
                r4.A02 = 2;
            } else if (r8.A0a) {
                r4.A02 = 1;
            } else {
                r4.A02 = 0;
            }
        }
    }

    public void A0d(String str) {
        synchronized (this.A0o) {
            this.A0X = str;
            this.A0l = null;
        }
    }

    public void A0e(String str) {
        if (!(this instanceof AnonymousClass0M3)) {
            this.A05 &= -65;
            return;
        }
        AnonymousClass0M3 r2 = (AnonymousClass0M3) this;
        r2.A0A = str;
        if (!TextUtils.isEmpty(str)) {
            r2.A0O(64);
        } else {
            r2.A0P(64);
        }
    }

    public void A0f(String str) {
        if (!(this instanceof C05390Oi)) {
            AnonymousClass02N r1 = this.A0n.A00;
            if (AnonymousClass1VY.A0T(r1) && !AnonymousClass1VY.A0b(r1) && str != null) {
                A0m(AnonymousClass1VY.A0G(UserJid.class, Arrays.asList(str.split(","))));
            } else if (AnonymousClass1VY.A0b(r1)) {
                A0Y(AnonymousClass1VY.A0B(str));
            } else if (TextUtils.isEmpty(str)) {
                A0Y(null);
            } else {
                A0Y(AnonymousClass02N.A01(str));
            }
        } else {
            C05390Oi r3 = (C05390Oi) this;
            if (r3 instanceof AnonymousClass2A5) {
                ((AnonymousClass2A5) r3).A01 = str;
            } else if (r3 instanceof AnonymousClass2A4) {
                ((C05480Os) r3).A03 = str;
            } else if (!(r3 instanceof C12130hb)) {
                r3.A0G = null;
                if (r3.A0u() && !TextUtils.isEmpty(str)) {
                    AnonymousClass02N A012 = AnonymousClass02N.A01(str);
                    r3.A0G = A012;
                    if (A012 == null) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("Something went wrong with this message, key = ");
                        A0S2.append(r3.A0n.toString());
                        A0S2.append(" action = ");
                        A0S2.append(r3.A00);
                        AnonymousClass00E.A08(false, A0S2.toString());
                    }
                }
            } else {
                C12130hb r32 = (C12130hb) r3;
                if (((C05390Oi) r32).A00 == 10) {
                    r32.A01 = UserJid.getNullable(str);
                }
            }
        }
    }

    public void A0g(String str) {
        if (this instanceof C05490Ot) {
            ((C05490Ot) this).A04 = str;
        } else if (this instanceof C05480Os) {
            C05480Os r1 = (C05480Os) this;
            if (r1 instanceof AnonymousClass2A5) {
                ((AnonymousClass2A5) r1).A03 = str;
            } else if (!(r1 instanceof AnonymousClass2A4)) {
                r1.A03 = str;
            } else {
                ((AnonymousClass2A4) r1).A02 = str;
            }
        } else if (this instanceof C12130hb) {
            C12130hb r2 = (C12130hb) this;
            if (((C05390Oi) r2).A00 == 28) {
                r2.A01 = UserJid.getNullable(str);
            }
        } else if (this instanceof C12150hd) {
            ((C12150hd) this).A01 = str;
        } else if (this instanceof AnonymousClass0ZL) {
            ((AnonymousClass0ZL) this).A00 = str;
        } else if (this instanceof AnonymousClass0M3) {
            ((AnonymousClass0M3) this).A04 = str;
        } else if (this instanceof C02850Ds) {
            ((C02850Ds) this).A03 = str;
        } else if (this instanceof AnonymousClass0ZF) {
            ((AnonymousClass0ZF) this).A03 = str;
        } else if (this instanceof AnonymousClass0Oo) {
            AnonymousClass0Oo r12 = (AnonymousClass0Oo) this;
            if (!TextUtils.isEmpty(str)) {
                r12.A01 = "video".equals(str);
                r12.A00 = true;
                return;
            }
            r12.A00 = false;
        }
    }

    public void A0h(String str) {
        if (this instanceof C05480Os) {
            C05480Os r1 = (C05480Os) this;
            if (r1 instanceof AnonymousClass2A5) {
                ((AnonymousClass2A5) r1).A04 = str;
            } else if (!(r1 instanceof AnonymousClass2A4)) {
                r1.A01 = UserJid.getNullable(str);
            } else {
                ((AnonymousClass2A4) r1).A03 = str;
            }
        } else if (this instanceof AnonymousClass0M3) {
            ((AnonymousClass0M3) this).A05 = str;
        }
    }

    public void A0i(String str) {
        if (this instanceof C05480Os) {
            C05480Os r1 = (C05480Os) this;
            if (r1 instanceof AnonymousClass2A5) {
                ((AnonymousClass2A5) r1).A00 = str;
            } else if (!(r1 instanceof AnonymousClass2A4)) {
                r1.A00 = UserJid.getNullable(str);
            } else {
                ((AnonymousClass2A4) r1).A01 = str;
            }
        } else if (this instanceof AnonymousClass0M3) {
            ((AnonymousClass0M3) this).A06 = str;
        }
    }

    public void A0j(String str) {
        if (this instanceof C05490Ot) {
            ((C05490Ot) this).A02 = str;
        } else if (this instanceof C12130hb) {
            C12130hb r2 = (C12130hb) this;
            if (((C05390Oi) r2).A00 == 28) {
                r2.A00 = UserJid.getNullable(str);
            }
        } else if (this instanceof C12110hZ) {
            ((C12110hZ) this).A00 = str;
        } else if (this instanceof AnonymousClass0ZJ) {
            ((AnonymousClass0ZJ) this).A00 = str;
        } else if (this instanceof AnonymousClass0M3) {
            ((AnonymousClass0M3) this).A08 = str;
        } else if (this instanceof C05470Or) {
            C05470Or r22 = (C05470Or) this;
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf(10);
                if (indexOf == -1) {
                    r22.A01 = str;
                    return;
                }
                r22.A01 = str.substring(0, indexOf);
                if (str.length() > indexOf) {
                    r22.A00 = str.substring(indexOf + 1);
                }
            }
        } else if (this instanceof C02850Ds) {
            C02850Ds r4 = (C02850Ds) this;
            if (str != null) {
                String[] split = str.split(",");
                if (split.length == 4) {
                    UserJid nullable = UserJid.getNullable(split[0]);
                    if (nullable != null) {
                        C02900Dx r23 = new C02900Dx(nullable);
                        r4.A02 = r23;
                        r23.A00 = Double.parseDouble(split[1]);
                        r23.A01 = Double.parseDouble(split[2]);
                        r23.A05 = Long.parseLong(split[3]);
                        return;
                    }
                    throw null;
                }
            }
        } else if (this instanceof AnonymousClass0M1) {
            ((AnonymousClass0M1) this).A00 = str;
        } else if (this instanceof C04830Lz) {
            ((C04830Lz) this).A00 = str;
        } else if (this instanceof C12220hk) {
            C12220hk r7 = (C12220hk) this;
            long A042 = C006803i.A04(str, 0);
            if (A042 < 0 || A042 > 2147483648L) {
                A042 = 0;
            }
            r7.A02 = A042;
            if (A042 > 0) {
                ((AnonymousClass0Oo) r7).A00 = true;
            }
        }
    }

    public void A0k(String str) {
        if (this instanceof C05490Ot) {
            ((C05490Ot) this).A05 = str;
        } else if (this instanceof AnonymousClass2A5) {
            ((AnonymousClass2A5) this).A02 = str;
        } else if (this instanceof AnonymousClass2A4) {
            ((AnonymousClass2A4) this).A04 = str;
        } else if (this instanceof C12180hg) {
            ((C12180hg) this).A01 = str;
        } else if (this instanceof C05470Or) {
            ((C05470Or) this).A02 = str;
        } else if (this instanceof AnonymousClass0M3) {
            ((AnonymousClass0M3) this).A09 = str;
        }
    }

    public void A0l(String str) {
        if (this instanceof C05490Ot) {
            A0d(str);
        } else if (this instanceof C05390Oi) {
            C05390Oi r2 = (C05390Oi) this;
            if (!(r2 instanceof C12100hY)) {
                r2.A0d(str);
                return;
            }
            C12100hY r22 = (C12100hY) r2;
            synchronized (r22.A0o) {
                r22.A00 = str;
            }
        } else if (!(this instanceof AnonymousClass0ZJ) && !(this instanceof AbstractC450022m) && !(this instanceof AbstractC05460Oq)) {
            if (this instanceof AnonymousClass0ZL) {
                ((AnonymousClass0ZL) this).A00 = str;
            } else if (this instanceof AnonymousClass0ZN) {
            } else {
                if (this instanceof AnonymousClass0M3) {
                    ((AnonymousClass0M3) this).A04 = str;
                } else if (this instanceof C05470Or) {
                } else {
                    if (this instanceof C02850Ds) {
                        ((C02850Ds) this).A03 = str;
                    } else if (this instanceof C449922l) {
                    } else {
                        if (this instanceof AnonymousClass0ZF) {
                            ((AnonymousClass0ZF) this).A03 = str;
                        } else if (!(this instanceof AnonymousClass0ZI) && !(this instanceof C12190hh)) {
                            if (this instanceof AnonymousClass0M1) {
                                ((AnonymousClass0M1) this).A00 = str;
                            } else if (this instanceof C04830Lz) {
                                ((C04830Lz) this).A00 = str;
                            } else if (this instanceof AnonymousClass0Oo) {
                            }
                        }
                    }
                }
            }
        }
    }

    public void A0m(List list) {
        if (!(this instanceof C05390Oi)) {
            this.A0G = null;
            this.A0d = list;
            return;
        }
        C05390Oi r1 = (C05390Oi) this;
        if (r1 instanceof C05480Os) {
            AnonymousClass00E.A08(false, "should not be called for FMessageSystemPayment");
        } else if (!(r1 instanceof C05400Oj)) {
            AnonymousClass00E.A08(false, "should not be called for FMessageSystem");
        } else {
            C05400Oj r12 = (C05400Oj) r1;
            if (list != null) {
                r12.A01 = list;
            } else {
                r12.A01 = new ArrayList();
            }
        }
    }

    public final void A0n(List list) {
        if (list == null || list.isEmpty()) {
            this.A0c = null;
            return;
        }
        this.A0c = new ArrayList(list);
        this.A0t |= 1;
    }

    public void A0o(byte[] bArr) {
        synchronized (this.A0o) {
            this.A0l = bArr;
            this.A0X = null;
            this.A01 = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r3.A0l != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0p() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0o
            monitor-enter(r2)
            java.lang.String r0 = r3.A0X     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x000c
            byte[] r1 = r3.A0l     // Catch:{ all -> 0x000f }
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC007503q.A0p():boolean");
    }

    public boolean A0q() {
        long j = (long) 8;
        return (this.A0t & j) == j;
    }

    public boolean A0r() {
        List list = this.A0c;
        return list != null && !list.isEmpty();
    }

    public boolean A0s(int i) {
        return (this.A05 & i) == i;
    }

    public byte[] A0t() {
        byte[] bArr;
        String str;
        synchronized (this.A0o) {
            bArr = this.A0l;
            if (bArr == null && (str = this.A0X) != null) {
                if (str != null) {
                    try {
                        bArr = str.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    this.A0l = bArr;
                }
                bArr = null;
                this.A0l = bArr;
            }
        }
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" key=");
        sb.append(this.A0n);
        sb.append(" media_wa_type=");
        sb.append((int) this.A0m);
        return sb.toString();
    }
}
