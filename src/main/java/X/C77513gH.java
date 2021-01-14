package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.3gH  reason: invalid class name and case insensitive filesystem */
public final class C77513gH extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77513gH A0f;
    public static volatile AbstractC37151nd A0g;
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
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;

    static {
        C77513gH r0 = new C77513gH();
        A0f = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r23, Object obj, Object obj2) {
        int ordinal = r23.ordinal();
        int i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        boolean z = false;
        switch (ordinal) {
            case 0:
                return A0f;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C77513gH r10 = (C77513gH) obj2;
                int i2 = this.A00;
                boolean z2 = false;
                if ((i2 & 1) == 1) {
                    z2 = true;
                }
                int i3 = this.A0C;
                int i4 = r10.A00;
                boolean z3 = false;
                if ((i4 & 1) == 1) {
                    z3 = true;
                }
                this.A0C = r11.AR9(z2, i3, z3, r10.A0C);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                int i5 = this.A0d;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                this.A0d = r11.AR9(z4, i5, z5, r10.A0d);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                int i6 = this.A0A;
                boolean z7 = false;
                if ((i4 & 4) == 4) {
                    z7 = true;
                }
                this.A0A = r11.AR9(z6, i6, z7, r10.A0A);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                int i7 = this.A09;
                boolean z9 = false;
                if ((i4 & 8) == 8) {
                    z9 = true;
                }
                this.A09 = r11.AR9(z8, i7, z9, r10.A09);
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                int i8 = this.A03;
                boolean z11 = false;
                if ((i4 & 16) == 16) {
                    z11 = true;
                }
                this.A03 = r11.AR9(z10, i8, z11, r10.A03);
                boolean z12 = false;
                if ((i2 & 32) == 32) {
                    z12 = true;
                }
                int i9 = this.A0J;
                boolean z13 = false;
                if ((i4 & 32) == 32) {
                    z13 = true;
                }
                this.A0J = r11.AR9(z12, i9, z13, r10.A0J);
                boolean z14 = false;
                if ((i2 & 64) == 64) {
                    z14 = true;
                }
                int i10 = this.A0F;
                boolean z15 = false;
                if ((i4 & 64) == 64) {
                    z15 = true;
                }
                this.A0F = r11.AR9(z14, i10, z15, r10.A0F);
                boolean z16 = false;
                if ((i2 & 128) == 128) {
                    z16 = true;
                }
                int i11 = this.A0K;
                boolean z17 = false;
                if ((i4 & 128) == 128) {
                    z17 = true;
                }
                this.A0K = r11.AR9(z16, i11, z17, r10.A0K);
                boolean z18 = false;
                if ((i2 & 256) == 256) {
                    z18 = true;
                }
                int i12 = this.A0c;
                boolean z19 = false;
                if ((i4 & 256) == 256) {
                    z19 = true;
                }
                this.A0c = r11.AR9(z18, i12, z19, r10.A0c);
                boolean z20 = false;
                if ((i2 & 512) == 512) {
                    z20 = true;
                }
                int i13 = this.A0L;
                boolean z21 = false;
                if ((i4 & 512) == 512) {
                    z21 = true;
                }
                this.A0L = r11.AR9(z20, i13, z21, r10.A0L);
                boolean z22 = false;
                if ((i2 & 1024) == 1024) {
                    z22 = true;
                }
                int i14 = this.A0I;
                boolean z23 = false;
                if ((i4 & 1024) == 1024) {
                    z23 = true;
                }
                this.A0I = r11.AR9(z22, i14, z23, r10.A0I);
                boolean z24 = false;
                if ((i2 & 2048) == 2048) {
                    z24 = true;
                }
                int i15 = this.A0R;
                boolean z25 = false;
                if ((i4 & 2048) == 2048) {
                    z25 = true;
                }
                this.A0R = r11.AR9(z24, i15, z25, r10.A0R);
                boolean z26 = false;
                if ((i2 & 4096) == 4096) {
                    z26 = true;
                }
                int i16 = this.A0E;
                boolean z27 = false;
                if ((i4 & 4096) == 4096) {
                    z27 = true;
                }
                this.A0E = r11.AR9(z26, i16, z27, r10.A0E);
                boolean z28 = false;
                if ((i2 & 8192) == 8192) {
                    z28 = true;
                }
                int i17 = this.A0D;
                boolean z29 = false;
                if ((i4 & 8192) == 8192) {
                    z29 = true;
                }
                this.A0D = r11.AR9(z28, i17, z29, r10.A0D);
                boolean z30 = false;
                if ((i2 & 16384) == 16384) {
                    z30 = true;
                }
                int i18 = this.A0H;
                boolean z31 = false;
                if ((i4 & 16384) == 16384) {
                    z31 = true;
                }
                this.A0H = r11.AR9(z30, i18, z31, r10.A0H);
                boolean z32 = false;
                if ((i2 & 32768) == 32768) {
                    z32 = true;
                }
                int i19 = this.A0G;
                boolean z33 = false;
                if ((i4 & 32768) == 32768) {
                    z33 = true;
                }
                this.A0G = r11.AR9(z32, i19, z33, r10.A0G);
                boolean z34 = false;
                if ((i2 & 65536) == 65536) {
                    z34 = true;
                }
                int i20 = this.A0a;
                boolean z35 = false;
                if ((i4 & 65536) == 65536) {
                    z35 = true;
                }
                this.A0a = r11.AR9(z34, i20, z35, r10.A0a);
                boolean z36 = false;
                if ((i2 & 131072) == 131072) {
                    z36 = true;
                }
                int i21 = this.A0Z;
                boolean z37 = false;
                if ((i4 & 131072) == 131072) {
                    z37 = true;
                }
                this.A0Z = r11.AR9(z36, i21, z37, r10.A0Z);
                boolean z38 = false;
                if ((i2 & 262144) == 262144) {
                    z38 = true;
                }
                int i22 = this.A0Q;
                boolean z39 = false;
                if ((i4 & 262144) == 262144) {
                    z39 = true;
                }
                this.A0Q = r11.AR9(z38, i22, z39, r10.A0Q);
                boolean z40 = false;
                if ((i2 & 524288) == 524288) {
                    z40 = true;
                }
                int i23 = this.A0e;
                boolean z41 = false;
                if ((i4 & 524288) == 524288) {
                    z41 = true;
                }
                this.A0e = r11.AR9(z40, i23, z41, r10.A0e);
                boolean z42 = false;
                if ((i2 & 1048576) == 1048576) {
                    z42 = true;
                }
                int i24 = this.A0X;
                boolean z43 = false;
                if ((i4 & 1048576) == 1048576) {
                    z43 = true;
                }
                this.A0X = r11.AR9(z42, i24, z43, r10.A0X);
                boolean z44 = false;
                if ((i2 & 2097152) == 2097152) {
                    z44 = true;
                }
                int i25 = this.A06;
                boolean z45 = false;
                if ((i4 & 2097152) == 2097152) {
                    z45 = true;
                }
                this.A06 = r11.AR9(z44, i25, z45, r10.A06);
                boolean z46 = false;
                if ((i2 & 4194304) == 4194304) {
                    z46 = true;
                }
                int i26 = this.A0B;
                boolean z47 = false;
                if ((i4 & 4194304) == 4194304) {
                    z47 = true;
                }
                this.A0B = r11.AR9(z46, i26, z47, r10.A0B);
                boolean z48 = false;
                if ((i2 & 8388608) == 8388608) {
                    z48 = true;
                }
                int i27 = this.A0O;
                boolean z49 = false;
                if ((i4 & 8388608) == 8388608) {
                    z49 = true;
                }
                this.A0O = r11.AR9(z48, i27, z49, r10.A0O);
                boolean z50 = false;
                if ((i2 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
                    z50 = true;
                }
                int i28 = this.A02;
                boolean z51 = false;
                if ((i4 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
                    z51 = true;
                }
                this.A02 = r11.AR9(z50, i28, z51, r10.A02);
                boolean z52 = false;
                if ((i2 & 33554432) == 33554432) {
                    z52 = true;
                }
                int i29 = this.A0P;
                boolean z53 = false;
                if ((i4 & 33554432) == 33554432) {
                    z53 = true;
                }
                this.A0P = r11.AR9(z52, i29, z53, r10.A0P);
                boolean z54 = false;
                if ((i2 & 67108864) == 67108864) {
                    z54 = true;
                }
                int i30 = this.A0b;
                boolean z55 = false;
                if ((i4 & 67108864) == 67108864) {
                    z55 = true;
                }
                this.A0b = r11.AR9(z54, i30, z55, r10.A0b);
                boolean z56 = false;
                if ((i2 & 134217728) == 134217728) {
                    z56 = true;
                }
                int i31 = this.A0W;
                boolean z57 = false;
                if ((i4 & 134217728) == 134217728) {
                    z57 = true;
                }
                this.A0W = r11.AR9(z56, i31, z57, r10.A0W);
                boolean z58 = false;
                if ((i2 & 268435456) == 268435456) {
                    z58 = true;
                }
                int i32 = this.A0V;
                boolean z59 = false;
                if ((i4 & 268435456) == 268435456) {
                    z59 = true;
                }
                this.A0V = r11.AR9(z58, i32, z59, r10.A0V);
                boolean z60 = false;
                if ((i2 & 536870912) == 536870912) {
                    z60 = true;
                }
                int i33 = this.A05;
                boolean z61 = false;
                if ((i4 & 536870912) == 536870912) {
                    z61 = true;
                }
                this.A05 = r11.AR9(z60, i33, z61, r10.A05);
                boolean z62 = false;
                if ((i2 & 1073741824) == 1073741824) {
                    z62 = true;
                }
                int i34 = this.A04;
                boolean z63 = false;
                if ((i4 & 1073741824) == 1073741824) {
                    z63 = true;
                }
                this.A04 = r11.AR9(z62, i34, z63, r10.A04);
                boolean z64 = false;
                if ((i2 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
                    z64 = true;
                }
                int i35 = this.A0M;
                boolean z65 = false;
                if ((i4 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
                    z65 = true;
                }
                this.A0M = r11.AR9(z64, i35, z65, r10.A0M);
                int i36 = this.A01;
                boolean z66 = true;
                boolean z67 = false;
                if ((i36 & 1) == 1) {
                    z67 = true;
                }
                int i37 = this.A0U;
                int i38 = r10.A01;
                boolean z68 = false;
                if ((i38 & 1) == 1) {
                    z68 = true;
                }
                this.A0U = r11.AR9(z67, i37, z68, r10.A0U);
                boolean z69 = false;
                if ((i36 & 2) == 2) {
                    z69 = true;
                }
                int i39 = this.A0N;
                boolean z70 = false;
                if ((i38 & 2) == 2) {
                    z70 = true;
                }
                this.A0N = r11.AR9(z69, i39, z70, r10.A0N);
                boolean z71 = false;
                if ((i36 & 4) == 4) {
                    z71 = true;
                }
                int i40 = this.A0Y;
                boolean z72 = false;
                if ((i38 & 4) == 4) {
                    z72 = true;
                }
                this.A0Y = r11.AR9(z71, i40, z72, r10.A0Y);
                boolean z73 = false;
                if ((i36 & 8) == 8) {
                    z73 = true;
                }
                int i41 = this.A0T;
                boolean z74 = false;
                if ((i38 & 8) == 8) {
                    z74 = true;
                }
                this.A0T = r11.AR9(z73, i41, z74, r10.A0T);
                boolean z75 = false;
                if ((i36 & 16) == 16) {
                    z75 = true;
                }
                int i42 = this.A0S;
                boolean z76 = false;
                if ((i38 & 16) == 16) {
                    z76 = true;
                }
                this.A0S = r11.AR9(z75, i42, z76, r10.A0S);
                boolean z77 = false;
                if ((i36 & 32) == 32) {
                    z77 = true;
                }
                int i43 = this.A08;
                boolean z78 = false;
                if ((i38 & 32) == 32) {
                    z78 = true;
                }
                this.A08 = r11.AR9(z77, i43, z78, r10.A08);
                boolean z79 = false;
                if ((i36 & 64) == 64) {
                    z79 = true;
                }
                int i44 = this.A07;
                if ((i38 & 64) != 64) {
                    z66 = false;
                }
                this.A07 = r11.AR9(z79, i44, z66, r10.A07);
                if (r11 == C04980Mp.A00) {
                    this.A00 = i2 | i4;
                    this.A01 = i36 | i38;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r112.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 8:
                                int A022 = r112.A02();
                                if (EnumC70043Jn.A00(A022) == null) {
                                    super.A0D(1, A022);
                                    continue;
                                } else {
                                    this.A00 |= 1;
                                    this.A0C = A022;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                                int A023 = r112.A02();
                                if (EnumC70043Jn.A00(A023) == null) {
                                    super.A0D(2, A023);
                                    continue;
                                } else {
                                    this.A00 |= 2;
                                    this.A0d = A023;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 24:
                                int A024 = r112.A02();
                                if (EnumC70043Jn.A00(A024) == null) {
                                    super.A0D(3, A024);
                                    continue;
                                } else {
                                    this.A00 |= 4;
                                    this.A0A = A024;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                int A025 = r112.A02();
                                if (EnumC70043Jn.A00(A025) == null) {
                                    super.A0D(4, A025);
                                    continue;
                                } else {
                                    this.A00 |= 8;
                                    this.A09 = A025;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 40:
                                int A026 = r112.A02();
                                if (EnumC70043Jn.A00(A026) == null) {
                                    super.A0D(5, A026);
                                    continue;
                                } else {
                                    this.A00 |= 16;
                                    this.A03 = A026;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 48:
                                int A027 = r112.A02();
                                if (EnumC70043Jn.A00(A027) == null) {
                                    super.A0D(6, A027);
                                    continue;
                                } else {
                                    this.A00 |= 32;
                                    this.A0J = A027;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 56:
                                int A028 = r112.A02();
                                if (EnumC70043Jn.A00(A028) == null) {
                                    super.A0D(7, A028);
                                    continue;
                                } else {
                                    this.A00 |= 64;
                                    this.A0F = A028;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 64:
                                int A029 = r112.A02();
                                if (EnumC70043Jn.A00(A029) == null) {
                                    super.A0D(8, A029);
                                    continue;
                                } else {
                                    this.A00 |= 128;
                                    this.A0K = A029;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case AnonymousClass0PW.A02:
                                int A0210 = r112.A02();
                                if (EnumC70043Jn.A00(A0210) == null) {
                                    super.A0D(9, A0210);
                                    continue;
                                } else {
                                    this.A00 |= 256;
                                    this.A0c = A0210;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 80:
                                int A0211 = r112.A02();
                                if (EnumC70043Jn.A00(A0211) == null) {
                                    super.A0D(10, A0211);
                                    continue;
                                } else {
                                    this.A00 |= 512;
                                    this.A0L = A0211;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 88:
                                int A0212 = r112.A02();
                                if (EnumC70043Jn.A00(A0212) == null) {
                                    super.A0D(11, A0212);
                                    continue;
                                } else {
                                    this.A00 |= 1024;
                                    this.A0I = A0212;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 96:
                                int A0213 = r112.A02();
                                if (EnumC70043Jn.A00(A0213) == null) {
                                    super.A0D(12, A0213);
                                    continue;
                                } else {
                                    this.A00 |= 2048;
                                    this.A0R = A0213;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 104:
                                int A0214 = r112.A02();
                                if (EnumC70043Jn.A00(A0214) == null) {
                                    super.A0D(13, A0214);
                                    continue;
                                } else {
                                    this.A00 |= 4096;
                                    this.A0E = A0214;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 112:
                                int A0215 = r112.A02();
                                if (EnumC70043Jn.A00(A0215) == null) {
                                    super.A0D(14, A0215);
                                    continue;
                                } else {
                                    this.A00 |= 8192;
                                    this.A0D = A0215;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 120:
                                int A0216 = r112.A02();
                                if (EnumC70043Jn.A00(A0216) == null) {
                                    super.A0D(15, A0216);
                                    continue;
                                } else {
                                    this.A00 |= 16384;
                                    this.A0H = A0216;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*{ENCODED_INT: 144}*/:
                                int A0217 = r112.A02();
                                if (EnumC70043Jn.A00(A0217) == null) {
                                    super.A0D(18, A0217);
                                    continue;
                                } else {
                                    this.A00 |= 32768;
                                    this.A0G = A0217;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 152:
                                int A0218 = r112.A02();
                                if (EnumC70043Jn.A00(A0218) == null) {
                                    super.A0D(19, A0218);
                                    continue;
                                } else {
                                    this.A00 |= 65536;
                                    this.A0a = A0218;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 160:
                                int A0219 = r112.A02();
                                if (EnumC70043Jn.A00(A0219) == null) {
                                    super.A0D(20, A0219);
                                    continue;
                                } else {
                                    this.A00 |= 131072;
                                    this.A0Z = A0219;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 168:
                                int A0220 = r112.A02();
                                if (EnumC70043Jn.A00(A0220) == null) {
                                    super.A0D(21, A0220);
                                    continue;
                                } else {
                                    this.A00 |= 262144;
                                    this.A0Q = A0220;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*{ENCODED_INT: 176}*/:
                                int A0221 = r112.A02();
                                if (EnumC70043Jn.A00(A0221) == null) {
                                    super.A0D(22, A0221);
                                    continue;
                                } else {
                                    this.A00 |= 524288;
                                    this.A0e = A0221;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 184:
                                int A0222 = r112.A02();
                                if (EnumC70043Jn.A00(A0222) == null) {
                                    super.A0D(23, A0222);
                                    continue;
                                } else {
                                    this.A00 |= 1048576;
                                    this.A0X = A0222;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 192:
                                int A0223 = r112.A02();
                                if (EnumC70043Jn.A00(A0223) == null) {
                                    super.A0D(24, A0223);
                                    continue;
                                } else {
                                    this.A00 |= 2097152;
                                    this.A06 = A0223;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 200:
                                int A0224 = r112.A02();
                                if (EnumC70043Jn.A00(A0224) == null) {
                                    super.A0D(25, A0224);
                                    continue;
                                } else {
                                    this.A00 |= 4194304;
                                    this.A0B = A0224;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 208:
                                int A0225 = r112.A02();
                                if (EnumC70043Jn.A00(A0225) == null) {
                                    super.A0D(26, A0225);
                                    continue;
                                } else {
                                    this.A00 |= 8388608;
                                    this.A0O = A0225;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 216:
                                int A0226 = r112.A02();
                                if (EnumC70043Jn.A00(A0226) == null) {
                                    super.A0D(27, A0226);
                                    continue;
                                } else {
                                    this.A00 |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                    this.A02 = A0226;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 224:
                                int A0227 = r112.A02();
                                if (EnumC70043Jn.A00(A0227) == null) {
                                    super.A0D(28, A0227);
                                    continue;
                                } else {
                                    this.A00 |= 33554432;
                                    this.A0P = A0227;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 232:
                                int A0228 = r112.A02();
                                if (EnumC70043Jn.A00(A0228) == null) {
                                    super.A0D(29, A0228);
                                    continue;
                                } else {
                                    this.A00 |= 67108864;
                                    this.A0b = A0228;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 240:
                                int A0229 = r112.A02();
                                if (EnumC70043Jn.A00(A0229) == null) {
                                    super.A0D(30, A0229);
                                    continue;
                                } else {
                                    this.A00 |= 134217728;
                                    this.A0W = A0229;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 248:
                                int A0230 = r112.A02();
                                if (EnumC70043Jn.A00(A0230) == null) {
                                    super.A0D(31, A0230);
                                    continue;
                                } else {
                                    this.A00 |= 268435456;
                                    this.A0V = A0230;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 256:
                                int A0231 = r112.A02();
                                if (EnumC70043Jn.A00(A0231) == null) {
                                    super.A0D(32, A0231);
                                    continue;
                                } else {
                                    this.A00 |= 536870912;
                                    this.A05 = A0231;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 264:
                                int A0232 = r112.A02();
                                if (EnumC70043Jn.A00(A0232) == null) {
                                    super.A0D(33, A0232);
                                    continue;
                                } else {
                                    this.A00 |= 1073741824;
                                    this.A04 = A0232;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 272:
                                int A0233 = r112.A02();
                                if (EnumC70043Jn.A00(A0233) == null) {
                                    super.A0D(34, A0233);
                                    continue;
                                } else {
                                    this.A00 |= i;
                                    this.A0M = A0233;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 280:
                                int A0234 = r112.A02();
                                if (EnumC70043Jn.A00(A0234) == null) {
                                    super.A0D(35, A0234);
                                    continue;
                                } else {
                                    this.A01 |= 1;
                                    this.A0U = A0234;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 288:
                                int A0235 = r112.A02();
                                if (EnumC70043Jn.A00(A0235) == null) {
                                    super.A0D(36, A0235);
                                    continue;
                                } else {
                                    this.A01 |= 2;
                                    this.A0N = A0235;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 296:
                                int A0236 = r112.A02();
                                if (EnumC70043Jn.A00(A0236) == null) {
                                    super.A0D(37, A0236);
                                    continue;
                                } else {
                                    this.A01 |= 4;
                                    this.A0Y = A0236;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 304:
                                int A0237 = r112.A02();
                                if (EnumC70043Jn.A00(A0237) == null) {
                                    super.A0D(38, A0237);
                                    continue;
                                } else {
                                    this.A01 |= 8;
                                    this.A0T = A0237;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 312:
                                int A0238 = r112.A02();
                                if (EnumC70043Jn.A00(A0238) == null) {
                                    super.A0D(39, A0238);
                                    continue;
                                } else {
                                    this.A01 |= 16;
                                    this.A0S = A0238;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 320:
                                int A0239 = r112.A02();
                                if (EnumC70043Jn.A00(A0239) == null) {
                                    super.A0D(40, A0239);
                                    continue;
                                } else {
                                    this.A01 |= 32;
                                    this.A08 = A0239;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            case 328:
                                int A0240 = r112.A02();
                                if (EnumC70043Jn.A00(A0240) == null) {
                                    super.A0D(41, A0240);
                                    continue;
                                } else {
                                    this.A01 |= 64;
                                    this.A07 = A0240;
                                }
                                i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                            default:
                                if (!A0G(A032, r112)) {
                                    break;
                                } else {
                                    continue;
                                    i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                                }
                        }
                        z = true;
                        i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r1 = new C04190Jk(e2.getMessage());
                        r1.unfinishedMessage = this;
                        throw new RuntimeException(r1);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C77513gH();
            case 5:
                return new C77503gG();
            case 6:
                break;
            case 7:
                if (A0g == null) {
                    synchronized (C77513gH.class) {
                        if (A0g == null) {
                            A0g = new AnonymousClass275(A0f);
                        }
                    }
                }
                return A0g;
            default:
                throw new UnsupportedOperationException();
        }
        return A0f;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A02(1, this.A0C);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A02(2, this.A0d);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A02(3, this.A0A);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A02(4, this.A09);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A02(5, this.A03);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A02(6, this.A0J);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A02(7, this.A0F);
        }
        if ((i3 & 128) == 128) {
            i2 += AbstractC11750gu.A02(8, this.A0K);
        }
        if ((i3 & 256) == 256) {
            i2 += AbstractC11750gu.A02(9, this.A0c);
        }
        if ((i3 & 512) == 512) {
            i2 += AbstractC11750gu.A02(10, this.A0L);
        }
        if ((i3 & 1024) == 1024) {
            i2 += AbstractC11750gu.A02(11, this.A0I);
        }
        if ((i3 & 2048) == 2048) {
            i2 += AbstractC11750gu.A02(12, this.A0R);
        }
        if ((i3 & 4096) == 4096) {
            i2 += AbstractC11750gu.A02(13, this.A0E);
        }
        if ((i3 & 8192) == 8192) {
            i2 += AbstractC11750gu.A02(14, this.A0D);
        }
        if ((i3 & 16384) == 16384) {
            i2 += AbstractC11750gu.A02(15, this.A0H);
        }
        if ((i3 & 32768) == 32768) {
            i2 += AbstractC11750gu.A02(18, this.A0G);
        }
        if ((i3 & 65536) == 65536) {
            i2 += AbstractC11750gu.A02(19, this.A0a);
        }
        if ((i3 & 131072) == 131072) {
            i2 += AbstractC11750gu.A02(20, this.A0Z);
        }
        if ((i3 & 262144) == 262144) {
            i2 += AbstractC11750gu.A02(21, this.A0Q);
        }
        if ((i3 & 524288) == 524288) {
            i2 += AbstractC11750gu.A02(22, this.A0e);
        }
        if ((i3 & 1048576) == 1048576) {
            i2 += AbstractC11750gu.A02(23, this.A0X);
        }
        if ((i3 & 2097152) == 2097152) {
            i2 += AbstractC11750gu.A02(24, this.A06);
        }
        if ((i3 & 4194304) == 4194304) {
            i2 += AbstractC11750gu.A02(25, this.A0B);
        }
        if ((i3 & 8388608) == 8388608) {
            i2 += AbstractC11750gu.A02(26, this.A0O);
        }
        if ((i3 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            i2 += AbstractC11750gu.A02(27, this.A02);
        }
        if ((i3 & 33554432) == 33554432) {
            i2 += AbstractC11750gu.A02(28, this.A0P);
        }
        if ((i3 & 67108864) == 67108864) {
            i2 += AbstractC11750gu.A02(29, this.A0b);
        }
        if ((i3 & 134217728) == 134217728) {
            i2 += AbstractC11750gu.A02(30, this.A0W);
        }
        if ((i3 & 268435456) == 268435456) {
            i2 += AbstractC11750gu.A02(31, this.A0V);
        }
        if ((i3 & 536870912) == 536870912) {
            i2 += AbstractC11750gu.A02(32, this.A05);
        }
        if ((i3 & 1073741824) == 1073741824) {
            i2 += AbstractC11750gu.A02(33, this.A04);
        }
        if ((i3 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            i2 += AbstractC11750gu.A02(34, this.A0M);
        }
        int i4 = this.A01;
        if ((i4 & 1) == 1) {
            i2 += AbstractC11750gu.A02(35, this.A0U);
        }
        if ((i4 & 2) == 2) {
            i2 += AbstractC11750gu.A02(36, this.A0N);
        }
        if ((i4 & 4) == 4) {
            i2 += AbstractC11750gu.A02(37, this.A0Y);
        }
        if ((i4 & 8) == 8) {
            i2 += AbstractC11750gu.A02(38, this.A0T);
        }
        if ((i4 & 16) == 16) {
            i2 += AbstractC11750gu.A02(39, this.A0S);
        }
        if ((i4 & 32) == 32) {
            i2 += AbstractC11750gu.A02(40, this.A08);
        }
        if ((i4 & 64) == 64) {
            i2 += AbstractC11750gu.A02(41, this.A07);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r10) {
        if ((this.A00 & 1) == 1) {
            r10.A0E(1, this.A0C);
        }
        if ((this.A00 & 2) == 2) {
            r10.A0E(2, this.A0d);
        }
        if ((this.A00 & 4) == 4) {
            r10.A0E(3, this.A0A);
        }
        if ((this.A00 & 8) == 8) {
            r10.A0E(4, this.A09);
        }
        if ((this.A00 & 16) == 16) {
            r10.A0E(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            r10.A0E(6, this.A0J);
        }
        if ((this.A00 & 64) == 64) {
            r10.A0E(7, this.A0F);
        }
        if ((this.A00 & 128) == 128) {
            r10.A0E(8, this.A0K);
        }
        if ((this.A00 & 256) == 256) {
            r10.A0E(9, this.A0c);
        }
        if ((this.A00 & 512) == 512) {
            r10.A0E(10, this.A0L);
        }
        if ((this.A00 & 1024) == 1024) {
            r10.A0E(11, this.A0I);
        }
        if ((this.A00 & 2048) == 2048) {
            r10.A0E(12, this.A0R);
        }
        if ((this.A00 & 4096) == 4096) {
            r10.A0E(13, this.A0E);
        }
        if ((this.A00 & 8192) == 8192) {
            r10.A0E(14, this.A0D);
        }
        if ((this.A00 & 16384) == 16384) {
            r10.A0E(15, this.A0H);
        }
        if ((this.A00 & 32768) == 32768) {
            r10.A0E(18, this.A0G);
        }
        if ((this.A00 & 65536) == 65536) {
            r10.A0E(19, this.A0a);
        }
        if ((this.A00 & 131072) == 131072) {
            r10.A0E(20, this.A0Z);
        }
        if ((this.A00 & 262144) == 262144) {
            r10.A0E(21, this.A0Q);
        }
        if ((this.A00 & 524288) == 524288) {
            r10.A0E(22, this.A0e);
        }
        if ((this.A00 & 1048576) == 1048576) {
            r10.A0E(23, this.A0X);
        }
        if ((this.A00 & 2097152) == 2097152) {
            r10.A0E(24, this.A06);
        }
        if ((this.A00 & 4194304) == 4194304) {
            r10.A0E(25, this.A0B);
        }
        if ((this.A00 & 8388608) == 8388608) {
            r10.A0E(26, this.A0O);
        }
        if ((this.A00 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            r10.A0E(27, this.A02);
        }
        if ((this.A00 & 33554432) == 33554432) {
            r10.A0E(28, this.A0P);
        }
        if ((this.A00 & 67108864) == 67108864) {
            r10.A0E(29, this.A0b);
        }
        if ((this.A00 & 134217728) == 134217728) {
            r10.A0E(30, this.A0W);
        }
        if ((this.A00 & 268435456) == 268435456) {
            r10.A0E(31, this.A0V);
        }
        if ((this.A00 & 536870912) == 536870912) {
            r10.A0E(32, this.A05);
        }
        if ((this.A00 & 1073741824) == 1073741824) {
            r10.A0E(33, this.A04);
        }
        if ((this.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            r10.A0E(34, this.A0M);
        }
        if ((this.A01 & 1) == 1) {
            r10.A0E(35, this.A0U);
        }
        if ((this.A01 & 2) == 2) {
            r10.A0E(36, this.A0N);
        }
        if ((this.A01 & 4) == 4) {
            r10.A0E(37, this.A0Y);
        }
        if ((this.A01 & 8) == 8) {
            r10.A0E(38, this.A0T);
        }
        if ((this.A01 & 16) == 16) {
            r10.A0E(39, this.A0S);
        }
        if ((this.A01 & 32) == 32) {
            r10.A0E(40, this.A08);
        }
        if ((this.A01 & 64) == 64) {
            r10.A0E(41, this.A07);
        }
        this.unknownFields.A02(r10);
    }
}
