package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: X.3Y6  reason: invalid class name */
public abstract class AnonymousClass3Y6 implements AbstractC07650Yy {
    public final C01970Ad A00;

    @Override // X.AbstractC07650Yy
    public int A5h(String str) {
        return SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    @Override // X.AnonymousClass0RJ
    public AbstractC460727x AAe() {
        return null;
    }

    public AnonymousClass3Y6(C01970Ad r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC07650Yy
    public boolean A2W() {
        return !(this instanceof C74803bW);
    }

    @Override // X.AbstractC07650Yy
    public Class A4f() {
        if (!(this instanceof C74803bW)) {
            return BrazilPayBloksActivity.class;
        }
        return IndiaUpiPaymentsAccountSetupActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public C449222e A5X() {
        if (!(this instanceof C74803bW)) {
            return null;
        }
        return ((C74803bW) this).A07;
    }

    @Override // X.AbstractC07650Yy
    public AnonymousClass3DT A5a() {
        if (!(this instanceof C74793bV)) {
            return null;
        }
        if (AnonymousClass3DT.A03 == null) {
            synchronized (AnonymousClass3DT.class) {
                if (AnonymousClass3DT.A03 == null) {
                    AnonymousClass3DT.A03 = new AnonymousClass3DT(C018709t.A01(), C63842x6.A00(), C60862s7.A00());
                }
            }
        }
        return AnonymousClass3DT.A03;
    }

    @Override // X.AbstractC07650Yy
    public AbstractC29051Wv A5s() {
        if (!(this instanceof C74803bW)) {
            return null;
        }
        C74803bW r0 = (C74803bW) this;
        return new C68733Ei(r0.A00, r0.A01, r0.A0J, r0.A05, r0.A0I, ((AnonymousClass3Y6) r0).A00, r0.A0H, r0.A02, r0.A0A, r0.A0E, r0.A0B, r0.A0C, r0.A0D);
    }

    @Override // X.AbstractC07650Yy
    public AnonymousClass0M5 A7Z(AnonymousClass2bX r9) {
        double doubleValue = r9.A02.A00.doubleValue();
        int i = r9.A00;
        return new AnonymousClass0M5("money", new AnonymousClass0OS[]{new AnonymousClass0OS("value", (int) (doubleValue * ((double) i))), new AnonymousClass0OS("offset", i), new AnonymousClass0OS("currency", r9.A01.A5e(), null, (byte) 0)}, null, null);
    }

    @Override // X.AbstractC07650Yy
    public AnonymousClass0M5 A80(C007303n r5, AnonymousClass0MH r6) {
        AnonymousClass2bX r1;
        AbstractC43791yx r0 = r6.A07;
        if (r0 == null || (r1 = r0.A00) == null) {
            return null;
        }
        return new AnonymousClass0M5("amount", new AnonymousClass0OS[0], A7Z(r1));
    }

    @Override // X.AbstractC07650Yy
    public List A81(C007303n r12, AnonymousClass0MH r13) {
        String str;
        AbstractC07650Yy r0;
        AnonymousClass3DT r7;
        C74723bO r02;
        String str2;
        String str3;
        AnonymousClass0OS r4 = null;
        if (r13.A0K()) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass008.A1F("type", "request", arrayList);
            if (AnonymousClass1VY.A0Y(r12.A00)) {
                UserJid userJid = r13.A0A;
                if (userJid != null) {
                    arrayList.add(new AnonymousClass0OS("sender", userJid));
                } else {
                    throw null;
                }
            }
            String str4 = r13.A0G;
            if (str4 != null) {
                AnonymousClass008.A1F("request-id", str4, arrayList);
            }
            AbstractC43791yx r03 = r13.A07;
            if (r03 != null) {
                arrayList.add(new AnonymousClass0OS("expiry-ts", Long.toString(r03.A04() / 1000), null, (byte) 0));
            }
            if (!TextUtils.isEmpty(r13.A0C)) {
                String str5 = r13.A0C;
                arrayList.add(new AnonymousClass0OS("country", str5, null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("version", AnonymousClass0MH.A01(str5)));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AnonymousClass0OS("type", "send", null, (byte) 0));
        arrayList2.add(new AnonymousClass0OS("currency", r13.A0E, null, (byte) 0));
        C05900Qy r04 = r13.A06;
        if (r04 != null) {
            arrayList2.add(new AnonymousClass0OS("amount", r04.toString(), null, (byte) 0));
            if (r13.A02 == 100) {
                str = "p2m";
            } else {
                str = "p2p";
            }
            arrayList2.add(new AnonymousClass0OS("transaction-type", str, null, (byte) 0));
            if (AnonymousClass1VY.A0Y(r12.A00)) {
                UserJid userJid2 = r13.A09;
                if (userJid2 != null) {
                    arrayList2.add(new AnonymousClass0OS("receiver", userJid2));
                } else {
                    throw null;
                }
            }
            ArrayList arrayList3 = r13.A0J;
            if (arrayList3 != null && arrayList3.size() == 1) {
                arrayList2.add(new AnonymousClass0OS("credential-id", ((AnonymousClass2LW) arrayList3.get(0)).A01.A07, null, (byte) 0));
            }
            AbstractC43791yx r10 = r13.A07;
            if (r10 != null) {
                if (r10 instanceof AnonymousClass3Y3) {
                    AnonymousClass3Y3 r102 = (AnonymousClass3Y3) r10;
                    if (!TextUtils.isEmpty(r102.A03)) {
                        arrayList2.add(new AnonymousClass0OS("nonce", r102.A03, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r102.A02)) {
                        arrayList2.add(new AnonymousClass0OS("device-id", r102.A02, null, (byte) 0));
                    }
                } else if (r10 instanceof AnonymousClass3XM) {
                    AnonymousClass3XM r103 = (AnonymousClass3XM) r10;
                    if (!TextUtils.isEmpty(r103.A0G)) {
                        arrayList2.add(new AnonymousClass0OS("mpin", r103.A0G, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r103.A0D)) {
                        arrayList2.add(new AnonymousClass0OS("seq-no", r103.A0D, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r103.A0B)) {
                        arrayList2.add(new AnonymousClass0OS("sender-vpa", r103.A0B, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r103.A0C)) {
                        arrayList2.add(new AnonymousClass0OS("sender-vpa-id", r103.A0C, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r103.A09)) {
                        arrayList2.add(new AnonymousClass0OS("receiver-vpa", r103.A09, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r103.A0A)) {
                        arrayList2.add(new AnonymousClass0OS("receiver-vpa-id", r103.A0A, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r103.A07)) {
                        arrayList2.add(new AnonymousClass0OS("device-id", r103.A07, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r103.A0F)) {
                        arrayList2.add(new AnonymousClass0OS("upi-bank-info", r103.A0F, null, (byte) 0));
                    }
                }
            }
            if (AnonymousClass0MH.A07(r13.A0G)) {
                String str6 = r13.A0G;
                if (str6 != null) {
                    arrayList2.add(new AnonymousClass0OS("id", str6, null, (byte) 0));
                } else {
                    throw null;
                }
            }
            if (r13.A0I != null) {
                C01970Ad r05 = this.A00;
                r05.A04();
                AnonymousClass0MH A0M = r05.A05.A0M(r13.A0I, null);
                if (!(A0M == null || (str3 = A0M.A0G) == null)) {
                    AnonymousClass008.A1F("request-id", str3, arrayList2);
                }
            }
            if (!TextUtils.isEmpty(r13.A0C)) {
                String str7 = r13.A0C;
                arrayList2.add(new AnonymousClass0OS("country", str7, null, (byte) 0));
                arrayList2.add(new AnonymousClass0OS("version", String.valueOf(AnonymousClass0MH.A01(str7)), null, (byte) 0));
            }
            AnonymousClass1X1 A02 = this.A00.A02(r13.A0C);
            if (A02 != null) {
                r0 = A02.A8I(r13.A0E);
            } else {
                r0 = null;
            }
            if (r0 != null) {
                r7 = r0.A5a();
            } else {
                r7 = null;
            }
            if (r7 != null) {
                String str8 = r13.A0D;
                String A022 = r7.A02.A02();
                AnonymousClass1VM A08 = r7.A00.A08(str8);
                if (A08 == null) {
                    r02 = null;
                } else {
                    r02 = (C74723bO) A08.A06;
                }
                if (r02 != null && "VISA".equals(r02.A03)) {
                    C60862s7 r2 = r7.A01;
                    String str9 = r02.A06;
                    if (r2 != null) {
                        try {
                            str2 = r2.A05(r2.A06(true), C60862s7.A01(A022, null, str9));
                        } catch (JSONException e) {
                            Log.w("PAY: generateTrustedDeviceInfoJwsToken threw creating json string: ", e);
                            str2 = null;
                        }
                        if (str2 != null) {
                            r4 = new AnonymousClass0OS("trusted-device-info", str2, null, (byte) 0);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            if (r4 != null) {
                arrayList2.add(r4);
            }
            return arrayList2;
        }
        throw null;
    }

    @Override // X.AbstractC07650Yy
    public AbstractC664834n A82(AnonymousClass01X r2) {
        return new C51872aB(r2);
    }

    @Override // X.AbstractC07650Yy
    public Class A87() {
        if (!(this instanceof C74793bV)) {
            return null;
        }
        return BrazilFbPayHubActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public Class A89() {
        return PaymentTransactionHistoryActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public int A8B() {
        if (!(this instanceof C74803bW)) {
            return 0;
        }
        return R.string.india_upi_payment_id_name;
    }

    @Override // X.AbstractC07650Yy
    public Pattern A8C() {
        if (!(this instanceof C74803bW)) {
            return null;
        }
        return C63832x5.A02;
    }

    @Override // X.AbstractC07650Yy
    public Class A8E() {
        if (!(this instanceof C74803bW)) {
            return null;
        }
        return IndiaUpiVpaContactInfoActivity.class;
    }

    @Override // X.AbstractC07650Yy
    public int A8F() {
        if (!(this instanceof C74803bW)) {
            return 0;
        }
        return R.string.india_upi_payment_pin_name;
    }

    @Override // X.AbstractC07650Yy
    public AnonymousClass3DZ A8G() {
        if (!(this instanceof C74803bW)) {
            return null;
        }
        return new AnonymousClass3DZ(((C74803bW) this).A09);
    }

    @Override // X.AbstractC07650Yy
    public Class A8M() {
        if (!(this instanceof C74803bW)) {
            return null;
        }
        return IndiaUpiResetPinActivity.class;
    }

    @Override // X.AnonymousClass0RJ
    public AbstractC460627w AAa() {
        if (!(this instanceof C74793bV)) {
            return null;
        }
        return new C74723bO();
    }

    @Override // X.AnonymousClass0RJ
    public AbstractC59432ne AAc() {
        if (!(this instanceof C74793bV)) {
            return null;
        }
        return new C74733bP();
    }

    @Override // X.AbstractC07650Yy
    public void ACY(Context context, AbstractC004502c r6, AbstractC007503q r7) {
        if (this instanceof C74793bV) {
            C74793bV r2 = (C74793bV) this;
            String A02 = r2.A0B.A02(true);
            if (A02 != null) {
                Intent intent = new Intent(context, BrazilPayBloksActivity.class);
                intent.putExtra("screen_name", A02);
                AnonymousClass2DC.A05(intent, "get_started");
                AnonymousClass3GP r1 = new AnonymousClass3GP(intent, null, r2.A05.A06(R.string.accept_payment_add_debit_bottom_sheet_desc), null);
                AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
                addPaymentMethodBottomSheet.A0N(new Bundle());
                addPaymentMethodBottomSheet.A00 = r1;
                addPaymentMethodBottomSheet.A01 = new RunnableEBaseShape11S0100000_I1_6(addPaymentMethodBottomSheet, 18);
                r6.APm(addPaymentMethodBottomSheet);
                return;
            }
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A01 = new BrazilConfirmReceivePaymentFragment();
            r6.APm(paymentBottomSheet);
        } else if (r7.A0F != null) {
            Intent intent2 = new Intent(context, A4f());
            intent2.putExtra("extra_setup_mode", 2);
            intent2.putExtra("extra_receive_nux", true);
            if (r7.A0F.A07 != null && !TextUtils.isEmpty(null)) {
                intent2.putExtra("extra_onboarding_provider", (String) null);
            }
            context.startActivity(intent2);
        } else {
            throw null;
        }
    }

    @Override // X.AbstractC07650Yy
    public boolean APZ() {
        return this instanceof C74793bV;
    }
}
