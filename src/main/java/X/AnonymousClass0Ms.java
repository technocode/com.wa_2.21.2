package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.0Ms  reason: invalid class name */
public final class AnonymousClass0Ms extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0Ms A0T;
    public static volatile AbstractC37151nd A0U;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 1;
    public long A07;
    public long A08;
    public AnonymousClass071 A09 = AnonymousClass071.A01;
    public AbstractC04120Jd A0A;
    public AbstractC04120Jd A0B;
    public C02890Dw A0C;
    public C02840Dr A0D;
    public AnonymousClass0N3 A0E;
    public C77493gF A0F;
    public C77493gF A0G;
    public String A0H = "";
    public String A0I = "";
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;

    static {
        AnonymousClass0Ms r0 = new AnonymousClass0Ms();
        A0T = r0;
        r0.A0C();
    }

    public AnonymousClass0Ms() {
        C05030Mw r0 = C05030Mw.A01;
        this.A0B = r0;
        this.A0A = r0;
        this.A0J = "";
    }

    public static void A08(AnonymousClass0Ms r1, AnonymousClass0N3 r2) {
        if (r2 != null) {
            r1.A0E = r2;
            r1.A01 |= 1;
            return;
        }
        throw null;
    }

    public static void A09(AnonymousClass0Ms r1, EnumC449722j r2) {
        if (r2 != null) {
            r1.A01 |= 8192;
            r1.A05 = r2.value;
            return;
        }
        throw null;
    }

    public static void A0A(AnonymousClass0Ms r2, String str) {
        if (str != null) {
            AbstractC04120Jd r1 = r2.A0B;
            if (!((AbstractC05040Mx) r1).A00) {
                r1 = AnonymousClass078.A04(r1);
                r2.A0B = r1;
            }
            r1.add(str);
            return;
        }
        throw null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r23, Object obj, Object obj2) {
        EnumC70053Jo r0;
        C77483gE r1;
        C76293eJ r12;
        C77483gE r13;
        EnumC449722j r02;
        EnumC70063Jp r03;
        C04970Mo r14;
        AnonymousClass0NK r15;
        int ordinal = r23.ordinal();
        int i = 4194304;
        int i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        switch (ordinal) {
            case 0:
                byte b = this.A00;
                if (b == 1) {
                    return A0T;
                }
                if (b == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z = false;
                if ((this.A01 & 1) == 1) {
                    z = true;
                }
                if (!z) {
                    if (booleanValue) {
                        this.A00 = 0;
                    }
                    return null;
                }
                if (booleanValue) {
                    this.A00 = 1;
                }
                return A0T;
            case 1:
                AbstractC05000Mr r152 = (AbstractC05000Mr) obj;
                AnonymousClass0Ms r5 = (AnonymousClass0Ms) obj2;
                this.A0E = (AnonymousClass0N3) r152.ARD(this.A0E, r5.A0E);
                this.A0D = (C02840Dr) r152.ARD(this.A0D, r5.A0D);
                int i3 = this.A01;
                boolean z2 = false;
                if ((i3 & 4) == 4) {
                    z2 = true;
                }
                long j = this.A08;
                int i4 = r5.A01;
                boolean z3 = false;
                if ((i4 & 4) == 4) {
                    z3 = true;
                }
                this.A08 = r152.ARC(z2, j, z3, r5.A08);
                boolean z4 = false;
                if ((i3 & 8) == 8) {
                    z4 = true;
                }
                int i5 = this.A06;
                boolean z5 = false;
                if ((i4 & 8) == 8) {
                    z5 = true;
                }
                this.A06 = r152.AR9(z4, i5, z5, r5.A06);
                boolean z6 = false;
                if ((i3 & 16) == 16) {
                    z6 = true;
                }
                String str = this.A0H;
                boolean z7 = false;
                if ((i4 & 16) == 16) {
                    z7 = true;
                }
                this.A0H = r152.ARH(z6, str, z7, r5.A0H);
                boolean z8 = false;
                if ((i3 & 32) == 32) {
                    z8 = true;
                }
                boolean z9 = this.A0O;
                boolean z10 = false;
                if ((i4 & 32) == 32) {
                    z10 = true;
                }
                this.A0O = r152.AR5(z8, z9, z10, r5.A0O);
                boolean z11 = false;
                if ((i3 & 64) == 64) {
                    z11 = true;
                }
                boolean z12 = this.A0Q;
                boolean z13 = false;
                if ((i4 & 64) == 64) {
                    z13 = true;
                }
                this.A0Q = r152.AR5(z11, z12, z13, r5.A0Q);
                boolean z14 = false;
                if ((i3 & 128) == 128) {
                    z14 = true;
                }
                boolean z15 = this.A0K;
                boolean z16 = false;
                if ((i4 & 128) == 128) {
                    z16 = true;
                }
                this.A0K = r152.AR5(z14, z15, z16, r5.A0K);
                boolean z17 = false;
                if ((i3 & 256) == 256) {
                    z17 = true;
                }
                String str2 = this.A0I;
                boolean z18 = false;
                if ((i4 & 256) == 256) {
                    z18 = true;
                }
                this.A0I = r152.ARH(z17, str2, z18, r5.A0I);
                boolean z19 = false;
                if ((i3 & 512) == 512) {
                    z19 = true;
                }
                AnonymousClass071 r10 = this.A09;
                boolean z20 = false;
                if ((i4 & 512) == 512) {
                    z20 = true;
                }
                this.A09 = r152.AR6(z19, r10, z20, r5.A09);
                int i6 = this.A01;
                boolean z21 = false;
                if ((i6 & 1024) == 1024) {
                    z21 = true;
                }
                boolean z22 = this.A0P;
                int i7 = r5.A01;
                boolean z23 = false;
                if ((i7 & 1024) == 1024) {
                    z23 = true;
                }
                this.A0P = r152.AR5(z21, z22, z23, r5.A0P);
                boolean z24 = false;
                if ((i6 & 2048) == 2048) {
                    z24 = true;
                }
                boolean z25 = this.A0S;
                boolean z26 = false;
                if ((i7 & 2048) == 2048) {
                    z26 = true;
                }
                this.A0S = r152.AR5(z24, z25, z26, r5.A0S);
                boolean z27 = false;
                if ((i6 & 4096) == 4096) {
                    z27 = true;
                }
                boolean z28 = this.A0R;
                boolean z29 = false;
                if ((i7 & 4096) == 4096) {
                    z29 = true;
                }
                this.A0R = r152.AR5(z27, z28, z29, r5.A0R);
                boolean z30 = false;
                if ((i6 & 8192) == 8192) {
                    z30 = true;
                }
                int i8 = this.A05;
                boolean z31 = false;
                if ((i7 & 8192) == 8192) {
                    z31 = true;
                }
                this.A05 = r152.AR9(z30, i8, z31, r5.A05);
                boolean z32 = false;
                if ((i6 & 16384) == 16384) {
                    z32 = true;
                }
                boolean z33 = this.A0L;
                boolean z34 = false;
                if ((i7 & 16384) == 16384) {
                    z34 = true;
                }
                this.A0L = r152.AR5(z32, z33, z34, r5.A0L);
                this.A0B = r152.ARB(this.A0B, r5.A0B);
                boolean z35 = false;
                if ((this.A01 & 32768) == 32768) {
                    z35 = true;
                }
                int i9 = this.A03;
                boolean z36 = false;
                if ((r5.A01 & 32768) == 32768) {
                    z36 = true;
                }
                this.A03 = r152.AR9(z35, i9, z36, r5.A03);
                this.A0A = r152.ARB(this.A0A, r5.A0A);
                this.A0F = (C77493gF) r152.ARD(this.A0F, r5.A0F);
                this.A0C = (C02890Dw) r152.ARD(this.A0C, r5.A0C);
                this.A0G = (C77493gF) r152.ARD(this.A0G, r5.A0G);
                int i10 = this.A01;
                boolean z37 = false;
                if ((i10 & 524288) == 524288) {
                    z37 = true;
                }
                long j2 = this.A07;
                int i11 = r5.A01;
                boolean z38 = false;
                if ((i11 & 524288) == 524288) {
                    z38 = true;
                }
                this.A07 = r152.ARC(z37, j2, z38, r5.A07);
                boolean z39 = false;
                if ((i10 & 1048576) == 1048576) {
                    z39 = true;
                }
                int i12 = this.A04;
                boolean z40 = false;
                if ((i11 & 1048576) == 1048576) {
                    z40 = true;
                }
                this.A04 = r152.AR9(z39, i12, z40, r5.A04);
                boolean z41 = false;
                if ((i10 & 2097152) == 2097152) {
                    z41 = true;
                }
                boolean z42 = this.A0M;
                boolean z43 = false;
                if ((i11 & 2097152) == 2097152) {
                    z43 = true;
                }
                this.A0M = r152.AR5(z41, z42, z43, r5.A0M);
                boolean z44 = false;
                if ((i10 & 4194304) == 4194304) {
                    z44 = true;
                }
                boolean z45 = this.A0N;
                boolean z46 = false;
                if ((i11 & 4194304) == 4194304) {
                    z46 = true;
                }
                this.A0N = r152.AR5(z44, z45, z46, r5.A0N);
                boolean z47 = false;
                if ((i10 & 8388608) == 8388608) {
                    z47 = true;
                }
                int i13 = this.A02;
                boolean z48 = false;
                if ((i11 & 8388608) == 8388608) {
                    z48 = true;
                }
                this.A02 = r152.AR9(z47, i13, z48, r5.A02);
                boolean z49 = false;
                if ((i10 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
                    z49 = true;
                }
                String str3 = this.A0J;
                boolean z50 = false;
                if ((i11 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
                    z50 = true;
                }
                this.A0J = r152.ARH(z49, str3, z50, r5.A0J);
                if (r152 == C04980Mp.A00) {
                    this.A01 = i10 | i11;
                }
                return this;
            case 2:
                C05010Mt r153 = (C05010Mt) obj;
                AnonymousClass1FL r52 = (AnonymousClass1FL) obj2;
                boolean z51 = false;
                while (!z51) {
                    try {
                        int A032 = r153.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                if ((this.A01 & 1) == 1) {
                                    r15 = (AnonymousClass0NK) this.A0E.AQb();
                                } else {
                                    r15 = null;
                                }
                                AnonymousClass0N3 r04 = (AnonymousClass0N3) r153.A09(AnonymousClass0N3.A05.A0A(), r52);
                                this.A0E = r04;
                                if (r15 != null) {
                                    r15.A03(r04);
                                    this.A0E = (AnonymousClass0N3) r15.A00();
                                }
                                this.A01 |= 1;
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 18:
                                if ((this.A01 & 2) == 2) {
                                    r14 = (C04970Mo) this.A0D.AQb();
                                } else {
                                    r14 = null;
                                }
                                C02840Dr r05 = (C02840Dr) r153.A09(C02840Dr.A0b.A0A(), r52);
                                this.A0D = r05;
                                if (r14 != null) {
                                    r14.A03(r05);
                                    this.A0D = (C02840Dr) r14.A00();
                                }
                                this.A01 |= 2;
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 24:
                                this.A01 |= 4;
                                this.A08 = r153.A06();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                int A022 = r153.A02();
                                if (A022 == 0) {
                                    r03 = EnumC70063Jp.ERROR;
                                } else if (A022 == 1) {
                                    r03 = EnumC70063Jp.PENDING;
                                } else if (A022 == 2) {
                                    r03 = EnumC70063Jp.SERVER_ACK;
                                } else if (A022 == 3) {
                                    r03 = EnumC70063Jp.DELIVERY_ACK;
                                } else if (A022 == 4) {
                                    r03 = EnumC70063Jp.READ;
                                } else if (A022 != 5) {
                                    r03 = null;
                                } else {
                                    r03 = EnumC70063Jp.PLAYED;
                                }
                                if (r03 == null) {
                                    super.A0D(4, A022);
                                    continue;
                                } else {
                                    this.A01 |= 8;
                                    this.A06 = A022;
                                }
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 42:
                                String A0A2 = r153.A0A();
                                this.A01 |= 16;
                                this.A0H = A0A2;
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 128:
                                this.A01 |= 32;
                                this.A0O = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 136:
                                this.A01 |= 64;
                                this.A0Q = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*{ENCODED_INT: 144}*/:
                                this.A01 |= 128;
                                this.A0K = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 154:
                                String A0A3 = r153.A0A();
                                this.A01 |= 256;
                                this.A0I = A0A3;
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 162:
                                this.A01 |= 512;
                                this.A09 = r153.A08();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 168:
                                this.A01 |= 1024;
                                this.A0P = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*{ENCODED_INT: 176}*/:
                                this.A01 |= 2048;
                                this.A0S = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 184:
                                this.A01 |= 4096;
                                this.A0R = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 192:
                                int A023 = r153.A02();
                                switch (A023) {
                                    case 0:
                                        r02 = EnumC449722j.UNKNOWN;
                                        break;
                                    case 1:
                                        r02 = EnumC449722j.REVOKE;
                                        break;
                                    case 2:
                                        r02 = EnumC449722j.CIPHERTEXT;
                                        break;
                                    case 3:
                                        r02 = EnumC449722j.FUTUREPROOF;
                                        break;
                                    case 4:
                                        r02 = EnumC449722j.NON_VERIFIED_TRANSITION;
                                        break;
                                    case 5:
                                        r02 = EnumC449722j.UNVERIFIED_TRANSITION;
                                        break;
                                    case 6:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION;
                                        break;
                                    case 7:
                                        r02 = EnumC449722j.VERIFIED_LOW_UNKNOWN;
                                        break;
                                    case 8:
                                        r02 = EnumC449722j.VERIFIED_HIGH;
                                        break;
                                    case 9:
                                        r02 = EnumC449722j.VERIFIED_INITIAL_UNKNOWN;
                                        break;
                                    case 10:
                                        r02 = EnumC449722j.VERIFIED_INITIAL_LOW;
                                        break;
                                    case 11:
                                        r02 = EnumC449722j.VERIFIED_INITIAL_HIGH;
                                        break;
                                    case 12:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION_ANY_TO_NONE;
                                        break;
                                    case 13:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION_ANY_TO_HIGH;
                                        break;
                                    case 14:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION_HIGH_TO_LOW;
                                        break;
                                    case 15:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION_HIGH_TO_UNKNOWN;
                                        break;
                                    case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION_UNKNOWN_TO_LOW;
                                        break;
                                    case 17:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION_LOW_TO_UNKNOWN;
                                        break;
                                    case 18:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION_NONE_TO_LOW;
                                        break;
                                    case 19:
                                        r02 = EnumC449722j.VERIFIED_TRANSITION_NONE_TO_UNKNOWN;
                                        break;
                                    case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                                        r02 = EnumC449722j.GROUP_CREATE;
                                        break;
                                    case 21:
                                        r02 = EnumC449722j.GROUP_CHANGE_SUBJECT;
                                        break;
                                    case 22:
                                        r02 = EnumC449722j.GROUP_CHANGE_ICON;
                                        break;
                                    case 23:
                                        r02 = EnumC449722j.GROUP_CHANGE_INVITE_LINK;
                                        break;
                                    case 24:
                                        r02 = EnumC449722j.GROUP_CHANGE_DESCRIPTION;
                                        break;
                                    case 25:
                                        r02 = EnumC449722j.GROUP_CHANGE_RESTRICT;
                                        break;
                                    case 26:
                                        r02 = EnumC449722j.GROUP_CHANGE_ANNOUNCE;
                                        break;
                                    case 27:
                                        r02 = EnumC449722j.GROUP_PARTICIPANT_ADD;
                                        break;
                                    case 28:
                                        r02 = EnumC449722j.GROUP_PARTICIPANT_REMOVE;
                                        break;
                                    case 29:
                                        r02 = EnumC449722j.GROUP_PARTICIPANT_PROMOTE;
                                        break;
                                    case 30:
                                        r02 = EnumC449722j.GROUP_PARTICIPANT_DEMOTE;
                                        break;
                                    case 31:
                                        r02 = EnumC449722j.GROUP_PARTICIPANT_INVITE;
                                        break;
                                    case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                        r02 = EnumC449722j.GROUP_PARTICIPANT_LEAVE;
                                        break;
                                    case 33:
                                        r02 = EnumC449722j.GROUP_PARTICIPANT_CHANGE_NUMBER;
                                        break;
                                    case 34:
                                        r02 = EnumC449722j.BROADCAST_CREATE;
                                        break;
                                    case 35:
                                        r02 = EnumC449722j.BROADCAST_ADD;
                                        break;
                                    case 36:
                                        r02 = EnumC449722j.BROADCAST_REMOVE;
                                        break;
                                    case 37:
                                        r02 = EnumC449722j.GENERIC_NOTIFICATION;
                                        break;
                                    case 38:
                                        r02 = EnumC449722j.E2E_IDENTITY_CHANGED;
                                        break;
                                    case 39:
                                        r02 = EnumC449722j.E2E_ENCRYPTED;
                                        break;
                                    case 40:
                                        r02 = EnumC449722j.CALL_MISSED_VOICE;
                                        break;
                                    case 41:
                                        r02 = EnumC449722j.CALL_MISSED_VIDEO;
                                        break;
                                    case 42:
                                        r02 = EnumC449722j.INDIVIDUAL_CHANGE_NUMBER;
                                        break;
                                    case 43:
                                        r02 = EnumC449722j.GROUP_DELETE;
                                        break;
                                    case 44:
                                        r02 = EnumC449722j.GROUP_ANNOUNCE_MODE_MESSAGE_BOUNCE;
                                        break;
                                    case 45:
                                        r02 = EnumC449722j.CALL_MISSED_GROUP_VOICE;
                                        break;
                                    case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                                        r02 = EnumC449722j.CALL_MISSED_GROUP_VIDEO;
                                        break;
                                    case 47:
                                        r02 = EnumC449722j.PAYMENT_CIPHERTEXT;
                                        break;
                                    case 48:
                                        r02 = EnumC449722j.PAYMENT_FUTUREPROOF;
                                        break;
                                    case 49:
                                        r02 = EnumC449722j.PAYMENT_TRANSACTION_STATUS_UPDATE_FAILED;
                                        break;
                                    case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                        r02 = EnumC449722j.PAYMENT_TRANSACTION_STATUS_UPDATE_REFUNDED;
                                        break;
                                    case 51:
                                        r02 = EnumC449722j.PAYMENT_TRANSACTION_STATUS_UPDATE_REFUND_FAILED;
                                        break;
                                    case 52:
                                        r02 = EnumC449722j.PAYMENT_TRANSACTION_STATUS_RECEIVER_PENDING_SETUP;
                                        break;
                                    case 53:
                                        r02 = EnumC449722j.PAYMENT_TRANSACTION_STATUS_RECEIVER_SUCCESS_AFTER_HICCUP;
                                        break;
                                    case 54:
                                        r02 = EnumC449722j.PAYMENT_ACTION_ACCOUNT_SETUP_REMINDER;
                                        break;
                                    case 55:
                                        r02 = EnumC449722j.PAYMENT_ACTION_SEND_PAYMENT_REMINDER;
                                        break;
                                    case 56:
                                        r02 = EnumC449722j.PAYMENT_ACTION_SEND_PAYMENT_INVITATION;
                                        break;
                                    case 57:
                                        r02 = EnumC449722j.PAYMENT_ACTION_REQUEST_DECLINED;
                                        break;
                                    case 58:
                                        r02 = EnumC449722j.PAYMENT_ACTION_REQUEST_EXPIRED;
                                        break;
                                    case 59:
                                        r02 = EnumC449722j.PAYMENT_ACTION_REQUEST_CANCELLED;
                                        break;
                                    case 60:
                                        r02 = EnumC449722j.BIZ_VERIFIED_TRANSITION_TOP_TO_BOTTOM;
                                        break;
                                    case 61:
                                        r02 = EnumC449722j.BIZ_VERIFIED_TRANSITION_BOTTOM_TO_TOP;
                                        break;
                                    case 62:
                                        r02 = EnumC449722j.BIZ_INTRO_TOP;
                                        break;
                                    case 63:
                                        r02 = EnumC449722j.BIZ_INTRO_BOTTOM;
                                        break;
                                    case 64:
                                        r02 = EnumC449722j.BIZ_NAME_CHANGE;
                                        break;
                                    case 65:
                                        r02 = EnumC449722j.BIZ_MOVE_TO_CONSUMER_APP;
                                        break;
                                    case 66:
                                        r02 = EnumC449722j.BIZ_TWO_TIER_MIGRATION_TOP;
                                        break;
                                    case 67:
                                        r02 = EnumC449722j.BIZ_TWO_TIER_MIGRATION_BOTTOM;
                                        break;
                                    case 68:
                                        r02 = EnumC449722j.OVERSIZED;
                                        break;
                                    case 69:
                                        r02 = EnumC449722j.GROUP_CHANGE_NO_FREQUENTLY_FORWARDED;
                                        break;
                                    case 70:
                                        r02 = EnumC449722j.GROUP_V4_ADD_INVITE_SENT;
                                        break;
                                    case 71:
                                        r02 = EnumC449722j.GROUP_PARTICIPANT_ADD_REQUEST_JOIN;
                                        break;
                                    case AnonymousClass0PW.A02 /*{ENCODED_INT: 72}*/:
                                        r02 = EnumC449722j.CHANGE_EPHEMERAL_SETTING;
                                        break;
                                    case 73:
                                        r02 = EnumC449722j.E2E_DEVICE_CHANGED;
                                        break;
                                    case 74:
                                        r02 = EnumC449722j.VIEWED_ONCE;
                                        break;
                                    case 75:
                                        r02 = EnumC449722j.E2E_ENCRYPTED_NOW;
                                        break;
                                    case 76:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_TO_BSP_PREMISE;
                                        break;
                                    case 77:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_TO_SELF_FB;
                                        break;
                                    case 78:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_TO_SELF_PREMISE;
                                        break;
                                    case 79:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_UNVERIFIED;
                                        break;
                                    case 80:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                                        break;
                                    case 81:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_VERIFIED;
                                        break;
                                    case 82:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                                        break;
                                    case 83:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_PREMISE_TO_SELF_PREMISE;
                                        break;
                                    case 84:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_PREMISE_UNVERIFIED;
                                        break;
                                    case 85:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_PREMISE_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                                        break;
                                    case 86:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_PREMISE_VERIFIED;
                                        break;
                                    case 87:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_PREMISE_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                                        break;
                                    case 88:
                                        r02 = EnumC449722j.BLUE_MSG_CONSUMER_TO_BSP_FB_UNVERIFIED;
                                        break;
                                    case 89:
                                        r02 = EnumC449722j.BLUE_MSG_CONSUMER_TO_BSP_PREMISE_UNVERIFIED;
                                        break;
                                    case 90:
                                        r02 = EnumC449722j.BLUE_MSG_CONSUMER_TO_SELF_FB_UNVERIFIED;
                                        break;
                                    case 91:
                                        r02 = EnumC449722j.BLUE_MSG_CONSUMER_TO_SELF_PREMISE_UNVERIFIED;
                                        break;
                                    case 92:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_FB_TO_BSP_PREMISE;
                                        break;
                                    case 93:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_FB_TO_SELF_PREMISE;
                                        break;
                                    case 94:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_FB_UNVERIFIED;
                                        break;
                                    case 95:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_FB_UNVERIFIED_TO_SELF_PREMISE_VERIFIED;
                                        break;
                                    case 96:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_FB_VERIFIED;
                                        break;
                                    case 97:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_FB_VERIFIED_TO_SELF_PREMISE_UNVERIFIED;
                                        break;
                                    case 98:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_PREMISE_TO_BSP_PREMISE;
                                        break;
                                    case 99:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_PREMISE_UNVERIFIED;
                                        break;
                                    case 100:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_PREMISE_VERIFIED;
                                        break;
                                    case 101:
                                        r02 = EnumC449722j.BLUE_MSG_TO_BSP_FB;
                                        break;
                                    case 102:
                                        r02 = EnumC449722j.BLUE_MSG_TO_CONSUMER;
                                        break;
                                    case 103:
                                        r02 = EnumC449722j.BLUE_MSG_TO_SELF_FB;
                                        break;
                                    case 104:
                                        r02 = EnumC449722j.BLUE_MSG_UNVERIFIED_TO_BSP_FB_VERIFIED;
                                        break;
                                    case 105:
                                        r02 = EnumC449722j.BLUE_MSG_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                                        break;
                                    case 106:
                                        r02 = EnumC449722j.BLUE_MSG_UNVERIFIED_TO_SELF_FB_VERIFIED;
                                        break;
                                    case 107:
                                        r02 = EnumC449722j.BLUE_MSG_UNVERIFIED_TO_VERIFIED;
                                        break;
                                    case AnonymousClass0PW.A03 /*{ENCODED_INT: 108}*/:
                                        r02 = EnumC449722j.BLUE_MSG_VERIFIED_TO_BSP_FB_UNVERIFIED;
                                        break;
                                    case 109:
                                        r02 = EnumC449722j.BLUE_MSG_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                                        break;
                                    case 110:
                                        r02 = EnumC449722j.BLUE_MSG_VERIFIED_TO_SELF_FB_UNVERIFIED;
                                        break;
                                    case 111:
                                        r02 = EnumC449722j.BLUE_MSG_VERIFIED_TO_UNVERIFIED;
                                        break;
                                    case 112:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                                        break;
                                    case 113:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_UNVERIFIED_TO_SELF_FB_VERIFIED;
                                        break;
                                    case 114:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                                        break;
                                    case 115:
                                        r02 = EnumC449722j.BLUE_MSG_BSP_FB_VERIFIED_TO_SELF_FB_UNVERIFIED;
                                        break;
                                    case 116:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_FB_UNVERIFIED_TO_BSP_PREMISE_VERIFIED;
                                        break;
                                    case 117:
                                        r02 = EnumC449722j.BLUE_MSG_SELF_FB_VERIFIED_TO_BSP_PREMISE_UNVERIFIED;
                                        break;
                                    case 118:
                                        r02 = EnumC449722j.E2E_IDENTITY_UNAVAILABLE;
                                        break;
                                    default:
                                        r02 = null;
                                        break;
                                }
                                if (r02 == null) {
                                    super.A0D(24, A023);
                                    continue;
                                } else {
                                    this.A01 |= 8192;
                                    this.A05 = A023;
                                }
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 200:
                                this.A01 |= 16384;
                                this.A0L = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 210:
                                String A0A4 = r153.A0A();
                                AbstractC04120Jd r16 = this.A0B;
                                if (!((AbstractC05040Mx) r16).A00) {
                                    r16 = AnonymousClass078.A04(r16);
                                    this.A0B = r16;
                                }
                                r16.add(A0A4);
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 216:
                                this.A01 |= 32768;
                                this.A03 = r153.A02();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 226:
                                String A0A5 = r153.A0A();
                                AbstractC04120Jd r06 = this.A0A;
                                if (!((AbstractC05040Mx) r06).A00) {
                                    r06 = AnonymousClass078.A04(r06);
                                    this.A0A = r06;
                                }
                                r06.add(A0A5);
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 234:
                                if ((this.A01 & 65536) == 65536) {
                                    r13 = (C77483gE) this.A0F.AQb();
                                } else {
                                    r13 = null;
                                }
                                C77493gF r07 = (C77493gF) r153.A09(C77493gF.A0B.A0A(), r52);
                                this.A0F = r07;
                                if (r13 != null) {
                                    r13.A03(r07);
                                    this.A0F = (C77493gF) r13.A00();
                                }
                                this.A01 |= 65536;
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 242:
                                if ((this.A01 & 131072) == 131072) {
                                    r12 = (C76293eJ) this.A0C.AQb();
                                } else {
                                    r12 = null;
                                }
                                C02890Dw r08 = (C02890Dw) r153.A09(C02890Dw.A0B.A0A(), r52);
                                this.A0C = r08;
                                if (r12 != null) {
                                    r12.A03(r08);
                                    this.A0C = (C02890Dw) r12.A00();
                                }
                                this.A01 |= 131072;
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 250:
                                if ((this.A01 & 262144) == 262144) {
                                    r1 = (C77483gE) this.A0G.AQb();
                                } else {
                                    r1 = null;
                                }
                                C77493gF r09 = (C77493gF) r153.A09(C77493gF.A0B.A0A(), r52);
                                this.A0G = r09;
                                if (r1 != null) {
                                    r1.A03(r09);
                                    this.A0G = (C77493gF) r1.A00();
                                }
                                this.A01 |= 262144;
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 256:
                                this.A01 |= 524288;
                                this.A07 = r153.A06();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 264:
                                this.A01 |= 1048576;
                                this.A04 = r153.A02();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 272:
                                this.A01 |= 2097152;
                                this.A0M = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 280:
                                this.A01 |= i;
                                this.A0N = r153.A0H();
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 288:
                                int A024 = r153.A02();
                                if (A024 == 0) {
                                    r0 = EnumC70053Jo.E2EE;
                                } else if (A024 == 1) {
                                    r0 = EnumC70053Jo.BSP;
                                } else if (A024 == 2) {
                                    r0 = EnumC70053Jo.FB;
                                } else if (A024 != 3) {
                                    r0 = null;
                                } else {
                                    r0 = EnumC70053Jo.BSP_AND_FB;
                                }
                                if (r0 == null) {
                                    super.A0D(36, A024);
                                    continue;
                                } else {
                                    this.A01 |= 8388608;
                                    this.A02 = A024;
                                }
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            case 298:
                                String A0A6 = r153.A0A();
                                this.A01 |= i2;
                                this.A0J = A0A6;
                                continue;
                                i = 4194304;
                                i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            default:
                                if (!A0G(A032, r153)) {
                                    break;
                                } else {
                                    continue;
                                    i = 4194304;
                                    i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                                }
                        }
                        z51 = true;
                        i = 4194304;
                        i2 = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r17 = new C04190Jk(e2.getMessage());
                        r17.unfinishedMessage = this;
                        throw new RuntimeException(r17);
                    }
                }
                break;
            case 3:
                ((AbstractC05040Mx) this.A0B).A00 = false;
                ((AbstractC05040Mx) this.A0A).A00 = false;
                return null;
            case 4:
                return new AnonymousClass0Ms();
            case 5:
                return new AnonymousClass0N0();
            case 6:
                break;
            case 7:
                if (A0U == null) {
                    synchronized (AnonymousClass0Ms.class) {
                        if (A0U == null) {
                            A0U = new AnonymousClass275(A0T);
                        }
                    }
                }
                return A0U;
            default:
                throw new UnsupportedOperationException();
        }
        return A0T;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A01 & 1) == 1) {
            AnonymousClass0N3 r0 = this.A0E;
            if (r0 == null) {
                r0 = AnonymousClass0N3.A05;
            }
            i = AbstractC11750gu.A08(1, r0) + 0;
        } else {
            i = 0;
        }
        if ((this.A01 & 2) == 2) {
            C02840Dr r02 = this.A0D;
            if (r02 == null) {
                r02 = C02840Dr.A0b;
            }
            i += AbstractC11750gu.A08(2, r02);
        }
        int i3 = this.A01;
        if ((i3 & 4) == 4) {
            i += AbstractC11750gu.A06(3, this.A08);
        }
        if ((i3 & 8) == 8) {
            i += AbstractC11750gu.A02(4, this.A06);
        }
        if ((i3 & 16) == 16) {
            i += AbstractC11750gu.A09(5, this.A0H);
        }
        int i4 = this.A01;
        if ((i4 & 32) == 32) {
            i += AbstractC11750gu.A00(16);
        }
        if ((i4 & 64) == 64) {
            i += AbstractC11750gu.A00(17);
        }
        if ((i4 & 128) == 128) {
            i += AbstractC11750gu.A00(18);
        }
        if ((i4 & 256) == 256) {
            i += AbstractC11750gu.A09(19, this.A0I);
        }
        int i5 = this.A01;
        if ((i5 & 512) == 512) {
            i += AbstractC11750gu.A07(20, this.A09);
        }
        if ((i5 & 1024) == 1024) {
            i += AbstractC11750gu.A00(21);
        }
        if ((i5 & 2048) == 2048) {
            i += AbstractC11750gu.A00(22);
        }
        if ((i5 & 4096) == 4096) {
            i += AbstractC11750gu.A00(23);
        }
        if ((i5 & 8192) == 8192) {
            i += AbstractC11750gu.A02(24, this.A05);
        }
        if ((i5 & 16384) == 16384) {
            i += AbstractC11750gu.A00(25);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.A0B.size(); i7++) {
            i6 += AbstractC11750gu.A0B((String) this.A0B.get(i7));
        }
        int size = (this.A0B.size() << 1) + i + i6;
        if ((this.A01 & 32768) == 32768) {
            size += AbstractC11750gu.A04(27, this.A03);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.A0A.size(); i9++) {
            i8 += AbstractC11750gu.A0B((String) this.A0A.get(i9));
        }
        int size2 = (this.A0A.size() << 1) + size + i8;
        if ((this.A01 & 65536) == 65536) {
            C77493gF r03 = this.A0F;
            if (r03 == null) {
                r03 = C77493gF.A0B;
            }
            size2 += AbstractC11750gu.A08(29, r03);
        }
        if ((this.A01 & 131072) == 131072) {
            C02890Dw r04 = this.A0C;
            if (r04 == null) {
                r04 = C02890Dw.A0B;
            }
            size2 += AbstractC11750gu.A08(30, r04);
        }
        if ((this.A01 & 262144) == 262144) {
            C77493gF r05 = this.A0G;
            if (r05 == null) {
                r05 = C77493gF.A0B;
            }
            size2 += AbstractC11750gu.A08(31, r05);
        }
        int i10 = this.A01;
        if ((i10 & 524288) == 524288) {
            size2 += AbstractC11750gu.A06(32, this.A07);
        }
        if ((i10 & 1048576) == 1048576) {
            size2 += AbstractC11750gu.A04(33, this.A04);
        }
        if ((i10 & 2097152) == 2097152) {
            size2 += AbstractC11750gu.A00(34);
        }
        if ((i10 & 4194304) == 4194304) {
            size2 += AbstractC11750gu.A00(35);
        }
        if ((i10 & 8388608) == 8388608) {
            size2 += AbstractC11750gu.A02(36, this.A02);
        }
        if ((i10 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            size2 += AbstractC11750gu.A09(37, this.A0J);
        }
        int A002 = this.unknownFields.A00() + size2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r6) {
        if ((this.A01 & 1) == 1) {
            AnonymousClass0N3 r0 = this.A0E;
            if (r0 == null) {
                r0 = AnonymousClass0N3.A05;
            }
            r6.A0K(1, r0);
        }
        if ((this.A01 & 2) == 2) {
            C02840Dr r02 = this.A0D;
            if (r02 == null) {
                r02 = C02840Dr.A0b;
            }
            r6.A0K(2, r02);
        }
        if ((this.A01 & 4) == 4) {
            r6.A0H(3, this.A08);
        }
        if ((this.A01 & 8) == 8) {
            r6.A0E(4, this.A06);
        }
        if ((this.A01 & 16) == 16) {
            r6.A0L(5, this.A0H);
        }
        if ((this.A01 & 32) == 32) {
            r6.A0M(16, this.A0O);
        }
        if ((this.A01 & 64) == 64) {
            r6.A0M(17, this.A0Q);
        }
        if ((this.A01 & 128) == 128) {
            r6.A0M(18, this.A0K);
        }
        if ((this.A01 & 256) == 256) {
            r6.A0L(19, this.A0I);
        }
        if ((this.A01 & 512) == 512) {
            r6.A0J(20, this.A09);
        }
        if ((this.A01 & 1024) == 1024) {
            r6.A0M(21, this.A0P);
        }
        if ((this.A01 & 2048) == 2048) {
            r6.A0M(22, this.A0S);
        }
        if ((this.A01 & 4096) == 4096) {
            r6.A0M(23, this.A0R);
        }
        if ((this.A01 & 8192) == 8192) {
            r6.A0E(24, this.A05);
        }
        if ((this.A01 & 16384) == 16384) {
            r6.A0M(25, this.A0L);
        }
        for (int i = 0; i < this.A0B.size(); i++) {
            r6.A0L(26, (String) this.A0B.get(i));
        }
        if ((this.A01 & 32768) == 32768) {
            r6.A0F(27, this.A03);
        }
        for (int i2 = 0; i2 < this.A0A.size(); i2++) {
            r6.A0L(28, (String) this.A0A.get(i2));
        }
        if ((this.A01 & 65536) == 65536) {
            C77493gF r03 = this.A0F;
            if (r03 == null) {
                r03 = C77493gF.A0B;
            }
            r6.A0K(29, r03);
        }
        if ((this.A01 & 131072) == 131072) {
            C02890Dw r04 = this.A0C;
            if (r04 == null) {
                r04 = C02890Dw.A0B;
            }
            r6.A0K(30, r04);
        }
        if ((this.A01 & 262144) == 262144) {
            C77493gF r05 = this.A0G;
            if (r05 == null) {
                r05 = C77493gF.A0B;
            }
            r6.A0K(31, r05);
        }
        if ((this.A01 & 524288) == 524288) {
            r6.A0H(32, this.A07);
        }
        if ((this.A01 & 1048576) == 1048576) {
            r6.A0F(33, this.A04);
        }
        if ((this.A01 & 2097152) == 2097152) {
            r6.A0M(34, this.A0M);
        }
        if ((this.A01 & 4194304) == 4194304) {
            r6.A0M(35, this.A0N);
        }
        if ((this.A01 & 8388608) == 8388608) {
            r6.A0E(36, this.A02);
        }
        if ((this.A01 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            r6.A0L(37, this.A0J);
        }
        this.unknownFields.A02(r6);
    }
}
