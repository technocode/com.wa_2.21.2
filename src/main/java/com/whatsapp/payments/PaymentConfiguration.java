package com.whatsapp.payments;

import X.AbstractC05890Qx;
import X.AbstractC07650Yy;
import X.AbstractC449322f;
import X.AnonymousClass008;
import X.AnonymousClass1X1;
import X.C02020Ai;
import X.C02040Ak;
import X.C05870Qv;
import X.C61002sL;
import X.C61012sM;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Locale;

public class PaymentConfiguration implements AbstractC449322f {
    public static volatile PaymentConfiguration INSTANCE;
    public AnonymousClass1X1 cachedPaymentFactory;
    public final C61012sM paymentConfigurationMap;
    public final C02020Ai paymentsCountryManager;
    public final C02040Ak paymentsGatingManager;

    public PaymentConfiguration(C02040Ak r1, C02020Ai r2, C61012sM r3) {
        this.paymentsGatingManager = r1;
        this.paymentsCountryManager = r2;
        this.paymentConfigurationMap = r3;
    }

    public static AbstractC449322f getInstance() {
        if (INSTANCE == null) {
            synchronized (PaymentConfiguration.class) {
                if (INSTANCE == null) {
                    C02040Ak A00 = C02040Ak.A00();
                    C02020Ai A002 = C02020Ai.A00();
                    if (C61012sM.A01 == null) {
                        synchronized (C61012sM.class) {
                            if (C61012sM.A01 == null) {
                                C61012sM.A01 = new C61012sM(new C61002sL());
                            }
                        }
                    }
                    INSTANCE = new PaymentConfiguration(A00, A002, C61012sM.A01);
                }
            }
        }
        return INSTANCE;
    }

    @Override // X.AbstractC449322f
    public AbstractC07650Yy getPaymentService(String str, String str2) {
        C61012sM r5 = this.paymentConfigurationMap;
        if (r5 != null) {
            if (str != null) {
                str = str.toUpperCase(Locale.US);
            }
            if (!r5.A00.containsKey(str)) {
                AnonymousClass008.A17("PAY: PaymentConfigurationMap/getPaymentFactory/unmapped service for country code=", str);
                return null;
            }
            if (str2 != null) {
                str2 = str2.toUpperCase(Locale.US);
            }
            if (!TextUtils.isEmpty(str2)) {
                int hashCode = str2.hashCode();
                if (hashCode != 66044) {
                    if (hashCode == 72653 && str2.equals("INR")) {
                        return (AbstractC07650Yy) r5.A00.get("IN");
                    }
                } else if (str2.equals("BRL")) {
                    return (AbstractC07650Yy) r5.A00.get("BR");
                }
                Log.e("PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for currency");
            }
            if (!TextUtils.isEmpty(str)) {
                int hashCode2 = str.hashCode();
                if (hashCode2 != 2128) {
                    if (hashCode2 == 2341 && str.equals("IN")) {
                        return (AbstractC07650Yy) r5.A00.get("IN");
                    }
                } else if (str.equals("BR")) {
                    return (AbstractC07650Yy) r5.A00.get("BR");
                }
                StringBuilder sb = new StringBuilder("PAY: PaymentConfigurationMap/getPaymentService/country=");
                sb.append(str);
                sb.append("/unmapped service");
                Log.e(sb.toString());
            }
            Log.e("PAY: PaymentConfigurationMap/getPaymentService/unmapped service for country and currency");
            return null;
        }
        throw null;
    }

    @Override // X.AnonymousClass0RI, X.AbstractC449322f
    public AbstractC07650Yy getService() {
        String str;
        C05870Qv A02 = this.paymentsCountryManager.A02();
        if (A02 == null) {
            Log.e("PAY: PaymentConfiguration/getService/null country");
            return null;
        }
        AnonymousClass1X1 initializeFactory = initializeFactory(A02.A02);
        AbstractC05890Qx A01 = this.paymentsCountryManager.A01();
        if (A01 != null) {
            str = A01.A5e();
        } else {
            str = null;
        }
        AnonymousClass008.A1T(AnonymousClass008.A0S("PAY: PaymentConfiguration/getService/defaulted to countryCode="), A02.A02);
        if (initializeFactory != null) {
            return initializeFactory.A8I(str);
        }
        return null;
    }

    @Override // X.AnonymousClass0RI, X.AbstractC449322f
    public AbstractC07650Yy getServiceBy(String str, String str2) {
        AnonymousClass1X1 initializeFactory = initializeFactory(str);
        if (initializeFactory != null) {
            return initializeFactory.A8I(str2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r0 == false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    @Override // X.AbstractC449322f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1X1 initializeFactory(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.PaymentConfiguration.initializeFactory(java.lang.String):X.1X1");
    }
}
