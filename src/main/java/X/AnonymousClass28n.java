package X;

import android.util.Log;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.28n  reason: invalid class name */
public final class AnonymousClass28n extends AbstractC455125c {
    public int A00;
    public AnonymousClass14L A01;
    public AnonymousClass14M A02;
    public List A03;
    public List A04;
    public final int A05;
    public final C233715m A06 = new C233715m();
    public final C233815n A07 = new C233815n();
    public final AnonymousClass14L[] A08;

    public AnonymousClass28n(int i) {
        this.A05 = i == -1 ? 1 : i;
        this.A08 = new AnonymousClass14L[8];
        int i2 = 0;
        do {
            this.A08[i2] = new AnonymousClass14L();
            i2++;
        } while (i2 < 8);
        this.A01 = this.A08[0];
        A02();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00() {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28n.A00():java.util.List");
    }

    public final void A01() {
        AnonymousClass14M r4 = this.A02;
        if (r4 != null) {
            int i = r4.A00;
            int i2 = (r4.A01 << 1) - 1;
            if (i != i2) {
                StringBuilder A0S = AnonymousClass008.A0S("DtvCcPacket ended prematurely; size is ");
                A0S.append(i2);
                A0S.append(", but current index is ");
                A0S.append(i);
                A0S.append(" (sequence number ");
                A0S.append(r4.A02);
                A0S.append("); ignoring packet");
                Log.w("Cea708Decoder", A0S.toString());
            } else {
                C233715m r12 = this.A06;
                r12.A03 = r4.A03;
                r12.A02 = 0;
                r12.A00 = 0;
                r12.A01 = i;
                int i3 = 3;
                int A002 = r12.A00(3);
                int A003 = r12.A00(5);
                int i4 = 7;
                int i5 = 6;
                if (A002 == 7) {
                    r12.A02(2);
                    A002 = r12.A00(6);
                    if (A002 < 7) {
                        AnonymousClass008.A0x("Invalid extended service number: ", A002, "Cea708Decoder");
                    }
                }
                if (A003 == 0) {
                    if (A002 != 0) {
                        StringBuilder sb = new StringBuilder("serviceNumber is non-zero (");
                        sb.append(A002);
                        sb.append(") when blockSize is 0");
                        Log.w("Cea708Decoder", sb.toString());
                    }
                } else if (A002 == this.A05) {
                    boolean z = false;
                    while (((r12.A01 - r12.A02) << 3) - r12.A00 > 0) {
                        int A004 = r12.A00(8);
                        if (A004 == 16) {
                            int A005 = r12.A00(8);
                            if (A005 > 31) {
                                if (A005 <= 127) {
                                    if (A005 == 32) {
                                        this.A01.A03(' ');
                                    } else if (A005 == 33) {
                                        this.A01.A03(160);
                                    } else if (A005 == 37) {
                                        this.A01.A03(8230);
                                    } else if (A005 == 42) {
                                        this.A01.A03(352);
                                    } else if (A005 == 44) {
                                        this.A01.A03(338);
                                    } else if (A005 == 63) {
                                        this.A01.A03(376);
                                    } else if (A005 == 57) {
                                        this.A01.A03(8482);
                                    } else if (A005 == 58) {
                                        this.A01.A03(353);
                                    } else if (A005 == 60) {
                                        this.A01.A03(339);
                                    } else if (A005 != 61) {
                                        switch (A005) {
                                            case 48:
                                                this.A01.A03(9608);
                                                break;
                                            case 49:
                                                this.A01.A03(8216);
                                                break;
                                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                                this.A01.A03(8217);
                                                break;
                                            case 51:
                                                this.A01.A03(8220);
                                                break;
                                            case 52:
                                                this.A01.A03(8221);
                                                break;
                                            case 53:
                                                this.A01.A03(8226);
                                                break;
                                            default:
                                                switch (A005) {
                                                    case 118:
                                                        this.A01.A03(8539);
                                                        break;
                                                    case 119:
                                                        this.A01.A03(8540);
                                                        break;
                                                    case 120:
                                                        this.A01.A03(8541);
                                                        break;
                                                    case 121:
                                                        this.A01.A03(8542);
                                                        break;
                                                    case 122:
                                                        this.A01.A03(9474);
                                                        break;
                                                    case 123:
                                                        this.A01.A03(9488);
                                                        break;
                                                    case 124:
                                                        this.A01.A03(9492);
                                                        break;
                                                    case 125:
                                                        this.A01.A03(9472);
                                                        break;
                                                    case 126:
                                                        this.A01.A03(9496);
                                                        break;
                                                    case 127:
                                                        this.A01.A03(9484);
                                                        break;
                                                    default:
                                                        AnonymousClass008.A0x("Invalid G2 character: ", A005, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.A01.A03(8480);
                                    }
                                } else if (A005 <= 159) {
                                    if (A005 <= 135) {
                                        r12.A02(32);
                                    } else if (A005 <= 143) {
                                        r12.A02(40);
                                    } else if (A005 <= 159) {
                                        r12.A02(2);
                                        r12.A02(r12.A00(i5) << 3);
                                    }
                                } else if (A005 > 255) {
                                    AnonymousClass008.A0x("Invalid extended command: ", A005, "Cea708Decoder");
                                } else if (A005 == 160) {
                                    this.A01.A03(13252);
                                } else {
                                    AnonymousClass008.A0x("Invalid G3 character: ", A005, "Cea708Decoder");
                                    this.A01.A03('_');
                                }
                                z = true;
                            } else if (A005 > i4) {
                                if (A005 <= 15) {
                                    r12.A02(8);
                                } else if (A005 <= 23) {
                                    r12.A02(16);
                                } else if (A005 <= 31) {
                                    r12.A02(24);
                                }
                            }
                        } else if (A004 > 31) {
                            if (A004 <= 127) {
                                AnonymousClass14L r1 = this.A01;
                                if (A004 == 127) {
                                    r1.A03(9835);
                                } else {
                                    r1.A03((char) (A004 & 255));
                                }
                            } else if (A004 <= 159) {
                                switch (A004) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i6 = A004 - 128;
                                        if (this.A00 != i6) {
                                            this.A00 = i6;
                                            this.A01 = this.A08[i6];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        int i7 = 1;
                                        do {
                                            if (r12.A04()) {
                                                AnonymousClass14L r13 = this.A08[8 - i7];
                                                r13.A0L.clear();
                                                r13.A0K.clear();
                                                r13.A06 = -1;
                                                r13.A0C = -1;
                                                r13.A04 = -1;
                                                r13.A02 = -1;
                                                r13.A0A = 0;
                                            }
                                            i7++;
                                        } while (i7 <= 8);
                                        break;
                                    case 137:
                                        int i8 = 1;
                                        do {
                                            if (r12.A04()) {
                                                this.A08[8 - i8].A0J = true;
                                            }
                                            i8++;
                                        } while (i8 <= 8);
                                        break;
                                    case 138:
                                        int i9 = 1;
                                        do {
                                            if (r12.A04()) {
                                                this.A08[8 - i9].A0J = false;
                                            }
                                            i9++;
                                        } while (i9 <= 8);
                                        break;
                                    case 139:
                                        int i10 = 1;
                                        do {
                                            if (r12.A04()) {
                                                AnonymousClass14L r14 = this.A08[8 - i10];
                                                r14.A0J = !r14.A0J;
                                            }
                                            i10++;
                                        } while (i10 <= 8);
                                        break;
                                    case 140:
                                        int i11 = 1;
                                        do {
                                            if (r12.A04()) {
                                                this.A08[8 - i11].A02();
                                            }
                                            i11++;
                                        } while (i11 <= 8);
                                        break;
                                    case 141:
                                        r12.A02(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        A02();
                                        break;
                                    case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*{ENCODED_INT: 144}*/:
                                        AnonymousClass14L r5 = this.A01;
                                        if (r5.A0G) {
                                            r12.A00(4);
                                            r12.A00(2);
                                            r12.A00(2);
                                            boolean A042 = r12.A04();
                                            boolean A043 = r12.A04();
                                            r12.A00(3);
                                            r12.A00(3);
                                            r5.A05(A042, A043);
                                            break;
                                        } else {
                                            r12.A02(16);
                                            break;
                                        }
                                    case 145:
                                        if (this.A01.A0G) {
                                            int A006 = AnonymousClass14L.A00(r12.A00(2), r12.A00(2), r12.A00(2), r12.A00(2));
                                            int A007 = AnonymousClass14L.A00(r12.A00(2), r12.A00(2), r12.A00(2), r12.A00(2));
                                            r12.A02(2);
                                            AnonymousClass14L.A00(r12.A00(2), r12.A00(2), r12.A00(2), 0);
                                            this.A01.A04(A006, A007);
                                            break;
                                        } else {
                                            r12.A02(24);
                                            break;
                                        }
                                    case 146:
                                        AnonymousClass14L r52 = this.A01;
                                        if (r52.A0G) {
                                            r12.A02(4);
                                            int A008 = r12.A00(4);
                                            r12.A02(2);
                                            r12.A00(i5);
                                            if (r52.A0A != A008) {
                                                r52.A03('\n');
                                            }
                                            r52.A0A = A008;
                                            break;
                                        } else {
                                            r12.A02(16);
                                            break;
                                        }
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        Log.w("Cea708Decoder", AnonymousClass008.A0F("Invalid C1 command: ", A004));
                                        break;
                                    case 151:
                                        if (this.A01.A0G) {
                                            int A009 = AnonymousClass14L.A00(r12.A00(2), r12.A00(2), r12.A00(2), r12.A00(2));
                                            r12.A00(2);
                                            AnonymousClass14L.A00(r12.A00(2), r12.A00(2), r12.A00(2), 0);
                                            r12.A04();
                                            r12.A04();
                                            r12.A00(2);
                                            r12.A00(2);
                                            int A0010 = r12.A00(2);
                                            r12.A02(8);
                                            AnonymousClass14L r0 = this.A01;
                                            r0.A0E = A009;
                                            r0.A07 = A0010;
                                            break;
                                        } else {
                                            r12.A02(32);
                                            break;
                                        }
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i12 = A004 - 152;
                                        AnonymousClass14L[] r02 = this.A08;
                                        AnonymousClass14L r10 = r02[i12];
                                        r12.A02(2);
                                        boolean A044 = r12.A04();
                                        boolean A045 = r12.A04();
                                        r12.A04();
                                        int A0011 = r12.A00(i3);
                                        boolean A046 = r12.A04();
                                        int A0012 = r12.A00(i4);
                                        int A0013 = r12.A00(8);
                                        int A0014 = r12.A00(4);
                                        int A0015 = r12.A00(4);
                                        r12.A02(2);
                                        r12.A00(i5);
                                        r12.A02(2);
                                        int A0016 = r12.A00(i3);
                                        int A0017 = r12.A00(i3);
                                        r10.A0G = true;
                                        r10.A0J = A044;
                                        r10.A0I = A045;
                                        r10.A09 = A0011;
                                        r10.A0H = A046;
                                        r10.A0D = A0012;
                                        r10.A05 = A0013;
                                        r10.A00 = A0014;
                                        int i13 = A0015 + 1;
                                        if (r10.A0B != i13) {
                                            r10.A0B = i13;
                                            while (true) {
                                                if ((A045 && r10.A0L.size() >= r10.A0B) || r10.A0L.size() >= 15) {
                                                    r10.A0L.remove(0);
                                                }
                                            }
                                        }
                                        if (!(A0016 == 0 || r10.A0F == A0016)) {
                                            r10.A0F = A0016;
                                            int i14 = A0016 - 1;
                                            int i15 = AnonymousClass14L.A0S[i14];
                                            int i16 = AnonymousClass14L.A0T[i14];
                                            r10.A0E = i15;
                                            r10.A07 = i16;
                                        }
                                        if (!(A0017 == 0 || r10.A08 == A0017)) {
                                            r10.A08 = A0017;
                                            r10.A05(false, false);
                                            r10.A04(AnonymousClass14L.A0N, AnonymousClass14L.A0P[A0017 - 1]);
                                        }
                                        if (this.A00 != i12) {
                                            this.A00 = i12;
                                            this.A01 = r02[i12];
                                            break;
                                        }
                                        break;
                                }
                            } else if (A004 <= 255) {
                                this.A01.A03((char) (A004 & 255));
                            } else {
                                AnonymousClass008.A0x("Invalid base command: ", A004, "Cea708Decoder");
                            }
                            z = true;
                        } else if (A004 != 0) {
                            if (A004 == i3) {
                                this.A03 = A00();
                            } else if (A004 != 8) {
                                switch (A004) {
                                    case 12:
                                        A02();
                                        continue;
                                    case 13:
                                        this.A01.A03('\n');
                                        continue;
                                    case 14:
                                        break;
                                    default:
                                        if (A004 < 17 || A004 > 23) {
                                            if (A004 >= 24 && A004 <= 31) {
                                                AnonymousClass008.A0x("Currently unsupported COMMAND_P16 Command: ", A004, "Cea708Decoder");
                                                r12.A02(16);
                                                break;
                                            } else {
                                                AnonymousClass008.A0x("Invalid C0 command: ", A004, "Cea708Decoder");
                                                break;
                                            }
                                        } else {
                                            AnonymousClass008.A0x("Currently unsupported COMMAND_EXT1 Command: ", A004, "Cea708Decoder");
                                            r12.A02(8);
                                            continue;
                                        }
                                }
                            } else {
                                AnonymousClass14L r15 = this.A01;
                                int length = r15.A0K.length();
                                if (length > 0) {
                                    r15.A0K.delete(length - 1, length);
                                }
                            }
                        }
                        i3 = 3;
                        i4 = 7;
                        i5 = 6;
                    }
                    if (z) {
                        this.A03 = A00();
                    }
                }
            }
            this.A02 = null;
        }
    }

    public final void A02() {
        int i = 0;
        do {
            this.A08[i].A02();
            i++;
        } while (i < 8);
    }

    @Override // X.AbstractC455125c, X.AbstractC227312y
    public void flush() {
        super.flush();
        this.A03 = null;
        this.A04 = null;
        this.A00 = 0;
        this.A01 = this.A08[0];
        A02();
        this.A02 = null;
    }
}
