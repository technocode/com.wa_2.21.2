package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.IOException;

/* renamed from: X.0Dr  reason: invalid class name and case insensitive filesystem */
public final class C02840Dr extends AnonymousClass078 implements AnonymousClass077 {
    public static final C02840Dr A0b;
    public static volatile AbstractC37151nd A0c;
    public int A00;
    public int A01;
    public C75663dI A02;
    public C75723dO A03;
    public C75743dQ A04;
    public C75763dS A05;
    public C75783dU A06;
    public C75803dW A07;
    public C75823dY A08;
    public C75843da A09;
    public C75863dc A0A;
    public C75903dg A0B;
    public C75923di A0C;
    public C75943dk A0D;
    public C75963dm A0E;
    public C75963dm A0F;
    public C75983do A0G;
    public C76103e0 A0H;
    public C76143e4 A0I;
    public C76183e8 A0J;
    public C76243eE A0K;
    public C76283eI A0L;
    public C02890Dw A0M;
    public C76313eL A0N;
    public C76333eN A0O;
    public C76393eT A0P;
    public C76413eV A0Q;
    public C76433eX A0R;
    public C76453eZ A0S;
    public C76473eb A0T;
    public C76473eb A0U;
    public C76493ed A0V;
    public C76513ef A0W;
    public AnonymousClass0OG A0X;
    public C76563ek A0Y;
    public C76583em A0Z;
    public String A0a = "";

    static {
        C02840Dr r0 = new C02840Dr();
        A0b = r0;
        r0.A0C();
    }

    public static C04970Mo A08() {
        return (C04970Mo) A0b.AQb();
    }

