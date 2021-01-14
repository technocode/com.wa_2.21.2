package X;

import android.content.Context;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2IG  reason: invalid class name */
public class AnonymousClass2IG {
    public AnonymousClass0YX A00;
    public AnonymousClass0D1 A01;
    public AnonymousClass3SQ A02;
    public List A03;
    public final C000300f A04;
    public final C017009c A05;
    public final AnonymousClass01A A06;
    public final AnonymousClass08C A07;
    public final AnonymousClass0L2 A08;
    public final AnonymousClass00G A09;
    public final AnonymousClass01X A0A;
    public final AnonymousClass0CN A0B;

    public AnonymousClass2IG(AnonymousClass00G r1, C000300f r2, AnonymousClass0CN r3, AnonymousClass0L2 r4, AnonymousClass01A r5, AnonymousClass01X r6, AnonymousClass08C r7, C017009c r8, AnonymousClass0D1 r9) {
        this.A09 = r1;
        this.A04 = r2;
        this.A0B = r3;
        this.A08 = r4;
        this.A06 = r5;
        this.A0A = r6;
        this.A07 = r7;
        this.A05 = r8;
        this.A01 = r9;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(AbstractC007503q r11) {
        byte b = r11.A0m;
        if (b != 0) {
            if (b == 1) {
                boolean A0q = r11.A0q();
                boolean z = r11.A0n.A02;
                if (A0q) {
                    return z ? 77 : 78;
                }
                if (!z) {
                    return 10;
                }
                return 1;
            } else if (b == 2) {
                int i = r11.A04;
                boolean z2 = r11.A0n.A02;
                if (i == 1) {
                    return z2 ? 7 : 16;
                }
                if (!z2) {
                    return 11;
                }
                return 2;
            } else if (b != 3) {
                if (b != 4) {
                    if (b != 5) {
                        if (b == 36) {
                            return 64;
                        }
                        if (b == 37) {
                            return r11.A0n.A02 ? 65 : 66;
                        }
                        if (b != 49) {
                            switch (b) {
                                case 9:
                                    if (AnonymousClass0FI.A0g(r11)) {
                                        int A0C = C002001d.A0C(r11);
                                        boolean z3 = r11.A0n.A02;
                                        if (A0C == 1) {
                                            if (z3) {
                                                return 5;
                                            }
                                            return 14;
                                        } else if (!z3) {
                                            return 29;
                                        } else {
                                            return 28;
                                        }
                                    } else if (!r11.A0n.A02) {
                                        return 17;
                                    } else {
                                        return 8;
                                    }
                                case 10:
                                    return 21;
                                case 11:
                                    if (r11.A0F == null) {
                                        return 20;
                                    }
                                    if (r11.A0n.A02) {
                                        return 35;
                                    }
                                    return 36;
                                case 12:
                                    AnonymousClass0MH r0 = r11.A0F;
                                    if (r0 == null || r0.A02 == 5) {
                                        return 22;
                                    }
                                    if (r11.A0n.A02) {
                                        return 35;
                                    }
                                    return 36;
                                case 13:
                                    return r11.A0n.A02 ? 24 : 25;
                                case 14:
                                    if (!r11.A0n.A02) {
                                        return 29;
                                    }
                                    return 28;
                                case 15:
                                    return r11.A0n.A02 ? 26 : 27;
                                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                                    return r11.A0n.A02 ? 30 : 31;
                                default:
                                    switch (b) {
                                        case 19:
                                            return 37;
                                        case AnonymousClass0PW.A01:
                                            return r11.A0n.A02 ? 38 : 39;
                                        case 21:
                                            return 43;
                                        case 22:
                                            return 44;
                                        case 23:
                                            return r11.A0n.A02 ? 45 : 46;
                                        case 24:
                                            return r11.A0n.A02 ? 47 : 48;
                                        case 25:
                                            return r11.A0n.A02 ? 50 : 51;
                                        case 26:
                                            return r11.A0n.A02 ? 52 : 53;
                                        case 27:
                                            return r11.A0n.A02 ? 54 : 55;
                                        case 28:
                                            return r11.A0n.A02 ? 56 : 57;
                                        case 29:
                                            return r11.A0n.A02 ? 58 : 59;
                                        case 30:
                                            return r11.A0n.A02 ? 60 : 61;
                                        case 31:
                                            AnonymousClass0MH r02 = r11.A0F;
                                            if (r02 == null || r02.A02 == 5) {
                                                return 49;
                                            }
                                            if (r11.A0n.A02) {
                                                return 35;
                                            }
                                            return 36;
                                        case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                            return r11.A0n.A02 ? 62 : 63;
                                        default:
                                            switch (b) {
                                                case 42:
                                                case 43:
                                                    return r11.A0n.A02 ? 71 : 72;
                                                case 44:
                                                    return r11.A0n.A02 ? 67 : 68;
                                                case 45:
                                                    return r11.A0n.A02 ? 69 : 70;
                                                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                                                    break;
                                                default:
                                                    if (r11.A08 != -1 || b != -1) {
                                                        return -1;
                                                    }
                                                    if (!r11.A0n.A02) {
                                                        return 15;
                                                    }
                                                    return 6;
                                            }
                                    }
                            }
                        }
                        if (r11.A0n.A02) {
                            return 0;
                        }
                        return 9;
                    } else if (!r11.A0n.A02) {
                        return 13;
                    } else {
                        return 4;
                    }
                } else if (r11.A0n.A02) {
                    return 5;
                } else {
                    return 14;
                }
            } else if (r11.A0q()) {
                return r11.A0n.A02 ? 75 : 76;
            } else {
                if (r11.A0n.A02) {
                    return 3;
                }
                return AnonymousClass0FI.A0e(r11) ? 12 : 23;
            }
        } else if (r11 instanceof C05390Oi) {
            int i2 = ((C05390Oi) r11).A00;
            boolean z4 = r11.A0n.A02;
            if (!z4 || i2 != 6) {
                if (i2 == 41 || i2 == 40 || i2 == 42) {
                    return 40;
                }
            } else if (((C12120ha) r11).A00 != null) {
                return 19;
            }
            if (!z4) {
                return 15;
            }
            return 6;
        } else if (r11.A0F == null) {
            boolean A0q2 = r11.A0q();
            boolean z5 = r11.A0n.A02;
            if (A0q2) {
                return z5 ? 73 : 74;
            }
            if (z5) {
                return 0;
            }
            return 9;
        } else if (r11.A0n.A02) {
            return 35;
        } else {
            return 36;
        }
    }

    public AnonymousClass0YX A01(Context context) {
        AnonymousClass0YX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0YX A032 = this.A08.A03(context);
        this.A00 = A032;
        return A032;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public AbstractC51572Zg A02(Context context, AbstractC007503q r6) {
        byte b = r6.A0m;
        if (b != 0) {
            if (b == 1) {
                boolean A0q = r6.A0q();
                AnonymousClass0MI r62 = (AnonymousClass0MI) r6;
                if (A0q) {
                    return new C60702pz(context, r62);
                }
                return new C60362pJ(context, r62);
            } else if (b == 2) {
                int i = r6.A04;
                AnonymousClass0MP r63 = (AnonymousClass0MP) r6;
                if (i == 1) {
                    return new C60742q3(context, r63, A01(context));
                }
                return new C60332pG(context, r63);
            } else if (b != 3) {
                if (b == 4) {
                    return new C59052my(context, r6, A01(context), A03());
                }
                if (b == 5) {
                    return new C59152nA(context, (C05470Or) r6);
                }
                if (b == 36) {
                    return new C59102n4(context, (C12190hh) r6);
                }
                if (b != 49) {
                    switch (b) {
                        case 9:
                            if (!AnonymousClass0FI.A0g(r6)) {
                                return new C60342pH(context, (AnonymousClass0M2) r6);
                            }
                            int A0C = C002001d.A0C(r6);
                            AnonymousClass0YX A012 = A01(context);
                            if (A0C == 1) {
                                return new C59052my(context, r6, A012, A03());
                            }
                            return new C59062mz(context, r6, A012, A03());
                        case 10:
                            return new C59172nC(context, (AnonymousClass0ZH) r6);
                        case 11:
                            if (r6.A0F != null) {
                                return new C59212nG(context, r6);
                            }
                            return new C59072n0(context, (AnonymousClass28B) r6);
                        case 12:
                            AnonymousClass0MH r0 = r6.A0F;
                            if (r0 == null || r0.A02 == 5) {
                                return new C59112n5(context, r6);
                            }
                            return new C59212nG(context, r6);
                        case 13:
                            C60352pI r1 = new C60352pI(context, (AnonymousClass0ZB) r6);
                            List list = this.A03;
                            if (list == null) {
                                list = new ArrayList();
                                this.A03 = list;
                            }
                            list.add(r1);
                            return r1;
                        case 14:
                            return new C59062mz(context, r6, A01(context), A03());
                        case 15:
                            return new C59232nI(context, (AnonymousClass0ZJ) r6);
                        case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                            return new C59142n9(context, (C02850Ds) r6, A01(context));
                        default:
                            switch (b) {
                                case 19:
                                    return new C59132n7(context, (AnonymousClass28C) r6);
                                case AnonymousClass0PW.A01:
                                    return new C60432pQ(context, (AnonymousClass0ZE) r6, this.A01);
                                case 21:
                                case 22:
                                    return new C59222nH(context, r6);
                                case 23:
                                    return new C60422pP(context, (AnonymousClass0Z9) r6);
                                case 24:
                                    return new C59122n6(context, (AnonymousClass0ZF) r6);
                                case 25:
                                    return new C60712q0(context, (AnonymousClass2B4) r6);
                                case 26:
                                    return new C60682px(context, (AnonymousClass2A6) r6);
                                case 27:
                                    return new C59262nL(context, (AnonymousClass28G) r6);
                                case 28:
                                    return new C60732q2(context, (AnonymousClass2CF) r6);
                                case 29:
                                    return new C60692py(context, (AnonymousClass2CE) r6);
                                case 30:
                                    return new C60392pM(context, (AnonymousClass2A7) r6);
                                case 31:
                                    if (r6.A0F != null) {
                                        return new C59212nG(context, r6);
                                    }
                                    return new C59182nD(context, (AnonymousClass28F) r6);
                                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                    break;
                                default:
                                    switch (b) {
                                        case 42:
                                            if (this.A04.A0D(AbstractC000400g.A2b)) {
                                                return new C60462pT(context, (AnonymousClass0M3) r6);
                                            }
                                            return new C59112n5(context, r6);
                                        case 43:
                                            if (this.A04.A0D(AbstractC000400g.A2b)) {
                                                return new C60462pT(context, (AnonymousClass0M3) r6);
                                            }
                                            return new C59112n5(context, r6);
                                        case 44:
                                            return new C59202nF(context, (AnonymousClass0ZA) r6);
                                        case 45:
                                            return new C59192nE(context, (AnonymousClass0ZN) r6);
                                        case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                                            break;
                                        default:
                                            if (r6.A08 == -1 && b == -1) {
                                                return new C59082n1(context, (C05390Oi) r6);
                                            }
                                            return new C59112n5(context, r6);
                                    }
                            }
                    }
                }
                return new C59242nJ(context, (C05490Ot) r6);
            } else if (r6.A0q()) {
                return new C60722q1(context, (AnonymousClass0ZC) r6);
            } else {
                AnonymousClass0ZC r12 = (AnonymousClass0ZC) r6;
                if (AnonymousClass0FI.A0e(r12) || r6.A0n.A02) {
                    return new C60452pS(context, r12);
                }
                return new C60382pL(context, r12);
            }
        } else if (r6 instanceof C05390Oi) {
            C05390Oi r2 = (C05390Oi) r6;
            int i2 = r2.A00;
            if (!r6.A0n.A02 || i2 != 6) {
                if (i2 == 41 || i2 == 40 || i2 == 42) {
                    return new C60402pN(context, r2);
                }
            } else if (((C12120ha) r6).A00 != null) {
                return new C60412pO(context, r2);
            }
            return new C59082n1(context, r2);
        } else if (r6.A0F != null) {
            return new C59212nG(context, r6);
        } else {
            boolean A0q2 = r6.A0q();
            C05490Ot r64 = (C05490Ot) r6;
            if (A0q2) {
                return new C59252nK(context, r64);
            }
            return new C59242nJ(context, r64);
        }
    }

    public AnonymousClass3SQ A03() {
        AnonymousClass3SQ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00G r1 = this.A09;
        AnonymousClass0CN r2 = this.A0B;
        AnonymousClass01A r3 = this.A06;
        AnonymousClass01X r4 = this.A0A;
        AnonymousClass08C r5 = this.A07;
        C017009c r6 = this.A05;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, new PriorityBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        AnonymousClass3SQ r02 = new AnonymousClass3SQ(r1, r2, r3, r4, r5, r6, threadPoolExecutor);
        this.A02 = r02;
        return r02;
    }
}
