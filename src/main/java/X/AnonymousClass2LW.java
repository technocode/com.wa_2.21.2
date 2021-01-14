package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2LW  reason: invalid class name */
public class AnonymousClass2LW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LV();
    public int A00;
    public AnonymousClass1VM A01;
    public final C05900Qy A02;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass2LW(AnonymousClass1VM r2, C05900Qy r3, int i) {
        AnonymousClass00E.A07(r3.A01());
        this.A02 = r3;
        this.A00 = i;
        this.A01 = r2;
    }

    public JSONObject A00(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.A01.A04());
            if (this.A01 != null) {
                jSONObject.put("st", (Object) null);
                jSONObject.put("cc", this.A01.A05.A02);
                if (!z) {
                    jSONObject.put("c", this.A01.A07);
                    jSONObject.put("n", this.A01.A0A);
                    jSONObject.put("a", this.A02.toString());
                }
                AnonymousClass1VM r2 = this.A01;
                if (r2 instanceof C43761yu) {
                    jSONObject.put("ci", ((C43761yu) r2).A01);
                }
                jSONObject.put("sd", this.A00);
                return jSONObject;
            }
            throw null;
        } catch (JSONException e) {
            if (!z) {
                Log.w("PAY: PaymentTransaction:Source:toJsonString threw creating json string: ", e);
            }
            return null;
        }
    }

    public String toString() {
        JSONObject A002 = A00(true);
        if (A002 != null) {
            return A002.toString();
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01.A04());
        if (this.A01 != null) {
            parcel.writeString(null);
            parcel.writeString(this.A01.A05.A02);
            parcel.writeString(this.A01.A07);
            parcel.writeString(this.A01.A0A);
            AnonymousClass1VM r1 = this.A01;
            if (r1 instanceof C43761yu) {
                parcel.writeInt(((C43761yu) r1).A01);
            }
            BigDecimal bigDecimal = this.A02.A00;
            parcel.writeInt(bigDecimal.scale());
            parcel.writeString(bigDecimal.toString());
            parcel.writeInt(this.A00);
            return;
        }
        throw null;
    }
}