    public static C02840Dr A09(byte[] bArr) {
        return (C02840Dr) AnonymousClass078.A02(A0b, bArr);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r8, Object obj, Object obj2) {
        C75733dP r1;
        C75673dJ r12;
        C76173e7 r13;
        C75953dl r14;
        C76253eF r15;
        C76323eM r16;
        C75953dl r17;
        C76193e9 r18;
        C76573el r19;
        C75873dd r110;
        C76343eO r111;
        C76503ee r112;
        C75973dn r113;
        C76483ec r114;
        C76523eg r115;
        C75773dT r116;
        C75853db r117;
        C76423eW r118;
        C76293eJ r119;
        C76443eY r120;
        C76463ea r121;
        C75993dp r122;
        C75833dZ r123;
        C76403eU r124;
        C75793dV r125;
        C75753dR r126;
        C76553ej r127;
        C75653dH r128;
        C75913dh r129;
        C75933dj r130;
        C76303eK r131;
        C75813dX r132;
        C76133e3 r133;
        C76463ea r134;
        boolean z = false;
        switch (r8.ordinal()) {
            case 0:
                return A0b;
            case 1:
                AbstractC05000Mr r9 = (AbstractC05000Mr) obj;
                C02840Dr r10 = (C02840Dr) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                String str = this.A0a;
                if ((r10.A00 & 1) == 1) {
                    z = true;
                }
                this.A0a = r9.ARH(z2, str, z, r10.A0a);
                this.A0U = (C76473eb) r9.ARD(this.A0U, r10.A0U);
                this.A0I = (C76143e4) r9.ARD(this.A0I, r10.A0I);
                this.A08 = (C75823dY) r9.ARD(this.A08, r10.A08);
                this.A0N = (C76313eL) r9.ARD(this.A0N, r10.A0N);
                this.A0D = (C75943dk) r9.ARD(this.A0D, r10.A0D);
                this.A0C = (C75923di) r9.ARD(this.A0C, r10.A0C);
                this.A02 = (C75663dI) r9.ARD(this.A02, r10.A02);
                this.A0Y = (C76563ek) r9.ARD(this.A0Y, r10.A0Y);
                this.A05 = (C75763dS) r9.ARD(this.A05, r10.A05);
                this.A07 = (C75803dW) r9.ARD(this.A07, r10.A07);
                this.A0Q = (C76413eV) r9.ARD(this.A0Q, r10.A0Q);
                this.A09 = (C75843da) r9.ARD(this.A09, r10.A09);
                this.A0H = (C76103e0) r9.ARD(this.A0H, r10.A0H);
                this.A0T = (C76473eb) r9.ARD(this.A0T, r10.A0T);
                this.A0S = (C76453eZ) r9.ARD(this.A0S, r10.A0S);
                this.A0M = (C02890Dw) r9.ARD(this.A0M, r10.A0M);
                this.A0R = (C76433eX) r9.ARD(this.A0R, r10.A0R);
                this.A0A = (C75863dc) r9.ARD(this.A0A, r10.A0A);
                this.A06 = (C75783dU) r9.ARD(this.A06, r10.A06);
                this.A0X = (AnonymousClass0OG) r9.ARD(this.A0X, r10.A0X);
                this.A0V = (C76493ed) r9.ARD(this.A0V, r10.A0V);
                this.A0G = (C75983do) r9.ARD(this.A0G, r10.A0G);
                this.A0W = (C76513ef) r9.ARD(this.A0W, r10.A0W);
                this.A0P = (C76393eT) r9.ARD(this.A0P, r10.A0P);
                this.A0B = (C75903dg) r9.ARD(this.A0B, r10.A0B);
                this.A0Z = (C76583em) r9.ARD(this.A0Z, r10.A0Z);
                this.A0K = (C76243eE) r9.ARD(this.A0K, r10.A0K);
                this.A0F = (C75963dm) r9.ARD(this.A0F, r10.A0F);
                this.A0O = (C76333eN) r9.ARD(this.A0O, r10.A0O);
                this.A0L = (C76283eI) r9.ARD(this.A0L, r10.A0L);
                this.A0E = (C75963dm) r9.ARD(this.A0E, r10.A0E);
                this.A0J = (C76183e8) r9.ARD(this.A0J, r10.A0J);
                this.A03 = (C75723dO) r9.ARD(this.A03, r10.A03);
                this.A04 = (C75743dQ) r9.ARD(this.A04, r10.A04);
                if (r9 == C04980Mp.A00) {
                    this.A00 |= r10.A00;
                    this.A01 |= r10.A01;
                }
                return this;
            case 2:
                C05010Mt r92 = (C05010Mt) obj;
                AnonymousClass1FL r102 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r92.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r92.A0A();
                                this.A00 |= 1;
                                this.A0a = A0A2;
                                continue;
                            case 18:
                                if ((this.A00 & 2) == 2) {
                                    r134 = (C76463ea) this.A0U.AQb();
                                } else {
                                    r134 = null;
                                }
                                C76473eb r0 = (C76473eb) r92.A09(C76473eb.A03.A0A(), r102);
                                this.A0U = r0;
                                if (r134 != null) {
                                    r134.A03(r0);
                                    this.A0U = (C76473eb) r134.A00();
                                }
                                this.A00 |= 2;
                                continue;
                            case 26:
                                if ((this.A00 & 4) == 4) {
                                    r133 = (C76133e3) this.A0I.AQb();
                                } else {
                                    r133 = null;
                                }
                                C76143e4 r02 = (C76143e4) r92.A09(C76143e4.A0N.A0A(), r102);
                                this.A0I = r02;
                                if (r133 != null) {
                                    r133.A03(r02);
                                    this.A0I = (C76143e4) r133.A00();
                                }
                                this.A00 |= 4;
                                continue;
                            case 34:
                                if ((this.A00 & 8) == 8) {
                                    r132 = (C75813dX) this.A08.AQb();
                                } else {
                                    r132 = null;
                                }
                                C75823dY r03 = (C75823dY) r92.A09(C75823dY.A04.A0A(), r102);
                                this.A08 = r03;
                                if (r132 != null) {
                                    r132.A03(r03);
                                    this.A08 = (C75823dY) r132.A00();
                                }
                                this.A00 |= 8;
                                continue;
                            case 42:
                                if ((this.A00 & 16) == 16) {
                                    r131 = (C76303eK) this.A0N.AQb();
                                } else {
                                    r131 = null;
                                }
                                C76313eL r04 = (C76313eL) r92.A09(C76313eL.A0D.A0A(), r102);
                                this.A0N = r04;
                                if (r131 != null) {
                                    r131.A03(r04);
                                    this.A0N = (C76313eL) r131.A00();
                                }
                                this.A00 |= 16;
                                continue;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                if ((this.A00 & 32) == 32) {
                                    r130 = (C75933dj) this.A0D.AQb();
                                } else {
                                    r130 = null;
                                }
                                C75943dk r05 = (C75943dk) r92.A09(C75943dk.A0D.A0A(), r102);
                                this.A0D = r05;
                                if (r130 != null) {
                                    r130.A03(r05);
                                    this.A0D = (C75943dk) r130.A00();
                                }
                                this.A00 |= 32;
                                continue;
                            case 58:
                                if ((this.A00 & 64) == 64) {
                                    r129 = (C75913dh) this.A0C.AQb();
                                } else {
                                    r129 = null;
                                }
                                C75923di r06 = (C75923di) r92.A09(C75923di.A0K.A0A(), r102);
                                this.A0C = r06;
                                if (r129 != null) {
                                    r129.A03(r06);
                                    this.A0C = (C75923di) r129.A00();
                                }
                                this.A00 |= 64;
                                continue;
                            case 66:
                                if ((this.A00 & 128) == 128) {
                                    r128 = (C75653dH) this.A02.AQb();
                                } else {
                                    r128 = null;
                                }
                                C75663dI r07 = (C75663dI) r92.A09(C75663dI.A0D.A0A(), r102);
                                this.A02 = r07;
                                if (r128 != null) {
                                    r128.A03(r07);
                                    this.A02 = (C75663dI) r128.A00();
                                }
                                this.A00 |= 128;
                                continue;
                            case 74:
                                if ((this.A00 & 256) == 256) {
                                    r127 = (C76553ej) this.A0Y.AQb();
                                } else {
                                    r127 = null;
                                }
                                C76563ek r08 = (C76563ek) r92.A09(C76563ek.A0K.A0A(), r102);
                                this.A0Y = r08;
                                if (r127 != null) {
                                    r127.A03(r08);
                                    this.A0Y = (C76563ek) r127.A00();
                                }
                                this.A00 |= 256;
                                continue;
                            case 82:
                                if ((this.A00 & 512) == 512) {
                                    r126 = (C75753dR) this.A05.AQb();
                                } else {
                                    r126 = null;
                                }
                                C75763dS r09 = (C75763dS) r92.A09(C75763dS.A02.A0A(), r102);
                                this.A05 = r09;
                                if (r126 != null) {
                                    r126.A03(r09);
                                    this.A05 = (C75763dS) r126.A00();
                                }
                                this.A00 |= 512;
                                continue;
                            case 90:
                                if ((this.A00 & 1024) == 1024) {
                                    r125 = (C75793dV) this.A07.AQb();
                                } else {
                                    r125 = null;
                                }
                                C75803dW r010 = (C75803dW) r92.A09(C75803dW.A03.A0A(), r102);
                                this.A07 = r010;
                                if (r125 != null) {
                                    r125.A03(r010);
                                    this.A07 = (C75803dW) r125.A00();
                                }
                                this.A00 |= 1024;
                                continue;
                            case 98:
                                if ((this.A00 & 2048) == 2048) {
                                    r124 = (C76403eU) this.A0Q.AQb();
                                } else {
                                    r124 = null;
                                }
                                C76413eV r011 = (C76413eV) r92.A09(C76413eV.A09.A0A(), r102);
                                this.A0Q = r011;
                                if (r124 != null) {
                                    r124.A03(r011);
                                    this.A0Q = (C76413eV) r124.A00();
                                }
                                this.A00 |= 2048;
                                continue;
                            case 106:
                                if ((this.A00 & 4096) == 4096) {
                                    r123 = (C75833dZ) this.A09.AQb();
                                } else {
                                    r123 = null;
                                }
                                C75843da r012 = (C75843da) r92.A09(C75843da.A04.A0A(), r102);
                                this.A09 = r012;
                                if (r123 != null) {
                                    r123.A03(r012);
                                    this.A09 = (C75843da) r123.A00();
                                }
                                this.A00 |= 4096;
                                continue;
                            case 114:
                                if ((this.A00 & 8192) == 8192) {
                                    r122 = (C75993dp) this.A0H.AQb();
                                } else {
                                    r122 = null;
                                }
                                C76103e0 r013 = (C76103e0) r92.A09(C76103e0.A0A.A0A(), r102);
                                this.A0H = r013;
                                if (r122 != null) {
                                    r122.A03(r013);
                                    this.A0H = (C76103e0) r122.A00();
                                }
                                this.A00 |= 8192;
                                continue;
                            case 122:
                                if ((this.A00 & 16384) == 16384) {
                                    r121 = (C76463ea) this.A0T.AQb();
                                } else {
                                    r121 = null;
                                }
                                C76473eb r014 = (C76473eb) r92.A09(C76473eb.A03.A0A(), r102);
                                this.A0T = r014;
                                if (r121 != null) {
                                    r121.A03(r014);
                                    this.A0T = (C76473eb) r121.A00();
                                }
                                this.A00 |= 16384;
                                continue;
                            case 130:
                                if ((this.A00 & 32768) == 32768) {
                                    r120 = (C76443eY) this.A0S.AQb();
                                } else {
                                    r120 = null;
                                }
                                C76453eZ r015 = (C76453eZ) r92.A09(C76453eZ.A03.A0A(), r102);
                                this.A0S = r015;
                                if (r120 != null) {
                                    r120.A03(r015);
                                    this.A0S = (C76453eZ) r120.A00();
                                }
                                this.A00 |= 32768;
                                continue;
                            case 146:
                                if ((this.A00 & 65536) == 65536) {
                                    r119 = (C76293eJ) this.A0M.AQb();
                                } else {
                                    r119 = null;
                                }
                                C02890Dw r016 = (C02890Dw) r92.A09(C02890Dw.A0B.A0A(), r102);
                                this.A0M = r016;
                                if (r119 != null) {
                                    r119.A03(r016);
                                    this.A0M = (C02890Dw) r119.A00();
                                }
                                this.A00 |= 65536;
                                continue;
                            case 178:
                                if ((this.A00 & 131072) == 131072) {
                                    r118 = (C76423eW) this.A0R.AQb();
                                } else {
                                    r118 = null;
                                }
                                C76433eX r017 = (C76433eX) r92.A09(C76433eX.A06.A0A(), r102);
                                this.A0R = r017;
                                if (r118 != null) {
                                    r118.A03(r017);
                                    this.A0R = (C76433eX) r118.A00();
                                }
                                this.A00 |= 131072;
                                continue;
                            case 186:
                                if ((this.A00 & 262144) == 262144) {
                                    r117 = (C75853db) this.A0A.AQb();
                                } else {
                                    r117 = null;
                                }
                                C75863dc r018 = (C75863dc) r92.A09(C75863dc.A02.A0A(), r102);
                                this.A0A = r018;
                                if (r117 != null) {
                                    r117.A03(r018);
                                    this.A0A = (C75863dc) r117.A00();
                                }
                                this.A00 |= 262144;
                                continue;
                            case 194:
                                if ((this.A00 & 524288) == 524288) {
                                    r116 = (C75773dT) this.A06.AQb();
                                } else {
                                    r116 = null;
                                }
                                C75783dU r019 = (C75783dU) r92.A09(C75783dU.A02.A0A(), r102);
                                this.A06 = r019;
                                if (r116 != null) {
                                    r116.A03(r019);
                                    this.A06 = (C75783dU) r116.A00();
                                }
                                this.A00 |= 524288;
                                continue;
                            case 202:
                                if ((this.A00 & 1048576) == 1048576) {
                                    r115 = (C76523eg) this.A0X.AQb();
                                } else {
                                    r115 = null;
                                }
                                AnonymousClass0OG r020 = (AnonymousClass0OG) r92.A09(AnonymousClass0OG.A05.A0A(), r102);
                                this.A0X = r020;
                                if (r115 != null) {
                                    r115.A03(r020);
                                    this.A0X = (AnonymousClass0OG) r115.A00();
                                }
                                this.A00 |= 1048576;
                                continue;
                            case 210:
                                if ((this.A00 & 2097152) == 2097152) {
                                    r114 = (C76483ec) this.A0V.AQb();
                                } else {
                                    r114 = null;
                                }
                                C76493ed r021 = (C76493ed) r92.A09(C76493ed.A0G.A0A(), r102);
                                this.A0V = r021;
                                if (r114 != null) {
                                    r114.A03(r021);
                                    this.A0V = (C76493ed) r114.A00();
                                }
                                this.A00 |= 2097152;
                                continue;
                            case 226:
                                if ((this.A00 & 4194304) == 4194304) {
                                    r113 = (C75973dn) this.A0G.AQb();
                                } else {
                                    r113 = null;
                                }
                                C75983do r022 = (C75983do) r92.A09(C75983do.A08.A0A(), r102);
                                this.A0G = r022;
                                if (r113 != null) {
                                    r113.A03(r022);
                                    this.A0G = (C75983do) r113.A00();
                                }
                                this.A00 |= 4194304;
                                continue;
                            case 234:
                                if ((this.A00 & 8388608) == 8388608) {
                                    r112 = (C76503ee) this.A0W.AQb();
                                } else {
                                    r112 = null;
                                }
                                C76513ef r023 = (C76513ef) r92.A09(C76513ef.A05.A0A(), r102);
                                this.A0W = r023;
                                if (r112 != null) {
                                    r112.A03(r023);
                                    this.A0W = (C76513ef) r112.A00();
                                }
                                this.A00 |= 8388608;
                                continue;
                            case 242:
                                if ((this.A00 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
                                    r111 = (C76343eO) this.A0P.AQb();
                                } else {
                                    r111 = null;
                                }
                                C76393eT r024 = (C76393eT) r92.A09(C76393eT.A05.A0A(), r102);
                                this.A0P = r024;
                                if (r111 != null) {
                                    r111.A03(r024);
                                    this.A0P = (C76393eT) r111.A00();
                                }
                                this.A00 |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                continue;
                            case 250:
                                if ((this.A00 & 33554432) == 33554432) {
                                    r110 = (C75873dd) this.A0B.AQb();
                                } else {
                                    r110 = null;
                                }
                                C75903dg r025 = (C75903dg) r92.A09(C75903dg.A05.A0A(), r102);
                                this.A0B = r025;
                                if (r110 != null) {
                                    r110.A03(r025);
                                    this.A0B = (C75903dg) r110.A00();
                                }
                                this.A00 |= 33554432;
                                continue;
                            case 282:
                                if ((this.A00 & 67108864) == 67108864) {
                                    r19 = (C76573el) this.A0Z.AQb();
                                } else {
                                    r19 = null;
                                }
                                C76583em r026 = (C76583em) r92.A09(C76583em.A02.A0A(), r102);
                                this.A0Z = r026;
                                if (r19 != null) {
                                    r19.A03(r026);
                                    this.A0Z = (C76583em) r19.A00();
                                }
                                this.A00 |= 67108864;
                                continue;
                            case 290:
                                if ((this.A00 & 134217728) == 134217728) {
                                    r18 = (C76193e9) this.A0K.AQb();
                                } else {
                                    r18 = null;
                                }
                                C76243eE r027 = (C76243eE) r92.A09(C76243eE.A06.A0A(), r102);
                                this.A0K = r027;
                                if (r18 != null) {
                                    r18.A03(r027);
                                    this.A0K = (C76243eE) r18.A00();
                                }
                                this.A00 |= 134217728;
                                continue;
                            case 298:
                                if ((this.A00 & 268435456) == 268435456) {
                                    r17 = (C75953dl) this.A0F.AQb();
                                } else {
                                    r17 = null;
                                }
                                C75963dm r028 = (C75963dm) r92.A09(C75963dm.A02.A0A(), r102);
                                this.A0F = r028;
                                if (r17 != null) {
                                    r17.A03(r028);
                                    this.A0F = (C75963dm) r17.A00();
                                }
                                this.A00 |= 268435456;
                                continue;
                            case 306:
                                if ((this.A00 & 536870912) == 536870912) {
                                    r16 = (C76323eM) this.A0O.AQb();
                                } else {
                                    r16 = null;
                                }
                                C76333eN r029 = (C76333eN) r92.A09(C76333eN.A0B.A0A(), r102);
                                this.A0O = r029;
                                if (r16 != null) {
                                    r16.A03(r029);
                                    this.A0O = (C76333eN) r16.A00();
                                }
                                this.A00 |= 536870912;
                                continue;
                            case 314:
                                if ((this.A00 & 1073741824) == 1073741824) {
                                    r15 = (C76253eF) this.A0L.AQb();
                                } else {
                                    r15 = null;
                                }
                                C76283eI r030 = (C76283eI) r92.A09(C76283eI.A06.A0A(), r102);
                                this.A0L = r030;
                                if (r15 != null) {
                                    r15.A03(r030);
                                    this.A0L = (C76283eI) r15.A00();
                                }
                                this.A00 |= 1073741824;
                                continue;
                            case 322:
                                if ((this.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
                                    r14 = (C75953dl) this.A0E.AQb();
                                } else {
                                    r14 = null;
                                }
                                C75963dm r031 = (C75963dm) r92.A09(C75963dm.A02.A0A(), r102);
                                this.A0E = r031;
                                if (r14 != null) {
                                    r14.A03(r031);
                                    this.A0E = (C75963dm) r14.A00();
                                }
                                this.A00 |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                continue;
                            case 330:
                                if ((this.A01 & 1) == 1) {
                                    r13 = (C76173e7) this.A0J.AQb();
                                } else {
                                    r13 = null;
                                }
                                C76183e8 r032 = (C76183e8) r92.A09(C76183e8.A0B.A0A(), r102);
                                this.A0J = r032;
                                if (r13 != null) {
                                    r13.A03(r032);
                                    this.A0J = (C76183e8) r13.A00();
                                }
                                this.A01 |= 1;
                                continue;
                            case 338:
                                if ((this.A01 & 2) == 2) {
                                    r12 = (C75673dJ) this.A03.AQb();
                                } else {
                                    r12 = null;
                                }
                                C75723dO r033 = (C75723dO) r92.A09(C75723dO.A07.A0A(), r102);
                                this.A03 = r033;
                                if (r12 != null) {
                                    r12.A03(r033);
                                    this.A03 = (C75723dO) r12.A00();
                                }
                                this.A01 |= 2;
                                continue;
                            case 346:
                                if ((this.A01 & 4) == 4) {
                                    r1 = (C75733dP) this.A04.AQb();
                                } else {
                                    r1 = null;
                                }
                                C75743dQ r034 = (C75743dQ) r92.A09(C75743dQ.A04.A0A(), r102);
                                this.A04 = r034;
                                if (r1 != null) {
                                    r1.A03(r034);
                                    this.A04 = (C75743dQ) r1.A00();
                                }
                                this.A01 |= 4;
                                continue;
                            default:
                                if (A0G(A032, r92)) {
                                    continue;
                                }
                                break;
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r135 = new C04190Jk(e2.getMessage());
                        r135.unfinishedMessage = this;
                        throw new RuntimeException(r135);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C02840Dr();
            case 5:
                return new C04970Mo();
            case 6:
                break;
            case 7:
                if (A0c == null) {
                    synchronized (C02840Dr.class) {
                        if (A0c == null) {
                            A0c = new AnonymousClass275(A0b);
                        }
                    }
                }
                return A0c;
            default:
                throw new UnsupportedOperationException();
        }
        return A0b;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A0a);
        }
        if ((this.A00 & 2) == 2) {
            C76473eb r0 = this.A0U;
            if (r0 == null) {
                r0 = C76473eb.A03;
            }
            i2 += AbstractC11750gu.A08(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            C76143e4 r02 = this.A0I;
            if (r02 == null) {
                r02 = C76143e4.A0N;
            }
            i2 += AbstractC11750gu.A08(3, r02);
        }
        if ((this.A00 & 8) == 8) {
            C75823dY r03 = this.A08;
            if (r03 == null) {
                r03 = C75823dY.A04;
            }
            i2 += AbstractC11750gu.A08(4, r03);
        }
        if ((this.A00 & 16) == 16) {
            C76313eL r04 = this.A0N;
            if (r04 == null) {
                r04 = C76313eL.A0D;
            }
            i2 += AbstractC11750gu.A08(5, r04);
        }
        if ((this.A00 & 32) == 32) {
            C75943dk r05 = this.A0D;
            if (r05 == null) {
                r05 = C75943dk.A0D;
            }
            i2 += AbstractC11750gu.A08(6, r05);
        }
        if ((this.A00 & 64) == 64) {
            C75923di r06 = this.A0C;
            if (r06 == null) {
                r06 = C75923di.A0K;
            }
            i2 += AbstractC11750gu.A08(7, r06);
        }
        if ((this.A00 & 128) == 128) {
            C75663dI r07 = this.A02;
            if (r07 == null) {
                r07 = C75663dI.A0D;
            }
            i2 += AbstractC11750gu.A08(8, r07);
        }
        if ((this.A00 & 256) == 256) {
            C76563ek r08 = this.A0Y;
            if (r08 == null) {
                r08 = C76563ek.A0K;
            }
            i2 += AbstractC11750gu.A08(9, r08);
        }
        if ((this.A00 & 512) == 512) {
            C75763dS r09 = this.A05;
            if (r09 == null) {
                r09 = C75763dS.A02;
            }
            i2 += AbstractC11750gu.A08(10, r09);
        }
        if ((this.A00 & 1024) == 1024) {
            C75803dW r010 = this.A07;
            if (r010 == null) {
                r010 = C75803dW.A03;
            }
            i2 += AbstractC11750gu.A08(11, r010);
        }
        if ((this.A00 & 2048) == 2048) {
            C76413eV r011 = this.A0Q;
            if (r011 == null) {
                r011 = C76413eV.A09;
            }
            i2 += AbstractC11750gu.A08(12, r011);
        }
        if ((this.A00 & 4096) == 4096) {
            C75843da r012 = this.A09;
            if (r012 == null) {
                r012 = C75843da.A04;
            }
            i2 += AbstractC11750gu.A08(13, r012);
        }
        if ((this.A00 & 8192) == 8192) {
            C76103e0 r013 = this.A0H;
            if (r013 == null) {
                r013 = C76103e0.A0A;
            }
            i2 += AbstractC11750gu.A08(14, r013);
        }
        if ((this.A00 & 16384) == 16384) {
            C76473eb r014 = this.A0T;
            if (r014 == null) {
                r014 = C76473eb.A03;
            }
            i2 += AbstractC11750gu.A08(15, r014);
        }
        if ((this.A00 & 32768) == 32768) {
            C76453eZ r015 = this.A0S;
            if (r015 == null) {
                r015 = C76453eZ.A03;
            }
            i2 += AbstractC11750gu.A08(16, r015);
        }
        if ((this.A00 & 65536) == 65536) {
            C02890Dw r016 = this.A0M;
            if (r016 == null) {
                r016 = C02890Dw.A0B;
            }
            i2 += AbstractC11750gu.A08(18, r016);
        }
        if ((this.A00 & 131072) == 131072) {
            C76433eX r017 = this.A0R;
            if (r017 == null) {
                r017 = C76433eX.A06;
            }
            i2 += AbstractC11750gu.A08(22, r017);
        }
        if ((this.A00 & 262144) == 262144) {
            C75863dc r018 = this.A0A;
            if (r018 == null) {
                r018 = C75863dc.A02;
            }
            i2 += AbstractC11750gu.A08(23, r018);
        }
        if ((this.A00 & 524288) == 524288) {
            C75783dU r019 = this.A06;
            if (r019 == null) {
                r019 = C75783dU.A02;
            }
            i2 += AbstractC11750gu.A08(24, r019);
        }
        if ((this.A00 & 1048576) == 1048576) {
            AnonymousClass0OG r020 = this.A0X;
            if (r020 == null) {
                r020 = AnonymousClass0OG.A05;
            }
            i2 += AbstractC11750gu.A08(25, r020);
        }
        if ((this.A00 & 2097152) == 2097152) {
            C76493ed r021 = this.A0V;
            if (r021 == null) {
                r021 = C76493ed.A0G;
            }
            i2 += AbstractC11750gu.A08(26, r021);
        }
        if ((this.A00 & 4194304) == 4194304) {
            C75983do r022 = this.A0G;
            if (r022 == null) {
                r022 = C75983do.A08;
            }
            i2 += AbstractC11750gu.A08(28, r022);
        }
        if ((this.A00 & 8388608) == 8388608) {
            C76513ef r023 = this.A0W;
            if (r023 == null) {
                r023 = C76513ef.A05;
            }
            i2 += AbstractC11750gu.A08(29, r023);
        }
        if ((this.A00 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            C76393eT r024 = this.A0P;
            if (r024 == null) {
                r024 = C76393eT.A05;
            }
            i2 += AbstractC11750gu.A08(30, r024);
        }
        if ((this.A00 & 33554432) == 33554432) {
            C75903dg r025 = this.A0B;
            if (r025 == null) {
                r025 = C75903dg.A05;
            }
            i2 += AbstractC11750gu.A08(31, r025);
        }
        if ((this.A00 & 67108864) == 67108864) {
            C76583em r026 = this.A0Z;
            if (r026 == null) {
                r026 = C76583em.A02;
            }
            i2 += AbstractC11750gu.A08(35, r026);
        }
        if ((this.A00 & 134217728) == 134217728) {
            C76243eE r027 = this.A0K;
            if (r027 == null) {
                r027 = C76243eE.A06;
            }
            i2 += AbstractC11750gu.A08(36, r027);
        }
        if ((this.A00 & 268435456) == 268435456) {
            C75963dm r028 = this.A0F;
            if (r028 == null) {
                r028 = C75963dm.A02;
            }
            i2 += AbstractC11750gu.A08(37, r028);
        }
        if ((this.A00 & 536870912) == 536870912) {
            C76333eN r029 = this.A0O;
            if (r029 == null) {
                r029 = C76333eN.A0B;
            }
            i2 += AbstractC11750gu.A08(38, r029);
        }
        if ((this.A00 & 1073741824) == 1073741824) {
            C76283eI r030 = this.A0L;
            if (r030 == null) {
                r030 = C76283eI.A06;
            }
            i2 += AbstractC11750gu.A08(39, r030);
        }
        if ((this.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            C75963dm r031 = this.A0E;
            if (r031 == null) {
                r031 = C75963dm.A02;
            }
            i2 += AbstractC11750gu.A08(40, r031);
        }
        if ((this.A01 & 1) == 1) {
            C76183e8 r032 = this.A0J;
            if (r032 == null) {
                r032 = C76183e8.A0B;
            }
            i2 += AbstractC11750gu.A08(41, r032);
        }
        if ((this.A01 & 2) == 2) {
            C75723dO r033 = this.A03;
            if (r033 == null) {
                r033 = C75723dO.A07;
            }
            i2 += AbstractC11750gu.A08(42, r033);
        }
        if ((this.A01 & 4) == 4) {
            C75743dQ r034 = this.A04;
            if (r034 == null) {
                r034 = C75743dQ.A04;
            }
            i2 += AbstractC11750gu.A08(43, r034);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r8) {
        if ((this.A00 & 1) == 1) {
            r8.A0L(1, this.A0a);
        }
        if ((this.A00 & 2) == 2) {
            C76473eb r0 = this.A0U;
            if (r0 == null) {
                r0 = C76473eb.A03;
            }
            r8.A0K(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            C76143e4 r02 = this.A0I;
            if (r02 == null) {
                r02 = C76143e4.A0N;
            }
            r8.A0K(3, r02);
        }
        if ((this.A00 & 8) == 8) {
            C75823dY r03 = this.A08;
            if (r03 == null) {
                r03 = C75823dY.A04;
            }
            r8.A0K(4, r03);
        }
        if ((this.A00 & 16) == 16) {
            C76313eL r04 = this.A0N;
            if (r04 == null) {
                r04 = C76313eL.A0D;
            }
            r8.A0K(5, r04);
        }
        if ((this.A00 & 32) == 32) {
            C75943dk r05 = this.A0D;
            if (r05 == null) {
                r05 = C75943dk.A0D;
            }
            r8.A0K(6, r05);
        }
        if ((this.A00 & 64) == 64) {
            C75923di r06 = this.A0C;
            if (r06 == null) {
                r06 = C75923di.A0K;
            }
            r8.A0K(7, r06);
        }
        if ((this.A00 & 128) == 128) {
            C75663dI r07 = this.A02;
            if (r07 == null) {
                r07 = C75663dI.A0D;
            }
            r8.A0K(8, r07);
        }
        if ((this.A00 & 256) == 256) {
            C76563ek r08 = this.A0Y;
            if (r08 == null) {
                r08 = C76563ek.A0K;
            }
            r8.A0K(9, r08);
        }
        if ((this.A00 & 512) == 512) {
            C75763dS r09 = this.A05;
            if (r09 == null) {
                r09 = C75763dS.A02;
            }
            r8.A0K(10, r09);
        }
        if ((this.A00 & 1024) == 1024) {
            C75803dW r010 = this.A07;
            if (r010 == null) {
                r010 = C75803dW.A03;
            }
            r8.A0K(11, r010);
        }
        if ((this.A00 & 2048) == 2048) {
            C76413eV r011 = this.A0Q;
            if (r011 == null) {
                r011 = C76413eV.A09;
            }
            r8.A0K(12, r011);
        }
        if ((this.A00 & 4096) == 4096) {
            C75843da r012 = this.A09;
            if (r012 == null) {
                r012 = C75843da.A04;
            }
            r8.A0K(13, r012);
        }
        if ((this.A00 & 8192) == 8192) {
            C76103e0 r013 = this.A0H;
            if (r013 == null) {
                r013 = C76103e0.A0A;
            }
            r8.A0K(14, r013);
        }
        if ((this.A00 & 16384) == 16384) {
            C76473eb r014 = this.A0T;
            if (r014 == null) {
                r014 = C76473eb.A03;
            }
            r8.A0K(15, r014);
        }
        if ((this.A00 & 32768) == 32768) {
            C76453eZ r015 = this.A0S;
            if (r015 == null) {
                r015 = C76453eZ.A03;
            }
            r8.A0K(16, r015);
        }
        if ((this.A00 & 65536) == 65536) {
            C02890Dw r016 = this.A0M;
            if (r016 == null) {
                r016 = C02890Dw.A0B;
            }
            r8.A0K(18, r016);
        }
        if ((this.A00 & 131072) == 131072) {
            C76433eX r017 = this.A0R;
            if (r017 == null) {
                r017 = C76433eX.A06;
            }
            r8.A0K(22, r017);
        }
        if ((this.A00 & 262144) == 262144) {
            C75863dc r018 = this.A0A;
            if (r018 == null) {
                r018 = C75863dc.A02;
            }
            r8.A0K(23, r018);
        }
        if ((this.A00 & 524288) == 524288) {
            C75783dU r019 = this.A06;
            if (r019 == null) {
                r019 = C75783dU.A02;
            }
            r8.A0K(24, r019);
        }
        if ((this.A00 & 1048576) == 1048576) {
            AnonymousClass0OG r020 = this.A0X;
            if (r020 == null) {
                r020 = AnonymousClass0OG.A05;
            }
            r8.A0K(25, r020);
        }
        if ((this.A00 & 2097152) == 2097152) {
            C76493ed r021 = this.A0V;
            if (r021 == null) {
                r021 = C76493ed.A0G;
            }
            r8.A0K(26, r021);
        }
        if ((this.A00 & 4194304) == 4194304) {
            C75983do r022 = this.A0G;
            if (r022 == null) {
                r022 = C75983do.A08;
            }
            r8.A0K(28, r022);
        }
        if ((this.A00 & 8388608) == 8388608) {
            C76513ef r023 = this.A0W;
            if (r023 == null) {
                r023 = C76513ef.A05;
            }
            r8.A0K(29, r023);
        }
        if ((this.A00 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            C76393eT r024 = this.A0P;
            if (r024 == null) {
                r024 = C76393eT.A05;
            }
            r8.A0K(30, r024);
        }
        if ((this.A00 & 33554432) == 33554432) {
            C75903dg r025 = this.A0B;
            if (r025 == null) {
                r025 = C75903dg.A05;
            }
            r8.A0K(31, r025);
        }
        if ((this.A00 & 67108864) == 67108864) {
            C76583em r026 = this.A0Z;
            if (r026 == null) {
                r026 = C76583em.A02;
            }
            r8.A0K(35, r026);
        }
        if ((this.A00 & 134217728) == 134217728) {
            C76243eE r027 = this.A0K;
            if (r027 == null) {
                r027 = C76243eE.A06;
            }
            r8.A0K(36, r027);
        }
        if ((this.A00 & 268435456) == 268435456) {
            C75963dm r028 = this.A0F;
            if (r028 == null) {
                r028 = C75963dm.A02;
            }
            r8.A0K(37, r028);
        }
        if ((this.A00 & 536870912) == 536870912) {
            C76333eN r029 = this.A0O;
            if (r029 == null) {
                r029 = C76333eN.A0B;
            }
            r8.A0K(38, r029);
        }
        if ((this.A00 & 1073741824) == 1073741824) {
            C76283eI r030 = this.A0L;
            if (r030 == null) {
                r030 = C76283eI.A06;
            }
            r8.A0K(39, r030);
        }
        if ((this.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            C75963dm r031 = this.A0E;
            if (r031 == null) {
                r031 = C75963dm.A02;
            }
            r8.A0K(40, r031);
        }
        if ((this.A01 & 1) == 1) {
            C76183e8 r032 = this.A0J;
            if (r032 == null) {
                r032 = C76183e8.A0B;
            }
            r8.A0K(41, r032);
        }
        if ((this.A01 & 2) == 2) {
            C75723dO r033 = this.A03;
            if (r033 == null) {
                r033 = C75723dO.A07;
            }
            r8.A0K(42, r033);
        }
        if ((this.A01 & 4) == 4) {
            C75743dQ r034 = this.A04;
            if (r034 == null) {
                r034 = C75743dQ.A04;
            }
            r8.A0K(43, r034);
        }
        this.unknownFields.A02(r8);
    }
}
