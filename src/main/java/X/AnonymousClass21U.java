package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.21U  reason: invalid class name */
public class AnonymousClass21U extends AnonymousClass1NN implements Runnable, AnonymousClass1XK {
    public int A00;
    public AnonymousClass02U A01;
    public final AnonymousClass0A8 A02;
    public final AnonymousClass0EO A03;
    public final AnonymousClass1Xa A04;
    public final AnonymousClass0C4 A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public AnonymousClass21U(AnonymousClass0C4 r11, AnonymousClass0EO r12, AnonymousClass0A8 r13, AnonymousClass02U r14, String str, List list, int i, AnonymousClass1Xa r18) {
        this(r11, r12, r13, r14, str, list, i, r18, true);
    }

    public AnonymousClass21U(AnonymousClass0C4 r4, AnonymousClass0EO r5, AnonymousClass0A8 r6, AnonymousClass02U r7, String str, List list, int i, AnonymousClass1Xa r11, boolean z) {
        Log.a(r7 != null);
        this.A05 = r4;
        this.A03 = r5;
        this.A02 = r6;
        this.A01 = r7;
        this.A06 = str;
        this.A07 = list;
        this.A00 = i;
        this.A04 = r11;
        this.A08 = z;
        StringBuilder sb = new StringBuilder("GroupResponseHandler - gid:");
        sb.append(r7);
        sb.append(" subject:");
        String str2 = "";
        sb.append(str == null ? str2 : str);
        sb.append(" pa:");
        AnonymousClass008.A1S(sb, list != null ? Arrays.deepToString(list.toArray()) : str2);
    }

    @Override // X.AnonymousClass1NN
    public void A00() {
        AnonymousClass008.A1L(AnonymousClass008.A0S("groupmgr/group_request/timeout/type:"), this.A00);
        super.A01 = true;
        int i = this.A00;
        if (i != 30) {
            switch (i) {
                case 15:
                    AnonymousClass0EO.A02(1002, this.A01);
                    break;
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                    AnonymousClass0EO.A02(1001, this.A01);
                    break;
                case 17:
                    AnonymousClass0EO.A02(1007, this.A01);
                    break;
                default:
                    switch (i) {
                        case 91:
                            AnonymousClass0EO.A02(1005, this.A01);
                            break;
                        case 92:
                            AnonymousClass0EO.A02(1006, this.A01);
                            break;
                        case 93:
                            AnonymousClass0EO.A02(1004, this.A01);
                            break;
                    }
            }
        } else {
            AnonymousClass0EO.A02(1003, this.A01);
        }
        AnonymousClass1Xa r0 = this.A04;
        if (r0 != null) {
            this.A05.A0E(r0.A01, 500);
        }
        this.A02.A07(this.A01, false);
        A01();
    }

