package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1VL  reason: invalid class name */
public class AnonymousClass1VL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LR();
    public final AnonymousClass2LQ A00;
    public final Integer A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1VL(Parcel parcel) {
        Integer valueOf;
        this.A02 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(readInt);
        }
        this.A01 = valueOf;
        this.A00 = (AnonymousClass2LQ) parcel.readParcelable(AnonymousClass2LQ.class.getClassLoader());
    }

    public AnonymousClass1VL(String str, Integer num, AnonymousClass2LQ r3) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = r3;
    }

    public static AnonymousClass1VL A00(AnonymousClass0M5 r9) {
        String str;
        AnonymousClass2LQ r2;
        Integer num;
        try {
            AnonymousClass0OS A0A = r9.A0A("kyc-state");
            if (A0A != null) {
                str = A0A.A03;
            } else {
                str = null;
            }
            AnonymousClass0M5 A0D = r9.A0D("kyc-actions-requested");
            if (A0D != null) {
                ArrayList arrayList = new ArrayList();
                String A0F = A0D.A0F("obligation");
                Iterator it = A0D.A0H("upload-document").iterator();
                while (true) {
                    if (it.hasNext()) {
                        String A0F2 = ((AnonymousClass0M5) it.next()).A0F("type");
                        if (!"PROOF_OF_IDENTITY".equals(A0F2)) {
                            if (!"PROOF_OF_ADDRESS".equals(A0F2)) {
                                AnonymousClass008.A17("PAY: KycActionsRequested/fromProtocolTreeNode non-supported action type: ", A0F2);
                                r2 = null;
                                break;
                            }
                            arrayList.add("UPLOAD_DOC_ADDRESS");
                        } else {
                            arrayList.add("UPLOAD_DOC_IDENTITY");
                        }
                    } else {
                        if (A0D.A0D("verify-card") != null) {
                            arrayList.add("VERIFY_CARD");
                        }
                        if (A0D.A0D("provide-ssn-last4") != null) {
                            arrayList.add("PROVIDE_SSN_LAST4");
                        }
                        r2 = new AnonymousClass2LQ(A0F, arrayList);
                    }
                }
            } else {
                r2 = null;
            }
            AnonymousClass0OS A0A2 = r9.A0A("kyc-rejection-code");
            if (A0A2 == null || A0A2.A03 == null) {
                num = null;
            } else {
                num = Integer.valueOf(r9.A05("kyc-rejection-code", 0));
            }
            if (!C003701u.A0E(str)) {
                return new AnonymousClass1VL(str, num, r2);
            }
        } catch (AnonymousClass1XC e) {
            Log.e("PAY: PaymentKycInfo/fromProtocolTreeNode ", e);
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A02);
        Integer num = this.A01;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.A00, i);
    }
}
