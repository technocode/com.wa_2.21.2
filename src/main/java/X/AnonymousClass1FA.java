package X;

import java.util.logging.Level;
import java.util.regex.Matcher;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: X.1FA  reason: invalid class name */
public abstract class AnonymousClass1FA extends Enum {
    public static final /* synthetic */ AnonymousClass1FA[] A00;
    public static final AnonymousClass1FA A01;
    public static final AnonymousClass1FA A02;
    public static final AnonymousClass1FA A03;
    public static final AnonymousClass1FA A04;
    public static final AnonymousClass1FA A05;

    static {
        C37081nW r9 = new C37081nW();
        A02 = r9;
        C37091nX r7 = new C37091nX();
        A04 = r7;
        C37101nY r5 = new C37101nY();
        A05 = r5;
        C37121na r3 = new C37121na();
        A03 = r3;
        C37141nc r1 = new C37141nc();
        A01 = r1;
        A00 = new AnonymousClass1FA[]{r9, r7, r5, r3, r1};
    }

    public AnonymousClass1FA(String str, int i) {
    }

    public boolean A00(C12490iB r6, String str, C12440i6 r8) {
        AnonymousClass1FD r1;
        if (!(this instanceof C37141nc)) {
            if (!(this instanceof C37121na)) {
                if (this instanceof C37101nY) {
                    AnonymousClass1FA r3 = A04;
                    if (r3.A00(r6, str, r8)) {
                        return true;
                    }
                    if (r6.hasNationalNumber) {
                        String valueOf = String.valueOf(r6.nationalNumber_);
                        if (valueOf.startsWith("8") && r6.hasCountryCode && r6.countryCode_ == 7 && r6.hasCountryCodeSource && r6.countryCodeSource_ == EnumC12500iC.FROM_DEFAULT_COUNTRY) {
                            long parseLong = Long.parseLong(valueOf.substring(1));
                            r6.hasNationalNumber = true;
                            r6.nationalNumber_ = parseLong;
                            EnumC12500iC r0 = EnumC12500iC.FROM_NUMBER_WITHOUT_PLUS_SIGN;
                            r6.hasCountryCodeSource = true;
                            r6.countryCodeSource_ = r0;
                            return r3.A00(r6, str, r8);
                        }
                    }
                    if (!r6.hasItalianLeadingZero || !r6.italianLeadingZero_) {
                        return false;
                    }
                    r6.hasItalianLeadingZero = false;
                    r6.italianLeadingZero_ = false;
                    return r3.A00(r6, str, r8);
                } else if (!(this instanceof C37091nX)) {
                    AnonymousClass1FD r32 = AnonymousClass1FD.IS_POSSIBLE;
                    String A012 = C12440i6.A01(r6);
                    int i = r6.countryCode_;
                    if (!r8.A03.containsKey(Integer.valueOf(i))) {
                        r1 = AnonymousClass1FD.INVALID_COUNTRY_CODE;
                    } else {
                        C12530iF A0C = r8.A0C(i, r8.A0F(i));
                        if (A0C != null) {
                            C12550iH r2 = A0C.generalDesc_;
                            if (!r2.hasNationalNumberPattern) {
                                C12440i6.A0G.log(Level.FINER, "Checking if number is possible with incomplete metadata.");
                                int length = A012.length();
                                if (length < 2) {
                                    r1 = AnonymousClass1FD.TOO_SHORT;
                                } else {
                                    r1 = length > 16 ? AnonymousClass1FD.TOO_LONG : r32;
                                }
                            } else {
                                Matcher matcher = r8.A00.A00(r2.possibleNumberPattern_).matcher(A012);
                                if (matcher.matches()) {
                                    r1 = r32;
                                } else if (matcher.lookingAt()) {
                                    r1 = AnonymousClass1FD.TOO_LONG;
                                } else {
                                    r1 = AnonymousClass1FD.TOO_SHORT;
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    return r1 == r32;
                } else if (!r8.A0K(r6) || !AnonymousClass1F9.A04(r6, str, r8)) {
                    return false;
                } else {
                    return AnonymousClass1F9.A03(r6, r8);
                }
            } else if (!r8.A0K(r6) || !AnonymousClass1F9.A04(r6, str, r8)) {
                return false;
            } else {
                int indexOf = str.indexOf(47);
                if ((indexOf <= 0 || !str.substring(indexOf + 1).contains("/")) && AnonymousClass1F9.A03(r6, r8)) {
                    return AnonymousClass1F9.A05(r6, str, r8, new C37111nZ());
                }
                return false;
            }
        } else if (!r8.A0K(r6) || !AnonymousClass1F9.A04(r6, str, r8)) {
            return false;
        } else {
            int indexOf2 = str.indexOf(47);
            if ((indexOf2 <= 0 || !str.substring(indexOf2 + 1).contains("/")) && AnonymousClass1F9.A03(r6, r8)) {
                return AnonymousClass1F9.A05(r6, str, r8, new C37131nb());
            }
            return false;
        }
    }

    public static AnonymousClass1FA valueOf(String str) {
        return (AnonymousClass1FA) Enum.valueOf(AnonymousClass1FA.class, str);
    }

    public static AnonymousClass1FA[] values() {
        return (AnonymousClass1FA[]) A00.clone();
    }
}