    public void A01() {
        AbstractC47272Hd r1;
        if (this instanceof C60032og) {
            C60032og r4 = (C60032og) this;
            C49332Qb r12 = r4.A00;
            if (!r12.A02.isFinishing()) {
                r12.A00.postDelayed(new RunnableEBaseShape10S0100000_I1_5(r4, 10), 300);
            }
        } else if (this instanceof C60022of) {
            ((C60022of) this).A00.A00.A0E();
        } else if (this instanceof C60012oe) {
            ((C60012oe) this).A00.A00.A0E();
        } else if (this instanceof C59972oa) {
            ((C59972oa) this).A00.A0E();
        } else if (this instanceof C59962oZ) {
            ((C59962oZ) this).A00.A0E();
        } else if (this instanceof C59952oY) {
            ((C59952oY) this).A00.A0E();
        } else if (this instanceof C59942oX) {
            ((C59942oX) this).A00.A0E();
        } else if (this instanceof C60552pg) {
            ((C60552pg) this).A00.A0E();
        } else if (this instanceof C59012mu) {
            C59012mu r3 = (C59012mu) this;
            C04360Kb r2 = r3.A01.A02;
            Jid A022 = r3.A02.A02(AnonymousClass02N.class);
            if (A022 != null) {
                r2.A0I((AnonymousClass02N) A022, true, true);
                AnonymousClass2ZH r0 = r3.A00;
                if (r0 != null && (r1 = r0.A00) != null) {
                    r1.AGe(r0.A01);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass1XK
    public void AN9(int i) {
        if (!(this instanceof C60032og)) {
            StringBuilder A0T = AnonymousClass008.A0T("groupmgr/request failed : ", i, " | ");
            A0T.append(this.A01);
            A0T.append(" | ");
            A0T.append(this.A00);
            Log.e(A0T.toString());
            super.A02.cancel();
            int i2 = this.A00;
            if (i2 != 30) {
                if (i2 != 159) {
                    if (i2 != 161) {
                        if (!(i2 == 213 || i2 == 224)) {
                            switch (i2) {
                                case 15:
                                    if (i != 401) {
                                        if (i != 408) {
                                            if (i != 429) {
                                                if (i != 403) {
                                                    if (i == 404) {
                                                        AnonymousClass0EO.A02(2013, null);
                                                        break;
                                                    } else {
                                                        AnonymousClass0EO.A02(2010, null);
                                                        break;
                                                    }
                                                } else {
                                                    AnonymousClass0EO.A02(2012, null);
                                                    break;
                                                }
                                            } else {
                                                AnonymousClass0EO.A02(3005, null);
                                                break;
                                            }
                                        } else {
                                            AnonymousClass0EO.A02(3007, null);
                                            break;
                                        }
                                    } else {
                                        AnonymousClass0EO.A02(2011, null);
                                        break;
                                    }
                                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                                    if (i != 403) {
                                        if (i == 404) {
                                            AnonymousClass0EO.A02(2024, null);
                                            break;
                                        } else {
                                            AnonymousClass0EO.A02(2022, null);
                                            break;
                                        }
                                    } else {
                                        AnonymousClass0EO.A02(2023, null);
                                        break;
                                    }
                                case 17:
                                    if (i != 401) {
                                        if (i != 406) {
                                            if (i != 403) {
                                                if (i == 404) {
                                                    AnonymousClass0EO.A02(2008, null);
                                                    break;
                                                } else {
                                                    AnonymousClass0EO.A02(2005, null);
                                                    break;
                                                }
                                            } else {
                                                AnonymousClass0EO.A02(2007, null);
                                                break;
                                            }
                                        } else {
                                            AnonymousClass0EO.A02(2009, this.A06);
                                            break;
                                        }
                                    } else {
                                        AnonymousClass0EO.A02(2006, null);
                                        break;
                                    }
                                default:
                                    switch (i2) {
                                        case 91:
                                        case 92:
                                            if (i != 401) {
                                                if (i != 403) {
                                                    if (i == 404) {
                                                        AnonymousClass0EO.A02(2021, null);
                                                        break;
                                                    } else {
                                                        AnonymousClass0EO.A02(2018, null);
                                                        break;
                                                    }
                                                } else {
                                                    AnonymousClass0EO.A02(2020, null);
                                                    break;
                                                }
                                            } else {
                                                AnonymousClass0EO.A02(2019, null);
                                                break;
                                            }
                                        case 93:
                                            AnonymousClass0EO.A02(2025, null);
                                            break;
                                    }
                            }
                        }
                    } else if (i == 401) {
                        AnonymousClass0EO.A02(3010, null);
                    } else if (i == 403) {
                        AnonymousClass0EO.A02(3011, null);
                    } else if (i == 405) {
                        AnonymousClass0EO.A02(3014, null);
                    } else if (i != 419) {
                        AnonymousClass0EO.A02(3012, null);
                    } else {
                        AnonymousClass0EO.A02(3013, null);
                    }
                }
                if (i == 400) {
                    AnonymousClass0EO.A02(3018, null);
                } else if (i == 401) {
                    AnonymousClass0EO.A02(3010, null);
                } else if (i != 403) {
                    AnonymousClass0EO.A02(3012, null);
                } else {
                    AnonymousClass0EO.A02(3011, null);
                }
            } else if (i == 401) {
                AnonymousClass0EO.A02(2015, null);
            } else if (i == 403) {
                AnonymousClass0EO.A02(2016, null);
            } else if (i != 404) {
                AnonymousClass0EO.A02(2014, null);
            } else {
                AnonymousClass0EO.A02(2017, null);
            }
            AnonymousClass1Xa r0 = this.A04;
            if (r0 != null) {
                this.A05.A0E(r0.A01, i);
            }
            this.A02.A07(this.A01, false);
            A01();
            return;
        }
        C60032og r3 = (C60032og) this;
        AnonymousClass02M r2 = r3.A00.A03;
        r2.A02.post(new RunnableEBaseShape1S0101000_I1(r3, i, 13));
        r3.A01();
    }

    public void run() {
        super.A02.cancel();
        StringBuilder sb = new StringBuilder("groupmgr/request success/");
        sb.append(this.A00);
        Log.i(sb.toString());
        A01();
    }
}
