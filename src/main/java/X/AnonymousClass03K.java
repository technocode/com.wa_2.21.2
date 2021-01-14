package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.03K  reason: invalid class name */
public class AnonymousClass03K extends AnonymousClass03L {
    public static volatile AnonymousClass03K A01;
    public final AnonymousClass00D A00;

    public AnonymousClass03K(AnonymousClass00D r4) {
        this.A00 = r4;
        String string = r4.A00.getString("wam_client_errors", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.A0I = A04(jSONObject, 2);
                this.A0J = A04(jSONObject, 3);
                super.A00 = A03(jSONObject, 1);
                this.A0G = A03(jSONObject, 4);
                this.A0H = A03(jSONObject, 5);
                this.A0F = A03(jSONObject, 6);
                this.A0D = A03(jSONObject, 7);
                this.A04 = A03(jSONObject, 8);
                this.A09 = A03(jSONObject, 9);
                this.A0A = A03(jSONObject, 10);
                this.A07 = A03(jSONObject, 11);
                this.A0E = A03(jSONObject, 12);
                this.A0B = A03(jSONObject, 13);
                this.A08 = A03(jSONObject, 14);
                this.A03 = A03(jSONObject, 15);
                this.A02 = A03(jSONObject, 16);
                this.A05 = A03(jSONObject, 17);
                this.A01 = A03(jSONObject, 18);
                this.A06 = A03(jSONObject, 19);
                this.A0C = A03(jSONObject, 20);
                this.A0M = A04(jSONObject, 22);
                this.A0N = A04(jSONObject, 23);
                this.A0K = A04(jSONObject, 24);
                this.A0L = A04(jSONObject, 25);
            } catch (JSONException e) {
                Log.e(e);
            }
        }
    }

    public static AnonymousClass03K A02() {
        if (A01 == null) {
            synchronized (AnonymousClass03K.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass03K(AnonymousClass00D.A00());
                }
            }
        }
        return A01;
    }

    public static Boolean A03(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(valueOf));
        } catch (JSONException e) {
            Log.e(e);
            return null;
        }
    }

    public static Long A04(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(valueOf));
        } catch (JSONException e) {
            Log.e(e);
            return null;
        }
    }

    public static void A05(JSONObject jSONObject, int i, Boolean bool) {
        if (bool != null) {
            try {
                jSONObject.put(String.valueOf(i), bool.booleanValue());
            } catch (JSONException e) {
                Log.e(e);
            }
        }
    }

    public static void A06(JSONObject jSONObject, int i, Long l) {
        if (l != null) {
            try {
                jSONObject.put(String.valueOf(i), l.longValue());
            } catch (JSONException e) {
                Log.e(e);
            }
        }
    }

    public void A07() {
        String str;
        if (!A00()) {
            JSONObject jSONObject = new JSONObject();
            A06(jSONObject, 2, this.A0I);
            A06(jSONObject, 3, this.A0J);
            A05(jSONObject, 1, super.A00);
            A05(jSONObject, 4, this.A0G);
            A05(jSONObject, 5, this.A0H);
            A05(jSONObject, 6, this.A0F);
            A05(jSONObject, 7, this.A0D);
            A05(jSONObject, 8, this.A04);
            A05(jSONObject, 9, this.A09);
            A05(jSONObject, 10, this.A0A);
            A05(jSONObject, 11, this.A07);
            A05(jSONObject, 12, this.A0E);
            A05(jSONObject, 13, this.A0B);
            A05(jSONObject, 14, this.A08);
            A05(jSONObject, 15, this.A03);
            A05(jSONObject, 16, this.A02);
            A05(jSONObject, 17, this.A05);
            A05(jSONObject, 18, this.A01);
            A05(jSONObject, 19, this.A06);
            A05(jSONObject, 20, this.A0C);
            A06(jSONObject, 22, this.A0M);
            A06(jSONObject, 23, this.A0N);
            A06(jSONObject, 24, this.A0K);
            A06(jSONObject, 25, this.A0L);
            str = jSONObject.toString();
        } else {
            str = null;
        }
        AnonymousClass008.A0m(this.A00, "wam_client_errors", str);
    }
}
