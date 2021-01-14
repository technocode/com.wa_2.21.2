package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0MI  reason: invalid class name */
public class AnonymousClass0MI extends AnonymousClass0MJ implements AbstractC02870Du, AbstractC02880Dv {
    public AnonymousClass0MI(C007303n r2, long j) {
        super(r2, j, (byte) 1);
    }

    public AnonymousClass0MI(C007303n r1, long j, byte b) {
        super(r1, j, b);
    }

    public AnonymousClass0MI(C007303n r2, long j, C76143e4 r5, boolean z, boolean z2) {
        super(r2, j, (byte) 1);
        A13(r5, z, z2);
    }

    public AnonymousClass0MI(AnonymousClass0MI r9, C007303n r10, long j, AnonymousClass0M4 r13) {
        super(r9, r10, j, r13, false, (byte) 1);
    }

    public AnonymousClass0MI(AnonymousClass0MI r9, C007303n r10, long j, AnonymousClass0M4 r13, boolean z) {
        super(r9, r10, j, r13, z, r9.A0m);
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r11) {
        AnonymousClass078 r0;
        AnonymousClass0OF r02;
        UserJid userJid;
        UserJid userJid2;
        if (this instanceof AnonymousClass2B4) {
            AnonymousClass2B4 r6 = (AnonymousClass2B4) this;
            C04970Mo r5 = r11.A01;
            C76523eg r4 = (C76523eg) r5.A04().AQb();
            AnonymousClass0OH r2 = r5.A04().A03;
            if (r2 == null) {
                r2 = AnonymousClass0OH.A07;
            }
            if (r2.A01 == 3) {
                r0 = (AnonymousClass078) r2.A03;
            } else {
                r0 = C76143e4.A0N;
            }
            C76133e3 A12 = r6.A12((C76133e3) r0.AQb(), r11.A04, r11.A03);
            if (A12 == null || (r02 = r6.A00) == null) {
                AnonymousClass008.A1M(AnonymousClass008.A0S("MessageTemplateImage/buildE2eMessage: cannot send encrypted media message, "), r6.A0m);
                return;
            }
            AnonymousClass0OI A0x = C002001d.A0x(r5, r02);
            A0x.A02();
            AnonymousClass0OH r1 = (AnonymousClass0OH) A0x.A00;
            if (r1 != null) {
                r1.A03 = A12.A01();
                r1.A01 = 3;
                r4.A05(A0x);
                r4.A04(A0x);
                r5.A0A(r4);
                return;
            }
            throw null;
        } else if (this instanceof AnonymousClass0Z9) {
            AnonymousClass0Z9 r3 = (AnonymousClass0Z9) this;
            C04970Mo r52 = r11.A01;
            C76393eT r03 = ((C02840Dr) r52.A00).A0P;
            if (r03 == null) {
                r03 = C76393eT.A05;
            }
            C76343eO r42 = (C76343eO) r03.AQb();
            C76393eT r04 = ((C02840Dr) r52.A00).A0P;
            if (r04 == null) {
                r04 = C76393eT.A05;
            }
            C76383eS r05 = r04.A03;
            if (r05 == null) {
                r05 = C76383eS.A0B;
            }
            AbstractC04160Jh A0B = r05.AQb();
            C76143e4 r06 = ((C76383eS) A0B.A00).A03;
            if (r06 == null) {
                r06 = C76143e4.A0N;
            }
            boolean z = r11.A04;
            boolean z2 = r11.A03;
            C76133e3 A122 = r3.A12((C76133e3) r06.AQb(), z, z2);
            if (A122 == null || (userJid = r3.A01) == null) {
                StringBuilder A0S = AnonymousClass008.A0S("FMessageProduct/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=");
                A0S.append(r3.A0n);
                A0S.append("; media_wa_type=");
                A0S.append((int) r3.A0m);
                A0S.append("; business_owner_jid=");
                A0S.append(r3.A01);
                Log.w(A0S.toString());
                return;
            }
            String rawString = userJid.getRawString();
            r42.A02();
            C76393eT r12 = (C76393eT) r42.A00;
            if (rawString != null) {
                r12.A00 |= 2;
                r12.A04 = rawString;
                if (!TextUtils.isEmpty(r3.A04)) {
                    String str = r3.A04;
                    A0B.A02();
                    C76383eS r13 = (C76383eS) A0B.A00;
                    if (str != null) {
                        r13.A00 |= 2;
                        r13.A07 = str;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(r3.A03)) {
                    String str2 = r3.A03;
                    A0B.A02();
                    C76383eS r14 = (C76383eS) A0B.A00;
                    if (str2 != null) {
                        r14.A00 |= 8;
                        r14.A05 = str2;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(r3.A07)) {
                    String str3 = r3.A07;
                    A0B.A02();
                    C76383eS r15 = (C76383eS) A0B.A00;
                    if (str3 != null) {
                        r15.A00 |= 4;
                        r15.A09 = str3;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(r3.A02) && r3.A08 != null) {
                    String str4 = r3.A02;
                    A0B.A02();
                    C76383eS r16 = (C76383eS) A0B.A00;
                    if (str4 != null) {
                        r16.A00 |= 16;
                        r16.A04 = str4;
                        long longValue = r3.A08.multiply(AnonymousClass1S6.A0A).longValue();
                        A0B.A02();
                        C76383eS r8 = (C76383eS) A0B.A00;
                        r8.A00 |= 32;
                        r8.A02 = longValue;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(r3.A06)) {
                    String str5 = r3.A06;
                    A0B.A02();
                    C76383eS r17 = (C76383eS) A0B.A00;
                    if (str5 != null) {
                        r17.A00 |= 64;
                        r17.A08 = str5;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(r3.A05)) {
                    String str6 = r3.A05;
                    A0B.A02();
                    C76383eS r18 = (C76383eS) A0B.A00;
                    if (str6 != null) {
                        r18.A00 |= 128;
                        r18.A0A = str6;
                    } else {
                        throw null;
                    }
                }
                int i = r3.A00;
                A0B.A02();
                C76383eS r19 = (C76383eS) A0B.A00;
                r19.A00 |= 256;
                r19.A01 = i;
                A0B.A02();
                C76383eS r110 = (C76383eS) A0B.A00;
                if (r110 != null) {
                    r110.A03 = (C76143e4) A122.A01();
                    r110.A00 |= 1;
                    r42.A02();
                    C76393eT r111 = (C76393eT) r42.A00;
                    if (r111 != null) {
                        r111.A03 = (C76383eS) A0B.A01();
                        r111.A00 |= 1;
                        C007103l r22 = r11.A02;
                        byte[] bArr = r11.A05;
                        if (AnonymousClass0ZG.A0M(r3, r22, bArr)) {
                            C75423cu A02 = AnonymousClass0ZG.A02(r11.A00, r3, z2, r22, bArr);
                            r42.A02();
                            C76393eT r112 = (C76393eT) r42.A00;
                            if (A02 != null) {
                                r112.A01 = A02;
                                r112.A00 |= 8;
                            } else {
                                throw null;
                            }
                        }
                        r52.A08(r42);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        } else if (!(this instanceof C12210hj)) {
            C04970Mo r113 = r11.A01;
            C76143e4 r07 = ((C02840Dr) r113.A00).A0I;
            if (r07 == null) {
                r07 = C76143e4.A0N;
            }
            C76133e3 A11 = A11((C76133e3) r07.AQb(), r11);
            if (A11 != null) {
                C76143e4 r08 = (C76143e4) A11.A01();
                r113.A02();
                C02840Dr r114 = (C02840Dr) r113.A00;
                if (r08 != null) {
                    r114.A0I = r08;
                    r114.A00 |= 4;
                    return;
                }
                throw null;
            }
        } else {
            C12210hj r32 = (C12210hj) this;
            C04970Mo r53 = r11.A01;
            C76393eT r09 = ((C02840Dr) r53.A00).A0P;
            if (r09 == null) {
                r09 = C76393eT.A05;
            }
            C76343eO r43 = (C76343eO) r09.AQb();
            C76393eT r010 = ((C02840Dr) r53.A00).A0P;
            if (r010 == null) {
                r010 = C76393eT.A05;
            }
            C76363eQ r011 = r010.A02;
            if (r011 == null) {
                r011 = C76363eQ.A04;
            }
            AbstractC04160Jh A0B2 = r011.AQb();
            C76143e4 r012 = ((C76363eQ) A0B2.A00).A01;
            if (r012 == null) {
                r012 = C76143e4.A0N;
            }
            boolean z3 = r11.A04;
            boolean z4 = r11.A03;
            C76133e3 A123 = r32.A12((C76133e3) r012.AQb(), z3, z4);
            if (A123 == null || (userJid2 = r32.A00) == null) {
                StringBuilder A0S2 = AnonymousClass008.A0S("FMessageCatalog/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=");
                A0S2.append(r32.A0n);
                A0S2.append("; media_wa_type=");
                A0S2.append((int) r32.A0m);
                A0S2.append("; business_owner_jid=");
                A0S2.append(r32.A00);
                Log.w(A0S2.toString());
                return;
            }
            String rawString2 = userJid2.getRawString();
            r43.A02();
            C76393eT r115 = (C76393eT) r43.A00;
            if (rawString2 != null) {
                r115.A00 |= 2;
                r115.A04 = rawString2;
                if (!TextUtils.isEmpty(r32.A01)) {
                    String str7 = r32.A01;
                    A0B2.A02();
                    C76363eQ r116 = (C76363eQ) A0B2.A00;
                    if (str7 != null) {
                        r116.A00 |= 4;
                        r116.A02 = str7;
                    } else {
                        throw null;
                    }
                }
                if (!TextUtils.isEmpty(r32.A02)) {
                    String str8 = r32.A02;
                    A0B2.A02();
                    C76363eQ r117 = (C76363eQ) A0B2.A00;
                    if (str8 != null) {
                        r117.A00 |= 2;
                        r117.A03 = str8;
                    } else {
                        throw null;
                    }
                }
                A0B2.A02();
                C76363eQ r118 = (C76363eQ) A0B2.A00;
                if (r118 != null) {
                    r118.A01 = (C76143e4) A123.A01();
                    r118.A00 |= 1;
                    r43.A02();
                    C76393eT r119 = (C76393eT) r43.A00;
                    if (r119 != null) {
                        r119.A02 = (C76363eQ) A0B2.A01();
                        r119.A00 |= 4;
                        C007103l r23 = r11.A02;
                        byte[] bArr2 = r11.A05;
                        if (AnonymousClass0ZG.A0M(r32, r23, bArr2)) {
                            C75423cu A022 = AnonymousClass0ZG.A02(r11.A00, r32, z4, r23, bArr2);
                            r43.A02();
                            C76393eT r120 = (C76393eT) r43.A00;
                            if (A022 != null) {
                                r120.A01 = A022;
                                r120.A00 |= 8;
                            } else {
                                throw null;
                            }
                        }
                        r53.A08(r43);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.AbstractC02870Du
    public /* bridge */ /* synthetic */ AbstractC007503q A2n(C007303n r8) {
        if (this instanceof AnonymousClass2B4) {
            AnonymousClass2B4 r1 = (AnonymousClass2B4) this;
            return new AnonymousClass2B4(r1, r8, r1.A0E, ((AnonymousClass0M3) r1).A02);
        } else if (this instanceof AnonymousClass0Z9) {
            AnonymousClass0Z9 r12 = (AnonymousClass0Z9) this;
            return new AnonymousClass0Z9(r12, r8, r12.A0E, ((AnonymousClass0M3) r12).A02, true);
        } else if (this instanceof C12210hj) {
            C12210hj r13 = (C12210hj) this;
            return new C12210hj(r13, r8, r13.A0E, ((AnonymousClass0M3) r13).A02, true);
        } else if (this instanceof AnonymousClass2B4) {
            AnonymousClass2B4 r14 = (AnonymousClass2B4) this;
            return new AnonymousClass2B4(r14, r8, r14.A0E, ((AnonymousClass0M3) r14).A02);
        } else if (this instanceof AnonymousClass0Z9) {
            AnonymousClass0Z9 r15 = (AnonymousClass0Z9) this;
            return new AnonymousClass0Z9(r15, r8, r15.A0E, ((AnonymousClass0M3) r15).A02, true);
        } else if (!(this instanceof C12210hj)) {
            return new AnonymousClass0MI(this, r8, this.A0E, ((AnonymousClass0M3) this).A02, true);
        } else {
            C12210hj r16 = (C12210hj) this;
            return new C12210hj(r16, r8, r16.A0E, ((AnonymousClass0M3) r16).A02, true);
        }
    }
}
