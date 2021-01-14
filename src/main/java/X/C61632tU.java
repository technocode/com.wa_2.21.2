package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.Calendar;

/* renamed from: X.2tU  reason: invalid class name and case insensitive filesystem */
public class C61632tU {
    public static volatile C61632tU A04;
    public String A00 = "0";
    public final C61612tS A01;
    public final C018809u A02 = C018809u.A00("PaymentsDobManager", "infra", "COMMON");
    public final C03190Fd A03;

    public C61632tU(C03190Fd r4, C61612tS r5) {
        this.A03 = r4;
        this.A01 = r5;
    }

    public static C61632tU A00() {
        if (A04 == null) {
            synchronized (C61632tU.class) {
                if (A04 == null) {
                    C03190Fd A002 = C03190Fd.A00();
                    if (C61612tS.A01 == null) {
                        synchronized (C61612tS.class) {
                            if (C61612tS.A01 == null) {
                                C61612tS.A01 = new C61612tS(AnonymousClass00S.A00());
                            }
                        }
                    }
                    A04 = new C61632tU(A002, C61612tS.A01);
                }
            }
        }
        return A04;
    }

    public AnonymousClass0M5 A01(int i, int i2, int i3) {
        C61612tS r1 = this.A01;
        if (r1 == null) {
            throw null;
        } else if (i2 < 0 || i2 > 11) {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Months are 0 indexed, invalid month: ", i2));
        } else {
            Calendar instance = Calendar.getInstance();
            instance.set(i, i2, i3);
            instance.setLenient(false);
            try {
                instance.getTime();
                Calendar instance2 = Calendar.getInstance();
                instance2.setTimeInMillis(r1.A00.A05());
                int i4 = instance2.get(1) - instance.get(1);
                int i5 = instance.get(2);
                int i6 = instance2.get(2);
                if (i5 > i6 || (i5 == i6 && instance.get(5) > instance2.get(5))) {
                    i4--;
                }
                String str = "2";
                if (this.A03.A05()) {
                    if (i4 < 16) {
                        this.A00 = str;
                    } else if (i4 < 18) {
                        this.A00 = "1";
                        str = "1";
                    } else {
                        this.A00 = "0";
                        str = "0";
                    }
                } else if (i4 < 13) {
                    this.A00 = str;
                } else if (i4 < 18) {
                    this.A00 = "1";
                    str = "1";
                } else {
                    this.A00 = "0";
                    str = "0";
                }
                if (str.equals("0")) {
                    return new AnonymousClass0M5("dob", new AnonymousClass0OS[]{new AnonymousClass0OS("state", "0", null, (byte) 0), new AnonymousClass0OS("day", i3), new AnonymousClass0OS("month", i2 + 1), new AnonymousClass0OS("year", i)}, null, null);
                }
                return new AnonymousClass0M5("dob", new AnonymousClass0OS[]{new AnonymousClass0OS("state", str, null, (byte) 0)}, null, null);
            } catch (Exception unused) {
                StringBuilder A0U = AnonymousClass008.A0U("Date format invalid. Year: ", i, " Month: ", i2, " Day: ");
                A0U.append(i3);
                throw new IllegalArgumentException(A0U.toString());
            }
        }
    }

    public boolean A02(ActivityC004702f r5, C61072sS r6) {
        C018809u r2 = this.A02;
        StringBuilder sb = new StringBuilder("maybeHandleUnderageError: ");
        sb.append(r6);
        r2.A07(null, sb.toString(), null);
        if (r6.code != 2896001) {
            return false;
        }
        PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("arg_is_underage_unavailability", true);
        paymentsUnavailableDialogFragment.A0N(bundle);
        r5.APm(paymentsUnavailableDialogFragment);
        return true;
    }
}
