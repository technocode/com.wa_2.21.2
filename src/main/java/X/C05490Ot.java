package X;

import android.text.TextUtils;
import com.whatsapp.TextData;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.0Ot  reason: invalid class name and case insensitive filesystem */
public class C05490Ot extends AbstractC007503q implements AbstractC02870Du, AbstractC02880Dv, AnonymousClass0M0 {
    public int A00 = 0;
    public TextData A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public byte[] A06;

    public C05490Ot(C007303n r2, long j) {
        super(r2, j, (byte) 0);
    }

    public C05490Ot(C007303n r2, long j, byte b) {
        super(r2, j, b);
    }

    public C05490Ot(C007303n r2, long j, C05420Ol r5) {
        super(r2, j, (byte) 0);
        A0d(r5.A06);
        this.A0H = r5;
        A0O(1024);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C05490Ot(X.C007303n r7, long r8, X.C75943dk r10) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05490Ot.<init>(X.03n, long, X.3dk):void");
    }

    public C05490Ot(C007303n r2, long j, String str) {
        super(r2, j, (byte) 0);
        A0d(C003701u.A07(str, 65536));
    }

    public C05490Ot(C007303n r2, long j, String str, C27241Os r6, List list) {
        super(r2, j, (byte) 0);
        A0d(str);
        if (r6 != null && r6.A0A()) {
            this.A04 = r6.A0C;
            this.A02 = r6.A0A;
            this.A05 = r6.A09;
            this.A00 = r6.A02;
            A0x(r6.A0E);
        }
        A0n(list);
    }

    public C05490Ot(C05490Ot r2, C007303n r3, long j, boolean z) {
        super(r2, r3, j, z);
        this.A04 = r2.A04;
        this.A02 = r2.A02;
        this.A05 = r2.A05;
        this.A01 = r2.A01;
        this.A06 = r2.A06;
        this.A00 = r2.A00;
    }

