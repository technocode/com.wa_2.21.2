package X;

import android.text.SpannableStringBuilder;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Locale;

/* renamed from: X.0Tw  reason: invalid class name and case insensitive filesystem */
public final class C06570Tw {
    public static final C06570Tw A03;
    public static final C06570Tw A04;
    public static final AbstractC06520Tq A05 = C06510Tp.A01;
    public static final String A06 = Character.toString(8206);
    public static final String A07 = Character.toString(8207);
    public final int A00 = 2;
    public final AbstractC06520Tq A01;
    public final boolean A02;

    static {
        AbstractC06520Tq r2 = A05;
        A03 = new C06570Tw(false, r2);
        A04 = new C06570Tw(true, r2);
    }

    public C06570Tw(boolean z, AbstractC06520Tq r3) {
        this.A02 = z;
        this.A01 = r3;
    }

    public static int A00(CharSequence charSequence) {
        byte directionality;
        C12570iJ r4 = new C12570iJ(charSequence);
        r4.A01 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = r4.A01;
            if (i4 < r4.A02) {
                if (i == 0) {
                    CharSequence charSequence2 = r4.A03;
                    char charAt = charSequence2.charAt(i4);
                    r4.A00 = charAt;
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(charSequence2, r4.A01);
                        r4.A01 = Character.charCount(codePointAt) + r4.A01;
                        directionality = Character.getDirectionality(codePointAt);
                    } else {
                        r4.A01++;
                        char c = r4.A00;
                        directionality = c < 1792 ? C12570iJ.A04[c] : Character.getDirectionality(c);
                    }
                    if (directionality != 0) {
                        if (directionality == 1 || directionality == 2) {
                            if (i3 == 0) {
                            }
                        } else if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                        return -1;
                    }
                    i = i3;
                }
            } else if (i == 0) {
                return 0;
            }
        }
        if (i2 != 0) {
            return i2;
        }
        while (r4.A01 > 0) {
            switch (r4.A00()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    break;
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    break;
                case 18:
                    i3++;
                    continue;
            }
            i3--;
        }
        return 0;
    }

    public static int A01(CharSequence charSequence) {
        C12570iJ r4 = new C12570iJ(charSequence);
        r4.A01 = r4.A02;
        int i = 0;
        int i2 = 0;
        while (r4.A01 > 0) {
            byte A002 = r4.A00();
            if (A002 != 0) {
                if (A002 == 1 || A002 == 2) {
                    if (i != 0) {
                        if (i2 != 0) {
                        }
                    }
                } else if (A002 != 9) {
                    switch (A002) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                        case 17:
                            if (i2 == i) {
                                break;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            }
                            break;
                    }
                } else {
                    continue;
                }
                return 1;
            } else if (i == 0) {
                return -1;
            } else {
                if (i2 != 0) {
                }
            }
            i2 = i;
        }
        return 0;
    }

    public static C06570Tw A02() {
        boolean z = true;
        if (C06560Tv.A00(Locale.getDefault()) != 1) {
            z = false;
        }
        AbstractC06520Tq r1 = A05;
        if (r1 != r1) {
            return new C06570Tw(z, r1);
        }
        if (z) {
            return A04;
        }
        return A03;
    }

    public CharSequence A03(CharSequence charSequence, AbstractC06520Tq r10) {
        AbstractC06520Tq r1;
        AbstractC06520Tq r12;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean A002 = ((AbstractC06530Tr) r10).A00(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = false;
        if ((this.A00 & 2) != 0) {
            z = true;
        }
        String str2 = "";
        if (z) {
            if (A002) {
                r12 = C06510Tp.A05;
            } else {
                r12 = C06510Tp.A04;
            }
            boolean A003 = ((AbstractC06530Tr) r12).A00(charSequence, charSequence.length());
            boolean z2 = this.A02;
            if (z2 || (!A003 && A00(charSequence) != 1)) {
                str = (!z2 || (A003 && A00(charSequence) != -1)) ? str2 : A07;
            } else {
                str = A06;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        boolean z3 = this.A02;
        if (A002 != z3) {
            char c = 8234;
            if (A002) {
                c = 8235;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (A002) {
            r1 = C06510Tp.A05;
        } else {
            r1 = C06510Tp.A04;
        }
        boolean A004 = ((AbstractC06530Tr) r1).A00(charSequence, charSequence.length());
        if (!z3) {
            if (A004 || A01(charSequence) == 1) {
                str2 = A06;
            }
        } else if (!A004 || A01(charSequence) == -1) {
            str2 = A07;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
