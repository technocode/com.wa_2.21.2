package X;

import android.content.SharedPreferences;

/* renamed from: X.0HP  reason: invalid class name */
public class AnonymousClass0HP {
    public static volatile AnonymousClass0HP A0A;
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass03P A08;
    public final AnonymousClass00D A09;

    public AnonymousClass0HP(AnonymousClass03P r4, AnonymousClass00D r5) {
        this.A08 = r4;
        this.A09 = r5;
        SharedPreferences sharedPreferences = r5.A00;
        this.A01 = sharedPreferences.getBoolean("pref_fail_too_many", false);
        this.A02 = sharedPreferences.getBoolean("pref_no_route_sms", false);
        this.A03 = sharedPreferences.getBoolean("pref_no_route_voice", false);
        this.A06 = sharedPreferences.getBoolean("pref_fail_too_many_attempts", false);
        this.A07 = sharedPreferences.getBoolean("pref_fail_too_many_guesses", false);
    }

    public static AnonymousClass0HP A00() {
        if (A0A == null) {
            synchronized (AnonymousClass0HP.class) {
                if (A0A == null) {
                    A0A = new AnonymousClass0HP(AnonymousClass03P.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A0A;
    }

    public String A01(String str) {
        boolean A0A2 = C007603r.A0A(this.A08);
        StringBuilder A0S = AnonymousClass008.A0S("VerificationFlowState/getContactUsContextInternal context ");
        A0S.append(this.A00);
        A0S.append(" phoneNumberIsEmpty ");
        A0S.append(this.A04);
        A0S.append(" phoneNumberIsValid ");
        A0S.append(this.A05);
        A0S.append(" noRouteSms ");
        A0S.append(this.A02);
        A0S.append(" noRouteVoice ");
        A0S.append(this.A03);
        A0S.append(" failTooMany ");
        AnonymousClass008.A1Z(A0S, this.A01);
        String str2 = this.A00;
        if ("register-phone".equals(str2)) {
            if (A0A2) {
                return "register-phone-rtd";
            }
            if (this.A04) {
                return "register-phone-no_number";
            }
            if (!this.A05) {
                return "register-phone-invalid";
            }
            return str;
        } else if (!"verify-sms".equals(str2)) {
            String str3 = "verify-tma";
            if (!str3.equals(str2)) {
                str3 = "verify-tmg";
                if (str3.equals(str2)) {
                    return str3;
                }
                return str;
            }
            return str3;
        } else if (A0A2) {
            return "verify-sms-rtd";
        } else {
            boolean z = this.A02;
            if (!z && !this.A03 && !this.A01) {
                return "verify-sms-normal";
            }
            boolean z2 = this.A03;
            if (z) {
                if (z2) {
                    return "verify-sms-no_routes_both";
                }
                return "verify-sms-no_routes_sms";
            } else if (z2) {
                return "verify-sms-no_routes_voice";
            } else {
                return str;
            }
        }
    }

    public void A02(String str) {
        this.A00 = str;
        if (str.equals("verify-tmg")) {
            this.A07 = true;
            this.A06 = false;
            this.A09.A0j(this.A01, this.A02, this.A03, false, true);
        } else if (str.equals("verify-tma")) {
            this.A07 = false;
            this.A06 = true;
            this.A09.A0j(this.A01, this.A02, this.A03, true, false);
        }
        if (!str.equals("verify-sms")) {
            return;
        }
        if (this.A07) {
            this.A00 = "verify-tmg";
        } else if (this.A06) {
            this.A00 = "verify-tma";
        }
    }

    public void A03(String str) {
        switch (str.hashCode()) {
            case -1976127222:
                if (str.equals("noRouteVoice")) {
                    this.A03 = true;
                    break;
                }
                break;
            case -1893373339:
                if (str.equals("validNumber")) {
                    this.A05 = true;
                    break;
                }
                break;
            case -1777505757:
                if (str.equals("notEmptyNumber")) {
                    this.A04 = false;
                    break;
                }
                break;
            case -1522953003:
                if (str.equals("failTooMany")) {
                    this.A01 = true;
                    break;
                }
                break;
            case -416647790:
                if (str.equals("notValidNumber")) {
                    this.A05 = false;
                    break;
                }
                break;
            case 1040735990:
                if (str.equals("emptyNumber")) {
                    this.A04 = true;
                    break;
                }
                break;
            case 1164419889:
                if (str.equals("noRouteSms")) {
                    this.A02 = true;
                    break;
                }
                break;
        }
        this.A09.A0j(this.A01, this.A02, this.A03, this.A06, this.A07);
    }
}
