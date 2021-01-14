package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.0HU  reason: invalid class name */
public abstract class AnonymousClass0HU extends ActivityC004602e implements AnonymousClass0HV {
    public static int A0L = 7;
    public static long A0M;
    public static String A0N;
    public static String A0O;
    public ProgressDialog A00;
    public AnonymousClass30A A01;
    public AnonymousClass30C A02;
    public String A03;
    public boolean A04 = true;
    public boolean A05 = false;
    public final C03290Fp A06 = C03290Fp.A00();
    public final AnonymousClass03B A07 = AnonymousClass03B.A00();
    public final AnonymousClass0GZ A08 = AnonymousClass0GZ.A00();
    public final AnonymousClass04j A09 = AnonymousClass04j.A00();
    public final AnonymousClass03P A0A = AnonymousClass03P.A00();
    public final AnonymousClass00S A0B = AnonymousClass00S.A00();
    public final AnonymousClass03S A0C = AnonymousClass03S.A00();
    public final AnonymousClass2OC A0D = AnonymousClass2OC.A00();
    public final AnonymousClass2OL A0E = AnonymousClass2OL.A00();
    public final C03200Fe A0F = C03200Fe.A00();
    public final AnonymousClass0KP A0G = AnonymousClass0KP.A00();
    public final AnonymousClass0HM A0H = AnonymousClass0HM.A00();
    public final AnonymousClass325 A0I = AnonymousClass325.A00();
    public final C03190Fd A0J = C03190Fd.A00();
    public final AnonymousClass00T A0K = C002101e.A00();

    public static int A05(AnonymousClass0CO r9, String str, String str2) {
        try {
            int length = str.length();
            if (length < 1 || length > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("enterphone/cc/bad-length cc=");
                sb.append(str);
                Log.w(sb.toString());
                return 2;
            }
            try {
                if (AbstractC05840Ql.A01.indexOfKey(Integer.parseInt(str)) >= 0) {
                    if (str2 == null || str2.length() == 0 || str2.replaceAll("\\D", "").length() == 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("enterphone/num/error/empty cc=");
                        sb2.append(str);
                        Log.w(sb2.toString());
                        return 4;
                    }
                    int parseInt = Integer.parseInt(str);
                    String A022 = r9.A02(parseInt, str2.replaceAll("\\D", ""));
                    int length2 = A022.length();
                    r9.A06();
                    Iterator it = r9.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C12520iE r1 = (C12520iE) it.next();
                        if (r1.A00 == parseInt) {
                            int A002 = r1.A00(length2);
                            if (A002 != 0) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("enterphone/num/error/invalid cc=");
                                sb3.append(parseInt);
                                sb3.append(" phone=");
                                sb3.append(A022);
                                sb3.append(" res=");
                                sb3.append(A002);
                                Log.w(sb3.toString());
                                return A002 < 0 ? 5 : 6;
                            }
                        }
                    }
                    int i = length + length2;
                    if (i <= 15 && i >= 8) {
                        return 1;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("enterphone/num/error/length cc=");
                    sb4.append(str);
                    sb4.append(" ph=");
                    sb4.append(A022);
                    Log.w(sb4.toString());
                    return 7;
                }
            } catch (NumberFormatException unused) {
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("enterphone/cc/bad-name ");
            sb5.append(str);
            Log.w(sb5.toString());
            return 3;
        } catch (IOException e) {
            Log.e("enterphone/error trimLeadingZero or nativeNameFromCallingCode from CountryPhoneInfo IOException", e);
            return 7;
        }
    }

    public static String A06(AnonymousClass01X r5) {
        return r5.A0D(R.string.register_bad_cc_length_with_placeholders, 1, 3);
    }

    public void A0T() {
        if (this instanceof RegisterPhone) {
            SharedPreferences.Editor edit = ((RegisterPhone) this).getPreferences(0).edit();
            edit.putInt("com.whatsapp.registration.RegisterPhone.verification_state", A0L);
            if (!edit.commit()) {
                Log.w("registerphone/savestate/commit failed");
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = new AnonymousClass30C(this, super.A0J);
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 9) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.register_connecting));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            this.A00 = progressDialog;
            return progressDialog;
        } else if (i == 22) {
            Log.w("enterphone/dialog/unrecoverable-error");
            AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
            String A062 = r5.A06(R.string.register_unrecoverable_error);
            StringBuilder A0S = AnonymousClass008.A0S("register-phone2 +");
            A0S.append(A0N);
            A0S.append(A0O);
            String obj = A0S.toString();
            AnonymousClass0MB r2 = new AnonymousClass0MB(this);
            r2.A01.A0E = A062;
            r2.A07(r5.A06(R.string.register_contact_support), new DialogInterface$OnClickListenerC65112zK(this, obj));
            r2.A05(r5.A06(R.string.cancel), new DialogInterface$OnClickListenerC65102zJ(this));
            return r2.A00();
        } else if (i == 109) {
            return AnonymousClass0JE.A05(this, this.A0K, this.A0A, ((AnonymousClass2C0) this).A01, this.A09, this.A0C, this.A0G);
        } else {
            if (i == 114) {
                DialogC40171sk r1 = new DialogC40171sk(this, ((AnonymousClass2C0) this).A01, this.A07, ((ActivityC004602e) this).A04, this, this.A08);
                r1.setOnCancelListener(new AnonymousClass18B(this));
                return r1;
            } else if (i == 124) {
                return AnonymousClass0JE.A04(this, ((AnonymousClass2C0) this).A01, A0N, A0O, null);
            } else {
                if (i != 125) {
                    return super.onCreateDialog(i);
                }
                return AnonymousClass0JE.A03(this, ((AnonymousClass2C0) this).A01, A0N, A0O);
            }
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        AnonymousClass30C r1 = this.A02;
        r1.A02 = true;
        AnonymousClass0JE.A0H(r1.A04, AnonymousClass0JE.A00);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A02.A00();
    }
}