    public String A0u() {
        if (!(this instanceof AnonymousClass28G)) {
            return A0D();
        }
        AnonymousClass28G r4 = (AnonymousClass28G) this;
        if (TextUtils.isEmpty(r4.A0D())) {
            return r4.A00.A00;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder A0S = AnonymousClass008.A0S("*");
        A0S.append(r4.A0D());
        A0S.append("*");
        sb.append(A0S.toString());
        sb.append("\n");
        sb.append("\n");
        sb.append(r4.A00.A00);
        return sb.toString();
    }

    public void A0v(TextData textData) {
        byte[] bArr;
        if (!(textData == null || (bArr = this.A06) == null)) {
            textData.thumbnail = bArr;
            this.A06 = null;
        }
        this.A01 = textData;
    }

    public void A0w(C05490Ot r5, C007303n r6) {
        if (AnonymousClass1VY.A0b(r6.A00)) {
            TextData textData = new TextData();
            int[] iArr = C660232m.A01;
            textData.backgroundColor = iArr[Math.abs(C660232m.A00.nextInt()) % iArr.length];
            textData.textColor = -1;
            textData.fontStyle = 0;
            r5.A0v(textData);
            if (!TextUtils.isEmpty(A0D())) {
                r5.A0d(C660232m.A02(r5.A0D()));
            }
        } else if (this.A01 != null) {
            r5.A01 = null;
            r5.A0x(this.A01.thumbnail);
        }
    }

    public void A0x(byte[] bArr) {
        TextData textData = this.A01;
        if (textData != null) {
            textData.thumbnail = bArr;
        } else {
            this.A06 = bArr;
        }
    }

    public byte[] A0y() {
        TextData textData = this.A01;
        if (textData != null) {
            return textData.thumbnail;
        }
        return this.A06;
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r16) {
        long A042;
        if (this instanceof AnonymousClass28G) {
            AnonymousClass28G r2 = (AnonymousClass28G) this;
            C04970Mo r5 = r16.A01;
            C76523eg r4 = (C76523eg) r5.A04().AQb();
            AnonymousClass0OF r0 = r2.A00;
            if (r0 != null) {
                AnonymousClass0OI A0x = C002001d.A0x(r5, r0);
                if (!TextUtils.isEmpty(r2.A0D())) {
                    String A0D = r2.A0D();
                    A0x.A02();
                    AnonymousClass0OH r1 = (AnonymousClass0OH) A0x.A00;
                    if (A0D != null) {
                        r1.A01 = 2;
                        r1.A03 = A0D;
                    } else {
                        throw null;
                    }
                }
                r4.A05(A0x);
                r4.A04(A0x);
                r5.A0A(r4);
                return;
            }
            AnonymousClass008.A1M(AnonymousClass008.A0S("MessageTemplateHsm: cannot send encrypted hsm title message, "), r2.A0m);
        } else if (this instanceof C12200hi) {
            C12200hi r6 = (C12200hi) this;
            C04970Mo r52 = r16.A01;
            C76513ef r02 = ((C02840Dr) r52.A00).A0W;
            if (r02 == null) {
                r02 = C76513ef.A05;
            }
            AbstractC04160Jh A0B = r02.AQb();
            String A0D2 = r6.A0D();
            A0B.A02();
            C76513ef r12 = (C76513ef) A0B.A00;
            if (A0D2 != null) {
                r12.A00 |= 2;
                r12.A03 = A0D2;
                if (!TextUtils.isEmpty(r6.A01)) {
                    String str = r6.A01;
                    A0B.A02();
                    C76513ef r13 = (C76513ef) A0B.A00;
                    if (str != null) {
                        r13.A00 |= 1;
                        r13.A04 = str;
                    } else {
                        throw null;
                    }
                }
                int i = r6.A00;
                A0B.A02();
                C76513ef r14 = (C76513ef) A0B.A00;
                r14.A00 |= 8;
                r14.A01 = i;
                C75423cu A022 = AnonymousClass0ZG.A02(r16.A00, r6, r16.A03, r16.A02, r16.A05);
                A0B.A02();
                C76513ef r15 = (C76513ef) A0B.A00;
                if (A022 != null) {
                    r15.A02 = A022;
                    r15.A00 |= 4;
                    r52.A02();
                    C02840Dr r22 = (C02840Dr) r52.A00;
                    if (r22 != null) {
                        r22.A0W = (C76513ef) A0B.A01();
                        r22.A00 |= 8388608;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        } else if (this instanceof AnonymousClass0ZP) {
            AnonymousClass0ZP r62 = (AnonymousClass0ZP) this;
            C04970Mo r42 = r16.A01;
            C76283eI r03 = ((C02840Dr) r42.A00).A0L;
            if (r03 == null) {
                r03 = C76283eI.A06;
            }
            AbstractC04160Jh A0B2 = r03.AQb();
            String str2 = r62.A00.A03;
            A0B2.A02();
            C76283eI r17 = (C76283eI) A0B2.A00;
            if (str2 != null) {
                r17.A00 |= 1;
                r17.A05 = str2;
                if (!TextUtils.isEmpty(r62.A00.A01)) {
                    String str3 = r62.A00.A01;
                    A0B2.A02();
                    C76283eI r18 = (C76283eI) A0B2.A00;
                    if (str3 != null) {
                        r18.A00 |= 16;
                        r18.A04 = str3;
                    } else {
                        throw null;
                    }
                }
                if (r62.A00.A00 == 1) {
                    AnonymousClass3JV r23 = AnonymousClass3JV.SINGLE_SELECT;
                    A0B2.A02();
                    C76283eI r19 = (C76283eI) A0B2.A00;
                    r19.A00 |= 2;
                    r19.A01 = r23.value;
                    C76273eH r04 = r19.A03;
                    if (r04 == null) {
                        r04 = C76273eH.A02;
                    }
                    AbstractC04160Jh A0B3 = r04.AQb();
                    String str4 = r62.A00.A02;
                    if (str4 != null) {
                        A0B3.A02();
                        C76273eH r110 = (C76273eH) A0B3.A00;
                        r110.A00 |= 1;
                        r110.A01 = str4;
                    }
                    C76273eH r05 = (C76273eH) A0B3.A01();
                    A0B2.A02();
                    C76283eI r111 = (C76283eI) A0B2.A00;
                    if (r05 != null) {
                        r111.A03 = r05;
                        r111.A00 |= 4;
                    } else {
                        throw null;
                    }
                }
                C007103l r3 = r16.A02;
                byte[] bArr = r16.A05;
                if (AnonymousClass0ZG.A0M(r62, r3, bArr)) {
                    C75423cu A023 = AnonymousClass0ZG.A02(r16.A00, r62, r16.A03, r3, bArr);
                    A0B2.A02();
                    C76283eI r112 = (C76283eI) A0B2.A00;
                    if (A023 != null) {
                        r112.A02 = A023;
                        r112.A00 |= 8;
                    } else {
                        throw null;
                    }
                }
                C76283eI r06 = (C76283eI) A0B2.A01();
                r42.A02();
                C02840Dr r24 = (C02840Dr) r42.A00;
                if (r06 != null) {
                    r24.A0L = r06;
                    r24.A00 |= 1073741824;
                    return;
                }
                throw null;
            }
            throw null;
        } else if (!(this instanceof AnonymousClass28A)) {
            AnonymousClass0MH r07 = this.A0F;
            if (r07 != null) {
                if (r07.A0K()) {
                    long longValue = this.A0F.A06.A00.scaleByPowerOfTen(3).longValue();
                    AnonymousClass0MH r43 = this.A0F;
                    String str5 = r43.A0E;
                    AbstractC43791yx r25 = r43.A07;
                    if (r25 == null) {
                        A042 = 0;
                    } else {
                        A042 = r25.A04();
                    }
                    UserJid userJid = r43.A0A;
                    AnonymousClass01I r132 = r16.A00;
                    C04970Mo r53 = r16.A01;
                    boolean z = r16.A03;
                    C007103l r11 = r16.A02;
                    byte[] bArr2 = r16.A05;
                    C76433eX r44 = ((C02840Dr) r53.A00).A0R;
                    if (r44 == null) {
                        r44 = C76433eX.A06;
                    }
                    AbstractC04160Jh A0B4 = r44.AQb();
                    C02840Dr r7 = ((C76433eX) A0B4.A00).A03;
                    if (r7 == null) {
                        r7 = C02840Dr.A0b;
                    }
                    C04970Mo r10 = (C04970Mo) r7.AQb();
                    C75943dk r72 = ((C02840Dr) r10.A00).A0D;
                    if (r72 == null) {
                        r72 = C75943dk.A0D;
                    }
                    C75933dj r8 = (C75933dj) r72.AQb();
                    if (A0D() != null) {
                        r8.A05(A0D());
                    }
                    if (AnonymousClass0ZG.A0M(this, r11, bArr2)) {
                        r8.A04(AnonymousClass0ZG.A02(r132, this, z, r11, bArr2));
                    }
                    r10.A06(r8);
                    A0B4.A02();
                    C76433eX r82 = (C76433eX) A0B4.A00;
                    if (r82 != null) {
                        r82.A03 = (C02840Dr) r10.A01();
                        r82.A00 |= 1;
                        A0B4.A02();
                        C76433eX r83 = (C76433eX) A0B4.A00;
                        r83.A00 |= 4;
                        r83.A01 = longValue;
                        A0B4.A02();
                        C76433eX r113 = (C76433eX) A0B4.A00;
                        if (str5 != null) {
                            r113.A00 |= 2;
                            r113.A04 = str5;
                            A0B4.A02();
                            C76433eX r114 = (C76433eX) A0B4.A00;
                            r114.A00 |= 16;
                            r114.A02 = A042 / 1000;
                            if (userJid != null) {
                                String rawString = userJid.getRawString();
                                A0B4.A02();
                                C76433eX r115 = (C76433eX) A0B4.A00;
                                if (rawString != null) {
                                    r115.A00 |= 8;
                                    r115.A05 = rawString;
                                } else {
                                    throw null;
                                }
                            }
                            r53.A02();
                            C02840Dr r26 = (C02840Dr) r53.A00;
                            if (r26 != null) {
                                r26.A0R = (C76433eX) A0B4.A01();
                                r26.A00 |= 131072;
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                AnonymousClass0MH r08 = this.A0F;
                String str6 = r08.A0I;
                UserJid userJid2 = r08.A09;
                AnonymousClass01I r9 = r16.A00;
                C04970Mo r27 = r16.A01;
                boolean z2 = r16.A03;
                C007103l r63 = r16.A02;
                byte[] bArr3 = r16.A05;
                C76453eZ r09 = ((C02840Dr) r27.A00).A0S;
                if (r09 == null) {
                    r09 = C76453eZ.A03;
                }
                AbstractC04160Jh A0B5 = r09.AQb();
                C02840Dr r010 = ((C76453eZ) A0B5.A00).A01;
                if (r010 == null) {
                    r010 = C02840Dr.A0b;
                }
                C04970Mo r54 = (C04970Mo) r010.AQb();
                C75943dk r011 = ((C02840Dr) r54.A00).A0D;
                if (r011 == null) {
                    r011 = C75943dk.A0D;
                }
                C75933dj r45 = (C75933dj) r011.AQb();
                if (A0D() != null) {
                    r45.A05(A0D());
                }
                if (str6 != null) {
                    AnonymousClass0NK r102 = (AnonymousClass0NK) AnonymousClass0N3.A05.AQb();
                    r102.A04(str6);
                    r102.A07(false);
                    AnonymousClass02N r116 = this.A0n.A00;
                    if (AnonymousClass1VY.A0Y(r116) && userJid2 != null) {
                        r102.A05(userJid2.getRawString());
                    }
                    r102.A06(AnonymousClass1VY.A0D(r116));
                    AnonymousClass0N3 r012 = (AnonymousClass0N3) r102.A01();
                    A0B5.A02();
                    C76453eZ r117 = (C76453eZ) A0B5.A00;
                    if (r012 != null) {
                        r117.A02 = r012;
                        r117.A00 |= 2;
                    } else {
                        throw null;
                    }
                }
                if (AnonymousClass0ZG.A0M(this, r63, bArr3)) {
                    r45.A04(AnonymousClass0ZG.A02(r9, this, z2, r63, bArr3));
                }
                r54.A06(r45);
                A0B5.A02();
                C76453eZ r118 = (C76453eZ) A0B5.A00;
                if (r118 != null) {
                    r118.A01 = (C02840Dr) r54.A01();
                    r118.A00 |= 1;
                    r27.A02();
                    C02840Dr r28 = (C02840Dr) r27.A00;
                    if (r28 != null) {
                        r28.A0S = (C76453eZ) A0B5.A01();
                        r28.A00 |= 32768;
                        return;
                    }
                    throw null;
                }
                throw null;
            } else if (!TextUtils.isEmpty(this.A04) || !TextUtils.isEmpty(this.A02) || this.A01 != null || A0s(1024) || AnonymousClass0ZG.A0M(this, r16.A02, r16.A05)) {
                C04970Mo r46 = r16.A01;
                C75943dk r013 = ((C02840Dr) r46.A00).A0D;
                if (r013 == null) {
                    r013 = C75943dk.A0D;
                }
                C75933dj r32 = (C75933dj) r013.AQb();
                r32.A05(A0D());
                String A024 = AnonymousClass1Y8.A02(A0D());
                if (!TextUtils.isEmpty(A024)) {
                    r32.A02();
                    C75943dk r119 = (C75943dk) r32.A00;
                    if (A024 != null) {
                        r119.A01 |= 2;
                        r119.A09 = A024;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(this.A04)) {
                    String str7 = this.A04;
                    r32.A02();
                    C75943dk r120 = (C75943dk) r32.A00;
                    if (str7 != null) {
                        r120.A01 |= 16;
                        r120.A0B = str7;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(this.A02)) {
                    String str8 = this.A02;
                    r32.A02();
                    C75943dk r121 = (C75943dk) r32.A00;
                    if (str8 != null) {
                        r121.A01 |= 8;
                        r121.A08 = str8;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(this.A05)) {
                    String str9 = this.A05;
                    r32.A02();
                    C75943dk r122 = (C75943dk) r32.A00;
                    if (str9 != null) {
                        r122.A01 |= 4;
                        r122.A07 = str9;
                    } else {
                        throw null;
                    }
                }
                if (this.A00 == 1) {
                    AnonymousClass3JN r29 = AnonymousClass3JN.VIDEO;
                    r32.A02();
                    C75943dk r123 = (C75943dk) r32.A00;
                    if (r29 != null) {
                        r123.A01 |= 256;
                        r123.A03 = r29.value;
                    } else {
                        throw null;
                    }
                } else {
                    AnonymousClass3JN r210 = AnonymousClass3JN.NONE;
                    r32.A02();
                    C75943dk r124 = (C75943dk) r32.A00;
                    if (r210 != null) {
                        r124.A01 |= 256;
                        r124.A03 = r210.value;
                    } else {
                        throw null;
                    }
                }
                TextData textData = this.A01;
                if (textData != null) {
                    int i2 = textData.backgroundColor;
                    r32.A02();
                    C75943dk r125 = (C75943dk) r32.A00;
                    r125.A01 |= 64;
                    r125.A00 = i2;
                    int i3 = this.A01.textColor;
                    r32.A02();
                    C75943dk r126 = (C75943dk) r32.A00;
                    r126.A01 |= 32;
                    r126.A04 = i3;
                    AnonymousClass3JM A002 = AnonymousClass3JM.A00(this.A01.fontStyle);
                    r32.A02();
                    C75943dk r127 = (C75943dk) r32.A00;
                    if (A002 != null) {
                        r127.A01 |= 128;
                        r127.A02 = A002.value;
                        byte[] bArr4 = this.A01.thumbnail;
                        if (bArr4 != null) {
                            AnonymousClass071 A003 = AnonymousClass071.A00(bArr4, 0, bArr4.length);
                            r32.A02();
                            C75943dk r128 = (C75943dk) r32.A00;
                            r128.A01 |= 512;
                            r128.A05 = A003;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    byte[] bArr5 = this.A06;
                    if (bArr5 != null) {
                        AnonymousClass071 A004 = AnonymousClass071.A00(bArr5, 0, bArr5.length);
                        r32.A02();
                        C75943dk r129 = (C75943dk) r32.A00;
                        r129.A01 |= 512;
                        r129.A05 = A004;
                    }
                }
                C007103l r55 = r16.A02;
                byte[] bArr6 = r16.A05;
                if (AnonymousClass0ZG.A0M(this, r55, bArr6)) {
                    r32.A04(AnonymousClass0ZG.A02(r16.A00, this, r16.A03, r55, bArr6));
                }
                r46.A06(r32);
            } else {
                C04970Mo r014 = r16.A01;
                String A0D3 = A0D();
                r014.A02();
                C02840Dr r130 = (C02840Dr) r014.A00;
                if (A0D3 != null) {
                    r130.A00 |= 1;
                    r130.A0a = A0D3;
                    return;
                }
                throw null;
            }
        } else {
            AnonymousClass28A r64 = (AnonymousClass28A) this;
            C04970Mo r56 = r16.A01;
            C75743dQ r015 = ((C02840Dr) r56.A00).A04;
            if (r015 == null) {
                r015 = C75743dQ.A04;
            }
            AbstractC04160Jh A0B6 = r015.AQb();
            String A0D4 = r64.A0D();
            A0B6.A02();
            C75743dQ r131 = (C75743dQ) A0B6.A00;
            if (A0D4 != null) {
                r131.A00 |= 2;
                r131.A03 = A0D4;
                if (!TextUtils.isEmpty(r64.A00)) {
                    String str10 = r64.A00;
                    A0B6.A02();
                    C75743dQ r133 = (C75743dQ) A0B6.A00;
                    if (str10 != null) {
                        r133.A00 |= 1;
                        r133.A02 = str10;
                    } else {
                        throw null;
                    }
                }
                C75423cu A025 = AnonymousClass0ZG.A02(r16.A00, r64, r16.A03, r16.A02, r16.A05);
                A0B6.A02();
                C75743dQ r134 = (C75743dQ) A0B6.A00;
                if (A025 != null) {
                    r134.A01 = A025;
                    r134.A00 |= 4;
                    r56.A02();
                    C02840Dr r135 = (C02840Dr) r56.A00;
                    if (r135 != null) {
                        r135.A04 = (C75743dQ) A0B6.A01();
                        r135.A01 |= 4;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass0M0
    public /* bridge */ /* synthetic */ AbstractC007503q A2m(C007303n r8, long j) {
        String A0z;
        if (this instanceof C12200hi) {
            C05490Ot r1 = new C05490Ot(r8, j);
            r1.A0d(A0D());
            A0w(r1, r8);
            return r1;
        } else if (this instanceof AnonymousClass28G) {
            AnonymousClass28G r2 = (AnonymousClass28G) this;
            C05490Ot r12 = new C05490Ot(r8, j);
            if (AnonymousClass1VY.A0b(r8.A00)) {
                A0z = r2.A0u();
            } else {
                A0z = r2.A0z();
            }
            r12.A0d(A0z);
            r2.A0w(r12, r8);
            return r12;
        } else if (!(this instanceof C12200hi)) {
            C05490Ot r13 = new C05490Ot(this, r8, j, false);
            A0w(r13, r8);
            return r13;
        } else {
            C05490Ot r14 = new C05490Ot(r8, j);
            r14.A0d(A0D());
            A0w(r14, r8);
            return r14;
        }
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r9) {
        if (this instanceof AnonymousClass28G) {
            AnonymousClass28G r3 = (AnonymousClass28G) this;
            return new AnonymousClass28G(r3, r9, r3.A0E);
        } else if (this instanceof C12200hi) {
            C12200hi r32 = (C12200hi) this;
            return new C12200hi(r32, r9, r32.A0E);
        } else if (this instanceof AnonymousClass0ZP) {
            AnonymousClass0ZP r33 = (AnonymousClass0ZP) this;
            return new AnonymousClass0ZP(r33, r9, r33.A0E);
        } else if (!(this instanceof AnonymousClass28A)) {
            return new C05490Ot(this, r9, this.A0E, true);
        } else {
            AnonymousClass28A r34 = (AnonymousClass28A) this;
            return new AnonymousClass28A(r34, r9, r34.A0E);
        }
    }
}
